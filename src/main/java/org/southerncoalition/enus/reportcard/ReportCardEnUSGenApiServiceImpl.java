package org.southerncoalition.enus.reportcard;

import org.southerncoalition.enus.county.SiteCountyEnUSGenApiServiceImpl;
import org.southerncoalition.enus.county.SiteCounty;
import org.southerncoalition.enus.config.SiteConfig;
import org.southerncoalition.enus.request.SiteRequestEnUS;
import org.southerncoalition.enus.context.SiteContextEnUS;
import org.southerncoalition.enus.user.SiteUser;
import org.southerncoalition.enus.request.api.ApiRequest;
import org.southerncoalition.enus.search.SearchResult;
import io.vertx.core.WorkerExecutor;
import io.vertx.ext.mail.MailClient;
import io.vertx.ext.mail.MailMessage;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import io.vertx.core.json.Json;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.commons.lang3.StringUtils;
import java.security.Principal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import java.io.PrintWriter;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrDocument;
import java.util.Collection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Router;
import io.vertx.core.Vertx;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import io.vertx.core.MultiMap;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.api.validation.HTTPRequestValidationHandler;
import io.vertx.ext.web.api.validation.ParameterTypeValidator;
import io.vertx.ext.web.api.validation.ValidationException;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.Transaction;
import io.vertx.sqlclient.SqlConnection;
import io.vertx.sqlclient.Tuple;
import io.vertx.sqlclient.Row;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.Timestamp;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.http.CaseInsensitiveHeaders;
import io.vertx.core.AsyncResult;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.api.OperationResponse;
import io.vertx.core.CompositeFuture;
import org.apache.http.client.utils.URLEncodedUtils;
import java.nio.charset.Charset;
import org.apache.http.NameValuePair;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.auth.oauth2.KeycloakHelper;
import java.util.Optional;
import java.util.stream.Stream;
import java.net.URLDecoder;
import java.time.ZonedDateTime;
import org.apache.solr.common.util.SimpleOrderedMap;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.southerncoalition.enus.user.SiteUserEnUSApiServiceImpl;
import org.southerncoalition.enus.search.SearchList;
import org.southerncoalition.enus.writer.AllWriter;


/**
 * Translate: false
 **/
public class ReportCardEnUSGenApiServiceImpl implements ReportCardEnUSGenApiService {

	protected static final Logger LOGGER = LoggerFactory.getLogger(ReportCardEnUSGenApiServiceImpl.class);

	protected static final String SERVICE_ADDRESS = "ReportCardEnUSApiServiceImpl";

	protected SiteContextEnUS siteContext;

	public ReportCardEnUSGenApiServiceImpl(SiteContextEnUS siteContext) {
		this.siteContext = siteContext;
	}

	// PUTImport //

	@Override
	public void putimportReportCard(JsonObject body, OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest, body);
		siteRequest.setRequestUri("/api/reportcard/import");
		siteRequest.setRequestMethod("PUTImport");
		try {
			LOGGER.info(String.format("putimportReportCard started. "));

			List<String> roles = Arrays.asList("SiteAdmin");
			if(
					!CollectionUtils.containsAny(siteRequest.getUserResourceRoles(), roles)
					&& !CollectionUtils.containsAny(siteRequest.getUserRealmRoles(), roles)
					) {
				eventHandler.handle(Future.succeededFuture(
					new OperationResponse(401, "UNAUTHORIZED", 
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "roles required: " + String.join(", ", roles))
								.encodePrettily()
							), new CaseInsensitiveHeaders()
					)
				));
			} else {

				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						putimportReportCardResponse(siteRequest, c -> {
							if(c.succeeded()) {
								eventHandler.handle(Future.succeededFuture(c.result()));
								WorkerExecutor workerExecutor = siteContext.getWorkerExecutor();
								workerExecutor.executeBlocking(
									blockingCodeHandler -> {
										try {
											ApiRequest apiRequest = new ApiRequest();
											JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
											apiRequest.setRows(jsonArray.size());
											apiRequest.setNumFound(new Integer(jsonArray.size()).longValue());
											apiRequest.setNumPATCH(0L);
											apiRequest.initDeepApiRequest(siteRequest);
											siteRequest.setApiRequest_(apiRequest);
											siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
											varsReportCard(siteRequest, d -> {
												if(d.succeeded()) {
													listPUTImportReportCard(apiRequest, siteRequest, e -> {
														if(e.succeeded()) {
															putimportReportCardResponse(siteRequest, f -> {
																if(e.succeeded()) {
																	LOGGER.info(String.format("putimportReportCard succeeded. "));
																	blockingCodeHandler.handle(Future.succeededFuture(e.result()));
																} else {
																	LOGGER.error(String.format("putimportReportCard failed. ", f.cause()));
																	errorReportCard(siteRequest, null, f);
																}
															});
														} else {
															LOGGER.error(String.format("putimportReportCard failed. ", e.cause()));
															errorReportCard(siteRequest, null, e);
														}
													});
												} else {
													LOGGER.error(String.format("putimportReportCard failed. ", d.cause()));
													errorReportCard(siteRequest, null, d);
												}
											});
										} catch(Exception ex) {
											LOGGER.error(String.format("putimportReportCard failed. ", ex));
											errorReportCard(siteRequest, null, Future.failedFuture(ex));
										}
									}, resultHandler -> {
									}
								);
							} else {
								LOGGER.error(String.format("putimportReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("putimportReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("putimportReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void listPUTImportReportCard(ApiRequest apiRequest, SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		List<Future> futures = new ArrayList<>();
		JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
		try {
			jsonArray.forEach(obj -> {
				JsonObject json = (JsonObject)obj;

				json.put("inheritPk", json.getValue("pk"));

				json.put("created", json.getValue("created"));

				SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), json);
				siteRequest2.setApiRequest_(apiRequest);
				siteRequest2.setRequestVars(siteRequest.getRequestVars());

				SearchList<ReportCard> searchList = new SearchList<ReportCard>();
				searchList.setStore(true);
				searchList.setQuery("*:*");
				searchList.setC(ReportCard.class);
				searchList.addFilterQuery("inheritPk_indexed_long:" + json.getString("pk"));
				searchList.initDeepForClass(siteRequest2);

				if(searchList.size() == 1) {
					ReportCard o = searchList.getList().stream().findFirst().orElse(null);
					JsonObject json2 = new JsonObject();
					for(String f : json.fieldNames()) {
						json2.put("set" + StringUtils.capitalize(f), json.getValue(f));
					}
					if(o != null) {
						for(String f : Optional.ofNullable(o.getSaves()).orElse(new ArrayList<>())) {
							if(!json.fieldNames().contains(f))
								json2.putNull("set" + StringUtils.capitalize(f));
						}
						siteRequest2.setJsonObject(json2);
						futures.add(
							patchReportCardFuture(o, true, a -> {
								if(a.succeeded()) {
								} else {
									LOGGER.error(String.format("listPUTImportReportCard failed. ", a.cause()));
									errorReportCard(siteRequest2, eventHandler, a);
								}
							})
						);
					}
				} else {
					futures.add(
						postReportCardFuture(siteRequest2, true, a -> {
							if(a.succeeded()) {
							} else {
								LOGGER.error(String.format("listPUTImportReportCard failed. ", a.cause()));
								errorReportCard(siteRequest2, eventHandler, a);
							}
						})
					);
				}
			});
			CompositeFuture.all(futures).setHandler( a -> {
				if(a.succeeded()) {
					apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
					response200PUTImportReportCard(siteRequest, eventHandler);
				} else {
					LOGGER.error(String.format("listPUTImportReportCard failed. ", a.cause()));
					errorReportCard(apiRequest.getSiteRequest_(), eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("listPUTImportReportCard failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}

	public void putimportReportCardResponse(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			response200PUTImportReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("putimportReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("putimportReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200PUTImportReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			JsonObject json = new JsonObject();
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200PUTImportReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// PUTMerge //

	@Override
	public void putmergeReportCard(JsonObject body, OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest, body);
		siteRequest.setRequestUri("/api/reportcard/merge");
		siteRequest.setRequestMethod("PUTMerge");
		try {
			LOGGER.info(String.format("putmergeReportCard started. "));

			List<String> roles = Arrays.asList("SiteAdmin");
			if(
					!CollectionUtils.containsAny(siteRequest.getUserResourceRoles(), roles)
					&& !CollectionUtils.containsAny(siteRequest.getUserRealmRoles(), roles)
					) {
				eventHandler.handle(Future.succeededFuture(
					new OperationResponse(401, "UNAUTHORIZED", 
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "roles required: " + String.join(", ", roles))
								.encodePrettily()
							), new CaseInsensitiveHeaders()
					)
				));
			} else {

				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						putmergeReportCardResponse(siteRequest, c -> {
							if(c.succeeded()) {
								eventHandler.handle(Future.succeededFuture(c.result()));
								WorkerExecutor workerExecutor = siteContext.getWorkerExecutor();
								workerExecutor.executeBlocking(
									blockingCodeHandler -> {
										try {
											ApiRequest apiRequest = new ApiRequest();
											JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
											apiRequest.setRows(jsonArray.size());
											apiRequest.setNumFound(new Integer(jsonArray.size()).longValue());
											apiRequest.setNumPATCH(0L);
											apiRequest.initDeepApiRequest(siteRequest);
											siteRequest.setApiRequest_(apiRequest);
											siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
											varsReportCard(siteRequest, d -> {
												if(d.succeeded()) {
													listPUTMergeReportCard(apiRequest, siteRequest, e -> {
														if(e.succeeded()) {
															putmergeReportCardResponse(siteRequest, f -> {
																if(e.succeeded()) {
																	LOGGER.info(String.format("putmergeReportCard succeeded. "));
																	blockingCodeHandler.handle(Future.succeededFuture(e.result()));
																} else {
																	LOGGER.error(String.format("putmergeReportCard failed. ", f.cause()));
																	errorReportCard(siteRequest, null, f);
																}
															});
														} else {
															LOGGER.error(String.format("putmergeReportCard failed. ", e.cause()));
															errorReportCard(siteRequest, null, e);
														}
													});
												} else {
													LOGGER.error(String.format("putmergeReportCard failed. ", d.cause()));
													errorReportCard(siteRequest, null, d);
												}
											});
										} catch(Exception ex) {
											LOGGER.error(String.format("putmergeReportCard failed. ", ex));
											errorReportCard(siteRequest, null, Future.failedFuture(ex));
										}
									}, resultHandler -> {
									}
								);
							} else {
								LOGGER.error(String.format("putmergeReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("putmergeReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("putmergeReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void listPUTMergeReportCard(ApiRequest apiRequest, SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		List<Future> futures = new ArrayList<>();
		JsonArray jsonArray = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonArray("list")).orElse(new JsonArray());
		try {
			jsonArray.forEach(obj -> {
				JsonObject json = (JsonObject)obj;

				json.put("inheritPk", json.getValue("pk"));

				SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), json);
				siteRequest2.setApiRequest_(apiRequest);
				siteRequest2.setRequestVars(siteRequest.getRequestVars());

				SearchList<ReportCard> searchList = new SearchList<ReportCard>();
				searchList.setStore(true);
				searchList.setQuery("*:*");
				searchList.setC(ReportCard.class);
				searchList.addFilterQuery("pk_indexed_long:" + json.getString("pk"));
				searchList.initDeepForClass(siteRequest2);

				if(searchList.size() == 1) {
					ReportCard o = searchList.getList().stream().findFirst().orElse(null);
					JsonObject json2 = new JsonObject();
					for(String f : json.fieldNames()) {
						json2.put("set" + StringUtils.capitalize(f), json.getValue(f));
					}
					if(o != null) {
						for(String f : Optional.ofNullable(o.getSaves()).orElse(new ArrayList<>())) {
							if(!json.fieldNames().contains(f))
								json2.putNull("set" + StringUtils.capitalize(f));
						}
						siteRequest2.setJsonObject(json2);
						futures.add(
							patchReportCardFuture(o, false, a -> {
								if(a.succeeded()) {
								} else {
									LOGGER.error(String.format("listPUTMergeReportCard failed. ", a.cause()));
									errorReportCard(siteRequest2, eventHandler, a);
								}
							})
						);
					}
				} else {
					futures.add(
						postReportCardFuture(siteRequest2, false, a -> {
							if(a.succeeded()) {
							} else {
								LOGGER.error(String.format("listPUTMergeReportCard failed. ", a.cause()));
								errorReportCard(siteRequest2, eventHandler, a);
							}
						})
					);
				}
			});
			CompositeFuture.all(futures).setHandler( a -> {
				if(a.succeeded()) {
					apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
					response200PUTMergeReportCard(siteRequest, eventHandler);
				} else {
					LOGGER.error(String.format("listPUTMergeReportCard failed. ", a.cause()));
					errorReportCard(apiRequest.getSiteRequest_(), eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("listPUTMergeReportCard failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}

	public void putmergeReportCardResponse(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			response200PUTMergeReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("putmergeReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("putmergeReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200PUTMergeReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			JsonObject json = new JsonObject();
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200PUTMergeReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// PUTCopy //

	@Override
	public void putcopyReportCard(JsonObject body, OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest, body);
		siteRequest.setRequestUri("/api/reportcard/copy");
		siteRequest.setRequestMethod("PUTCopy");
		try {
			LOGGER.info(String.format("putcopyReportCard started. "));

			List<String> roles = Arrays.asList("SiteAdmin");
			if(
					!CollectionUtils.containsAny(siteRequest.getUserResourceRoles(), roles)
					&& !CollectionUtils.containsAny(siteRequest.getUserRealmRoles(), roles)
					) {
				eventHandler.handle(Future.succeededFuture(
					new OperationResponse(401, "UNAUTHORIZED", 
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "roles required: " + String.join(", ", roles))
								.encodePrettily()
							), new CaseInsensitiveHeaders()
					)
				));
			} else {

				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						putcopyReportCardResponse(siteRequest, c -> {
							if(c.succeeded()) {
								eventHandler.handle(Future.succeededFuture(c.result()));
								WorkerExecutor workerExecutor = siteContext.getWorkerExecutor();
								workerExecutor.executeBlocking(
									blockingCodeHandler -> {
										try {
											aSearchReportCard(siteRequest, false, true, "/api/reportcard/copy", "PUTCopy", d -> {
												if(d.succeeded()) {
													SearchList<ReportCard> listReportCard = d.result();
													ApiRequest apiRequest = new ApiRequest();
													apiRequest.setRows(listReportCard.getRows());
													apiRequest.setNumFound(listReportCard.getQueryResponse().getResults().getNumFound());
													apiRequest.setNumPATCH(0L);
													apiRequest.initDeepApiRequest(siteRequest);
													siteRequest.setApiRequest_(apiRequest);
													siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
													try {
														listPUTCopyReportCard(apiRequest, listReportCard, e -> {
															if(e.succeeded()) {
																putcopyReportCardResponse(siteRequest, f -> {
																	if(f.succeeded()) {
																		LOGGER.info(String.format("putcopyReportCard succeeded. "));
																		blockingCodeHandler.handle(Future.succeededFuture(f.result()));
																	} else {
																		LOGGER.error(String.format("putcopyReportCard failed. ", f.cause()));
																		errorReportCard(siteRequest, null, f);
																	}
																});
															} else {
																LOGGER.error(String.format("putcopyReportCard failed. ", e.cause()));
																errorReportCard(siteRequest, null, e);
															}
														});
													} catch(Exception ex) {
														LOGGER.error(String.format("putcopyReportCard failed. ", ex));
														errorReportCard(siteRequest, null, Future.failedFuture(ex));
													}
												} else {
													LOGGER.error(String.format("putcopyReportCard failed. ", d.cause()));
													errorReportCard(siteRequest, null, d);
												}
											});
										} catch(Exception ex) {
											LOGGER.error(String.format("putcopyReportCard failed. ", ex));
											errorReportCard(siteRequest, null, Future.failedFuture(ex));
										}
									}, resultHandler -> {
									}
								);
							} else {
								LOGGER.error(String.format("putcopyReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("putcopyReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("putcopyReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void listPUTCopyReportCard(ApiRequest apiRequest, SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		listReportCard.getList().forEach(o -> {
			SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), siteRequest.getJsonObject());
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			o.setSiteRequest_(siteRequest2);
			futures.add(
				putcopyReportCardFuture(siteRequest2, JsonObject.mapFrom(o), a -> {
					if(a.succeeded()) {
					} else {
						LOGGER.error(String.format("listPUTCopyReportCard failed. ", a.cause()));
						errorReportCard(siteRequest, eventHandler, a);
					}
				})
			);
		});
		CompositeFuture.all(futures).setHandler( a -> {
			if(a.succeeded()) {
				apiRequest.setNumPATCH(apiRequest.getNumPATCH() + listReportCard.size());
				if(listReportCard.next()) {
					listPUTCopyReportCard(apiRequest, listReportCard, eventHandler);
				} else {
					response200PUTCopyReportCard(siteRequest, eventHandler);
				}
			} else {
				LOGGER.error(String.format("listPUTCopyReportCard failed. ", a.cause()));
				errorReportCard(listReportCard.getSiteRequest_(), eventHandler, a);
			}
		});
	}

	public Future<ReportCard> putcopyReportCardFuture(SiteRequestEnUS siteRequest, JsonObject jsonObject, Handler<AsyncResult<ReportCard>> eventHandler) {
		Promise<ReportCard> promise = Promise.promise();
		try {

			jsonObject.put("saves", Optional.ofNullable(jsonObject.getJsonArray("saves")).orElse(new JsonArray()));
			JsonObject jsonPatch = Optional.ofNullable(siteRequest.getJsonObject()).map(o -> o.getJsonObject("patch")).orElse(new JsonObject());
			jsonPatch.stream().forEach(o -> {
				jsonObject.put(o.getKey(), o.getValue());
				jsonObject.getJsonArray("saves").add(o.getKey());
			});

			sqlConnectionReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					sqlTransactionReportCard(siteRequest, b -> {
						if(b.succeeded()) {
							createReportCard(siteRequest, c -> {
								if(c.succeeded()) {
									ReportCard reportCard = c.result();
									sqlPUTCopyReportCard(reportCard, jsonObject, d -> {
										if(d.succeeded()) {
											defineIndexReportCard(reportCard, e -> {
												if(e.succeeded()) {
													ApiRequest apiRequest = siteRequest.getApiRequest_();
													if(apiRequest != null) {
														apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
														if(apiRequest.getNumFound() == 1L) {
															reportCard.apiRequestReportCard();
														}
														siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
													}
													eventHandler.handle(Future.succeededFuture(reportCard));
													promise.complete(reportCard);
												} else {
													LOGGER.error(String.format("putcopyReportCardFuture failed. ", e.cause()));
													eventHandler.handle(Future.failedFuture(e.cause()));
												}
											});
										} else {
											LOGGER.error(String.format("putcopyReportCardFuture failed. ", d.cause()));
											eventHandler.handle(Future.failedFuture(d.cause()));
										}
									});
								} else {
									LOGGER.error(String.format("putcopyReportCardFuture failed. ", c.cause()));
									eventHandler.handle(Future.failedFuture(c.cause()));
								}
							});
						} else {
							LOGGER.error(String.format("putcopyReportCardFuture failed. ", b.cause()));
							eventHandler.handle(Future.failedFuture(b.cause()));
						}
					});
				} else {
					LOGGER.error(String.format("putcopyReportCardFuture failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("putcopyReportCardFuture failed. ", e));
			errorReportCard(siteRequest, null, Future.failedFuture(e));
		}
		return promise.future();
	}

	public void sqlPUTCopyReportCard(ReportCard o, JsonObject jsonObject, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			Transaction tx = siteRequest.getTx();
			Long pk = o.getPk();
			List<Future> futures = new ArrayList<>();

			if(jsonObject != null) {
				JsonArray entityVars = jsonObject.getJsonArray("saves");
				for(Integer i = 0; i < entityVars.size(); i++) {
					String entityVar = entityVars.getString(i);
					switch(entityVar) {
					case "archived":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "archived", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.archived failed", b.cause())));
							});
						}));
						break;
					case "deleted":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "deleted", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.deleted failed", b.cause())));
							});
						}));
						break;
					case "reportCardStartYear":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "reportCardStartYear", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.reportCardStartYear failed", b.cause())));
							});
						}));
						break;
					case "countyKey":
							{
						Long l = Long.parseLong(jsonObject.getString(entityVar));
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_addA
									, Tuple.of(pk, "countyKey", l, "reportCardKeys")
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.countyKey failed", b.cause())));
							});
						}));
						}
						break;
					case "pupilsTotal":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsTotal", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsTotal failed", b.cause())));
							});
						}));
						break;
					case "pupilsIndianFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsIndianFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsIndianMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsIndianMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsAsianFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsAsianFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsAsianMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsAsianMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsHispanicFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsHispanicFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsHispanicMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsHispanicMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsBlackFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsBlackFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsBlackMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsBlackMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsWhiteFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsWhiteFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsWhiteMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsWhiteMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsPacificIslanderFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsPacificIslanderFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsPacificIslanderMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsPacificIslanderMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsMultiRacialFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsMultiRacialFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsMultiRacialMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsMultiRacialMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialMale failed", b.cause())));
							});
						}));
						break;
					case "delinquentComplaintsTotal":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "delinquentComplaintsTotal", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsTotal failed", b.cause())));
							});
						}));
						break;
					case "delinquentComplaintsAtSchool":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "delinquentComplaintsAtSchool", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsAtSchool failed", b.cause())));
							});
						}));
						break;
					}
				}
			}
			CompositeFuture.all(futures).setHandler( a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture());
				} else {
					LOGGER.error(String.format("sqlPUTCopyReportCard failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("sqlPUTCopyReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void putcopyReportCardResponse(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			response200PUTCopyReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("putcopyReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("putcopyReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200PUTCopyReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			JsonObject json = new JsonObject();
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200PUTCopyReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// POST //

	@Override
	public void postReportCard(JsonObject body, OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest, body);
		siteRequest.setRequestUri("/api/reportcard");
		siteRequest.setRequestMethod("POST");
		try {
			LOGGER.info(String.format("postReportCard started. "));

			List<String> roles = Arrays.asList("SiteAdmin");
			if(
					!CollectionUtils.containsAny(siteRequest.getUserResourceRoles(), roles)
					&& !CollectionUtils.containsAny(siteRequest.getUserRealmRoles(), roles)
					) {
				eventHandler.handle(Future.succeededFuture(
					new OperationResponse(401, "UNAUTHORIZED", 
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "roles required: " + String.join(", ", roles))
								.encodePrettily()
							), new CaseInsensitiveHeaders()
					)
				));
			} else {

				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						ApiRequest apiRequest = new ApiRequest();
						apiRequest.setRows(1);
						apiRequest.setNumFound(1L);
						apiRequest.setNumPATCH(0L);
						apiRequest.initDeepApiRequest(siteRequest);
						siteRequest.setApiRequest_(apiRequest);
						siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
						postReportCardFuture(siteRequest, false, c -> {
							if(c.succeeded()) {
								ReportCard reportCard = c.result();
								apiRequest.setPk(reportCard.getPk());
								postReportCardResponse(reportCard, d -> {
										if(d.succeeded()) {
										eventHandler.handle(Future.succeededFuture(d.result()));
										LOGGER.info(String.format("postReportCard succeeded. "));
									} else {
										LOGGER.error(String.format("postReportCard failed. ", d.cause()));
										errorReportCard(siteRequest, eventHandler, d);
									}
								});
							} else {
								LOGGER.error(String.format("postReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("postReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("postReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public Future<ReportCard> postReportCardFuture(SiteRequestEnUS siteRequest, Boolean inheritPk, Handler<AsyncResult<ReportCard>> eventHandler) {
		Promise<ReportCard> promise = Promise.promise();
		try {
			sqlConnectionReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					sqlTransactionReportCard(siteRequest, b -> {
						if(b.succeeded()) {
							createReportCard(siteRequest, c -> {
								if(c.succeeded()) {
									ReportCard reportCard = c.result();
									sqlPOSTReportCard(reportCard, inheritPk, d -> {
										if(d.succeeded()) {
											defineIndexReportCard(reportCard, e -> {
												if(e.succeeded()) {
													ApiRequest apiRequest = siteRequest.getApiRequest_();
													if(apiRequest != null) {
														apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
														reportCard.apiRequestReportCard();
														siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
													}
													eventHandler.handle(Future.succeededFuture(reportCard));
													promise.complete(reportCard);
												} else {
													LOGGER.error(String.format("postReportCardFuture failed. ", e.cause()));
													eventHandler.handle(Future.failedFuture(e.cause()));
												}
											});
										} else {
											LOGGER.error(String.format("postReportCardFuture failed. ", d.cause()));
											eventHandler.handle(Future.failedFuture(d.cause()));
										}
									});
								} else {
									LOGGER.error(String.format("postReportCardFuture failed. ", c.cause()));
									eventHandler.handle(Future.failedFuture(c.cause()));
								}
							});
						} else {
							LOGGER.error(String.format("postReportCardFuture failed. ", b.cause()));
							eventHandler.handle(Future.failedFuture(b.cause()));
						}
					});
				} else {
					LOGGER.error(String.format("postReportCardFuture failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("postReportCardFuture failed. ", e));
			errorReportCard(siteRequest, null, Future.failedFuture(e));
		}
		return promise.future();
	}

	public void sqlPOSTReportCard(ReportCard o, Boolean inheritPk, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			Transaction tx = siteRequest.getTx();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			List<Future> futures = new ArrayList<>();

			if(siteRequest.getSessionId() != null) {
				futures.add(Future.future(a -> {
					tx.preparedQuery(SiteContextEnUS.SQL_setD
				, Tuple.of(pk, "sessionId", siteRequest.getSessionId())
							, b
					-> {
						if(b.succeeded())
							a.handle(Future.succeededFuture());
						else
							a.handle(Future.failedFuture(b.cause()));
					});
				}));
			}
			if(siteRequest.getUserId() != null) {
				futures.add(Future.future(a -> {
					tx.preparedQuery(SiteContextEnUS.SQL_setD
				, Tuple.of(pk, "userId", siteRequest.getUserId())
							, b
					-> {
						if(b.succeeded())
							a.handle(Future.succeededFuture());
						else
							a.handle(Future.failedFuture(b.cause()));
					});
				}));
			}
			if(siteRequest.getUserKey() != null) {
				futures.add(Future.future(a -> {
					tx.preparedQuery(SiteContextEnUS.SQL_setD
				, Tuple.of(pk, "userKey", siteRequest.getUserKey().toString())
							, b
					-> {
						if(b.succeeded())
							a.handle(Future.succeededFuture());
						else
							a.handle(Future.failedFuture(b.cause()));
					});
				}));
			}

			if(jsonObject != null) {
				Set<String> entityVars = jsonObject.fieldNames();
				for(String entityVar : entityVars) {
					switch(entityVar) {
					case "archived":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "archived", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.archived failed", b.cause())));
							});
						}));
						break;
					case "deleted":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "deleted", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.deleted failed", b.cause())));
							});
						}));
						break;
					case "reportCardStartYear":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "reportCardStartYear", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.reportCardStartYear failed", b.cause())));
							});
						}));
						break;
					case "countyKey":
						{
							Long l = Long.parseLong(jsonObject.getString(entityVar));
							if(l != null) {
								SearchList<SiteCounty> searchList = new SearchList<SiteCounty>();
								searchList.setQuery("*:*");
								searchList.setStore(true);
								searchList.setC(SiteCounty.class);
								searchList.addFilterQuery((inheritPk ? "inheritPk" : "pk") + "_indexed_long:" + l);
								searchList.initDeepSearchList(siteRequest);
								Long l2 = Optional.ofNullable(searchList.getList().stream().findFirst().orElse(null)).map(a -> a.getPk()).orElse(null);
								if(l2 != null) {
									futures.add(Future.future(a -> {
										tx.preparedQuery(SiteContextEnUS.SQL_addA
												, Tuple.of(pk, "countyKey", l2, "reportCardKeys")
												, b
										-> {
											if(b.succeeded())
												a.handle(Future.succeededFuture());
											else
												a.handle(Future.failedFuture(new Exception("value ReportCard.countyKey failed", b.cause())));
										});
									}));
									if(!pks.contains(l2)) {
										pks.add(l2);
										classes.add("SiteCounty");
									}
								}
							}
						}
						break;
					case "pupilsTotal":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsTotal", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsTotal failed", b.cause())));
							});
						}));
						break;
					case "pupilsIndianFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsIndianFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsIndianMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsIndianMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsAsianFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsAsianFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsAsianMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsAsianMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsHispanicFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsHispanicFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsHispanicMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsHispanicMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsBlackFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsBlackFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsBlackMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsBlackMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsWhiteFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsWhiteFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsWhiteMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsWhiteMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsPacificIslanderFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsPacificIslanderFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsPacificIslanderMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsPacificIslanderMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderMale failed", b.cause())));
							});
						}));
						break;
					case "pupilsMultiRacialFemale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsMultiRacialFemale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialFemale failed", b.cause())));
							});
						}));
						break;
					case "pupilsMultiRacialMale":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "pupilsMultiRacialMale", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialMale failed", b.cause())));
							});
						}));
						break;
					case "delinquentComplaintsTotal":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "delinquentComplaintsTotal", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsTotal failed", b.cause())));
							});
						}));
						break;
					case "delinquentComplaintsAtSchool":
						futures.add(Future.future(a -> {
							tx.preparedQuery(SiteContextEnUS.SQL_setD
									, Tuple.of(pk, "delinquentComplaintsAtSchool", Optional.ofNullable(jsonObject.getValue(entityVar)).map(s -> s.toString()).orElse(null))
									, b
							-> {
								if(b.succeeded())
									a.handle(Future.succeededFuture());
								else
									a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsAtSchool failed", b.cause())));
							});
						}));
						break;
					}
				}
			}
			CompositeFuture.all(futures).setHandler( a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture());
				} else {
					LOGGER.error(String.format("sqlPOSTReportCard failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("sqlPOSTReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void postReportCardResponse(ReportCard reportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = reportCard.getSiteRequest_();
		try {
			response200POSTReportCard(reportCard, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("postReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("postReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200POSTReportCard(ReportCard o, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			JsonObject json = JsonObject.mapFrom(o);
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200POSTReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// PATCH //

	@Override
	public void patchReportCard(JsonObject body, OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest, body);
		siteRequest.setRequestUri("/api/reportcard");
		siteRequest.setRequestMethod("PATCH");
		try {
			LOGGER.info(String.format("patchReportCard started. "));

			List<String> roles = Arrays.asList("SiteAdmin");
			if(
					!CollectionUtils.containsAny(siteRequest.getUserResourceRoles(), roles)
					&& !CollectionUtils.containsAny(siteRequest.getUserRealmRoles(), roles)
					) {
				eventHandler.handle(Future.succeededFuture(
					new OperationResponse(401, "UNAUTHORIZED", 
						Buffer.buffer().appendString(
							new JsonObject()
								.put("errorCode", "401")
								.put("errorMessage", "roles required: " + String.join(", ", roles))
								.encodePrettily()
							), new CaseInsensitiveHeaders()
					)
				));
			} else {

				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						patchReportCardResponse(siteRequest, c -> {
							if(c.succeeded()) {
								eventHandler.handle(Future.succeededFuture(c.result()));
								WorkerExecutor workerExecutor = siteContext.getWorkerExecutor();
								workerExecutor.executeBlocking(
									blockingCodeHandler -> {
										try {
											aSearchReportCard(siteRequest, false, true, "/api/reportcard", "PATCH", d -> {
												if(d.succeeded()) {
													SearchList<ReportCard> listReportCard = d.result();
													ApiRequest apiRequest = new ApiRequest();
													apiRequest.setRows(listReportCard.getRows());
													apiRequest.setNumFound(listReportCard.getQueryResponse().getResults().getNumFound());
													apiRequest.setNumPATCH(0L);
													apiRequest.initDeepApiRequest(siteRequest);
													siteRequest.setApiRequest_(apiRequest);
													siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
													SimpleOrderedMap facets = (SimpleOrderedMap)Optional.ofNullable(listReportCard.getQueryResponse()).map(QueryResponse::getResponse).map(r -> r.get("facets")).orElse(null);
													Date date = null;
													if(facets != null)
														date = (Date)facets.get("max_modified");
													String dt;
													if(date == null)
														dt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(ZonedDateTime.now().toInstant(), ZoneId.of("UTC")).minusNanos(1000));
													else
														dt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")));
													listReportCard.addFilterQuery(String.format("modified_indexed_date:[* TO %s]", dt));

													try {
														listPATCHReportCard(apiRequest, listReportCard, dt, e -> {
															if(e.succeeded()) {
																patchReportCardResponse(siteRequest, f -> {
																	if(f.succeeded()) {
																		LOGGER.info(String.format("patchReportCard succeeded. "));
																		blockingCodeHandler.handle(Future.succeededFuture(f.result()));
																	} else {
																		LOGGER.error(String.format("patchReportCard failed. ", f.cause()));
																		errorReportCard(siteRequest, null, f);
																	}
																});
															} else {
																LOGGER.error(String.format("patchReportCard failed. ", e.cause()));
																errorReportCard(siteRequest, null, e);
															}
														});
													} catch(Exception ex) {
														LOGGER.error(String.format("patchReportCard failed. ", ex));
														errorReportCard(siteRequest, null, Future.failedFuture(ex));
													}
										} else {
													LOGGER.error(String.format("patchReportCard failed. ", d.cause()));
													errorReportCard(siteRequest, null, d);
												}
											});
										} catch(Exception ex) {
											LOGGER.error(String.format("patchReportCard failed. ", ex));
											errorReportCard(siteRequest, null, Future.failedFuture(ex));
										}
									}, resultHandler -> {
									}
								);
							} else {
								LOGGER.error(String.format("patchReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("patchReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("patchReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void listPATCHReportCard(ApiRequest apiRequest, SearchList<ReportCard> listReportCard, String dt, Handler<AsyncResult<OperationResponse>> eventHandler) {
		List<Future> futures = new ArrayList<>();
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		listReportCard.getList().forEach(o -> {
			SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), siteRequest.getJsonObject());
			siteRequest2.setApiRequest_(siteRequest.getApiRequest_());
			o.setSiteRequest_(siteRequest2);
			futures.add(
				patchReportCardFuture(o, false, a -> {
					if(a.succeeded()) {
					} else {
						errorReportCard(siteRequest2, eventHandler, a);
					}
				})
			);
		});
		CompositeFuture.all(futures).setHandler( a -> {
			if(a.succeeded()) {
				if(listReportCard.next(dt)) {
					listPATCHReportCard(apiRequest, listReportCard, dt, eventHandler);
				} else {
					response200PATCHReportCard(siteRequest, eventHandler);
				}
			} else {
				LOGGER.error(String.format("listPATCHReportCard failed. ", a.cause()));
				errorReportCard(listReportCard.getSiteRequest_(), eventHandler, a);
			}
		});
	}

	public Future<ReportCard> patchReportCardFuture(ReportCard o, Boolean inheritPk, Handler<AsyncResult<ReportCard>> eventHandler) {
		Promise<ReportCard> promise = Promise.promise();
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			if(apiRequest != null && apiRequest.getNumFound() == 1L) {
				apiRequest.setOriginal(o);
				apiRequest.setPk(o.getPk());
			}
			sqlConnectionReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					sqlTransactionReportCard(siteRequest, b -> {
						if(b.succeeded()) {
							sqlPATCHReportCard(o, inheritPk, c -> {
								if(c.succeeded()) {
									ReportCard reportCard = c.result();
									defineIndexReportCard(reportCard, d -> {
										if(d.succeeded()) {
											if(apiRequest != null) {
												apiRequest.setNumPATCH(apiRequest.getNumPATCH() + 1);
												if(apiRequest.getNumFound() == 1L) {
													reportCard.apiRequestReportCard();
												}
												siteRequest.getVertx().eventBus().publish("websocketReportCard", JsonObject.mapFrom(apiRequest).toString());
											}
											eventHandler.handle(Future.succeededFuture(reportCard));
											promise.complete(reportCard);
										} else {
											LOGGER.error(String.format("patchReportCardFuture failed. ", d.cause()));
											eventHandler.handle(Future.failedFuture(d.cause()));
										}
									});
								} else {
									LOGGER.error(String.format("patchReportCardFuture failed. ", c.cause()));
									eventHandler.handle(Future.failedFuture(c.cause()));
								}
							});
						} else {
							LOGGER.error(String.format("patchReportCardFuture failed. ", b.cause()));
							eventHandler.handle(Future.failedFuture(b.cause()));
						}
					});
				} else {
					LOGGER.error(String.format("patchReportCardFuture failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("patchReportCardFuture failed. ", e));
			errorReportCard(siteRequest, null, Future.failedFuture(e));
		}
		return promise.future();
	}

	public void sqlPATCHReportCard(ReportCard o, Boolean inheritPk, Handler<AsyncResult<ReportCard>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			Transaction tx = siteRequest.getTx();
			Long pk = o.getPk();
			JsonObject jsonObject = siteRequest.getJsonObject();
			Set<String> methodNames = jsonObject.fieldNames();
			ReportCard o2 = new ReportCard();
			List<Future> futures = new ArrayList<>();

			if(o.getUserId() == null && siteRequest.getUserId() != null) {
				futures.add(Future.future(a -> {
					tx.preparedQuery(SiteContextEnUS.SQL_setD
							, Tuple.of(pk, "userId", siteRequest.getUserId())
							, b
					-> {
						if(b.succeeded())
							a.handle(Future.succeededFuture());
						else
							a.handle(Future.failedFuture(b.cause()));
					});
				}));
			}
			if(o.getUserKey() == null && siteRequest.getUserKey() != null) {
				futures.add(Future.future(a -> {
					tx.preparedQuery(SiteContextEnUS.SQL_setD
				, Tuple.of(pk, "userKey", siteRequest.getUserKey().toString())
							, b
					-> {
						if(b.succeeded())
							a.handle(Future.succeededFuture());
						else
							a.handle(Future.failedFuture(b.cause()));
					});
				}));
			}

			for(String methodName : methodNames) {
				switch(methodName) {
					case "setArchived":
						if(jsonObject.getBoolean(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "archived")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.archived failed", b.cause())));
								});
							}));
						} else {
							o2.setArchived(jsonObject.getBoolean(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "archived", o2.jsonArchived())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.archived failed", b.cause())));
								});
							}));
						}
						break;
					case "setDeleted":
						if(jsonObject.getBoolean(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "deleted")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.deleted failed", b.cause())));
								});
							}));
						} else {
							o2.setDeleted(jsonObject.getBoolean(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "deleted", o2.jsonDeleted())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.deleted failed", b.cause())));
								});
							}));
						}
						break;
					case "setReportCardStartYear":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "reportCardStartYear")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.reportCardStartYear failed", b.cause())));
								});
							}));
						} else {
							o2.setReportCardStartYear(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "reportCardStartYear", o2.jsonReportCardStartYear())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.reportCardStartYear failed", b.cause())));
								});
							}));
						}
						break;
					case "setCountyKey":
						{
							Long l = o2.getCountyKey();
							if(l != null) {
								SearchList<SiteCounty> searchList = new SearchList<SiteCounty>();
								searchList.setQuery("*:*");
								searchList.setStore(true);
								searchList.setC(SiteCounty.class);
								searchList.addFilterQuery((inheritPk ? "inheritPk" : "pk") + "_indexed_long:" + l);
								searchList.initDeepSearchList(siteRequest);
								Long l2 = Optional.ofNullable(searchList.getList().stream().findFirst().orElse(null)).map(a -> a.getPk()).orElse(null);
								if(l2 != null && !l2.equals(o.getCountyKey())) {
									o2.setCountyKey(jsonObject.getString(methodName));
									futures.add(Future.future(a -> {
										tx.preparedQuery(SiteContextEnUS.SQL_addA
												, Tuple.of(pk, "countyKey", l2, "reportCardKeys")
												, b
										-> {
											if(b.succeeded())
												a.handle(Future.succeededFuture());
											else
												a.handle(Future.failedFuture(new Exception("value ReportCard.countyKey failed", b.cause())));
										});
									}));
									if(!pks.contains(l2)) {
										pks.add(l2);
										classes.add("SiteCounty");
									}
								}
							}
						}
						break;
					case "removeCountyKey":
						{
							Long l = o2.getCountyKey();
							if(l != null) {
								SearchList<SiteCounty> searchList = new SearchList<SiteCounty>();
								searchList.setQuery("*:*");
								searchList.setStore(true);
								searchList.setC(SiteCounty.class);
								searchList.addFilterQuery((inheritPk ? "inheritPk" : "pk") + "_indexed_long:" + l);
								searchList.initDeepSearchList(siteRequest);
								Long l2 = Optional.ofNullable(searchList.getList().stream().findFirst().orElse(null)).map(a -> a.getPk()).orElse(null);
								if(l2 != null && l2.equals(o.getCountyKey())) {
									o2.setCountyKey(jsonObject.getString(methodName));
									futures.add(Future.future(a -> {
										tx.preparedQuery(SiteContextEnUS.SQL_removeA
												, Tuple.of(pk, "countyKey", l2, "reportCardKeys")
												, b
										-> {
											if(b.succeeded())
												a.handle(Future.succeededFuture());
											else
												a.handle(Future.failedFuture(new Exception("value ReportCard.countyKey failed", b.cause())));
										});
									}));
									if(!pks.contains(l2)) {
										pks.add(l2);
										classes.add("SiteCounty");
									}
								}
							}
						}
						break;
					case "setPupilsTotal":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsTotal")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsTotal failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsTotal(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsTotal", o2.jsonPupilsTotal())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsTotal failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsIndianFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsIndianFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsIndianFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsIndianFemale", o2.jsonPupilsIndianFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsIndianMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsIndianMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsIndianMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsIndianMale", o2.jsonPupilsIndianMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsIndianMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsAsianFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsAsianFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsAsianFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsAsianFemale", o2.jsonPupilsAsianFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsAsianMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsAsianMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsAsianMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsAsianMale", o2.jsonPupilsAsianMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsAsianMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsHispanicFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsHispanicFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsHispanicFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsHispanicFemale", o2.jsonPupilsHispanicFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsHispanicMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsHispanicMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsHispanicMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsHispanicMale", o2.jsonPupilsHispanicMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsHispanicMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsBlackFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsBlackFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsBlackFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsBlackFemale", o2.jsonPupilsBlackFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsBlackMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsBlackMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsBlackMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsBlackMale", o2.jsonPupilsBlackMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsBlackMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsWhiteFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsWhiteFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsWhiteFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsWhiteFemale", o2.jsonPupilsWhiteFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsWhiteMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsWhiteMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsWhiteMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsWhiteMale", o2.jsonPupilsWhiteMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsWhiteMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsPacificIslanderFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsPacificIslanderFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsPacificIslanderFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsPacificIslanderFemale", o2.jsonPupilsPacificIslanderFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsPacificIslanderMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsPacificIslanderMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsPacificIslanderMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsPacificIslanderMale", o2.jsonPupilsPacificIslanderMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsPacificIslanderMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsMultiRacialFemale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsMultiRacialFemale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialFemale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsMultiRacialFemale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsMultiRacialFemale", o2.jsonPupilsMultiRacialFemale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialFemale failed", b.cause())));
								});
							}));
						}
						break;
					case "setPupilsMultiRacialMale":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "pupilsMultiRacialMale")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialMale failed", b.cause())));
								});
							}));
						} else {
							o2.setPupilsMultiRacialMale(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "pupilsMultiRacialMale", o2.jsonPupilsMultiRacialMale())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.pupilsMultiRacialMale failed", b.cause())));
								});
							}));
						}
						break;
					case "setDelinquentComplaintsTotal":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "delinquentComplaintsTotal")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsTotal failed", b.cause())));
								});
							}));
						} else {
							o2.setDelinquentComplaintsTotal(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "delinquentComplaintsTotal", o2.jsonDelinquentComplaintsTotal())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsTotal failed", b.cause())));
								});
							}));
						}
						break;
					case "setDelinquentComplaintsAtSchool":
						if(jsonObject.getString(methodName) == null) {
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_removeD
										, Tuple.of(pk, "delinquentComplaintsAtSchool")
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsAtSchool failed", b.cause())));
								});
							}));
						} else {
							o2.setDelinquentComplaintsAtSchool(jsonObject.getString(methodName));
							futures.add(Future.future(a -> {
								tx.preparedQuery(SiteContextEnUS.SQL_setD
										, Tuple.of(pk, "delinquentComplaintsAtSchool", o2.jsonDelinquentComplaintsAtSchool())
										, b
								-> {
									if(b.succeeded())
										a.handle(Future.succeededFuture());
									else
										a.handle(Future.failedFuture(new Exception("value ReportCard.delinquentComplaintsAtSchool failed", b.cause())));
								});
							}));
						}
						break;
				}
			}
			CompositeFuture.all(futures).setHandler( a -> {
				if(a.succeeded()) {
					ReportCard o3 = new ReportCard();
					o3.setSiteRequest_(o.getSiteRequest_());
					o3.setPk(pk);
					eventHandler.handle(Future.succeededFuture(o3));
				} else {
					LOGGER.error(String.format("sqlPATCHReportCard failed. ", a.cause()));
					eventHandler.handle(Future.failedFuture(a.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("sqlPATCHReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void patchReportCardResponse(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			response200PATCHReportCard(siteRequest, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("patchReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("patchReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200PATCHReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			JsonObject json = new JsonObject();
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200PATCHReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// GET //

	@Override
	public void getReportCard(OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest);
		siteRequest.setRequestUri("/api/reportcard/{id}");
		siteRequest.setRequestMethod("GET");
		try {
			{
				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						aSearchReportCard(siteRequest, false, true, "/api/reportcard/{id}", "GET", c -> {
							if(c.succeeded()) {
								SearchList<ReportCard> listReportCard = c.result();
								getReportCardResponse(listReportCard, d -> {
									if(d.succeeded()) {
										eventHandler.handle(Future.succeededFuture(d.result()));
										LOGGER.info(String.format("getReportCard succeeded. "));
									} else {
										LOGGER.error(String.format("getReportCard failed. ", d.cause()));
										errorReportCard(siteRequest, eventHandler, d);
									}
								});
							} else {
								LOGGER.error(String.format("getReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("getReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("getReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void getReportCardResponse(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		try {
			response200GETReportCard(listReportCard, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("getReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("getReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200GETReportCard(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
			SolrDocumentList solrDocuments = listReportCard.getSolrDocumentList();

			JsonObject json = JsonObject.mapFrom(listReportCard.getList().stream().findFirst().orElse(null));
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200GETReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// Search //

	@Override
	public void searchReportCard(OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest);
		siteRequest.setRequestUri("/api/reportcard");
		siteRequest.setRequestMethod("Search");
		try {
			{
				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						aSearchReportCard(siteRequest, false, true, "/api/reportcard", "Search", c -> {
							if(c.succeeded()) {
								SearchList<ReportCard> listReportCard = c.result();
								searchReportCardResponse(listReportCard, d -> {
									if(d.succeeded()) {
										eventHandler.handle(Future.succeededFuture(d.result()));
										LOGGER.info(String.format("searchReportCard succeeded. "));
									} else {
										LOGGER.error(String.format("searchReportCard failed. ", d.cause()));
										errorReportCard(siteRequest, eventHandler, d);
									}
								});
							} else {
								LOGGER.error(String.format("searchReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("searchReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("searchReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void searchReportCardResponse(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		try {
			response200SearchReportCard(listReportCard, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("searchReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("searchReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200SearchReportCard(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
			QueryResponse responseSearch = listReportCard.getQueryResponse();
			SolrDocumentList solrDocuments = listReportCard.getSolrDocumentList();
			Long searchInMillis = Long.valueOf(responseSearch.getQTime());
			Long transmissionInMillis = responseSearch.getElapsedTime();
			Long startNum = responseSearch.getResults().getStart();
			Long foundNum = responseSearch.getResults().getNumFound();
			Integer returnedNum = responseSearch.getResults().size();
			String searchTime = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(searchInMillis), TimeUnit.MILLISECONDS.toMillis(searchInMillis) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(searchInMillis)));
			String transmissionTime = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(transmissionInMillis), TimeUnit.MILLISECONDS.toMillis(transmissionInMillis) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(transmissionInMillis)));
			Exception exceptionSearch = responseSearch.getException();

			JsonObject json = new JsonObject();
			json.put("startNum", startNum);
			json.put("foundNum", foundNum);
			json.put("returnedNum", returnedNum);
			json.put("searchTime", searchTime);
			json.put("transmissionTime", transmissionTime);
			JsonArray l = new JsonArray();
			listReportCard.getList().stream().forEach(o -> {
				JsonObject json2 = JsonObject.mapFrom(o);
				List<String> fls = listReportCard.getFields();
				if(fls.size() > 0) {
					Set<String> fieldNames = new HashSet<String>();
					fieldNames.addAll(json2.fieldNames());
					if(fls.size() == 1 && fls.stream().findFirst().orElse(null).equals("saves")) {
						fieldNames.removeAll(Optional.ofNullable(json2.getJsonArray("saves")).orElse(new JsonArray()).stream().map(s -> s.toString()).collect(Collectors.toList()));
						fieldNames.remove("pk");
						fieldNames.remove("created");
					}
					else if(fls.size() >= 1) {
						fieldNames.removeAll(fls);
					}
					for(String fieldName : fieldNames) {
						if(!fls.contains(fieldName))
							json2.remove(fieldName);
					}
				}
				l.add(json2);
			});
			json.put("list", l);
			if(exceptionSearch != null) {
				json.put("exceptionSearch", exceptionSearch.getMessage());
			}
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200SearchReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// AdminSearch //

	@Override
	public void adminsearchReportCard(OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest);
		siteRequest.setRequestUri("/api/admin/reportcard");
		siteRequest.setRequestMethod("AdminSearch");
		try {
			{
				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						aSearchReportCard(siteRequest, false, true, "/api/admin/reportcard", "AdminSearch", c -> {
							if(c.succeeded()) {
								SearchList<ReportCard> listReportCard = c.result();
								adminsearchReportCardResponse(listReportCard, d -> {
									if(d.succeeded()) {
										eventHandler.handle(Future.succeededFuture(d.result()));
										LOGGER.info(String.format("adminsearchReportCard succeeded. "));
									} else {
										LOGGER.error(String.format("adminsearchReportCard failed. ", d.cause()));
										errorReportCard(siteRequest, eventHandler, d);
									}
								});
							} else {
								LOGGER.error(String.format("adminsearchReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("adminsearchReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("adminsearchReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void adminsearchReportCardResponse(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		try {
			response200AdminSearchReportCard(listReportCard, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("adminsearchReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("adminsearchReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200AdminSearchReportCard(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
			QueryResponse responseSearch = listReportCard.getQueryResponse();
			SolrDocumentList solrDocuments = listReportCard.getSolrDocumentList();
			Long searchInMillis = Long.valueOf(responseSearch.getQTime());
			Long transmissionInMillis = responseSearch.getElapsedTime();
			Long startNum = responseSearch.getResults().getStart();
			Long foundNum = responseSearch.getResults().getNumFound();
			Integer returnedNum = responseSearch.getResults().size();
			String searchTime = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(searchInMillis), TimeUnit.MILLISECONDS.toMillis(searchInMillis) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(searchInMillis)));
			String transmissionTime = String.format("%d.%03d sec", TimeUnit.MILLISECONDS.toSeconds(transmissionInMillis), TimeUnit.MILLISECONDS.toMillis(transmissionInMillis) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(transmissionInMillis)));
			Exception exceptionSearch = responseSearch.getException();

			JsonObject json = new JsonObject();
			json.put("startNum", startNum);
			json.put("foundNum", foundNum);
			json.put("returnedNum", returnedNum);
			json.put("searchTime", searchTime);
			json.put("transmissionTime", transmissionTime);
			JsonArray l = new JsonArray();
			listReportCard.getList().stream().forEach(o -> {
				JsonObject json2 = JsonObject.mapFrom(o);
				List<String> fls = listReportCard.getFields();
				if(fls.size() > 0) {
					Set<String> fieldNames = new HashSet<String>();
					fieldNames.addAll(json2.fieldNames());
					if(fls.size() == 1 && fls.stream().findFirst().orElse(null).equals("saves")) {
						fieldNames.removeAll(Optional.ofNullable(json2.getJsonArray("saves")).orElse(new JsonArray()).stream().map(s -> s.toString()).collect(Collectors.toList()));
						fieldNames.remove("pk");
						fieldNames.remove("created");
					}
					else if(fls.size() >= 1) {
						fieldNames.removeAll(fls);
					}
					for(String fieldName : fieldNames) {
						if(!fls.contains(fieldName))
							json2.remove(fieldName);
					}
				}
				l.add(json2);
			});
			json.put("list", l);
			if(exceptionSearch != null) {
				json.put("exceptionSearch", exceptionSearch.getMessage());
			}
			eventHandler.handle(Future.succeededFuture(OperationResponse.completedWithJson(Buffer.buffer(Optional.ofNullable(json).orElse(new JsonObject()).encodePrettily()))));
		} catch(Exception e) {
			LOGGER.error(String.format("response200AdminSearchReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// SearchPage //

	@Override
	public void searchpageReportCardId(OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		searchpageReportCard(operationRequest, eventHandler);
	}

	@Override
	public void searchpageReportCard(OperationRequest operationRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = generateSiteRequestEnUSForReportCard(siteContext, operationRequest);
		siteRequest.setRequestUri("/reportcard");
		siteRequest.setRequestMethod("SearchPage");
		try {
			{
				userReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						aSearchReportCard(siteRequest, false, true, "/reportcard", "SearchPage", c -> {
							if(c.succeeded()) {
								SearchList<ReportCard> listReportCard = c.result();
								searchpageReportCardResponse(listReportCard, d -> {
									if(d.succeeded()) {
										eventHandler.handle(Future.succeededFuture(d.result()));
										LOGGER.info(String.format("searchpageReportCard succeeded. "));
									} else {
										LOGGER.error(String.format("searchpageReportCard failed. ", d.cause()));
										errorReportCard(siteRequest, eventHandler, d);
									}
								});
							} else {
								LOGGER.error(String.format("searchpageReportCard failed. ", c.cause()));
								errorReportCard(siteRequest, eventHandler, c);
							}
						});
					} else {
						LOGGER.error(String.format("searchpageReportCard failed. ", b.cause()));
						errorReportCard(siteRequest, eventHandler, b);
					}
				});
			}
		} catch(Exception ex) {
			LOGGER.error(String.format("searchpageReportCard failed. ", ex));
			errorReportCard(siteRequest, eventHandler, Future.failedFuture(ex));
		}
	}


	public void searchpageReportCardPageInit(ReportCardPage page, SearchList<ReportCard> listReportCard) {
	}
	public void searchpageReportCardResponse(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
		try {
			Buffer buffer = Buffer.buffer();
			AllWriter w = AllWriter.create(siteRequest, buffer);
			siteRequest.setW(w);
			response200SearchPageReportCard(listReportCard, a -> {
				if(a.succeeded()) {
					eventHandler.handle(Future.succeededFuture(a.result()));
				} else {
					LOGGER.error(String.format("searchpageReportCardResponse failed. ", a.cause()));
					errorReportCard(siteRequest, eventHandler, a);
				}
			});
		} catch(Exception ex) {
			LOGGER.error(String.format("searchpageReportCardResponse failed. ", ex));
			errorReportCard(siteRequest, null, Future.failedFuture(ex));
		}
	}
	public void response200SearchPageReportCard(SearchList<ReportCard> listReportCard, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = listReportCard.getSiteRequest_();
			Buffer buffer = Buffer.buffer();
			AllWriter w = AllWriter.create(listReportCard.getSiteRequest_(), buffer);
			ReportCardPage page = new ReportCardPage();
			SolrDocument pageSolrDocument = new SolrDocument();
			CaseInsensitiveHeaders requestHeaders = new CaseInsensitiveHeaders();
			siteRequest.setRequestHeaders(requestHeaders);

			pageSolrDocument.setField("pageUri_frFR_stored_string", "/reportcard");
			page.setPageSolrDocument(pageSolrDocument);
			page.setW(w);
			if(listReportCard.size() == 1)
				siteRequest.setRequestPk(listReportCard.get(0).getPk());
			siteRequest.setW(w);
			page.setListReportCard(listReportCard);
			page.setSiteRequest_(siteRequest);
			searchpageReportCardPageInit(page, listReportCard);
			page.initDeepReportCardPage(siteRequest);
			page.html();
			eventHandler.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, requestHeaders)));
		} catch(Exception e) {
			LOGGER.error(String.format("response200SearchPageReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	// General //

	public Future<ReportCard> defineIndexReportCard(ReportCard reportCard, Handler<AsyncResult<ReportCard>> eventHandler) {
		Promise<ReportCard> promise = Promise.promise();
		SiteRequestEnUS siteRequest = reportCard.getSiteRequest_();
		defineReportCard(reportCard, c -> {
			if(c.succeeded()) {
				attributeReportCard(reportCard, d -> {
					if(d.succeeded()) {
						indexReportCard(reportCard, e -> {
							if(e.succeeded()) {
								sqlCommitReportCard(siteRequest, f -> {
									if(f.succeeded()) {
										sqlCloseReportCard(siteRequest, g -> {
											if(g.succeeded()) {
												refreshReportCard(reportCard, h -> {
													if(h.succeeded()) {
														eventHandler.handle(Future.succeededFuture(reportCard));
														promise.complete(reportCard);
													} else {
														LOGGER.error(String.format("refreshReportCard failed. ", h.cause()));
														errorReportCard(siteRequest, null, h);
													}
												});
											} else {
												LOGGER.error(String.format("defineIndexReportCard failed. ", g.cause()));
												errorReportCard(siteRequest, null, g);
											}
										});
									} else {
										LOGGER.error(String.format("defineIndexReportCard failed. ", f.cause()));
										errorReportCard(siteRequest, null, f);
									}
								});
							} else {
								LOGGER.error(String.format("defineIndexReportCard failed. ", e.cause()));
								errorReportCard(siteRequest, null, e);
							}
						});
					} else {
						LOGGER.error(String.format("defineIndexReportCard failed. ", d.cause()));
						errorReportCard(siteRequest, null, d);
					}
				});
			} else {
				LOGGER.error(String.format("defineIndexReportCard failed. ", c.cause()));
				errorReportCard(siteRequest, null, c);
			}
		});
		return promise.future();
	}

	public void createReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<ReportCard>> eventHandler) {
		try {
			Transaction tx = siteRequest.getTx();
			String userId = siteRequest.getUserId();
			ZonedDateTime created = Optional.ofNullable(siteRequest.getJsonObject()).map(j -> j.getString("created")).map(s -> ZonedDateTime.parse(s, DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.of(siteRequest.getSiteConfig_().getSiteZone())))).orElse(ZonedDateTime.now(ZoneId.of(siteRequest.getSiteConfig_().getSiteZone())));

			tx.preparedQuery(
					SiteContextEnUS.SQL_create
					, Tuple.of(ReportCard.class.getCanonicalName(), userId, created.toOffsetDateTime())
					, Collectors.toList()
					, createAsync
			-> {
				if(createAsync.succeeded()) {
					Row createLine = createAsync.result().value().stream().findFirst().orElseGet(() -> null);
					Long pk = createLine.getLong(0);
					ReportCard o = new ReportCard();
					o.setPk(pk);
					o.setSiteRequest_(siteRequest);
					eventHandler.handle(Future.succeededFuture(o));
				} else {
					LOGGER.error(String.format("createReportCard failed. ", createAsync.cause()));
					eventHandler.handle(Future.failedFuture(createAsync.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("createReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void errorReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler, AsyncResult<?> resultAsync) {
		Throwable e = resultAsync.cause();
		JsonObject json = new JsonObject()
				.put("error", new JsonObject()
				.put("message", Optional.ofNullable(e).map(Throwable::getMessage).orElse(null))
				.put("userName", siteRequest.getUserName())
				.put("userFullName", siteRequest.getUserFullName())
				.put("requestUri", siteRequest.getRequestUri())
				.put("requestMethod", siteRequest.getRequestMethod())
				.put("params", siteRequest.getOperationRequest().getParams())
				);
		ExceptionUtils.printRootCauseStackTrace(e);
		OperationResponse responseOperation = new OperationResponse(400, "BAD REQUEST", 
				Buffer.buffer().appendString(json.encodePrettily())
				, new CaseInsensitiveHeaders().add("Content-Type", "application/json")
		);
		SiteConfig siteConfig = siteRequest.getSiteConfig_();
		SiteContextEnUS siteContext = siteRequest.getSiteContext_();
		MailClient mailClient = siteContext.getMailClient();
		MailMessage message = new MailMessage();
		message.setFrom(siteConfig.getEmailFrom());
		message.setTo(siteConfig.getEmailAdmin());
		if(e != null)
			message.setText(String.format("%s\n\n%s", json.encodePrettily(), ExceptionUtils.getStackTrace(e)));
		message.setSubject(String.format(siteConfig.getSiteBaseUrl() + " " + Optional.ofNullable(e).map(Throwable::getMessage).orElse(null)));
		WorkerExecutor workerExecutor = siteContext.getWorkerExecutor();
		workerExecutor.executeBlocking(
			blockingCodeHandler -> {
				mailClient.sendMail(message, result -> {
					if (result.succeeded()) {
						LOGGER.info(result.result());
					} else {
						LOGGER.error(result.cause());
					}
				});
			}, resultHandler -> {
			}
		);
		sqlRollbackReportCard(siteRequest, a -> {
			if(a.succeeded()) {
				LOGGER.info(String.format("sql rollback. "));
				sqlCloseReportCard(siteRequest, b -> {
					if(b.succeeded()) {
						LOGGER.info(String.format("sql close. "));
						if(eventHandler != null)
							eventHandler.handle(Future.succeededFuture(responseOperation));
					} else {
						if(eventHandler != null)
							eventHandler.handle(Future.succeededFuture(responseOperation));
					}
				});
			} else {
				if(eventHandler != null)
					eventHandler.handle(Future.succeededFuture(responseOperation));
			}
		});
	}

	public void sqlConnectionReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			PgPool pgPool = siteRequest.getSiteContext_().getPgPool();

			if(pgPool == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				pgPool.getConnection(a -> {
					if(a.succeeded()) {
						SqlConnection sqlConnection = a.result();
						siteRequest.setSqlConnection(sqlConnection);
						eventHandler.handle(Future.succeededFuture());
					} else {
						LOGGER.error(String.format("sqlConnectionReportCard failed. ", a.cause()));
						eventHandler.handle(Future.failedFuture(a.cause()));
					}
				});
			}
		} catch(Exception e) {
			LOGGER.error(String.format("sqlReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void sqlTransactionReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SqlConnection sqlConnection = siteRequest.getSqlConnection();

			if(sqlConnection == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				Transaction tx = sqlConnection.begin();
				siteRequest.setTx(tx);
				eventHandler.handle(Future.succeededFuture());
			}
		} catch(Exception e) {
			LOGGER.error(String.format("sqlTransactionReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void sqlCommitReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			Transaction tx = siteRequest.getTx();

			if(tx == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				tx.commit(a -> {
					if(a.succeeded()) {
						siteRequest.setTx(null);
						eventHandler.handle(Future.succeededFuture());
					} else if("Transaction already completed".equals(a.cause().getMessage())) {
						siteRequest.setTx(null);
						eventHandler.handle(Future.succeededFuture());
					} else {
						LOGGER.error(String.format("sqlCommitReportCard failed. ", a.cause()));
						eventHandler.handle(Future.failedFuture(a.cause()));
					}
				});
			}
		} catch(Exception e) {
			LOGGER.error(String.format("sqlReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void sqlRollbackReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			Transaction tx = siteRequest.getTx();

			if(tx == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				tx.rollback(a -> {
					if(a.succeeded()) {
						siteRequest.setTx(null);
						eventHandler.handle(Future.succeededFuture());
					} else if("Transaction already completed".equals(a.cause().getMessage())) {
						siteRequest.setTx(null);
						eventHandler.handle(Future.succeededFuture());
					} else {
						LOGGER.error(String.format("sqlRollbackReportCard failed. ", a.cause()));
						eventHandler.handle(Future.failedFuture(a.cause()));
					}
				});
			}
		} catch(Exception e) {
			LOGGER.error(String.format("sqlReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void sqlCloseReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SqlConnection sqlConnection = siteRequest.getSqlConnection();

			if(sqlConnection == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				sqlConnection.close();
				siteRequest.setSqlConnection(null);
				eventHandler.handle(Future.succeededFuture());
			}
		} catch(Exception e) {
			LOGGER.error(String.format("sqlCloseReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public SiteRequestEnUS generateSiteRequestEnUSForReportCard(SiteContextEnUS siteContext, OperationRequest operationRequest) {
		return generateSiteRequestEnUSForReportCard(siteContext, operationRequest, null);
	}

	public SiteRequestEnUS generateSiteRequestEnUSForReportCard(SiteContextEnUS siteContext, OperationRequest operationRequest, JsonObject body) {
		Vertx vertx = siteContext.getVertx();
		SiteRequestEnUS siteRequest = new SiteRequestEnUS();
		siteRequest.setJsonObject(body);
		siteRequest.setVertx(vertx);
		siteRequest.setSiteContext_(siteContext);
		siteRequest.setSiteConfig_(siteContext.getSiteConfig());
		siteRequest.setOperationRequest(operationRequest);
		siteRequest.initDeepSiteRequestEnUS(siteRequest);

		return siteRequest;
	}

	public void userReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			String userId = siteRequest.getUserId();
			if(userId == null) {
				eventHandler.handle(Future.succeededFuture());
			} else {
				sqlConnectionReportCard(siteRequest, a -> {
					if(a.succeeded()) {
						sqlTransactionReportCard(siteRequest, b -> {
							if(b.succeeded()) {
								Transaction tx = siteRequest.getTx();
								tx.preparedQuery(
										SiteContextEnUS.SQL_selectC
										, Tuple.of("org.southerncoalition.enus.user.SiteUser", userId)
										, Collectors.toList()
										, selectCAsync
								-> {
									if(selectCAsync.succeeded()) {
										try {
											Row userValues = selectCAsync.result().value().stream().findFirst().orElse(null);
											SiteUserEnUSApiServiceImpl userService = new SiteUserEnUSApiServiceImpl(siteContext);
											if(userValues == null) {
												JsonObject userVertx = siteRequest.getOperationRequest().getUser();
												JsonObject jsonPrincipal = KeycloakHelper.parseToken(userVertx.getString("access_token"));

												JsonObject jsonObject = new JsonObject();
												jsonObject.put("userName", jsonPrincipal.getString("preferred_username"));
												jsonObject.put("userFirstName", jsonPrincipal.getString("given_name"));
												jsonObject.put("userLastName", jsonPrincipal.getString("family_name"));
												jsonObject.put("userCompleteName", jsonPrincipal.getString("name"));
												jsonObject.put("userId", jsonPrincipal.getString("sub"));
												jsonObject.put("userEmail", jsonPrincipal.getString("email"));
												userReportCardDefine(siteRequest, jsonObject, false);

												SiteRequestEnUS siteRequest2 = new SiteRequestEnUS();
												siteRequest2.setTx(siteRequest.getTx());
												siteRequest2.setSqlConnection(siteRequest.getSqlConnection());
												siteRequest2.setJsonObject(jsonObject);
												siteRequest2.setVertx(siteRequest.getVertx());
												siteRequest2.setSiteContext_(siteContext);
												siteRequest2.setSiteConfig_(siteContext.getSiteConfig());
												siteRequest2.setUserId(siteRequest.getUserId());
												siteRequest2.initDeepSiteRequestEnUS(siteRequest);

												ApiRequest apiRequest = new ApiRequest();
												apiRequest.setRows(1);
												apiRequest.setNumFound(1L);
												apiRequest.setNumPATCH(0L);
												apiRequest.initDeepApiRequest(siteRequest2);
												siteRequest2.setApiRequest_(apiRequest);

												userService.createSiteUser(siteRequest2, c -> {
													if(c.succeeded()) {
														SiteUser siteUser = c.result();
														userService.sqlPOSTSiteUser(siteUser, false, d -> {
															if(d.succeeded()) {
																userService.defineIndexSiteUser(siteUser, e -> {
																	if(e.succeeded()) {
																		siteRequest.setSiteUser(siteUser);
																		siteRequest.setUserName(jsonPrincipal.getString("preferred_username"));
																		siteRequest.setUserFirstName(jsonPrincipal.getString("given_name"));
																		siteRequest.setUserLastName(jsonPrincipal.getString("family_name"));
																		siteRequest.setUserId(jsonPrincipal.getString("sub"));
																		siteRequest.setUserKey(siteUser.getPk());
																		eventHandler.handle(Future.succeededFuture());
																	} else {
																		errorReportCard(siteRequest, eventHandler, e);
																	}
																});
															} else {
																errorReportCard(siteRequest, eventHandler, d);
															}
														});
													} else {
														errorReportCard(siteRequest, eventHandler, c);
													}
												});
											} else {
												Long pkUser = userValues.getLong(0);
												SearchList<SiteUser> searchList = new SearchList<SiteUser>();
												searchList.setQuery("*:*");
												searchList.setStore(true);
												searchList.setC(SiteUser.class);
												searchList.addFilterQuery("userId_indexed_string:" + ClientUtils.escapeQueryChars(userId));
												searchList.addFilterQuery("pk_indexed_long:" + pkUser);
												searchList.initDeepSearchList(siteRequest);
												SiteUser siteUser1 = searchList.getList().stream().findFirst().orElse(null);

												JsonObject userVertx = siteRequest.getOperationRequest().getUser();
												JsonObject jsonPrincipal = KeycloakHelper.parseToken(userVertx.getString("access_token"));

												JsonObject jsonObject = new JsonObject();
												jsonObject.put("setUserName", jsonPrincipal.getString("preferred_username"));
												jsonObject.put("setUserFirstName", jsonPrincipal.getString("given_name"));
												jsonObject.put("setUserLastName", jsonPrincipal.getString("family_name"));
												jsonObject.put("setUserCompleteName", jsonPrincipal.getString("name"));
												jsonObject.put("setUserId", jsonPrincipal.getString("sub"));
												jsonObject.put("setUserEmail", jsonPrincipal.getString("email"));
												Boolean define = userReportCardDefine(siteRequest, jsonObject, true);
												if(define) {
													SiteUser siteUser;
													if(siteUser1 == null) {
														siteUser = new SiteUser();
														siteUser.setPk(pkUser);
														siteUser.setSiteRequest_(siteRequest);
													} else {
														siteUser = siteUser1;
													}

													SiteRequestEnUS siteRequest2 = new SiteRequestEnUS();
													siteRequest2.setTx(siteRequest.getTx());
													siteRequest2.setSqlConnection(siteRequest.getSqlConnection());
													siteRequest2.setJsonObject(jsonObject);
													siteRequest2.setVertx(siteRequest.getVertx());
													siteRequest2.setSiteContext_(siteContext);
													siteRequest2.setSiteConfig_(siteContext.getSiteConfig());
													siteRequest2.setUserId(siteRequest.getUserId());
													siteRequest2.setUserKey(siteRequest.getUserKey());
													siteRequest2.initDeepSiteRequestEnUS(siteRequest);
													siteUser.setSiteRequest_(siteRequest2);

													ApiRequest apiRequest = new ApiRequest();
													apiRequest.setRows(1);
													apiRequest.setNumFound(1L);
													apiRequest.setNumPATCH(0L);
													apiRequest.initDeepApiRequest(siteRequest2);
													siteRequest2.setApiRequest_(apiRequest);

													userService.sqlPATCHSiteUser(siteUser, false, d -> {
														if(d.succeeded()) {
															SiteUser siteUser2 = d.result();
															userService.defineIndexSiteUser(siteUser2, e -> {
																if(e.succeeded()) {
																	siteRequest.setSiteUser(siteUser2);
																	siteRequest.setUserName(siteUser2.getUserName());
																	siteRequest.setUserFirstName(siteUser2.getUserFirstName());
																	siteRequest.setUserLastName(siteUser2.getUserLastName());
																	siteRequest.setUserId(siteUser2.getUserId());
																	siteRequest.setUserKey(siteUser2.getPk());
																	eventHandler.handle(Future.succeededFuture());
																} else {
																	errorReportCard(siteRequest, eventHandler, e);
																}
															});
														} else {
															errorReportCard(siteRequest, eventHandler, d);
														}
													});
												} else {
													siteRequest.setSiteUser(siteUser1);
													siteRequest.setUserName(siteUser1.getUserName());
													siteRequest.setUserFirstName(siteUser1.getUserFirstName());
													siteRequest.setUserLastName(siteUser1.getUserLastName());
													siteRequest.setUserId(siteUser1.getUserId());
													siteRequest.setUserKey(siteUser1.getPk());
													sqlRollbackReportCard(siteRequest, c -> {
														if(c.succeeded()) {
															eventHandler.handle(Future.succeededFuture());
														} else {
															eventHandler.handle(Future.failedFuture(c.cause()));
															errorReportCard(siteRequest, eventHandler, c);
														}
													});
												}
											}
										} catch(Exception e) {
											LOGGER.error(String.format("userReportCard failed. ", e));
											eventHandler.handle(Future.failedFuture(e));
										}
									} else {
										LOGGER.error(String.format("userReportCard failed. ", selectCAsync.cause()));
										eventHandler.handle(Future.failedFuture(selectCAsync.cause()));
									}
								});
							} else {
								LOGGER.error(String.format("userReportCard failed. ", b.cause()));
								eventHandler.handle(Future.failedFuture(b.cause()));
							}
						});
					} else {
						LOGGER.error(String.format("userReportCard failed. ", a.cause()));
						eventHandler.handle(Future.failedFuture(a.cause()));
					}
				});
			}
		} catch(Exception e) {
			LOGGER.error(String.format("userReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public Boolean userReportCardDefine(SiteRequestEnUS siteRequest, JsonObject jsonObject, Boolean patch) {
		if(patch) {
			return false;
		} else {
			return false;
		}
	}

	public void aSearchReportCardQ(String uri, String apiMethod, SearchList<ReportCard> searchList, String entityVar, String valueIndexed, String varIndexed) {
		searchList.setQuery(varIndexed + ":" + ("*".equals(valueIndexed) ? valueIndexed : ClientUtils.escapeQueryChars(valueIndexed)));
		if(!"*".equals(entityVar)) {
		}
	}

	public void aSearchReportCardFq(String uri, String apiMethod, SearchList<ReportCard> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		searchList.addFilterQuery(varIndexed + ":" + ClientUtils.escapeQueryChars(valueIndexed));
	}

	public void aSearchReportCardSort(String uri, String apiMethod, SearchList<ReportCard> searchList, String entityVar, String valueIndexed, String varIndexed) {
		if(varIndexed == null)
			throw new RuntimeException(String.format("\"%s\" is not an indexed entity. ", entityVar));
		searchList.addSort(varIndexed, ORDER.valueOf(valueIndexed));
	}

	public void aSearchReportCardRows(String uri, String apiMethod, SearchList<ReportCard> searchList, Integer valueRows) {
			searchList.setRows(apiMethod != null && apiMethod.contains("Search") ? valueRows : 10);
	}

	public void aSearchReportCardStart(String uri, String apiMethod, SearchList<ReportCard> searchList, Integer valueStart) {
		searchList.setStart(valueStart);
	}

	public void aSearchReportCardVar(String uri, String apiMethod, SearchList<ReportCard> searchList, String var, String value) {
		searchList.getSiteRequest_().getRequestVars().put(var, value);
	}

	public void aSearchReportCardUri(String uri, String apiMethod, SearchList<ReportCard> searchList) {
	}

	public void varsReportCard(SiteRequestEnUS siteRequest, Handler<AsyncResult<SearchList<OperationResponse>>> eventHandler) {
		try {
			OperationRequest operationRequest = siteRequest.getOperationRequest();

			operationRequest.getParams().getJsonObject("query").forEach(paramRequest -> {
				String entityVar = null;
				String valueIndexed = null;
				String paramName = paramRequest.getKey();
				Object paramValuesObject = paramRequest.getValue();
				JsonArray paramObjects = paramValuesObject instanceof JsonArray ? (JsonArray)paramValuesObject : new JsonArray().add(paramValuesObject);

				try {
					for(Object paramObject : paramObjects) {
						switch(paramName) {
							case "var":
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								siteRequest.getRequestVars().put(entityVar, valueIndexed);
								break;
						}
					}
				} catch(Exception e) {
					LOGGER.error(String.format("aSearchReportCard failed. ", e));
					eventHandler.handle(Future.failedFuture(e));
				}
			});
			eventHandler.handle(Future.succeededFuture());
		} catch(Exception e) {
			LOGGER.error(String.format("aSearchReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void aSearchReportCard(SiteRequestEnUS siteRequest, Boolean populate, Boolean store, String uri, String apiMethod, Handler<AsyncResult<SearchList<ReportCard>>> eventHandler) {
		try {
			OperationRequest operationRequest = siteRequest.getOperationRequest();
			String entityListStr = siteRequest.getOperationRequest().getParams().getJsonObject("query").getString("fl");
			String[] entityList = entityListStr == null ? null : entityListStr.split(",\\s*");
			SearchList<ReportCard> searchList = new SearchList<ReportCard>();
			searchList.setPopulate(populate);
			searchList.setStore(store);
			searchList.setQuery("*:*");
			searchList.setC(ReportCard.class);
			searchList.setSiteRequest_(siteRequest);
			if(entityList != null)
				searchList.addFields(entityList);
			searchList.add("json.facet", "{max_modified:'max(modified_indexed_date)'}");

			String id = operationRequest.getParams().getJsonObject("path").getString("id");
			if(id != null) {
				searchList.addFilterQuery("(id:" + ClientUtils.escapeQueryChars(id) + " OR objectId_indexed_string:" + ClientUtils.escapeQueryChars(id) + ")");
			}

			operationRequest.getParams().getJsonObject("query").forEach(paramRequest -> {
				String entityVar = null;
				String valueIndexed = null;
				String varIndexed = null;
				String valueSort = null;
				Integer valueStart = null;
				Integer valueRows = null;
				String paramName = paramRequest.getKey();
				Object paramValuesObject = paramRequest.getValue();
				JsonArray paramObjects = paramValuesObject instanceof JsonArray ? (JsonArray)paramValuesObject : new JsonArray().add(paramValuesObject);

				try {
					for(Object paramObject : paramObjects) {
						switch(paramName) {
							case "q":
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								varIndexed = "*".equals(entityVar) ? entityVar : ReportCard.varSearchReportCard(entityVar);
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								valueIndexed = StringUtils.isEmpty(valueIndexed) ? "*" : valueIndexed;
								aSearchReportCardQ(uri, apiMethod, searchList, entityVar, valueIndexed, varIndexed);
								break;
							case "fq":
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								varIndexed = ReportCard.varIndexedReportCard(entityVar);
								aSearchReportCardFq(uri, apiMethod, searchList, entityVar, valueIndexed, varIndexed);
								break;
							case "sort":
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, " "));
								valueIndexed = StringUtils.trim(StringUtils.substringAfter((String)paramObject, " "));
								varIndexed = ReportCard.varIndexedReportCard(entityVar);
								aSearchReportCardSort(uri, apiMethod, searchList, entityVar, valueIndexed, varIndexed);
								break;
							case "start":
								valueStart = (Integer)paramObject;
								aSearchReportCardStart(uri, apiMethod, searchList, valueStart);
								break;
							case "rows":
								valueRows = (Integer)paramObject;
								aSearchReportCardRows(uri, apiMethod, searchList, valueRows);
								break;
							case "var":
								entityVar = StringUtils.trim(StringUtils.substringBefore((String)paramObject, ":"));
								valueIndexed = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObject, ":")), "UTF-8");
								aSearchReportCardVar(uri, apiMethod, searchList, entityVar, valueIndexed);
								break;
						}
					}
					aSearchReportCardUri(uri, apiMethod, searchList);
				} catch(Exception e) {
					LOGGER.error(String.format("aSearchReportCard failed. ", e));
					eventHandler.handle(Future.failedFuture(e));
				}
			});
			if("*".equals(searchList.getQuery()) && searchList.getSorts().size() == 0) {
				searchList.addSort("reportCardStartYear_indexed_int", ORDER.desc);
				searchList.addSort("stateName_indexed_string", ORDER.asc);
				searchList.addSort("countyName_indexed_string", ORDER.asc);
			}
			searchList.initDeepForClass(siteRequest);
			eventHandler.handle(Future.succeededFuture(searchList));
		} catch(Exception e) {
			LOGGER.error(String.format("aSearchReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void defineReportCard(ReportCard o, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			Transaction tx = siteRequest.getTx();
			Long pk = o.getPk();
			tx.preparedQuery(
					SiteContextEnUS.SQL_define
					, Tuple.of(pk)
					, Collectors.toList()
					, defineAsync
			-> {
				if(defineAsync.succeeded()) {
					try {
						for(Row definition : defineAsync.result().value()) {
							try {
								o.defineForClass(definition.getString(0), definition.getString(1));
							} catch(Exception e) {
								LOGGER.error(String.format("defineReportCard failed. ", e));
								LOGGER.error(e);
							}
						}
						eventHandler.handle(Future.succeededFuture());
					} catch(Exception e) {
						LOGGER.error(String.format("defineReportCard failed. ", e));
						eventHandler.handle(Future.failedFuture(e));
					}
				} else {
					LOGGER.error(String.format("defineReportCard failed. ", defineAsync.cause()));
					eventHandler.handle(Future.failedFuture(defineAsync.cause()));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("defineReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void attributeReportCard(ReportCard o, Handler<AsyncResult<OperationResponse>> eventHandler) {
		try {
			SiteRequestEnUS siteRequest = o.getSiteRequest_();
			Transaction tx = siteRequest.getTx();
			Long pk = o.getPk();
			tx.preparedQuery(
					SiteContextEnUS.SQL_attribute
					, Tuple.of(pk, pk)
					, Collectors.toList()
					, attributeAsync
			-> {
				try {
					if(attributeAsync.succeeded()) {
						if(attributeAsync.result() != null) {
							for(Row definition : attributeAsync.result().value()) {
								if(pk.equals(definition.getLong(0)))
									o.attributeForClass(definition.getString(2), definition.getLong(1));
								else
									o.attributeForClass(definition.getString(3), definition.getLong(0));
							}
						}
						eventHandler.handle(Future.succeededFuture());
					} else {
						LOGGER.error(String.format("attributeReportCard failed. ", attributeAsync.cause()));
						eventHandler.handle(Future.failedFuture(attributeAsync.cause()));
					}
				} catch(Exception e) {
					LOGGER.error(String.format("attributeReportCard failed. ", e));
					eventHandler.handle(Future.failedFuture(e));
				}
			});
		} catch(Exception e) {
			LOGGER.error(String.format("attributeReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void indexReportCard(ReportCard o, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			o.initDeepForClass(siteRequest);
			o.indexForClass();
			eventHandler.handle(Future.succeededFuture());
		} catch(Exception e) {
			LOGGER.error(String.format("indexReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}

	public void refreshReportCard(ReportCard o, Handler<AsyncResult<OperationResponse>> eventHandler) {
		SiteRequestEnUS siteRequest = o.getSiteRequest_();
		try {
			ApiRequest apiRequest = siteRequest.getApiRequest_();
			List<Long> pks = Optional.ofNullable(apiRequest).map(r -> r.getPks()).orElse(new ArrayList<>());
			List<String> classes = Optional.ofNullable(apiRequest).map(r -> r.getClasses()).orElse(new ArrayList<>());
			Boolean refresh = !"false".equals(siteRequest.getRequestVars().get("refresh"));
			if(refresh && BooleanUtils.isFalse(Optional.ofNullable(siteRequest.getApiRequest_()).map(ApiRequest::getEmpty).orElse(true))) {
				SearchList<ReportCard> searchList = new SearchList<ReportCard>();
				searchList.setStore(true);
				searchList.setQuery("*:*");
				searchList.setC(ReportCard.class);
				searchList.addFilterQuery("modified_indexed_date:[" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(ZonedDateTime.ofInstant(siteRequest.getApiRequest_().getCreated().toInstant(), ZoneId.of("UTC"))) + " TO *]");
				searchList.add("json.facet", "{countyKey:{terms:{field:countyKey_indexed_longs, limit:1000}}}");
				searchList.setRows(1000);
				searchList.initDeepSearchList(siteRequest);
				List<Future> futures = new ArrayList<>();

				for(int i=0; i < pks.size(); i++) {
					Long pk2 = pks.get(i);
					String classSimpleName2 = classes.get(i);

					if("SiteCounty".equals(classSimpleName2) && pk2 != null) {
						SearchList<SiteCounty> searchList2 = new SearchList<SiteCounty>();
						searchList2.setStore(true);
						searchList2.setQuery("*:*");
						searchList2.setC(SiteCounty.class);
						searchList2.addFilterQuery("pk_indexed_long:" + pk2);
						searchList2.setRows(1);
						searchList2.initDeepSearchList(siteRequest);
						SiteCounty o2 = searchList2.getList().stream().findFirst().orElse(null);

						if(o2 != null) {
							SiteCountyEnUSGenApiServiceImpl service = new SiteCountyEnUSGenApiServiceImpl(siteRequest.getSiteContext_());
							SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), new JsonObject());
							ApiRequest apiRequest2 = new ApiRequest();
							apiRequest2.setRows(1);
							apiRequest2.setNumFound(1l);
							apiRequest2.setNumPATCH(0L);
							apiRequest2.initDeepApiRequest(siteRequest2);
							siteRequest2.setApiRequest_(apiRequest2);
							siteRequest2.getVertx().eventBus().publish("websocketSiteCounty", JsonObject.mapFrom(apiRequest2).toString());

							o2.setPk(pk2);
							o2.setSiteRequest_(siteRequest2);
							futures.add(
								service.patchSiteCountyFuture(o2, false, a -> {
									if(a.succeeded()) {
									} else {
										LOGGER.info(String.format("SiteCounty %s failed. ", pk2));
										eventHandler.handle(Future.failedFuture(a.cause()));
									}
								})
							);
						}
					}
				}

				CompositeFuture.all(futures).setHandler(a -> {
					if(a.succeeded()) {
						ReportCardEnUSApiServiceImpl service = new ReportCardEnUSApiServiceImpl(siteRequest.getSiteContext_());
						List<Future> futures2 = new ArrayList<>();
						for(ReportCard o2 : searchList.getList()) {
							SiteRequestEnUS siteRequest2 = generateSiteRequestEnUSForReportCard(siteContext, siteRequest.getOperationRequest(), new JsonObject());
							o2.setSiteRequest_(siteRequest2);
							futures2.add(
								service.patchReportCardFuture(o2, false, b -> {
									if(b.succeeded()) {
									} else {
										LOGGER.info(String.format("ReportCard %s failed. ", o2.getPk()));
										eventHandler.handle(Future.failedFuture(b.cause()));
									}
								})
							);
						}

						CompositeFuture.all(futures2).setHandler(b -> {
							if(b.succeeded()) {
								eventHandler.handle(Future.succeededFuture());
							} else {
								LOGGER.error("Refresh relations failed. ", b.cause());
								errorReportCard(siteRequest, eventHandler, b);
							}
						});
					} else {
						LOGGER.error("Refresh relations failed. ", a.cause());
						errorReportCard(siteRequest, eventHandler, a);
					}
				});
			} else {
				eventHandler.handle(Future.succeededFuture());
			}
		} catch(Exception e) {
			LOGGER.error(String.format("refreshReportCard failed. ", e));
			eventHandler.handle(Future.failedFuture(e));
		}
	}
}
