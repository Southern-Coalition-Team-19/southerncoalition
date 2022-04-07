package org.southerncoalition.enus.model.reportcard;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import org.southerncoalition.enus.model.base.BaseModel;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import org.slf4j.LoggerFactory;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.vertx.api.ApiRequest;
import org.computate.search.response.solr.SolrResponse;
import java.math.BigDecimal;
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import org.computate.vertx.config.ComputateVertxConfigKeys;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import java.util.Set;
import org.southerncoalition.enus.model.reportcard.ReportCard;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.southerncoalition.enus.request.SiteRequestEnUS;
import io.vertx.core.Future;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import java.util.Objects;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.vertx.search.list.SearchList;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.search.wrap.Wrap;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.southerncoalition.enus.model.agency.SiteAgency;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br>
 **/
public abstract class ReportCardGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(ReportCard.class);

	public static final String ReportCard_AName = "a report card";
	public static final String ReportCard_This = "this ";
	public static final String ReportCard_ThisName = "this report card";
	public static final String ReportCard_A = "a ";
	public static final String ReportCard_TheName = "the report card";
	public static final String ReportCard_NameSingular = "report card";
	public static final String ReportCard_NamePlural = "report cards";
	public static final String ReportCard_NameActual = "current report card";
	public static final String ReportCard_AllName = "all the report cards";
	public static final String ReportCard_SearchAllNameBy = "search report cards by ";
	public static final String ReportCard_Title = "report cards";
	public static final String ReportCard_ThePluralName = "the report cards";
	public static final String ReportCard_NoNameFound = "no report card found";
	public static final String ReportCard_NameVar = "reportCard";
	public static final String ReportCard_OfName = "of report card";
	public static final String ReportCard_ANameAdjective = "a report card";
	public static final String ReportCard_NameAdjectiveSingular = "report card";
	public static final String ReportCard_NameAdjectivePlural = "report cards";
	public static final String ReportCard_Color = "pale-green";
	public static final String ReportCard_IconGroup = "regular";
	public static final String ReportCard_IconName = "newspaper";
	public static final Integer ReportCard_Rows = 100;

	///////////////////
	// reportCardKey //
	///////////////////

	/**	 The entity reportCardKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long reportCardKey;

	/**	<br> The entity reportCardKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardKey">Find the entity reportCardKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardKey(Wrap<Long> c);

	public Long getReportCardKey() {
		return reportCardKey;
	}

	public void setReportCardKey(Long reportCardKey) {
		this.reportCardKey = reportCardKey;
	}
	@JsonIgnore
	public void setReportCardKey(String o) {
		this.reportCardKey = ReportCard.staticSetReportCardKey(siteRequest_, o);
	}
	public static Long staticSetReportCardKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard reportCardKeyInit() {
		Wrap<Long> reportCardKeyWrap = new Wrap<Long>().var("reportCardKey");
		if(reportCardKey == null) {
			_reportCardKey(reportCardKeyWrap);
			setReportCardKey(reportCardKeyWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchReportCardKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrReportCardKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardKey(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardKey(siteRequest_, ReportCard.staticSearchReportCardKey(siteRequest_, ReportCard.staticSetReportCardKey(siteRequest_, o)));
	}

	/////////////////////////
	// reportCardStartYear //
	/////////////////////////

	/**	 The entity reportCardStartYear
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer reportCardStartYear;

	/**	<br> The entity reportCardStartYear
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardStartYear">Find the entity reportCardStartYear in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardStartYear(Wrap<Integer> c);

	public Integer getReportCardStartYear() {
		return reportCardStartYear;
	}

	public void setReportCardStartYear(Integer reportCardStartYear) {
		this.reportCardStartYear = reportCardStartYear;
	}
	@JsonIgnore
	public void setReportCardStartYear(String o) {
		this.reportCardStartYear = ReportCard.staticSetReportCardStartYear(siteRequest_, o);
	}
	public static Integer staticSetReportCardStartYear(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard reportCardStartYearInit() {
		Wrap<Integer> reportCardStartYearWrap = new Wrap<Integer>().var("reportCardStartYear");
		if(reportCardStartYear == null) {
			_reportCardStartYear(reportCardStartYearWrap);
			setReportCardStartYear(reportCardStartYearWrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchReportCardStartYear(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrReportCardStartYear(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardStartYear(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardStartYear(siteRequest_, ReportCard.staticSearchReportCardStartYear(siteRequest_, ReportCard.staticSetReportCardStartYear(siteRequest_, o)));
	}

	////////////////////////////
	// reportCardStartYearStr //
	////////////////////////////

	/**	 The entity reportCardStartYearStr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportCardStartYearStr;

	/**	<br> The entity reportCardStartYearStr
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardStartYearStr">Find the entity reportCardStartYearStr in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardStartYearStr(Wrap<String> c);

	public String getReportCardStartYearStr() {
		return reportCardStartYearStr;
	}
	public void setReportCardStartYearStr(String o) {
		this.reportCardStartYearStr = ReportCard.staticSetReportCardStartYearStr(siteRequest_, o);
	}
	public static String staticSetReportCardStartYearStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard reportCardStartYearStrInit() {
		Wrap<String> reportCardStartYearStrWrap = new Wrap<String>().var("reportCardStartYearStr");
		if(reportCardStartYearStr == null) {
			_reportCardStartYearStr(reportCardStartYearStrWrap);
			setReportCardStartYearStr(reportCardStartYearStrWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchReportCardStartYearStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportCardStartYearStr(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardStartYearStr(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardStartYearStr(siteRequest_, ReportCard.staticSearchReportCardStartYearStr(siteRequest_, ReportCard.staticSetReportCardStartYearStr(siteRequest_, o)));
	}

	///////////////////////
	// reportCardEndYear //
	///////////////////////

	/**	 The entity reportCardEndYear
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer reportCardEndYear;

	/**	<br> The entity reportCardEndYear
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardEndYear">Find the entity reportCardEndYear in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardEndYear(Wrap<Integer> c);

	public Integer getReportCardEndYear() {
		return reportCardEndYear;
	}

	public void setReportCardEndYear(Integer reportCardEndYear) {
		this.reportCardEndYear = reportCardEndYear;
	}
	@JsonIgnore
	public void setReportCardEndYear(String o) {
		this.reportCardEndYear = ReportCard.staticSetReportCardEndYear(siteRequest_, o);
	}
	public static Integer staticSetReportCardEndYear(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard reportCardEndYearInit() {
		Wrap<Integer> reportCardEndYearWrap = new Wrap<Integer>().var("reportCardEndYear");
		if(reportCardEndYear == null) {
			_reportCardEndYear(reportCardEndYearWrap);
			setReportCardEndYear(reportCardEndYearWrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchReportCardEndYear(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrReportCardEndYear(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardEndYear(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardEndYear(siteRequest_, ReportCard.staticSearchReportCardEndYear(siteRequest_, ReportCard.staticSetReportCardEndYear(siteRequest_, o)));
	}

	////////////////////////
	// reportCardYearsStr //
	////////////////////////

	/**	 The entity reportCardYearsStr
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportCardYearsStr;

	/**	<br> The entity reportCardYearsStr
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardYearsStr">Find the entity reportCardYearsStr in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardYearsStr(Wrap<String> c);

	public String getReportCardYearsStr() {
		return reportCardYearsStr;
	}
	public void setReportCardYearsStr(String o) {
		this.reportCardYearsStr = ReportCard.staticSetReportCardYearsStr(siteRequest_, o);
	}
	public static String staticSetReportCardYearsStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard reportCardYearsStrInit() {
		Wrap<String> reportCardYearsStrWrap = new Wrap<String>().var("reportCardYearsStr");
		if(reportCardYearsStr == null) {
			_reportCardYearsStr(reportCardYearsStrWrap);
			setReportCardYearsStr(reportCardYearsStrWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchReportCardYearsStr(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportCardYearsStr(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardYearsStr(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardYearsStr(siteRequest_, ReportCard.staticSearchReportCardYearsStr(siteRequest_, ReportCard.staticSetReportCardYearsStr(siteRequest_, o)));
	}

	//////////////////
	// agencySearch //
	//////////////////

	/**	 The entity agencySearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteAgency> agencySearch;

	/**	<br> The entity agencySearch
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencySearch">Find the entity agencySearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencySearch(Promise<SearchList<SiteAgency>> promise);

	public SearchList<SiteAgency> getAgencySearch() {
		return agencySearch;
	}

	public void setAgencySearch(SearchList<SiteAgency> agencySearch) {
		this.agencySearch = agencySearch;
	}
	public static SearchList<SiteAgency> staticSetAgencySearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<SiteAgency>> agencySearchPromise() {
		Promise<SearchList<SiteAgency>> promise = Promise.promise();
		Promise<SearchList<SiteAgency>> promise2 = Promise.promise();
		_agencySearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && agencySearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setAgencySearch(o);
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete(o);
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/////////////
	// agency_ //
	/////////////

	/**	 The entity agency_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteAgency agency_;

	/**	<br> The entity agency_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agency_">Find the entity agency_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agency_(Wrap<SiteAgency> c);

	public SiteAgency getAgency_() {
		return agency_;
	}

	public void setAgency_(SiteAgency agency_) {
		this.agency_ = agency_;
	}
	public static SiteAgency staticSetAgency_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ReportCard agency_Init() {
		Wrap<SiteAgency> agency_Wrap = new Wrap<SiteAgency>().var("agency_");
		if(agency_ == null) {
			_agency_(agency_Wrap);
			setAgency_(agency_Wrap.o);
		}
		return (ReportCard)this;
	}

	///////////////
	// agencyKey //
	///////////////

	/**	 The entity agencyKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long agencyKey;

	/**	<br> The entity agencyKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyKey">Find the entity agencyKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyKey(Wrap<Long> c);

	public Long getAgencyKey() {
		return agencyKey;
	}

	public void setAgencyKey(Long agencyKey) {
		this.agencyKey = agencyKey;
	}
	@JsonIgnore
	public void setAgencyKey(String o) {
		this.agencyKey = ReportCard.staticSetAgencyKey(siteRequest_, o);
	}
	public static Long staticSetAgencyKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard agencyKeyInit() {
		Wrap<Long> agencyKeyWrap = new Wrap<Long>().var("agencyKey");
		if(agencyKey == null) {
			_agencyKey(agencyKeyWrap);
			setAgencyKey(agencyKeyWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchAgencyKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrAgencyKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyKey(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyKey(siteRequest_, ReportCard.staticSearchAgencyKey(siteRequest_, ReportCard.staticSetAgencyKey(siteRequest_, o)));
	}

	///////////////
	// imageLeft //
	///////////////

	/**	 The entity imageLeft
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer imageLeft;

	/**	<br> The entity imageLeft
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageLeft">Find the entity imageLeft in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _imageLeft(Wrap<Integer> c);

	public Integer getImageLeft() {
		return imageLeft;
	}

	public void setImageLeft(Integer imageLeft) {
		this.imageLeft = imageLeft;
	}
	@JsonIgnore
	public void setImageLeft(String o) {
		this.imageLeft = ReportCard.staticSetImageLeft(siteRequest_, o);
	}
	public static Integer staticSetImageLeft(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard imageLeftInit() {
		Wrap<Integer> imageLeftWrap = new Wrap<Integer>().var("imageLeft");
		if(imageLeft == null) {
			_imageLeft(imageLeftWrap);
			setImageLeft(imageLeftWrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageLeft(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrImageLeft(siteRequest_, ReportCard.staticSearchImageLeft(siteRequest_, ReportCard.staticSetImageLeft(siteRequest_, o)));
	}

	//////////////
	// imageTop //
	//////////////

	/**	 The entity imageTop
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer imageTop;

	/**	<br> The entity imageTop
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageTop">Find the entity imageTop in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _imageTop(Wrap<Integer> c);

	public Integer getImageTop() {
		return imageTop;
	}

	public void setImageTop(Integer imageTop) {
		this.imageTop = imageTop;
	}
	@JsonIgnore
	public void setImageTop(String o) {
		this.imageTop = ReportCard.staticSetImageTop(siteRequest_, o);
	}
	public static Integer staticSetImageTop(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard imageTopInit() {
		Wrap<Integer> imageTopWrap = new Wrap<Integer>().var("imageTop");
		if(imageTop == null) {
			_imageTop(imageTopWrap);
			setImageTop(imageTopWrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageTop(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrImageTop(siteRequest_, ReportCard.staticSearchImageTop(siteRequest_, ReportCard.staticSetImageTop(siteRequest_, o)));
	}

	//////////////
	// stateKey //
	//////////////

	/**	 The entity stateKey
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long stateKey;

	/**	<br> The entity stateKey
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateKey">Find the entity stateKey in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateKey(Wrap<Long> c);

	public Long getStateKey() {
		return stateKey;
	}

	public void setStateKey(Long stateKey) {
		this.stateKey = stateKey;
	}
	@JsonIgnore
	public void setStateKey(String o) {
		this.stateKey = ReportCard.staticSetStateKey(siteRequest_, o);
	}
	public static Long staticSetStateKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard stateKeyInit() {
		Wrap<Long> stateKeyWrap = new Wrap<Long>().var("stateKey");
		if(stateKey == null) {
			_stateKey(stateKeyWrap);
			setStateKey(stateKeyWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateKey(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrStateKey(siteRequest_, ReportCard.staticSearchStateKey(siteRequest_, ReportCard.staticSetStateKey(siteRequest_, o)));
	}

	/////////////
	// stateId //
	/////////////

	/**	 The entity stateId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String stateId;

	/**	<br> The entity stateId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateId">Find the entity stateId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateId(Wrap<String> c);

	public String getStateId() {
		return stateId;
	}
	public void setStateId(String o) {
		this.stateId = ReportCard.staticSetStateId(siteRequest_, o);
	}
	public static String staticSetStateId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard stateIdInit() {
		Wrap<String> stateIdWrap = new Wrap<String>().var("stateId");
		if(stateId == null) {
			_stateId(stateIdWrap);
			setStateId(stateIdWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchStateId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateId(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrStateId(siteRequest_, ReportCard.staticSearchStateId(siteRequest_, ReportCard.staticSetStateId(siteRequest_, o)));
	}

	//////////////
	// agencyId //
	//////////////

	/**	 The entity agencyId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyId;

	/**	<br> The entity agencyId
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyId">Find the entity agencyId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyId(Wrap<String> c);

	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String o) {
		this.agencyId = ReportCard.staticSetAgencyId(siteRequest_, o);
	}
	public static String staticSetAgencyId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyIdInit() {
		Wrap<String> agencyIdWrap = new Wrap<String>().var("agencyId");
		if(agencyId == null) {
			_agencyId(agencyIdWrap);
			setAgencyId(agencyIdWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyId(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyId(siteRequest_, ReportCard.staticSearchAgencyId(siteRequest_, ReportCard.staticSetAgencyId(siteRequest_, o)));
	}

	///////////////
	// stateName //
	///////////////

	/**	 The entity stateName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String stateName;

	/**	<br> The entity stateName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateName">Find the entity stateName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateName(Wrap<String> c);

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String o) {
		this.stateName = ReportCard.staticSetStateName(siteRequest_, o);
	}
	public static String staticSetStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard stateNameInit() {
		Wrap<String> stateNameWrap = new Wrap<String>().var("stateName");
		if(stateName == null) {
			_stateName(stateNameWrap);
			setStateName(stateNameWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateName(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrStateName(siteRequest_, ReportCard.staticSearchStateName(siteRequest_, ReportCard.staticSetStateName(siteRequest_, o)));
	}

	///////////////////////
	// stateAbbreviation //
	///////////////////////

	/**	 The entity stateAbbreviation
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String stateAbbreviation;

	/**	<br> The entity stateAbbreviation
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateAbbreviation">Find the entity stateAbbreviation in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateAbbreviation(Wrap<String> c);

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}
	public void setStateAbbreviation(String o) {
		this.stateAbbreviation = ReportCard.staticSetStateAbbreviation(siteRequest_, o);
	}
	public static String staticSetStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard stateAbbreviationInit() {
		Wrap<String> stateAbbreviationWrap = new Wrap<String>().var("stateAbbreviation");
		if(stateAbbreviation == null) {
			_stateAbbreviation(stateAbbreviationWrap);
			setStateAbbreviation(stateAbbreviationWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrStateAbbreviation(siteRequest_, ReportCard.staticSearchStateAbbreviation(siteRequest_, ReportCard.staticSetStateAbbreviation(siteRequest_, o)));
	}

	////////////////////
	// agencyOnlyName //
	////////////////////

	/**	 The entity agencyOnlyName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyOnlyName;

	/**	<br> The entity agencyOnlyName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyOnlyName">Find the entity agencyOnlyName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyOnlyName(Wrap<String> c);

	public String getAgencyOnlyName() {
		return agencyOnlyName;
	}
	public void setAgencyOnlyName(String o) {
		this.agencyOnlyName = ReportCard.staticSetAgencyOnlyName(siteRequest_, o);
	}
	public static String staticSetAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyOnlyNameInit() {
		Wrap<String> agencyOnlyNameWrap = new Wrap<String>().var("agencyOnlyName");
		if(agencyOnlyName == null) {
			_agencyOnlyName(agencyOnlyNameWrap);
			setAgencyOnlyName(agencyOnlyNameWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyOnlyName(siteRequest_, ReportCard.staticSearchAgencyOnlyName(siteRequest_, ReportCard.staticSetAgencyOnlyName(siteRequest_, o)));
	}

	////////////////
	// agencyName //
	////////////////

	/**	 The entity agencyName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyName;

	/**	<br> The entity agencyName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyName">Find the entity agencyName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyName(Wrap<String> c);

	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String o) {
		this.agencyName = ReportCard.staticSetAgencyName(siteRequest_, o);
	}
	public static String staticSetAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyNameInit() {
		Wrap<String> agencyNameWrap = new Wrap<String>().var("agencyName");
		if(agencyName == null) {
			_agencyName(agencyNameWrap);
			setAgencyName(agencyNameWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyName(siteRequest_, ReportCard.staticSearchAgencyName(siteRequest_, ReportCard.staticSetAgencyName(siteRequest_, o)));
	}

	///////////////////
	// agencyIsState //
	///////////////////

	/**	 The entity agencyIsState
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean agencyIsState;

	/**	<br> The entity agencyIsState
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyIsState">Find the entity agencyIsState in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyIsState(Wrap<Boolean> c);

	public Boolean getAgencyIsState() {
		return agencyIsState;
	}

	public void setAgencyIsState(Boolean agencyIsState) {
		this.agencyIsState = agencyIsState;
	}
	@JsonIgnore
	public void setAgencyIsState(String o) {
		this.agencyIsState = ReportCard.staticSetAgencyIsState(siteRequest_, o);
	}
	public static Boolean staticSetAgencyIsState(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected ReportCard agencyIsStateInit() {
		Wrap<Boolean> agencyIsStateWrap = new Wrap<Boolean>().var("agencyIsState");
		if(agencyIsState == null) {
			_agencyIsState(agencyIsStateWrap);
			setAgencyIsState(agencyIsStateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Boolean staticSearchAgencyIsState(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrAgencyIsState(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyIsState(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyIsState(siteRequest_, ReportCard.staticSearchAgencyIsState(siteRequest_, ReportCard.staticSetAgencyIsState(siteRequest_, o)));
	}

	//////////////////
	// agencyCoords //
	//////////////////

	/**	 The entity agencyCoords
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyCoords;

	/**	<br> The entity agencyCoords
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyCoords">Find the entity agencyCoords in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyCoords(Wrap<String> c);

	public String getAgencyCoords() {
		return agencyCoords;
	}
	public void setAgencyCoords(String o) {
		this.agencyCoords = ReportCard.staticSetAgencyCoords(siteRequest_, o);
	}
	public static String staticSetAgencyCoords(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyCoordsInit() {
		Wrap<String> agencyCoordsWrap = new Wrap<String>().var("agencyCoords");
		if(agencyCoords == null) {
			_agencyCoords(agencyCoordsWrap);
			setAgencyCoords(agencyCoordsWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyCoords(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyCoords(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyCoords(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyCoords(siteRequest_, ReportCard.staticSearchAgencyCoords(siteRequest_, ReportCard.staticSetAgencyCoords(siteRequest_, o)));
	}

	////////////////
	// agencyLeft //
	////////////////

	/**	 The entity agencyLeft
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer agencyLeft;

	/**	<br> The entity agencyLeft
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyLeft">Find the entity agencyLeft in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyLeft(Wrap<Integer> c);

	public Integer getAgencyLeft() {
		return agencyLeft;
	}

	public void setAgencyLeft(Integer agencyLeft) {
		this.agencyLeft = agencyLeft;
	}
	@JsonIgnore
	public void setAgencyLeft(String o) {
		this.agencyLeft = ReportCard.staticSetAgencyLeft(siteRequest_, o);
	}
	public static Integer staticSetAgencyLeft(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard agencyLeftInit() {
		Wrap<Integer> agencyLeftWrap = new Wrap<Integer>().var("agencyLeft");
		if(agencyLeft == null) {
			_agencyLeft(agencyLeftWrap);
			setAgencyLeft(agencyLeftWrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchAgencyLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrAgencyLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyLeft(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyLeft(siteRequest_, ReportCard.staticSearchAgencyLeft(siteRequest_, ReportCard.staticSetAgencyLeft(siteRequest_, o)));
	}

	///////////////////////////
	// stateReportCardSearch //
	///////////////////////////

	/**	 The entity stateReportCardSearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<ReportCard> stateReportCardSearch;

	/**	<br> The entity stateReportCardSearch
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateReportCardSearch">Find the entity stateReportCardSearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateReportCardSearch(Promise<SearchList<ReportCard>> promise);

	public SearchList<ReportCard> getStateReportCardSearch() {
		return stateReportCardSearch;
	}

	public void setStateReportCardSearch(SearchList<ReportCard> stateReportCardSearch) {
		this.stateReportCardSearch = stateReportCardSearch;
	}
	public static SearchList<ReportCard> staticSetStateReportCardSearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<ReportCard>> stateReportCardSearchPromise() {
		Promise<SearchList<ReportCard>> promise = Promise.promise();
		Promise<SearchList<ReportCard>> promise2 = Promise.promise();
		_stateReportCardSearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && stateReportCardSearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setStateReportCardSearch(o);
					promise.complete(o);
				}).onFailure(ex -> {
					promise.fail(ex);
				});
			} else {
				promise.complete(o);
			}
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	/////////////////
	// stateFacets //
	/////////////////

	/**	 The entity stateFacets
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Map<String, Double> stateFacets;

	/**	<br> The entity stateFacets
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateFacets">Find the entity stateFacets in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateFacets(Wrap<Map<String, Double>> w);

	public Map<String, Double> getStateFacets() {
		return stateFacets;
	}

	public void setStateFacets(Map<String, Double> stateFacets) {
		this.stateFacets = stateFacets;
	}
	public static Map<String, Double> staticSetStateFacets(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected ReportCard stateFacetsInit() {
		Wrap<Map<String, Double>> stateFacetsWrap = new Wrap<Map<String, Double>>().var("stateFacets");
		if(stateFacets == null) {
			_stateFacets(stateFacetsWrap);
			setStateFacets(stateFacetsWrap.o);
		}
		return (ReportCard)this;
	}

	/////////////////
	// pupilsTotal //
	/////////////////

	/**	 The entity pupilsTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsTotal;

	/**	<br> The entity pupilsTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsTotal">Find the entity pupilsTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsTotal(Wrap<Long> c);

	public Long getPupilsTotal() {
		return pupilsTotal;
	}

	public void setPupilsTotal(Long pupilsTotal) {
		this.pupilsTotal = pupilsTotal;
	}
	@JsonIgnore
	public void setPupilsTotal(String o) {
		this.pupilsTotal = ReportCard.staticSetPupilsTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsTotalInit() {
		Wrap<Long> pupilsTotalWrap = new Wrap<Long>().var("pupilsTotal");
		if(pupilsTotal == null) {
			_pupilsTotal(pupilsTotalWrap);
			setPupilsTotal(pupilsTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsTotal(siteRequest_, ReportCard.staticSearchPupilsTotal(siteRequest_, ReportCard.staticSetPupilsTotal(siteRequest_, o)));
	}

	////////////////////////////
	// pupilsIndigenousFemale //
	////////////////////////////

	/**	 The entity pupilsIndigenousFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsIndigenousFemale;

	/**	<br> The entity pupilsIndigenousFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsIndigenousFemale">Find the entity pupilsIndigenousFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsIndigenousFemale(Wrap<Long> c);

	public Long getPupilsIndigenousFemale() {
		return pupilsIndigenousFemale;
	}

	public void setPupilsIndigenousFemale(Long pupilsIndigenousFemale) {
		this.pupilsIndigenousFemale = pupilsIndigenousFemale;
	}
	@JsonIgnore
	public void setPupilsIndigenousFemale(String o) {
		this.pupilsIndigenousFemale = ReportCard.staticSetPupilsIndigenousFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsIndigenousFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsIndigenousFemaleInit() {
		Wrap<Long> pupilsIndigenousFemaleWrap = new Wrap<Long>().var("pupilsIndigenousFemale");
		if(pupilsIndigenousFemale == null) {
			_pupilsIndigenousFemale(pupilsIndigenousFemaleWrap);
			setPupilsIndigenousFemale(pupilsIndigenousFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsIndigenousFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsIndigenousFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsIndigenousFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsIndigenousFemale(siteRequest_, ReportCard.staticSearchPupilsIndigenousFemale(siteRequest_, ReportCard.staticSetPupilsIndigenousFemale(siteRequest_, o)));
	}

	//////////////////////////
	// pupilsIndigenousMale //
	//////////////////////////

	/**	 The entity pupilsIndigenousMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsIndigenousMale;

	/**	<br> The entity pupilsIndigenousMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsIndigenousMale">Find the entity pupilsIndigenousMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsIndigenousMale(Wrap<Long> c);

	public Long getPupilsIndigenousMale() {
		return pupilsIndigenousMale;
	}

	public void setPupilsIndigenousMale(Long pupilsIndigenousMale) {
		this.pupilsIndigenousMale = pupilsIndigenousMale;
	}
	@JsonIgnore
	public void setPupilsIndigenousMale(String o) {
		this.pupilsIndigenousMale = ReportCard.staticSetPupilsIndigenousMale(siteRequest_, o);
	}
	public static Long staticSetPupilsIndigenousMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsIndigenousMaleInit() {
		Wrap<Long> pupilsIndigenousMaleWrap = new Wrap<Long>().var("pupilsIndigenousMale");
		if(pupilsIndigenousMale == null) {
			_pupilsIndigenousMale(pupilsIndigenousMaleWrap);
			setPupilsIndigenousMale(pupilsIndigenousMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsIndigenousMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsIndigenousMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsIndigenousMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsIndigenousMale(siteRequest_, ReportCard.staticSearchPupilsIndigenousMale(siteRequest_, ReportCard.staticSetPupilsIndigenousMale(siteRequest_, o)));
	}

	///////////////////////////
	// pupilsIndigenousTotal //
	///////////////////////////

	/**	 The entity pupilsIndigenousTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsIndigenousTotal;

	/**	<br> The entity pupilsIndigenousTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsIndigenousTotal">Find the entity pupilsIndigenousTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsIndigenousTotal(Wrap<Long> c);

	public Long getPupilsIndigenousTotal() {
		return pupilsIndigenousTotal;
	}

	public void setPupilsIndigenousTotal(Long pupilsIndigenousTotal) {
		this.pupilsIndigenousTotal = pupilsIndigenousTotal;
	}
	@JsonIgnore
	public void setPupilsIndigenousTotal(String o) {
		this.pupilsIndigenousTotal = ReportCard.staticSetPupilsIndigenousTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsIndigenousTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsIndigenousTotalInit() {
		Wrap<Long> pupilsIndigenousTotalWrap = new Wrap<Long>().var("pupilsIndigenousTotal");
		if(pupilsIndigenousTotal == null) {
			_pupilsIndigenousTotal(pupilsIndigenousTotalWrap);
			setPupilsIndigenousTotal(pupilsIndigenousTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsIndigenousTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsIndigenousTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsIndigenousTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsIndigenousTotal(siteRequest_, ReportCard.staticSearchPupilsIndigenousTotal(siteRequest_, ReportCard.staticSetPupilsIndigenousTotal(siteRequest_, o)));
	}

	/////////////////////////////
	// pupilsIndigenousPercent //
	/////////////////////////////

	/**	 The entity pupilsIndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsIndigenousPercent;

	/**	<br> The entity pupilsIndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsIndigenousPercent">Find the entity pupilsIndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsIndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsIndigenousPercent() {
		return pupilsIndigenousPercent;
	}

	public void setPupilsIndigenousPercent(BigDecimal pupilsIndigenousPercent) {
		this.pupilsIndigenousPercent = pupilsIndigenousPercent;
	}
	@JsonIgnore
	public void setPupilsIndigenousPercent(String o) {
		this.pupilsIndigenousPercent = ReportCard.staticSetPupilsIndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsIndigenousPercent(Double o) {
			this.pupilsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsIndigenousPercent(Integer o) {
			this.pupilsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsIndigenousPercentInit() {
		Wrap<BigDecimal> pupilsIndigenousPercentWrap = new Wrap<BigDecimal>().var("pupilsIndigenousPercent");
		if(pupilsIndigenousPercent == null) {
			_pupilsIndigenousPercent(pupilsIndigenousPercentWrap);
			setPupilsIndigenousPercent(pupilsIndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsIndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsIndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsIndigenousPercent(siteRequest_, ReportCard.staticSearchPupilsIndigenousPercent(siteRequest_, ReportCard.staticSetPupilsIndigenousPercent(siteRequest_, o)));
	}

	///////////////////////
	// pupilsAsianFemale //
	///////////////////////

	/**	 The entity pupilsAsianFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsAsianFemale;

	/**	<br> The entity pupilsAsianFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsAsianFemale">Find the entity pupilsAsianFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsAsianFemale(Wrap<Long> c);

	public Long getPupilsAsianFemale() {
		return pupilsAsianFemale;
	}

	public void setPupilsAsianFemale(Long pupilsAsianFemale) {
		this.pupilsAsianFemale = pupilsAsianFemale;
	}
	@JsonIgnore
	public void setPupilsAsianFemale(String o) {
		this.pupilsAsianFemale = ReportCard.staticSetPupilsAsianFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsAsianFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsAsianFemaleInit() {
		Wrap<Long> pupilsAsianFemaleWrap = new Wrap<Long>().var("pupilsAsianFemale");
		if(pupilsAsianFemale == null) {
			_pupilsAsianFemale(pupilsAsianFemaleWrap);
			setPupilsAsianFemale(pupilsAsianFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsAsianFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsAsianFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsAsianFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsAsianFemale(siteRequest_, ReportCard.staticSearchPupilsAsianFemale(siteRequest_, ReportCard.staticSetPupilsAsianFemale(siteRequest_, o)));
	}

	/////////////////////
	// pupilsAsianMale //
	/////////////////////

	/**	 The entity pupilsAsianMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsAsianMale;

	/**	<br> The entity pupilsAsianMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsAsianMale">Find the entity pupilsAsianMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsAsianMale(Wrap<Long> c);

	public Long getPupilsAsianMale() {
		return pupilsAsianMale;
	}

	public void setPupilsAsianMale(Long pupilsAsianMale) {
		this.pupilsAsianMale = pupilsAsianMale;
	}
	@JsonIgnore
	public void setPupilsAsianMale(String o) {
		this.pupilsAsianMale = ReportCard.staticSetPupilsAsianMale(siteRequest_, o);
	}
	public static Long staticSetPupilsAsianMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsAsianMaleInit() {
		Wrap<Long> pupilsAsianMaleWrap = new Wrap<Long>().var("pupilsAsianMale");
		if(pupilsAsianMale == null) {
			_pupilsAsianMale(pupilsAsianMaleWrap);
			setPupilsAsianMale(pupilsAsianMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsAsianMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsAsianMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsAsianMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsAsianMale(siteRequest_, ReportCard.staticSearchPupilsAsianMale(siteRequest_, ReportCard.staticSetPupilsAsianMale(siteRequest_, o)));
	}

	//////////////////////
	// pupilsAsianTotal //
	//////////////////////

	/**	 The entity pupilsAsianTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsAsianTotal;

	/**	<br> The entity pupilsAsianTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsAsianTotal">Find the entity pupilsAsianTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsAsianTotal(Wrap<Long> c);

	public Long getPupilsAsianTotal() {
		return pupilsAsianTotal;
	}

	public void setPupilsAsianTotal(Long pupilsAsianTotal) {
		this.pupilsAsianTotal = pupilsAsianTotal;
	}
	@JsonIgnore
	public void setPupilsAsianTotal(String o) {
		this.pupilsAsianTotal = ReportCard.staticSetPupilsAsianTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsAsianTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsAsianTotalInit() {
		Wrap<Long> pupilsAsianTotalWrap = new Wrap<Long>().var("pupilsAsianTotal");
		if(pupilsAsianTotal == null) {
			_pupilsAsianTotal(pupilsAsianTotalWrap);
			setPupilsAsianTotal(pupilsAsianTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsAsianTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsAsianTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsAsianTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsAsianTotal(siteRequest_, ReportCard.staticSearchPupilsAsianTotal(siteRequest_, ReportCard.staticSetPupilsAsianTotal(siteRequest_, o)));
	}

	////////////////////////
	// pupilsAsianPercent //
	////////////////////////

	/**	 The entity pupilsAsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsAsianPercent;

	/**	<br> The entity pupilsAsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsAsianPercent">Find the entity pupilsAsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsAsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsAsianPercent() {
		return pupilsAsianPercent;
	}

	public void setPupilsAsianPercent(BigDecimal pupilsAsianPercent) {
		this.pupilsAsianPercent = pupilsAsianPercent;
	}
	@JsonIgnore
	public void setPupilsAsianPercent(String o) {
		this.pupilsAsianPercent = ReportCard.staticSetPupilsAsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsAsianPercent(Double o) {
			this.pupilsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsAsianPercent(Integer o) {
			this.pupilsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsAsianPercentInit() {
		Wrap<BigDecimal> pupilsAsianPercentWrap = new Wrap<BigDecimal>().var("pupilsAsianPercent");
		if(pupilsAsianPercent == null) {
			_pupilsAsianPercent(pupilsAsianPercentWrap);
			setPupilsAsianPercent(pupilsAsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsAsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsAsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsAsianPercent(siteRequest_, ReportCard.staticSearchPupilsAsianPercent(siteRequest_, ReportCard.staticSetPupilsAsianPercent(siteRequest_, o)));
	}

	////////////////////////
	// pupilsLatinxFemale //
	////////////////////////

	/**	 The entity pupilsLatinxFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsLatinxFemale;

	/**	<br> The entity pupilsLatinxFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsLatinxFemale">Find the entity pupilsLatinxFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsLatinxFemale(Wrap<Long> c);

	public Long getPupilsLatinxFemale() {
		return pupilsLatinxFemale;
	}

	public void setPupilsLatinxFemale(Long pupilsLatinxFemale) {
		this.pupilsLatinxFemale = pupilsLatinxFemale;
	}
	@JsonIgnore
	public void setPupilsLatinxFemale(String o) {
		this.pupilsLatinxFemale = ReportCard.staticSetPupilsLatinxFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsLatinxFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsLatinxFemaleInit() {
		Wrap<Long> pupilsLatinxFemaleWrap = new Wrap<Long>().var("pupilsLatinxFemale");
		if(pupilsLatinxFemale == null) {
			_pupilsLatinxFemale(pupilsLatinxFemaleWrap);
			setPupilsLatinxFemale(pupilsLatinxFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsLatinxFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsLatinxFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsLatinxFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsLatinxFemale(siteRequest_, ReportCard.staticSearchPupilsLatinxFemale(siteRequest_, ReportCard.staticSetPupilsLatinxFemale(siteRequest_, o)));
	}

	//////////////////////
	// pupilsLatinxMale //
	//////////////////////

	/**	 The entity pupilsLatinxMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsLatinxMale;

	/**	<br> The entity pupilsLatinxMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsLatinxMale">Find the entity pupilsLatinxMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsLatinxMale(Wrap<Long> c);

	public Long getPupilsLatinxMale() {
		return pupilsLatinxMale;
	}

	public void setPupilsLatinxMale(Long pupilsLatinxMale) {
		this.pupilsLatinxMale = pupilsLatinxMale;
	}
	@JsonIgnore
	public void setPupilsLatinxMale(String o) {
		this.pupilsLatinxMale = ReportCard.staticSetPupilsLatinxMale(siteRequest_, o);
	}
	public static Long staticSetPupilsLatinxMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsLatinxMaleInit() {
		Wrap<Long> pupilsLatinxMaleWrap = new Wrap<Long>().var("pupilsLatinxMale");
		if(pupilsLatinxMale == null) {
			_pupilsLatinxMale(pupilsLatinxMaleWrap);
			setPupilsLatinxMale(pupilsLatinxMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsLatinxMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsLatinxMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsLatinxMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsLatinxMale(siteRequest_, ReportCard.staticSearchPupilsLatinxMale(siteRequest_, ReportCard.staticSetPupilsLatinxMale(siteRequest_, o)));
	}

	///////////////////////
	// pupilsLatinxTotal //
	///////////////////////

	/**	 The entity pupilsLatinxTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsLatinxTotal;

	/**	<br> The entity pupilsLatinxTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsLatinxTotal">Find the entity pupilsLatinxTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsLatinxTotal(Wrap<Long> c);

	public Long getPupilsLatinxTotal() {
		return pupilsLatinxTotal;
	}

	public void setPupilsLatinxTotal(Long pupilsLatinxTotal) {
		this.pupilsLatinxTotal = pupilsLatinxTotal;
	}
	@JsonIgnore
	public void setPupilsLatinxTotal(String o) {
		this.pupilsLatinxTotal = ReportCard.staticSetPupilsLatinxTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsLatinxTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsLatinxTotalInit() {
		Wrap<Long> pupilsLatinxTotalWrap = new Wrap<Long>().var("pupilsLatinxTotal");
		if(pupilsLatinxTotal == null) {
			_pupilsLatinxTotal(pupilsLatinxTotalWrap);
			setPupilsLatinxTotal(pupilsLatinxTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsLatinxTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsLatinxTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsLatinxTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsLatinxTotal(siteRequest_, ReportCard.staticSearchPupilsLatinxTotal(siteRequest_, ReportCard.staticSetPupilsLatinxTotal(siteRequest_, o)));
	}

	/////////////////////////
	// pupilsLatinxPercent //
	/////////////////////////

	/**	 The entity pupilsLatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsLatinxPercent;

	/**	<br> The entity pupilsLatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsLatinxPercent">Find the entity pupilsLatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsLatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsLatinxPercent() {
		return pupilsLatinxPercent;
	}

	public void setPupilsLatinxPercent(BigDecimal pupilsLatinxPercent) {
		this.pupilsLatinxPercent = pupilsLatinxPercent;
	}
	@JsonIgnore
	public void setPupilsLatinxPercent(String o) {
		this.pupilsLatinxPercent = ReportCard.staticSetPupilsLatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsLatinxPercent(Double o) {
			this.pupilsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsLatinxPercent(Integer o) {
			this.pupilsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsLatinxPercentInit() {
		Wrap<BigDecimal> pupilsLatinxPercentWrap = new Wrap<BigDecimal>().var("pupilsLatinxPercent");
		if(pupilsLatinxPercent == null) {
			_pupilsLatinxPercent(pupilsLatinxPercentWrap);
			setPupilsLatinxPercent(pupilsLatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsLatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsLatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsLatinxPercent(siteRequest_, ReportCard.staticSearchPupilsLatinxPercent(siteRequest_, ReportCard.staticSetPupilsLatinxPercent(siteRequest_, o)));
	}

	///////////////////////
	// pupilsBlackFemale //
	///////////////////////

	/**	 The entity pupilsBlackFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsBlackFemale;

	/**	<br> The entity pupilsBlackFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsBlackFemale">Find the entity pupilsBlackFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsBlackFemale(Wrap<Long> c);

	public Long getPupilsBlackFemale() {
		return pupilsBlackFemale;
	}

	public void setPupilsBlackFemale(Long pupilsBlackFemale) {
		this.pupilsBlackFemale = pupilsBlackFemale;
	}
	@JsonIgnore
	public void setPupilsBlackFemale(String o) {
		this.pupilsBlackFemale = ReportCard.staticSetPupilsBlackFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsBlackFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsBlackFemaleInit() {
		Wrap<Long> pupilsBlackFemaleWrap = new Wrap<Long>().var("pupilsBlackFemale");
		if(pupilsBlackFemale == null) {
			_pupilsBlackFemale(pupilsBlackFemaleWrap);
			setPupilsBlackFemale(pupilsBlackFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsBlackFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsBlackFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsBlackFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsBlackFemale(siteRequest_, ReportCard.staticSearchPupilsBlackFemale(siteRequest_, ReportCard.staticSetPupilsBlackFemale(siteRequest_, o)));
	}

	/////////////////////
	// pupilsBlackMale //
	/////////////////////

	/**	 The entity pupilsBlackMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsBlackMale;

	/**	<br> The entity pupilsBlackMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsBlackMale">Find the entity pupilsBlackMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsBlackMale(Wrap<Long> c);

	public Long getPupilsBlackMale() {
		return pupilsBlackMale;
	}

	public void setPupilsBlackMale(Long pupilsBlackMale) {
		this.pupilsBlackMale = pupilsBlackMale;
	}
	@JsonIgnore
	public void setPupilsBlackMale(String o) {
		this.pupilsBlackMale = ReportCard.staticSetPupilsBlackMale(siteRequest_, o);
	}
	public static Long staticSetPupilsBlackMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsBlackMaleInit() {
		Wrap<Long> pupilsBlackMaleWrap = new Wrap<Long>().var("pupilsBlackMale");
		if(pupilsBlackMale == null) {
			_pupilsBlackMale(pupilsBlackMaleWrap);
			setPupilsBlackMale(pupilsBlackMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsBlackMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsBlackMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsBlackMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsBlackMale(siteRequest_, ReportCard.staticSearchPupilsBlackMale(siteRequest_, ReportCard.staticSetPupilsBlackMale(siteRequest_, o)));
	}

	//////////////////////
	// pupilsBlackTotal //
	//////////////////////

	/**	 The entity pupilsBlackTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsBlackTotal;

	/**	<br> The entity pupilsBlackTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsBlackTotal">Find the entity pupilsBlackTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsBlackTotal(Wrap<Long> c);

	public Long getPupilsBlackTotal() {
		return pupilsBlackTotal;
	}

	public void setPupilsBlackTotal(Long pupilsBlackTotal) {
		this.pupilsBlackTotal = pupilsBlackTotal;
	}
	@JsonIgnore
	public void setPupilsBlackTotal(String o) {
		this.pupilsBlackTotal = ReportCard.staticSetPupilsBlackTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsBlackTotalInit() {
		Wrap<Long> pupilsBlackTotalWrap = new Wrap<Long>().var("pupilsBlackTotal");
		if(pupilsBlackTotal == null) {
			_pupilsBlackTotal(pupilsBlackTotalWrap);
			setPupilsBlackTotal(pupilsBlackTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsBlackTotal(siteRequest_, ReportCard.staticSearchPupilsBlackTotal(siteRequest_, ReportCard.staticSetPupilsBlackTotal(siteRequest_, o)));
	}

	////////////////////////
	// pupilsBlackPercent //
	////////////////////////

	/**	 The entity pupilsBlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsBlackPercent;

	/**	<br> The entity pupilsBlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsBlackPercent">Find the entity pupilsBlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsBlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsBlackPercent() {
		return pupilsBlackPercent;
	}

	public void setPupilsBlackPercent(BigDecimal pupilsBlackPercent) {
		this.pupilsBlackPercent = pupilsBlackPercent;
	}
	@JsonIgnore
	public void setPupilsBlackPercent(String o) {
		this.pupilsBlackPercent = ReportCard.staticSetPupilsBlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsBlackPercent(Double o) {
			this.pupilsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsBlackPercent(Integer o) {
			this.pupilsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsBlackPercentInit() {
		Wrap<BigDecimal> pupilsBlackPercentWrap = new Wrap<BigDecimal>().var("pupilsBlackPercent");
		if(pupilsBlackPercent == null) {
			_pupilsBlackPercent(pupilsBlackPercentWrap);
			setPupilsBlackPercent(pupilsBlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsBlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsBlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsBlackPercent(siteRequest_, ReportCard.staticSearchPupilsBlackPercent(siteRequest_, ReportCard.staticSetPupilsBlackPercent(siteRequest_, o)));
	}

	///////////////////////
	// pupilsWhiteFemale //
	///////////////////////

	/**	 The entity pupilsWhiteFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsWhiteFemale;

	/**	<br> The entity pupilsWhiteFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsWhiteFemale">Find the entity pupilsWhiteFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsWhiteFemale(Wrap<Long> c);

	public Long getPupilsWhiteFemale() {
		return pupilsWhiteFemale;
	}

	public void setPupilsWhiteFemale(Long pupilsWhiteFemale) {
		this.pupilsWhiteFemale = pupilsWhiteFemale;
	}
	@JsonIgnore
	public void setPupilsWhiteFemale(String o) {
		this.pupilsWhiteFemale = ReportCard.staticSetPupilsWhiteFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsWhiteFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsWhiteFemaleInit() {
		Wrap<Long> pupilsWhiteFemaleWrap = new Wrap<Long>().var("pupilsWhiteFemale");
		if(pupilsWhiteFemale == null) {
			_pupilsWhiteFemale(pupilsWhiteFemaleWrap);
			setPupilsWhiteFemale(pupilsWhiteFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsWhiteFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsWhiteFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsWhiteFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsWhiteFemale(siteRequest_, ReportCard.staticSearchPupilsWhiteFemale(siteRequest_, ReportCard.staticSetPupilsWhiteFemale(siteRequest_, o)));
	}

	/////////////////////
	// pupilsWhiteMale //
	/////////////////////

	/**	 The entity pupilsWhiteMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsWhiteMale;

	/**	<br> The entity pupilsWhiteMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsWhiteMale">Find the entity pupilsWhiteMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsWhiteMale(Wrap<Long> c);

	public Long getPupilsWhiteMale() {
		return pupilsWhiteMale;
	}

	public void setPupilsWhiteMale(Long pupilsWhiteMale) {
		this.pupilsWhiteMale = pupilsWhiteMale;
	}
	@JsonIgnore
	public void setPupilsWhiteMale(String o) {
		this.pupilsWhiteMale = ReportCard.staticSetPupilsWhiteMale(siteRequest_, o);
	}
	public static Long staticSetPupilsWhiteMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsWhiteMaleInit() {
		Wrap<Long> pupilsWhiteMaleWrap = new Wrap<Long>().var("pupilsWhiteMale");
		if(pupilsWhiteMale == null) {
			_pupilsWhiteMale(pupilsWhiteMaleWrap);
			setPupilsWhiteMale(pupilsWhiteMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsWhiteMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsWhiteMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsWhiteMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsWhiteMale(siteRequest_, ReportCard.staticSearchPupilsWhiteMale(siteRequest_, ReportCard.staticSetPupilsWhiteMale(siteRequest_, o)));
	}

	//////////////////////
	// pupilsWhiteTotal //
	//////////////////////

	/**	 The entity pupilsWhiteTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsWhiteTotal;

	/**	<br> The entity pupilsWhiteTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsWhiteTotal">Find the entity pupilsWhiteTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsWhiteTotal(Wrap<Long> c);

	public Long getPupilsWhiteTotal() {
		return pupilsWhiteTotal;
	}

	public void setPupilsWhiteTotal(Long pupilsWhiteTotal) {
		this.pupilsWhiteTotal = pupilsWhiteTotal;
	}
	@JsonIgnore
	public void setPupilsWhiteTotal(String o) {
		this.pupilsWhiteTotal = ReportCard.staticSetPupilsWhiteTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsWhiteTotalInit() {
		Wrap<Long> pupilsWhiteTotalWrap = new Wrap<Long>().var("pupilsWhiteTotal");
		if(pupilsWhiteTotal == null) {
			_pupilsWhiteTotal(pupilsWhiteTotalWrap);
			setPupilsWhiteTotal(pupilsWhiteTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsWhiteTotal(siteRequest_, ReportCard.staticSearchPupilsWhiteTotal(siteRequest_, ReportCard.staticSetPupilsWhiteTotal(siteRequest_, o)));
	}

	////////////////////////
	// pupilsWhitePercent //
	////////////////////////

	/**	 The entity pupilsWhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsWhitePercent;

	/**	<br> The entity pupilsWhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsWhitePercent">Find the entity pupilsWhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsWhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsWhitePercent() {
		return pupilsWhitePercent;
	}

	public void setPupilsWhitePercent(BigDecimal pupilsWhitePercent) {
		this.pupilsWhitePercent = pupilsWhitePercent;
	}
	@JsonIgnore
	public void setPupilsWhitePercent(String o) {
		this.pupilsWhitePercent = ReportCard.staticSetPupilsWhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsWhitePercent(Double o) {
			this.pupilsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsWhitePercent(Integer o) {
			this.pupilsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsWhitePercentInit() {
		Wrap<BigDecimal> pupilsWhitePercentWrap = new Wrap<BigDecimal>().var("pupilsWhitePercent");
		if(pupilsWhitePercent == null) {
			_pupilsWhitePercent(pupilsWhitePercentWrap);
			setPupilsWhitePercent(pupilsWhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsWhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsWhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsWhitePercent(siteRequest_, ReportCard.staticSearchPupilsWhitePercent(siteRequest_, ReportCard.staticSetPupilsWhitePercent(siteRequest_, o)));
	}

	/////////////////////////////////
	// pupilsPacificIslanderFemale //
	/////////////////////////////////

	/**	 The entity pupilsPacificIslanderFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsPacificIslanderFemale;

	/**	<br> The entity pupilsPacificIslanderFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsPacificIslanderFemale">Find the entity pupilsPacificIslanderFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsPacificIslanderFemale(Wrap<Long> c);

	public Long getPupilsPacificIslanderFemale() {
		return pupilsPacificIslanderFemale;
	}

	public void setPupilsPacificIslanderFemale(Long pupilsPacificIslanderFemale) {
		this.pupilsPacificIslanderFemale = pupilsPacificIslanderFemale;
	}
	@JsonIgnore
	public void setPupilsPacificIslanderFemale(String o) {
		this.pupilsPacificIslanderFemale = ReportCard.staticSetPupilsPacificIslanderFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsPacificIslanderFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsPacificIslanderFemaleInit() {
		Wrap<Long> pupilsPacificIslanderFemaleWrap = new Wrap<Long>().var("pupilsPacificIslanderFemale");
		if(pupilsPacificIslanderFemale == null) {
			_pupilsPacificIslanderFemale(pupilsPacificIslanderFemaleWrap);
			setPupilsPacificIslanderFemale(pupilsPacificIslanderFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsPacificIslanderFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsPacificIslanderFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsPacificIslanderFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsPacificIslanderFemale(siteRequest_, ReportCard.staticSearchPupilsPacificIslanderFemale(siteRequest_, ReportCard.staticSetPupilsPacificIslanderFemale(siteRequest_, o)));
	}

	///////////////////////////////
	// pupilsPacificIslanderMale //
	///////////////////////////////

	/**	 The entity pupilsPacificIslanderMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsPacificIslanderMale;

	/**	<br> The entity pupilsPacificIslanderMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsPacificIslanderMale">Find the entity pupilsPacificIslanderMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsPacificIslanderMale(Wrap<Long> c);

	public Long getPupilsPacificIslanderMale() {
		return pupilsPacificIslanderMale;
	}

	public void setPupilsPacificIslanderMale(Long pupilsPacificIslanderMale) {
		this.pupilsPacificIslanderMale = pupilsPacificIslanderMale;
	}
	@JsonIgnore
	public void setPupilsPacificIslanderMale(String o) {
		this.pupilsPacificIslanderMale = ReportCard.staticSetPupilsPacificIslanderMale(siteRequest_, o);
	}
	public static Long staticSetPupilsPacificIslanderMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsPacificIslanderMaleInit() {
		Wrap<Long> pupilsPacificIslanderMaleWrap = new Wrap<Long>().var("pupilsPacificIslanderMale");
		if(pupilsPacificIslanderMale == null) {
			_pupilsPacificIslanderMale(pupilsPacificIslanderMaleWrap);
			setPupilsPacificIslanderMale(pupilsPacificIslanderMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsPacificIslanderMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsPacificIslanderMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsPacificIslanderMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsPacificIslanderMale(siteRequest_, ReportCard.staticSearchPupilsPacificIslanderMale(siteRequest_, ReportCard.staticSetPupilsPacificIslanderMale(siteRequest_, o)));
	}

	////////////////////////////////
	// pupilsPacificIslanderTotal //
	////////////////////////////////

	/**	 The entity pupilsPacificIslanderTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsPacificIslanderTotal;

	/**	<br> The entity pupilsPacificIslanderTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsPacificIslanderTotal">Find the entity pupilsPacificIslanderTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsPacificIslanderTotal(Wrap<Long> c);

	public Long getPupilsPacificIslanderTotal() {
		return pupilsPacificIslanderTotal;
	}

	public void setPupilsPacificIslanderTotal(Long pupilsPacificIslanderTotal) {
		this.pupilsPacificIslanderTotal = pupilsPacificIslanderTotal;
	}
	@JsonIgnore
	public void setPupilsPacificIslanderTotal(String o) {
		this.pupilsPacificIslanderTotal = ReportCard.staticSetPupilsPacificIslanderTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsPacificIslanderTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsPacificIslanderTotalInit() {
		Wrap<Long> pupilsPacificIslanderTotalWrap = new Wrap<Long>().var("pupilsPacificIslanderTotal");
		if(pupilsPacificIslanderTotal == null) {
			_pupilsPacificIslanderTotal(pupilsPacificIslanderTotalWrap);
			setPupilsPacificIslanderTotal(pupilsPacificIslanderTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsPacificIslanderTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsPacificIslanderTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsPacificIslanderTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsPacificIslanderTotal(siteRequest_, ReportCard.staticSearchPupilsPacificIslanderTotal(siteRequest_, ReportCard.staticSetPupilsPacificIslanderTotal(siteRequest_, o)));
	}

	//////////////////////////////////
	// pupilsPacificIslanderPercent //
	//////////////////////////////////

	/**	 The entity pupilsPacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsPacificIslanderPercent;

	/**	<br> The entity pupilsPacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsPacificIslanderPercent">Find the entity pupilsPacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsPacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsPacificIslanderPercent() {
		return pupilsPacificIslanderPercent;
	}

	public void setPupilsPacificIslanderPercent(BigDecimal pupilsPacificIslanderPercent) {
		this.pupilsPacificIslanderPercent = pupilsPacificIslanderPercent;
	}
	@JsonIgnore
	public void setPupilsPacificIslanderPercent(String o) {
		this.pupilsPacificIslanderPercent = ReportCard.staticSetPupilsPacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsPacificIslanderPercent(Double o) {
			this.pupilsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsPacificIslanderPercent(Integer o) {
			this.pupilsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsPacificIslanderPercentInit() {
		Wrap<BigDecimal> pupilsPacificIslanderPercentWrap = new Wrap<BigDecimal>().var("pupilsPacificIslanderPercent");
		if(pupilsPacificIslanderPercent == null) {
			_pupilsPacificIslanderPercent(pupilsPacificIslanderPercentWrap);
			setPupilsPacificIslanderPercent(pupilsPacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsPacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsPacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsPacificIslanderPercent(siteRequest_, ReportCard.staticSearchPupilsPacificIslanderPercent(siteRequest_, ReportCard.staticSetPupilsPacificIslanderPercent(siteRequest_, o)));
	}

	/////////////////////////////
	// pupilsMultiRacialFemale //
	/////////////////////////////

	/**	 The entity pupilsMultiRacialFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsMultiRacialFemale;

	/**	<br> The entity pupilsMultiRacialFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsMultiRacialFemale">Find the entity pupilsMultiRacialFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsMultiRacialFemale(Wrap<Long> c);

	public Long getPupilsMultiRacialFemale() {
		return pupilsMultiRacialFemale;
	}

	public void setPupilsMultiRacialFemale(Long pupilsMultiRacialFemale) {
		this.pupilsMultiRacialFemale = pupilsMultiRacialFemale;
	}
	@JsonIgnore
	public void setPupilsMultiRacialFemale(String o) {
		this.pupilsMultiRacialFemale = ReportCard.staticSetPupilsMultiRacialFemale(siteRequest_, o);
	}
	public static Long staticSetPupilsMultiRacialFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsMultiRacialFemaleInit() {
		Wrap<Long> pupilsMultiRacialFemaleWrap = new Wrap<Long>().var("pupilsMultiRacialFemale");
		if(pupilsMultiRacialFemale == null) {
			_pupilsMultiRacialFemale(pupilsMultiRacialFemaleWrap);
			setPupilsMultiRacialFemale(pupilsMultiRacialFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsMultiRacialFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsMultiRacialFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsMultiRacialFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsMultiRacialFemale(siteRequest_, ReportCard.staticSearchPupilsMultiRacialFemale(siteRequest_, ReportCard.staticSetPupilsMultiRacialFemale(siteRequest_, o)));
	}

	///////////////////////////
	// pupilsMultiRacialMale //
	///////////////////////////

	/**	 The entity pupilsMultiRacialMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsMultiRacialMale;

	/**	<br> The entity pupilsMultiRacialMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsMultiRacialMale">Find the entity pupilsMultiRacialMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsMultiRacialMale(Wrap<Long> c);

	public Long getPupilsMultiRacialMale() {
		return pupilsMultiRacialMale;
	}

	public void setPupilsMultiRacialMale(Long pupilsMultiRacialMale) {
		this.pupilsMultiRacialMale = pupilsMultiRacialMale;
	}
	@JsonIgnore
	public void setPupilsMultiRacialMale(String o) {
		this.pupilsMultiRacialMale = ReportCard.staticSetPupilsMultiRacialMale(siteRequest_, o);
	}
	public static Long staticSetPupilsMultiRacialMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsMultiRacialMaleInit() {
		Wrap<Long> pupilsMultiRacialMaleWrap = new Wrap<Long>().var("pupilsMultiRacialMale");
		if(pupilsMultiRacialMale == null) {
			_pupilsMultiRacialMale(pupilsMultiRacialMaleWrap);
			setPupilsMultiRacialMale(pupilsMultiRacialMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsMultiRacialMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsMultiRacialMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsMultiRacialMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsMultiRacialMale(siteRequest_, ReportCard.staticSearchPupilsMultiRacialMale(siteRequest_, ReportCard.staticSetPupilsMultiRacialMale(siteRequest_, o)));
	}

	////////////////////////////
	// pupilsMultiRacialTotal //
	////////////////////////////

	/**	 The entity pupilsMultiRacialTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long pupilsMultiRacialTotal;

	/**	<br> The entity pupilsMultiRacialTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsMultiRacialTotal">Find the entity pupilsMultiRacialTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsMultiRacialTotal(Wrap<Long> c);

	public Long getPupilsMultiRacialTotal() {
		return pupilsMultiRacialTotal;
	}

	public void setPupilsMultiRacialTotal(Long pupilsMultiRacialTotal) {
		this.pupilsMultiRacialTotal = pupilsMultiRacialTotal;
	}
	@JsonIgnore
	public void setPupilsMultiRacialTotal(String o) {
		this.pupilsMultiRacialTotal = ReportCard.staticSetPupilsMultiRacialTotal(siteRequest_, o);
	}
	public static Long staticSetPupilsMultiRacialTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard pupilsMultiRacialTotalInit() {
		Wrap<Long> pupilsMultiRacialTotalWrap = new Wrap<Long>().var("pupilsMultiRacialTotal");
		if(pupilsMultiRacialTotal == null) {
			_pupilsMultiRacialTotal(pupilsMultiRacialTotalWrap);
			setPupilsMultiRacialTotal(pupilsMultiRacialTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchPupilsMultiRacialTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrPupilsMultiRacialTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsMultiRacialTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsMultiRacialTotal(siteRequest_, ReportCard.staticSearchPupilsMultiRacialTotal(siteRequest_, ReportCard.staticSetPupilsMultiRacialTotal(siteRequest_, o)));
	}

	//////////////////////////////
	// pupilsMultiRacialPercent //
	//////////////////////////////

	/**	 The entity pupilsMultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsMultiRacialPercent;

	/**	<br> The entity pupilsMultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsMultiRacialPercent">Find the entity pupilsMultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsMultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsMultiRacialPercent() {
		return pupilsMultiRacialPercent;
	}

	public void setPupilsMultiRacialPercent(BigDecimal pupilsMultiRacialPercent) {
		this.pupilsMultiRacialPercent = pupilsMultiRacialPercent;
	}
	@JsonIgnore
	public void setPupilsMultiRacialPercent(String o) {
		this.pupilsMultiRacialPercent = ReportCard.staticSetPupilsMultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsMultiRacialPercent(Double o) {
			this.pupilsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsMultiRacialPercent(Integer o) {
			this.pupilsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsMultiRacialPercentInit() {
		Wrap<BigDecimal> pupilsMultiRacialPercentWrap = new Wrap<BigDecimal>().var("pupilsMultiRacialPercent");
		if(pupilsMultiRacialPercent == null) {
			_pupilsMultiRacialPercent(pupilsMultiRacialPercentWrap);
			setPupilsMultiRacialPercent(pupilsMultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsMultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsMultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsMultiRacialPercent(siteRequest_, ReportCard.staticSearchPupilsMultiRacialPercent(siteRequest_, ReportCard.staticSetPupilsMultiRacialPercent(siteRequest_, o)));
	}

	////////////////////////
	// pupilsOtherPercent //
	////////////////////////

	/**	 The entity pupilsOtherPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal pupilsOtherPercent;

	/**	<br> The entity pupilsOtherPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pupilsOtherPercent">Find the entity pupilsOtherPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pupilsOtherPercent(Wrap<BigDecimal> c);

	public BigDecimal getPupilsOtherPercent() {
		return pupilsOtherPercent;
	}

	public void setPupilsOtherPercent(BigDecimal pupilsOtherPercent) {
		this.pupilsOtherPercent = pupilsOtherPercent;
	}
	@JsonIgnore
	public void setPupilsOtherPercent(String o) {
		this.pupilsOtherPercent = ReportCard.staticSetPupilsOtherPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetPupilsOtherPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPupilsOtherPercent(Double o) {
			this.pupilsOtherPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setPupilsOtherPercent(Integer o) {
			this.pupilsOtherPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard pupilsOtherPercentInit() {
		Wrap<BigDecimal> pupilsOtherPercentWrap = new Wrap<BigDecimal>().var("pupilsOtherPercent");
		if(pupilsOtherPercent == null) {
			_pupilsOtherPercent(pupilsOtherPercentWrap);
			setPupilsOtherPercent(pupilsOtherPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchPupilsOtherPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPupilsOtherPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPupilsOtherPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrPupilsOtherPercent(siteRequest_, ReportCard.staticSearchPupilsOtherPercent(siteRequest_, ReportCard.staticSetPupilsOtherPercent(siteRequest_, o)));
	}

	//////////////////
	// teachersMale //
	//////////////////

	/**	 The entity teachersMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersMale;

	/**	<br> The entity teachersMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersMale">Find the entity teachersMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersMale(Wrap<Long> c);

	public Long getTeachersMale() {
		return teachersMale;
	}

	public void setTeachersMale(Long teachersMale) {
		this.teachersMale = teachersMale;
	}
	@JsonIgnore
	public void setTeachersMale(String o) {
		this.teachersMale = ReportCard.staticSetTeachersMale(siteRequest_, o);
	}
	public static Long staticSetTeachersMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersMaleInit() {
		Wrap<Long> teachersMaleWrap = new Wrap<Long>().var("teachersMale");
		if(teachersMale == null) {
			_teachersMale(teachersMaleWrap);
			setTeachersMale(teachersMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersMale(siteRequest_, ReportCard.staticSearchTeachersMale(siteRequest_, ReportCard.staticSetTeachersMale(siteRequest_, o)));
	}

	////////////////////
	// teachersFemale //
	////////////////////

	/**	 The entity teachersFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersFemale;

	/**	<br> The entity teachersFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersFemale">Find the entity teachersFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersFemale(Wrap<Long> c);

	public Long getTeachersFemale() {
		return teachersFemale;
	}

	public void setTeachersFemale(Long teachersFemale) {
		this.teachersFemale = teachersFemale;
	}
	@JsonIgnore
	public void setTeachersFemale(String o) {
		this.teachersFemale = ReportCard.staticSetTeachersFemale(siteRequest_, o);
	}
	public static Long staticSetTeachersFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersFemaleInit() {
		Wrap<Long> teachersFemaleWrap = new Wrap<Long>().var("teachersFemale");
		if(teachersFemale == null) {
			_teachersFemale(teachersFemaleWrap);
			setTeachersFemale(teachersFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersFemale(siteRequest_, ReportCard.staticSearchTeachersFemale(siteRequest_, ReportCard.staticSetTeachersFemale(siteRequest_, o)));
	}

	///////////////////
	// teachersTotal //
	///////////////////

	/**	 The entity teachersTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersTotal;

	/**	<br> The entity teachersTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersTotal">Find the entity teachersTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersTotal(Wrap<Long> c);

	public Long getTeachersTotal() {
		return teachersTotal;
	}

	public void setTeachersTotal(Long teachersTotal) {
		this.teachersTotal = teachersTotal;
	}
	@JsonIgnore
	public void setTeachersTotal(String o) {
		this.teachersTotal = ReportCard.staticSetTeachersTotal(siteRequest_, o);
	}
	public static Long staticSetTeachersTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersTotalInit() {
		Wrap<Long> teachersTotalWrap = new Wrap<Long>().var("teachersTotal");
		if(teachersTotal == null) {
			_teachersTotal(teachersTotalWrap);
			setTeachersTotal(teachersTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersTotal(siteRequest_, ReportCard.staticSearchTeachersTotal(siteRequest_, ReportCard.staticSetTeachersTotal(siteRequest_, o)));
	}

	////////////////////////
	// teachersWhiteTotal //
	////////////////////////

	/**	 The entity teachersWhiteTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersWhiteTotal;

	/**	<br> The entity teachersWhiteTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersWhiteTotal">Find the entity teachersWhiteTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersWhiteTotal(Wrap<Long> c);

	public Long getTeachersWhiteTotal() {
		return teachersWhiteTotal;
	}

	public void setTeachersWhiteTotal(Long teachersWhiteTotal) {
		this.teachersWhiteTotal = teachersWhiteTotal;
	}
	@JsonIgnore
	public void setTeachersWhiteTotal(String o) {
		this.teachersWhiteTotal = ReportCard.staticSetTeachersWhiteTotal(siteRequest_, o);
	}
	public static Long staticSetTeachersWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersWhiteTotalInit() {
		Wrap<Long> teachersWhiteTotalWrap = new Wrap<Long>().var("teachersWhiteTotal");
		if(teachersWhiteTotal == null) {
			_teachersWhiteTotal(teachersWhiteTotalWrap);
			setTeachersWhiteTotal(teachersWhiteTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersWhiteTotal(siteRequest_, ReportCard.staticSearchTeachersWhiteTotal(siteRequest_, ReportCard.staticSetTeachersWhiteTotal(siteRequest_, o)));
	}

	//////////////////////////
	// teachersWhitePercent //
	//////////////////////////

	/**	 The entity teachersWhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal teachersWhitePercent;

	/**	<br> The entity teachersWhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersWhitePercent">Find the entity teachersWhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersWhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getTeachersWhitePercent() {
		return teachersWhitePercent;
	}

	public void setTeachersWhitePercent(BigDecimal teachersWhitePercent) {
		this.teachersWhitePercent = teachersWhitePercent;
	}
	@JsonIgnore
	public void setTeachersWhitePercent(String o) {
		this.teachersWhitePercent = ReportCard.staticSetTeachersWhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetTeachersWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setTeachersWhitePercent(Double o) {
			this.teachersWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setTeachersWhitePercent(Integer o) {
			this.teachersWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard teachersWhitePercentInit() {
		Wrap<BigDecimal> teachersWhitePercentWrap = new Wrap<BigDecimal>().var("teachersWhitePercent");
		if(teachersWhitePercent == null) {
			_teachersWhitePercent(teachersWhitePercentWrap);
			setTeachersWhitePercent(teachersWhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchTeachersWhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTeachersWhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersWhitePercent(siteRequest_, ReportCard.staticSearchTeachersWhitePercent(siteRequest_, ReportCard.staticSetTeachersWhitePercent(siteRequest_, o)));
	}

	////////////////////////
	// teachersBlackTotal //
	////////////////////////

	/**	 The entity teachersBlackTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersBlackTotal;

	/**	<br> The entity teachersBlackTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersBlackTotal">Find the entity teachersBlackTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersBlackTotal(Wrap<Long> c);

	public Long getTeachersBlackTotal() {
		return teachersBlackTotal;
	}

	public void setTeachersBlackTotal(Long teachersBlackTotal) {
		this.teachersBlackTotal = teachersBlackTotal;
	}
	@JsonIgnore
	public void setTeachersBlackTotal(String o) {
		this.teachersBlackTotal = ReportCard.staticSetTeachersBlackTotal(siteRequest_, o);
	}
	public static Long staticSetTeachersBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersBlackTotalInit() {
		Wrap<Long> teachersBlackTotalWrap = new Wrap<Long>().var("teachersBlackTotal");
		if(teachersBlackTotal == null) {
			_teachersBlackTotal(teachersBlackTotalWrap);
			setTeachersBlackTotal(teachersBlackTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersBlackTotal(siteRequest_, ReportCard.staticSearchTeachersBlackTotal(siteRequest_, ReportCard.staticSetTeachersBlackTotal(siteRequest_, o)));
	}

	//////////////////////////
	// teachersBlackPercent //
	//////////////////////////

	/**	 The entity teachersBlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal teachersBlackPercent;

	/**	<br> The entity teachersBlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersBlackPercent">Find the entity teachersBlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersBlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getTeachersBlackPercent() {
		return teachersBlackPercent;
	}

	public void setTeachersBlackPercent(BigDecimal teachersBlackPercent) {
		this.teachersBlackPercent = teachersBlackPercent;
	}
	@JsonIgnore
	public void setTeachersBlackPercent(String o) {
		this.teachersBlackPercent = ReportCard.staticSetTeachersBlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetTeachersBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setTeachersBlackPercent(Double o) {
			this.teachersBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setTeachersBlackPercent(Integer o) {
			this.teachersBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard teachersBlackPercentInit() {
		Wrap<BigDecimal> teachersBlackPercentWrap = new Wrap<BigDecimal>().var("teachersBlackPercent");
		if(teachersBlackPercent == null) {
			_teachersBlackPercent(teachersBlackPercentWrap);
			setTeachersBlackPercent(teachersBlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchTeachersBlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTeachersBlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersBlackPercent(siteRequest_, ReportCard.staticSearchTeachersBlackPercent(siteRequest_, ReportCard.staticSetTeachersBlackPercent(siteRequest_, o)));
	}

	////////////////////////
	// teachersOtherTotal //
	////////////////////////

	/**	 The entity teachersOtherTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long teachersOtherTotal;

	/**	<br> The entity teachersOtherTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersOtherTotal">Find the entity teachersOtherTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersOtherTotal(Wrap<Long> c);

	public Long getTeachersOtherTotal() {
		return teachersOtherTotal;
	}

	public void setTeachersOtherTotal(Long teachersOtherTotal) {
		this.teachersOtherTotal = teachersOtherTotal;
	}
	@JsonIgnore
	public void setTeachersOtherTotal(String o) {
		this.teachersOtherTotal = ReportCard.staticSetTeachersOtherTotal(siteRequest_, o);
	}
	public static Long staticSetTeachersOtherTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard teachersOtherTotalInit() {
		Wrap<Long> teachersOtherTotalWrap = new Wrap<Long>().var("teachersOtherTotal");
		if(teachersOtherTotal == null) {
			_teachersOtherTotal(teachersOtherTotalWrap);
			setTeachersOtherTotal(teachersOtherTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchTeachersOtherTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrTeachersOtherTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersOtherTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersOtherTotal(siteRequest_, ReportCard.staticSearchTeachersOtherTotal(siteRequest_, ReportCard.staticSetTeachersOtherTotal(siteRequest_, o)));
	}

	//////////////////////////
	// teachersOtherPercent //
	//////////////////////////

	/**	 The entity teachersOtherPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal teachersOtherPercent;

	/**	<br> The entity teachersOtherPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:teachersOtherPercent">Find the entity teachersOtherPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _teachersOtherPercent(Wrap<BigDecimal> c);

	public BigDecimal getTeachersOtherPercent() {
		return teachersOtherPercent;
	}

	public void setTeachersOtherPercent(BigDecimal teachersOtherPercent) {
		this.teachersOtherPercent = teachersOtherPercent;
	}
	@JsonIgnore
	public void setTeachersOtherPercent(String o) {
		this.teachersOtherPercent = ReportCard.staticSetTeachersOtherPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetTeachersOtherPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setTeachersOtherPercent(Double o) {
			this.teachersOtherPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setTeachersOtherPercent(Integer o) {
			this.teachersOtherPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard teachersOtherPercentInit() {
		Wrap<BigDecimal> teachersOtherPercentWrap = new Wrap<BigDecimal>().var("teachersOtherPercent");
		if(teachersOtherPercent == null) {
			_teachersOtherPercent(teachersOtherPercentWrap);
			setTeachersOtherPercent(teachersOtherPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchTeachersOtherPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrTeachersOtherPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTeachersOtherPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrTeachersOtherPercent(siteRequest_, ReportCard.staticSearchTeachersOtherPercent(siteRequest_, ReportCard.staticSetTeachersOtherPercent(siteRequest_, o)));
	}

	///////////////////////////////
	// delinquentComplaintsTotal //
	///////////////////////////////

	/**	 The entity delinquentComplaintsTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsTotal;

	/**	<br> The entity delinquentComplaintsTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsTotal">Find the entity delinquentComplaintsTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsTotal(Wrap<Long> c);

	public Long getDelinquentComplaintsTotal() {
		return delinquentComplaintsTotal;
	}

	public void setDelinquentComplaintsTotal(Long delinquentComplaintsTotal) {
		this.delinquentComplaintsTotal = delinquentComplaintsTotal;
	}
	@JsonIgnore
	public void setDelinquentComplaintsTotal(String o) {
		this.delinquentComplaintsTotal = ReportCard.staticSetDelinquentComplaintsTotal(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsTotalInit() {
		Wrap<Long> delinquentComplaintsTotalWrap = new Wrap<Long>().var("delinquentComplaintsTotal");
		if(delinquentComplaintsTotal == null) {
			_delinquentComplaintsTotal(delinquentComplaintsTotalWrap);
			setDelinquentComplaintsTotal(delinquentComplaintsTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsTotal(siteRequest_, ReportCard.staticSearchDelinquentComplaintsTotal(siteRequest_, ReportCard.staticSetDelinquentComplaintsTotal(siteRequest_, o)));
	}

	//////////////////////////////////
	// delinquentComplaintsAtSchool //
	//////////////////////////////////

	/**	 The entity delinquentComplaintsAtSchool
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsAtSchool;

	/**	<br> The entity delinquentComplaintsAtSchool
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsAtSchool">Find the entity delinquentComplaintsAtSchool in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsAtSchool(Wrap<Long> c);

	public Long getDelinquentComplaintsAtSchool() {
		return delinquentComplaintsAtSchool;
	}

	public void setDelinquentComplaintsAtSchool(Long delinquentComplaintsAtSchool) {
		this.delinquentComplaintsAtSchool = delinquentComplaintsAtSchool;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAtSchool(String o) {
		this.delinquentComplaintsAtSchool = ReportCard.staticSetDelinquentComplaintsAtSchool(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsAtSchool(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsAtSchoolInit() {
		Wrap<Long> delinquentComplaintsAtSchoolWrap = new Wrap<Long>().var("delinquentComplaintsAtSchool");
		if(delinquentComplaintsAtSchool == null) {
			_delinquentComplaintsAtSchool(delinquentComplaintsAtSchoolWrap);
			setDelinquentComplaintsAtSchool(delinquentComplaintsAtSchoolWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsAtSchool(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsAtSchool(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsAtSchool(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsAtSchool(siteRequest_, ReportCard.staticSearchDelinquentComplaintsAtSchool(siteRequest_, ReportCard.staticSetDelinquentComplaintsAtSchool(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// delinquentComplaintsAtSchoolPercent //
	/////////////////////////////////////////

	/**	 The entity delinquentComplaintsAtSchoolPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsAtSchoolPercent;

	/**	<br> The entity delinquentComplaintsAtSchoolPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsAtSchoolPercent">Find the entity delinquentComplaintsAtSchoolPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsAtSchoolPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsAtSchoolPercent() {
		return delinquentComplaintsAtSchoolPercent;
	}

	public void setDelinquentComplaintsAtSchoolPercent(BigDecimal delinquentComplaintsAtSchoolPercent) {
		this.delinquentComplaintsAtSchoolPercent = delinquentComplaintsAtSchoolPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAtSchoolPercent(String o) {
		this.delinquentComplaintsAtSchoolPercent = ReportCard.staticSetDelinquentComplaintsAtSchoolPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsAtSchoolPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAtSchoolPercent(Double o) {
			this.delinquentComplaintsAtSchoolPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsAtSchoolPercent(Integer o) {
			this.delinquentComplaintsAtSchoolPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsAtSchoolPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsAtSchoolPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsAtSchoolPercent");
		if(delinquentComplaintsAtSchoolPercent == null) {
			_delinquentComplaintsAtSchoolPercent(delinquentComplaintsAtSchoolPercentWrap);
			setDelinquentComplaintsAtSchoolPercent(delinquentComplaintsAtSchoolPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsAtSchoolPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsAtSchoolPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsAtSchoolPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsAtSchoolPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsAtSchoolPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsAtSchoolPercent(siteRequest_, o)));
	}

	///////////////////////////////
	// delinquentComplaintsAsian //
	///////////////////////////////

	/**	 The entity delinquentComplaintsAsian
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsAsian;

	/**	<br> The entity delinquentComplaintsAsian
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsAsian">Find the entity delinquentComplaintsAsian in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsAsian(Wrap<Long> c);

	public Long getDelinquentComplaintsAsian() {
		return delinquentComplaintsAsian;
	}

	public void setDelinquentComplaintsAsian(Long delinquentComplaintsAsian) {
		this.delinquentComplaintsAsian = delinquentComplaintsAsian;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAsian(String o) {
		this.delinquentComplaintsAsian = ReportCard.staticSetDelinquentComplaintsAsian(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsAsian(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsAsianInit() {
		Wrap<Long> delinquentComplaintsAsianWrap = new Wrap<Long>().var("delinquentComplaintsAsian");
		if(delinquentComplaintsAsian == null) {
			_delinquentComplaintsAsian(delinquentComplaintsAsianWrap);
			setDelinquentComplaintsAsian(delinquentComplaintsAsianWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsAsian(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsAsian(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsAsian(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsAsian(siteRequest_, ReportCard.staticSearchDelinquentComplaintsAsian(siteRequest_, ReportCard.staticSetDelinquentComplaintsAsian(siteRequest_, o)));
	}

	//////////////////////////////////////
	// delinquentComplaintsAsianPercent //
	//////////////////////////////////////

	/**	 The entity delinquentComplaintsAsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsAsianPercent;

	/**	<br> The entity delinquentComplaintsAsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsAsianPercent">Find the entity delinquentComplaintsAsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsAsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsAsianPercent() {
		return delinquentComplaintsAsianPercent;
	}

	public void setDelinquentComplaintsAsianPercent(BigDecimal delinquentComplaintsAsianPercent) {
		this.delinquentComplaintsAsianPercent = delinquentComplaintsAsianPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAsianPercent(String o) {
		this.delinquentComplaintsAsianPercent = ReportCard.staticSetDelinquentComplaintsAsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsAsianPercent(Double o) {
			this.delinquentComplaintsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsAsianPercent(Integer o) {
			this.delinquentComplaintsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsAsianPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsAsianPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsAsianPercent");
		if(delinquentComplaintsAsianPercent == null) {
			_delinquentComplaintsAsianPercent(delinquentComplaintsAsianPercentWrap);
			setDelinquentComplaintsAsianPercent(delinquentComplaintsAsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsAsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsAsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsAsianPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsAsianPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsAsianPercent(siteRequest_, o)));
	}

	///////////////////////////////
	// delinquentComplaintsBlack //
	///////////////////////////////

	/**	 The entity delinquentComplaintsBlack
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsBlack;

	/**	<br> The entity delinquentComplaintsBlack
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsBlack">Find the entity delinquentComplaintsBlack in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsBlack(Wrap<Long> c);

	public Long getDelinquentComplaintsBlack() {
		return delinquentComplaintsBlack;
	}

	public void setDelinquentComplaintsBlack(Long delinquentComplaintsBlack) {
		this.delinquentComplaintsBlack = delinquentComplaintsBlack;
	}
	@JsonIgnore
	public void setDelinquentComplaintsBlack(String o) {
		this.delinquentComplaintsBlack = ReportCard.staticSetDelinquentComplaintsBlack(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsBlack(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsBlackInit() {
		Wrap<Long> delinquentComplaintsBlackWrap = new Wrap<Long>().var("delinquentComplaintsBlack");
		if(delinquentComplaintsBlack == null) {
			_delinquentComplaintsBlack(delinquentComplaintsBlackWrap);
			setDelinquentComplaintsBlack(delinquentComplaintsBlackWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsBlack(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsBlack(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsBlack(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsBlack(siteRequest_, ReportCard.staticSearchDelinquentComplaintsBlack(siteRequest_, ReportCard.staticSetDelinquentComplaintsBlack(siteRequest_, o)));
	}

	//////////////////////////////////////
	// delinquentComplaintsBlackPercent //
	//////////////////////////////////////

	/**	 The entity delinquentComplaintsBlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsBlackPercent;

	/**	<br> The entity delinquentComplaintsBlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsBlackPercent">Find the entity delinquentComplaintsBlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsBlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsBlackPercent() {
		return delinquentComplaintsBlackPercent;
	}

	public void setDelinquentComplaintsBlackPercent(BigDecimal delinquentComplaintsBlackPercent) {
		this.delinquentComplaintsBlackPercent = delinquentComplaintsBlackPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsBlackPercent(String o) {
		this.delinquentComplaintsBlackPercent = ReportCard.staticSetDelinquentComplaintsBlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsBlackPercent(Double o) {
			this.delinquentComplaintsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsBlackPercent(Integer o) {
			this.delinquentComplaintsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsBlackPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsBlackPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsBlackPercent");
		if(delinquentComplaintsBlackPercent == null) {
			_delinquentComplaintsBlackPercent(delinquentComplaintsBlackPercentWrap);
			setDelinquentComplaintsBlackPercent(delinquentComplaintsBlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsBlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsBlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsBlackPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsBlackPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsBlackPercent(siteRequest_, o)));
	}

	////////////////////////////////
	// delinquentComplaintsLatinx //
	////////////////////////////////

	/**	 The entity delinquentComplaintsLatinx
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsLatinx;

	/**	<br> The entity delinquentComplaintsLatinx
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsLatinx">Find the entity delinquentComplaintsLatinx in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsLatinx(Wrap<Long> c);

	public Long getDelinquentComplaintsLatinx() {
		return delinquentComplaintsLatinx;
	}

	public void setDelinquentComplaintsLatinx(Long delinquentComplaintsLatinx) {
		this.delinquentComplaintsLatinx = delinquentComplaintsLatinx;
	}
	@JsonIgnore
	public void setDelinquentComplaintsLatinx(String o) {
		this.delinquentComplaintsLatinx = ReportCard.staticSetDelinquentComplaintsLatinx(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsLatinx(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsLatinxInit() {
		Wrap<Long> delinquentComplaintsLatinxWrap = new Wrap<Long>().var("delinquentComplaintsLatinx");
		if(delinquentComplaintsLatinx == null) {
			_delinquentComplaintsLatinx(delinquentComplaintsLatinxWrap);
			setDelinquentComplaintsLatinx(delinquentComplaintsLatinxWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsLatinx(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsLatinx(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsLatinx(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsLatinx(siteRequest_, ReportCard.staticSearchDelinquentComplaintsLatinx(siteRequest_, ReportCard.staticSetDelinquentComplaintsLatinx(siteRequest_, o)));
	}

	///////////////////////////////////////
	// delinquentComplaintsLatinxPercent //
	///////////////////////////////////////

	/**	 The entity delinquentComplaintsLatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsLatinxPercent;

	/**	<br> The entity delinquentComplaintsLatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsLatinxPercent">Find the entity delinquentComplaintsLatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsLatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsLatinxPercent() {
		return delinquentComplaintsLatinxPercent;
	}

	public void setDelinquentComplaintsLatinxPercent(BigDecimal delinquentComplaintsLatinxPercent) {
		this.delinquentComplaintsLatinxPercent = delinquentComplaintsLatinxPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsLatinxPercent(String o) {
		this.delinquentComplaintsLatinxPercent = ReportCard.staticSetDelinquentComplaintsLatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsLatinxPercent(Double o) {
			this.delinquentComplaintsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsLatinxPercent(Integer o) {
			this.delinquentComplaintsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsLatinxPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsLatinxPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsLatinxPercent");
		if(delinquentComplaintsLatinxPercent == null) {
			_delinquentComplaintsLatinxPercent(delinquentComplaintsLatinxPercentWrap);
			setDelinquentComplaintsLatinxPercent(delinquentComplaintsLatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsLatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsLatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsLatinxPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsLatinxPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsLatinxPercent(siteRequest_, o)));
	}

	/////////////////////////////////////
	// delinquentComplaintsMultiRacial //
	/////////////////////////////////////

	/**	 The entity delinquentComplaintsMultiRacial
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsMultiRacial;

	/**	<br> The entity delinquentComplaintsMultiRacial
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsMultiRacial">Find the entity delinquentComplaintsMultiRacial in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsMultiRacial(Wrap<Long> c);

	public Long getDelinquentComplaintsMultiRacial() {
		return delinquentComplaintsMultiRacial;
	}

	public void setDelinquentComplaintsMultiRacial(Long delinquentComplaintsMultiRacial) {
		this.delinquentComplaintsMultiRacial = delinquentComplaintsMultiRacial;
	}
	@JsonIgnore
	public void setDelinquentComplaintsMultiRacial(String o) {
		this.delinquentComplaintsMultiRacial = ReportCard.staticSetDelinquentComplaintsMultiRacial(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsMultiRacial(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsMultiRacialInit() {
		Wrap<Long> delinquentComplaintsMultiRacialWrap = new Wrap<Long>().var("delinquentComplaintsMultiRacial");
		if(delinquentComplaintsMultiRacial == null) {
			_delinquentComplaintsMultiRacial(delinquentComplaintsMultiRacialWrap);
			setDelinquentComplaintsMultiRacial(delinquentComplaintsMultiRacialWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsMultiRacial(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsMultiRacial(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsMultiRacial(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsMultiRacial(siteRequest_, ReportCard.staticSearchDelinquentComplaintsMultiRacial(siteRequest_, ReportCard.staticSetDelinquentComplaintsMultiRacial(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// delinquentComplaintsMultiRacialPercent //
	////////////////////////////////////////////

	/**	 The entity delinquentComplaintsMultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsMultiRacialPercent;

	/**	<br> The entity delinquentComplaintsMultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsMultiRacialPercent">Find the entity delinquentComplaintsMultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsMultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsMultiRacialPercent() {
		return delinquentComplaintsMultiRacialPercent;
	}

	public void setDelinquentComplaintsMultiRacialPercent(BigDecimal delinquentComplaintsMultiRacialPercent) {
		this.delinquentComplaintsMultiRacialPercent = delinquentComplaintsMultiRacialPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsMultiRacialPercent(String o) {
		this.delinquentComplaintsMultiRacialPercent = ReportCard.staticSetDelinquentComplaintsMultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsMultiRacialPercent(Double o) {
			this.delinquentComplaintsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsMultiRacialPercent(Integer o) {
			this.delinquentComplaintsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsMultiRacialPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsMultiRacialPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsMultiRacialPercent");
		if(delinquentComplaintsMultiRacialPercent == null) {
			_delinquentComplaintsMultiRacialPercent(delinquentComplaintsMultiRacialPercentWrap);
			setDelinquentComplaintsMultiRacialPercent(delinquentComplaintsMultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsMultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsMultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsMultiRacialPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsMultiRacialPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsMultiRacialPercent(siteRequest_, o)));
	}

	////////////////////////////////////
	// delinquentComplaintsIndigenous //
	////////////////////////////////////

	/**	 The entity delinquentComplaintsIndigenous
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsIndigenous;

	/**	<br> The entity delinquentComplaintsIndigenous
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsIndigenous">Find the entity delinquentComplaintsIndigenous in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsIndigenous(Wrap<Long> c);

	public Long getDelinquentComplaintsIndigenous() {
		return delinquentComplaintsIndigenous;
	}

	public void setDelinquentComplaintsIndigenous(Long delinquentComplaintsIndigenous) {
		this.delinquentComplaintsIndigenous = delinquentComplaintsIndigenous;
	}
	@JsonIgnore
	public void setDelinquentComplaintsIndigenous(String o) {
		this.delinquentComplaintsIndigenous = ReportCard.staticSetDelinquentComplaintsIndigenous(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsIndigenous(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsIndigenousInit() {
		Wrap<Long> delinquentComplaintsIndigenousWrap = new Wrap<Long>().var("delinquentComplaintsIndigenous");
		if(delinquentComplaintsIndigenous == null) {
			_delinquentComplaintsIndigenous(delinquentComplaintsIndigenousWrap);
			setDelinquentComplaintsIndigenous(delinquentComplaintsIndigenousWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsIndigenous(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsIndigenous(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsIndigenous(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsIndigenous(siteRequest_, ReportCard.staticSearchDelinquentComplaintsIndigenous(siteRequest_, ReportCard.staticSetDelinquentComplaintsIndigenous(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// delinquentComplaintsIndigenousPercent //
	///////////////////////////////////////////

	/**	 The entity delinquentComplaintsIndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsIndigenousPercent;

	/**	<br> The entity delinquentComplaintsIndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsIndigenousPercent">Find the entity delinquentComplaintsIndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsIndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsIndigenousPercent() {
		return delinquentComplaintsIndigenousPercent;
	}

	public void setDelinquentComplaintsIndigenousPercent(BigDecimal delinquentComplaintsIndigenousPercent) {
		this.delinquentComplaintsIndigenousPercent = delinquentComplaintsIndigenousPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsIndigenousPercent(String o) {
		this.delinquentComplaintsIndigenousPercent = ReportCard.staticSetDelinquentComplaintsIndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsIndigenousPercent(Double o) {
			this.delinquentComplaintsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsIndigenousPercent(Integer o) {
			this.delinquentComplaintsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsIndigenousPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsIndigenousPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsIndigenousPercent");
		if(delinquentComplaintsIndigenousPercent == null) {
			_delinquentComplaintsIndigenousPercent(delinquentComplaintsIndigenousPercentWrap);
			setDelinquentComplaintsIndigenousPercent(delinquentComplaintsIndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsIndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsIndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsIndigenousPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsIndigenousPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsIndigenousPercent(siteRequest_, o)));
	}

	///////////////////////////////
	// delinquentComplaintsWhite //
	///////////////////////////////

	/**	 The entity delinquentComplaintsWhite
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsWhite;

	/**	<br> The entity delinquentComplaintsWhite
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsWhite">Find the entity delinquentComplaintsWhite in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsWhite(Wrap<Long> c);

	public Long getDelinquentComplaintsWhite() {
		return delinquentComplaintsWhite;
	}

	public void setDelinquentComplaintsWhite(Long delinquentComplaintsWhite) {
		this.delinquentComplaintsWhite = delinquentComplaintsWhite;
	}
	@JsonIgnore
	public void setDelinquentComplaintsWhite(String o) {
		this.delinquentComplaintsWhite = ReportCard.staticSetDelinquentComplaintsWhite(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsWhite(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsWhiteInit() {
		Wrap<Long> delinquentComplaintsWhiteWrap = new Wrap<Long>().var("delinquentComplaintsWhite");
		if(delinquentComplaintsWhite == null) {
			_delinquentComplaintsWhite(delinquentComplaintsWhiteWrap);
			setDelinquentComplaintsWhite(delinquentComplaintsWhiteWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsWhite(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsWhite(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsWhite(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsWhite(siteRequest_, ReportCard.staticSearchDelinquentComplaintsWhite(siteRequest_, ReportCard.staticSetDelinquentComplaintsWhite(siteRequest_, o)));
	}

	//////////////////////////////////////
	// delinquentComplaintsWhitePercent //
	//////////////////////////////////////

	/**	 The entity delinquentComplaintsWhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsWhitePercent;

	/**	<br> The entity delinquentComplaintsWhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsWhitePercent">Find the entity delinquentComplaintsWhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsWhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsWhitePercent() {
		return delinquentComplaintsWhitePercent;
	}

	public void setDelinquentComplaintsWhitePercent(BigDecimal delinquentComplaintsWhitePercent) {
		this.delinquentComplaintsWhitePercent = delinquentComplaintsWhitePercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsWhitePercent(String o) {
		this.delinquentComplaintsWhitePercent = ReportCard.staticSetDelinquentComplaintsWhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsWhitePercent(Double o) {
			this.delinquentComplaintsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsWhitePercent(Integer o) {
			this.delinquentComplaintsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsWhitePercentInit() {
		Wrap<BigDecimal> delinquentComplaintsWhitePercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsWhitePercent");
		if(delinquentComplaintsWhitePercent == null) {
			_delinquentComplaintsWhitePercent(delinquentComplaintsWhitePercentWrap);
			setDelinquentComplaintsWhitePercent(delinquentComplaintsWhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsWhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsWhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsWhitePercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsWhitePercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsWhitePercent(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// delinquentComplaintsPacificIslander //
	/////////////////////////////////////////

	/**	 The entity delinquentComplaintsPacificIslander
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long delinquentComplaintsPacificIslander;

	/**	<br> The entity delinquentComplaintsPacificIslander
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsPacificIslander">Find the entity delinquentComplaintsPacificIslander in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsPacificIslander(Wrap<Long> c);

	public Long getDelinquentComplaintsPacificIslander() {
		return delinquentComplaintsPacificIslander;
	}

	public void setDelinquentComplaintsPacificIslander(Long delinquentComplaintsPacificIslander) {
		this.delinquentComplaintsPacificIslander = delinquentComplaintsPacificIslander;
	}
	@JsonIgnore
	public void setDelinquentComplaintsPacificIslander(String o) {
		this.delinquentComplaintsPacificIslander = ReportCard.staticSetDelinquentComplaintsPacificIslander(siteRequest_, o);
	}
	public static Long staticSetDelinquentComplaintsPacificIslander(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard delinquentComplaintsPacificIslanderInit() {
		Wrap<Long> delinquentComplaintsPacificIslanderWrap = new Wrap<Long>().var("delinquentComplaintsPacificIslander");
		if(delinquentComplaintsPacificIslander == null) {
			_delinquentComplaintsPacificIslander(delinquentComplaintsPacificIslanderWrap);
			setDelinquentComplaintsPacificIslander(delinquentComplaintsPacificIslanderWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchDelinquentComplaintsPacificIslander(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrDelinquentComplaintsPacificIslander(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsPacificIslander(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsPacificIslander(siteRequest_, ReportCard.staticSearchDelinquentComplaintsPacificIslander(siteRequest_, ReportCard.staticSetDelinquentComplaintsPacificIslander(siteRequest_, o)));
	}

	////////////////////////////////////////////////
	// delinquentComplaintsPacificIslanderPercent //
	////////////////////////////////////////////////

	/**	 The entity delinquentComplaintsPacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal delinquentComplaintsPacificIslanderPercent;

	/**	<br> The entity delinquentComplaintsPacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:delinquentComplaintsPacificIslanderPercent">Find the entity delinquentComplaintsPacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _delinquentComplaintsPacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getDelinquentComplaintsPacificIslanderPercent() {
		return delinquentComplaintsPacificIslanderPercent;
	}

	public void setDelinquentComplaintsPacificIslanderPercent(BigDecimal delinquentComplaintsPacificIslanderPercent) {
		this.delinquentComplaintsPacificIslanderPercent = delinquentComplaintsPacificIslanderPercent;
	}
	@JsonIgnore
	public void setDelinquentComplaintsPacificIslanderPercent(String o) {
		this.delinquentComplaintsPacificIslanderPercent = ReportCard.staticSetDelinquentComplaintsPacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetDelinquentComplaintsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDelinquentComplaintsPacificIslanderPercent(Double o) {
			this.delinquentComplaintsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDelinquentComplaintsPacificIslanderPercent(Integer o) {
			this.delinquentComplaintsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard delinquentComplaintsPacificIslanderPercentInit() {
		Wrap<BigDecimal> delinquentComplaintsPacificIslanderPercentWrap = new Wrap<BigDecimal>().var("delinquentComplaintsPacificIslanderPercent");
		if(delinquentComplaintsPacificIslanderPercent == null) {
			_delinquentComplaintsPacificIslanderPercent(delinquentComplaintsPacificIslanderPercentWrap);
			setDelinquentComplaintsPacificIslanderPercent(delinquentComplaintsPacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchDelinquentComplaintsPacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDelinquentComplaintsPacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDelinquentComplaintsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrDelinquentComplaintsPacificIslanderPercent(siteRequest_, ReportCard.staticSearchDelinquentComplaintsPacificIslanderPercent(siteRequest_, ReportCard.staticSetDelinquentComplaintsPacificIslanderPercent(siteRequest_, o)));
	}

	/////////////////////////////
	// shortTermSuspensionRate //
	/////////////////////////////

	/**	 The entity shortTermSuspensionRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionRate;

	/**	<br> The entity shortTermSuspensionRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionRate">Find the entity shortTermSuspensionRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionRate(Wrap<Long> c);

	public Long getShortTermSuspensionRate() {
		return shortTermSuspensionRate;
	}

	public void setShortTermSuspensionRate(Long shortTermSuspensionRate) {
		this.shortTermSuspensionRate = shortTermSuspensionRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionRate(String o) {
		this.shortTermSuspensionRate = ReportCard.staticSetShortTermSuspensionRate(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionRate(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionRateInit() {
		Wrap<Long> shortTermSuspensionRateWrap = new Wrap<Long>().var("shortTermSuspensionRate");
		if(shortTermSuspensionRate == null) {
			_shortTermSuspensionRate(shortTermSuspensionRateWrap);
			setShortTermSuspensionRate(shortTermSuspensionRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionRate(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionRate(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionRate(siteRequest_, ReportCard.staticSetShortTermSuspensionRate(siteRequest_, o)));
	}

	///////////////////////////////
	// shortTermSuspensionsTotal //
	///////////////////////////////

	/**	 The entity shortTermSuspensionsTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsTotal;

	/**	<br> The entity shortTermSuspensionsTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsTotal">Find the entity shortTermSuspensionsTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsTotal() {
		return shortTermSuspensionsTotal;
	}

	public void setShortTermSuspensionsTotal(Long shortTermSuspensionsTotal) {
		this.shortTermSuspensionsTotal = shortTermSuspensionsTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsTotal(String o) {
		this.shortTermSuspensionsTotal = ReportCard.staticSetShortTermSuspensionsTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsTotalInit() {
		Wrap<Long> shortTermSuspensionsTotalWrap = new Wrap<Long>().var("shortTermSuspensionsTotal");
		if(shortTermSuspensionsTotal == null) {
			_shortTermSuspensionsTotal(shortTermSuspensionsTotalWrap);
			setShortTermSuspensionsTotal(shortTermSuspensionsTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsTotal(siteRequest_, o)));
	}

	//////////////////////////////
	// longTermSuspensionsTotal //
	//////////////////////////////

	/**	 The entity longTermSuspensionsTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long longTermSuspensionsTotal;

	/**	<br> The entity longTermSuspensionsTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:longTermSuspensionsTotal">Find the entity longTermSuspensionsTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _longTermSuspensionsTotal(Wrap<Long> c);

	public Long getLongTermSuspensionsTotal() {
		return longTermSuspensionsTotal;
	}

	public void setLongTermSuspensionsTotal(Long longTermSuspensionsTotal) {
		this.longTermSuspensionsTotal = longTermSuspensionsTotal;
	}
	@JsonIgnore
	public void setLongTermSuspensionsTotal(String o) {
		this.longTermSuspensionsTotal = ReportCard.staticSetLongTermSuspensionsTotal(siteRequest_, o);
	}
	public static Long staticSetLongTermSuspensionsTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard longTermSuspensionsTotalInit() {
		Wrap<Long> longTermSuspensionsTotalWrap = new Wrap<Long>().var("longTermSuspensionsTotal");
		if(longTermSuspensionsTotal == null) {
			_longTermSuspensionsTotal(longTermSuspensionsTotalWrap);
			setLongTermSuspensionsTotal(longTermSuspensionsTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchLongTermSuspensionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrLongTermSuspensionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqLongTermSuspensionsTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrLongTermSuspensionsTotal(siteRequest_, ReportCard.staticSearchLongTermSuspensionsTotal(siteRequest_, ReportCard.staticSetLongTermSuspensionsTotal(siteRequest_, o)));
	}

	/////////////////////
	// expulsionsTotal //
	/////////////////////

	/**	 The entity expulsionsTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long expulsionsTotal;

	/**	<br> The entity expulsionsTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:expulsionsTotal">Find the entity expulsionsTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _expulsionsTotal(Wrap<Long> c);

	public Long getExpulsionsTotal() {
		return expulsionsTotal;
	}

	public void setExpulsionsTotal(Long expulsionsTotal) {
		this.expulsionsTotal = expulsionsTotal;
	}
	@JsonIgnore
	public void setExpulsionsTotal(String o) {
		this.expulsionsTotal = ReportCard.staticSetExpulsionsTotal(siteRequest_, o);
	}
	public static Long staticSetExpulsionsTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard expulsionsTotalInit() {
		Wrap<Long> expulsionsTotalWrap = new Wrap<Long>().var("expulsionsTotal");
		if(expulsionsTotal == null) {
			_expulsionsTotal(expulsionsTotalWrap);
			setExpulsionsTotal(expulsionsTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchExpulsionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrExpulsionsTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExpulsionsTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExpulsionsTotal(siteRequest_, ReportCard.staticSearchExpulsionsTotal(siteRequest_, ReportCard.staticSetExpulsionsTotal(siteRequest_, o)));
	}

	/////////////////////////////////////
	// shortTermSuspensionsAsianFemale //
	/////////////////////////////////////

	/**	 The entity shortTermSuspensionsAsianFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsAsianFemale;

	/**	<br> The entity shortTermSuspensionsAsianFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAsianFemale">Find the entity shortTermSuspensionsAsianFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAsianFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsAsianFemale() {
		return shortTermSuspensionsAsianFemale;
	}

	public void setShortTermSuspensionsAsianFemale(Long shortTermSuspensionsAsianFemale) {
		this.shortTermSuspensionsAsianFemale = shortTermSuspensionsAsianFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianFemale(String o) {
		this.shortTermSuspensionsAsianFemale = ReportCard.staticSetShortTermSuspensionsAsianFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsAsianFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsAsianFemaleInit() {
		Wrap<Long> shortTermSuspensionsAsianFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsAsianFemale");
		if(shortTermSuspensionsAsianFemale == null) {
			_shortTermSuspensionsAsianFemale(shortTermSuspensionsAsianFemaleWrap);
			setShortTermSuspensionsAsianFemale(shortTermSuspensionsAsianFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsAsianFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsAsianFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAsianFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAsianFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAsianFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsAsianFemale(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsAsianMale //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsAsianMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsAsianMale;

	/**	<br> The entity shortTermSuspensionsAsianMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAsianMale">Find the entity shortTermSuspensionsAsianMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAsianMale(Wrap<Long> c);

	public Long getShortTermSuspensionsAsianMale() {
		return shortTermSuspensionsAsianMale;
	}

	public void setShortTermSuspensionsAsianMale(Long shortTermSuspensionsAsianMale) {
		this.shortTermSuspensionsAsianMale = shortTermSuspensionsAsianMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianMale(String o) {
		this.shortTermSuspensionsAsianMale = ReportCard.staticSetShortTermSuspensionsAsianMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsAsianMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsAsianMaleInit() {
		Wrap<Long> shortTermSuspensionsAsianMaleWrap = new Wrap<Long>().var("shortTermSuspensionsAsianMale");
		if(shortTermSuspensionsAsianMale == null) {
			_shortTermSuspensionsAsianMale(shortTermSuspensionsAsianMaleWrap);
			setShortTermSuspensionsAsianMale(shortTermSuspensionsAsianMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsAsianMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsAsianMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAsianMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAsianMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAsianMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsAsianMale(siteRequest_, o)));
	}

	////////////////////////////////////
	// shortTermSuspensionsAsianTotal //
	////////////////////////////////////

	/**	 The entity shortTermSuspensionsAsianTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsAsianTotal;

	/**	<br> The entity shortTermSuspensionsAsianTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAsianTotal">Find the entity shortTermSuspensionsAsianTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAsianTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsAsianTotal() {
		return shortTermSuspensionsAsianTotal;
	}

	public void setShortTermSuspensionsAsianTotal(Long shortTermSuspensionsAsianTotal) {
		this.shortTermSuspensionsAsianTotal = shortTermSuspensionsAsianTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianTotal(String o) {
		this.shortTermSuspensionsAsianTotal = ReportCard.staticSetShortTermSuspensionsAsianTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsAsianTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsAsianTotalInit() {
		Wrap<Long> shortTermSuspensionsAsianTotalWrap = new Wrap<Long>().var("shortTermSuspensionsAsianTotal");
		if(shortTermSuspensionsAsianTotal == null) {
			_shortTermSuspensionsAsianTotal(shortTermSuspensionsAsianTotalWrap);
			setShortTermSuspensionsAsianTotal(shortTermSuspensionsAsianTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsAsianTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsAsianTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAsianTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAsianTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAsianTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsAsianTotal(siteRequest_, o)));
	}

	//////////////////////////////////////
	// shortTermSuspensionsAsianPercent //
	//////////////////////////////////////

	/**	 The entity shortTermSuspensionsAsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsAsianPercent;

	/**	<br> The entity shortTermSuspensionsAsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAsianPercent">Find the entity shortTermSuspensionsAsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsAsianPercent() {
		return shortTermSuspensionsAsianPercent;
	}

	public void setShortTermSuspensionsAsianPercent(BigDecimal shortTermSuspensionsAsianPercent) {
		this.shortTermSuspensionsAsianPercent = shortTermSuspensionsAsianPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianPercent(String o) {
		this.shortTermSuspensionsAsianPercent = ReportCard.staticSetShortTermSuspensionsAsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianPercent(Double o) {
			this.shortTermSuspensionsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianPercent(Integer o) {
			this.shortTermSuspensionsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsAsianPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsAsianPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsAsianPercent");
		if(shortTermSuspensionsAsianPercent == null) {
			_shortTermSuspensionsAsianPercent(shortTermSuspensionsAsianPercentWrap);
			setShortTermSuspensionsAsianPercent(shortTermSuspensionsAsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsAsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsAsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAsianPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAsianPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsAsianPercent(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsAsianRate //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsAsianRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsAsianRate;

	/**	<br> The entity shortTermSuspensionsAsianRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAsianRate">Find the entity shortTermSuspensionsAsianRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAsianRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsAsianRate() {
		return shortTermSuspensionsAsianRate;
	}

	public void setShortTermSuspensionsAsianRate(BigDecimal shortTermSuspensionsAsianRate) {
		this.shortTermSuspensionsAsianRate = shortTermSuspensionsAsianRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianRate(String o) {
		this.shortTermSuspensionsAsianRate = ReportCard.staticSetShortTermSuspensionsAsianRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsAsianRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianRate(Double o) {
			this.shortTermSuspensionsAsianRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsAsianRate(Integer o) {
			this.shortTermSuspensionsAsianRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsAsianRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsAsianRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsAsianRate");
		if(shortTermSuspensionsAsianRate == null) {
			_shortTermSuspensionsAsianRate(shortTermSuspensionsAsianRateWrap);
			setShortTermSuspensionsAsianRate(shortTermSuspensionsAsianRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsAsianRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsAsianRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAsianRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAsianRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAsianRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsAsianRate(siteRequest_, o)));
	}

	/////////////////////////////////////
	// shortTermSuspensionsBlackFemale //
	/////////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsBlackFemale;

	/**	<br> The entity shortTermSuspensionsBlackFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackFemale">Find the entity shortTermSuspensionsBlackFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsBlackFemale() {
		return shortTermSuspensionsBlackFemale;
	}

	public void setShortTermSuspensionsBlackFemale(Long shortTermSuspensionsBlackFemale) {
		this.shortTermSuspensionsBlackFemale = shortTermSuspensionsBlackFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackFemale(String o) {
		this.shortTermSuspensionsBlackFemale = ReportCard.staticSetShortTermSuspensionsBlackFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsBlackFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsBlackFemaleInit() {
		Wrap<Long> shortTermSuspensionsBlackFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsBlackFemale");
		if(shortTermSuspensionsBlackFemale == null) {
			_shortTermSuspensionsBlackFemale(shortTermSuspensionsBlackFemaleWrap);
			setShortTermSuspensionsBlackFemale(shortTermSuspensionsBlackFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsBlackFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsBlackFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackFemale(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsBlackMale //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsBlackMale;

	/**	<br> The entity shortTermSuspensionsBlackMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackMale">Find the entity shortTermSuspensionsBlackMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackMale(Wrap<Long> c);

	public Long getShortTermSuspensionsBlackMale() {
		return shortTermSuspensionsBlackMale;
	}

	public void setShortTermSuspensionsBlackMale(Long shortTermSuspensionsBlackMale) {
		this.shortTermSuspensionsBlackMale = shortTermSuspensionsBlackMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackMale(String o) {
		this.shortTermSuspensionsBlackMale = ReportCard.staticSetShortTermSuspensionsBlackMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsBlackMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsBlackMaleInit() {
		Wrap<Long> shortTermSuspensionsBlackMaleWrap = new Wrap<Long>().var("shortTermSuspensionsBlackMale");
		if(shortTermSuspensionsBlackMale == null) {
			_shortTermSuspensionsBlackMale(shortTermSuspensionsBlackMaleWrap);
			setShortTermSuspensionsBlackMale(shortTermSuspensionsBlackMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsBlackMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsBlackMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackMale(siteRequest_, o)));
	}

	////////////////////////////////////
	// shortTermSuspensionsBlackTotal //
	////////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsBlackTotal;

	/**	<br> The entity shortTermSuspensionsBlackTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackTotal">Find the entity shortTermSuspensionsBlackTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsBlackTotal() {
		return shortTermSuspensionsBlackTotal;
	}

	public void setShortTermSuspensionsBlackTotal(Long shortTermSuspensionsBlackTotal) {
		this.shortTermSuspensionsBlackTotal = shortTermSuspensionsBlackTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackTotal(String o) {
		this.shortTermSuspensionsBlackTotal = ReportCard.staticSetShortTermSuspensionsBlackTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsBlackTotalInit() {
		Wrap<Long> shortTermSuspensionsBlackTotalWrap = new Wrap<Long>().var("shortTermSuspensionsBlackTotal");
		if(shortTermSuspensionsBlackTotal == null) {
			_shortTermSuspensionsBlackTotal(shortTermSuspensionsBlackTotalWrap);
			setShortTermSuspensionsBlackTotal(shortTermSuspensionsBlackTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsBlackTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackTotal(siteRequest_, o)));
	}

	//////////////////////////////////////
	// shortTermSuspensionsBlackPercent //
	//////////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsBlackPercent;

	/**	<br> The entity shortTermSuspensionsBlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackPercent">Find the entity shortTermSuspensionsBlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsBlackPercent() {
		return shortTermSuspensionsBlackPercent;
	}

	public void setShortTermSuspensionsBlackPercent(BigDecimal shortTermSuspensionsBlackPercent) {
		this.shortTermSuspensionsBlackPercent = shortTermSuspensionsBlackPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackPercent(String o) {
		this.shortTermSuspensionsBlackPercent = ReportCard.staticSetShortTermSuspensionsBlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackPercent(Double o) {
			this.shortTermSuspensionsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackPercent(Integer o) {
			this.shortTermSuspensionsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsBlackPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsBlackPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsBlackPercent");
		if(shortTermSuspensionsBlackPercent == null) {
			_shortTermSuspensionsBlackPercent(shortTermSuspensionsBlackPercentWrap);
			setShortTermSuspensionsBlackPercent(shortTermSuspensionsBlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsBlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsBlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackPercent(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsBlackRate //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsBlackRate;

	/**	<br> The entity shortTermSuspensionsBlackRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackRate">Find the entity shortTermSuspensionsBlackRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsBlackRate() {
		return shortTermSuspensionsBlackRate;
	}

	public void setShortTermSuspensionsBlackRate(BigDecimal shortTermSuspensionsBlackRate) {
		this.shortTermSuspensionsBlackRate = shortTermSuspensionsBlackRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackRate(String o) {
		this.shortTermSuspensionsBlackRate = ReportCard.staticSetShortTermSuspensionsBlackRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsBlackRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackRate(Double o) {
			this.shortTermSuspensionsBlackRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackRate(Integer o) {
			this.shortTermSuspensionsBlackRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsBlackRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsBlackRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsBlackRate");
		if(shortTermSuspensionsBlackRate == null) {
			_shortTermSuspensionsBlackRate(shortTermSuspensionsBlackRateWrap);
			setShortTermSuspensionsBlackRate(shortTermSuspensionsBlackRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsBlackRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsBlackRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackRate(siteRequest_, o)));
	}

	//////////////////////////////////////
	// shortTermSuspensionsLatinxFemale //
	//////////////////////////////////////

	/**	 The entity shortTermSuspensionsLatinxFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsLatinxFemale;

	/**	<br> The entity shortTermSuspensionsLatinxFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsLatinxFemale">Find the entity shortTermSuspensionsLatinxFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsLatinxFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsLatinxFemale() {
		return shortTermSuspensionsLatinxFemale;
	}

	public void setShortTermSuspensionsLatinxFemale(Long shortTermSuspensionsLatinxFemale) {
		this.shortTermSuspensionsLatinxFemale = shortTermSuspensionsLatinxFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxFemale(String o) {
		this.shortTermSuspensionsLatinxFemale = ReportCard.staticSetShortTermSuspensionsLatinxFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsLatinxFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsLatinxFemaleInit() {
		Wrap<Long> shortTermSuspensionsLatinxFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsLatinxFemale");
		if(shortTermSuspensionsLatinxFemale == null) {
			_shortTermSuspensionsLatinxFemale(shortTermSuspensionsLatinxFemaleWrap);
			setShortTermSuspensionsLatinxFemale(shortTermSuspensionsLatinxFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsLatinxFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsLatinxFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsLatinxFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsLatinxFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsLatinxFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsLatinxFemale(siteRequest_, o)));
	}

	////////////////////////////////////
	// shortTermSuspensionsLatinxMale //
	////////////////////////////////////

	/**	 The entity shortTermSuspensionsLatinxMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsLatinxMale;

	/**	<br> The entity shortTermSuspensionsLatinxMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsLatinxMale">Find the entity shortTermSuspensionsLatinxMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsLatinxMale(Wrap<Long> c);

	public Long getShortTermSuspensionsLatinxMale() {
		return shortTermSuspensionsLatinxMale;
	}

	public void setShortTermSuspensionsLatinxMale(Long shortTermSuspensionsLatinxMale) {
		this.shortTermSuspensionsLatinxMale = shortTermSuspensionsLatinxMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxMale(String o) {
		this.shortTermSuspensionsLatinxMale = ReportCard.staticSetShortTermSuspensionsLatinxMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsLatinxMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsLatinxMaleInit() {
		Wrap<Long> shortTermSuspensionsLatinxMaleWrap = new Wrap<Long>().var("shortTermSuspensionsLatinxMale");
		if(shortTermSuspensionsLatinxMale == null) {
			_shortTermSuspensionsLatinxMale(shortTermSuspensionsLatinxMaleWrap);
			setShortTermSuspensionsLatinxMale(shortTermSuspensionsLatinxMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsLatinxMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsLatinxMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsLatinxMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsLatinxMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsLatinxMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsLatinxMale(siteRequest_, o)));
	}

	/////////////////////////////////////
	// shortTermSuspensionsLatinxTotal //
	/////////////////////////////////////

	/**	 The entity shortTermSuspensionsLatinxTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsLatinxTotal;

	/**	<br> The entity shortTermSuspensionsLatinxTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsLatinxTotal">Find the entity shortTermSuspensionsLatinxTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsLatinxTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsLatinxTotal() {
		return shortTermSuspensionsLatinxTotal;
	}

	public void setShortTermSuspensionsLatinxTotal(Long shortTermSuspensionsLatinxTotal) {
		this.shortTermSuspensionsLatinxTotal = shortTermSuspensionsLatinxTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxTotal(String o) {
		this.shortTermSuspensionsLatinxTotal = ReportCard.staticSetShortTermSuspensionsLatinxTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsLatinxTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsLatinxTotalInit() {
		Wrap<Long> shortTermSuspensionsLatinxTotalWrap = new Wrap<Long>().var("shortTermSuspensionsLatinxTotal");
		if(shortTermSuspensionsLatinxTotal == null) {
			_shortTermSuspensionsLatinxTotal(shortTermSuspensionsLatinxTotalWrap);
			setShortTermSuspensionsLatinxTotal(shortTermSuspensionsLatinxTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsLatinxTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsLatinxTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsLatinxTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsLatinxTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsLatinxTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsLatinxTotal(siteRequest_, o)));
	}

	///////////////////////////////////////
	// shortTermSuspensionsLatinxPercent //
	///////////////////////////////////////

	/**	 The entity shortTermSuspensionsLatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsLatinxPercent;

	/**	<br> The entity shortTermSuspensionsLatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsLatinxPercent">Find the entity shortTermSuspensionsLatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsLatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsLatinxPercent() {
		return shortTermSuspensionsLatinxPercent;
	}

	public void setShortTermSuspensionsLatinxPercent(BigDecimal shortTermSuspensionsLatinxPercent) {
		this.shortTermSuspensionsLatinxPercent = shortTermSuspensionsLatinxPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxPercent(String o) {
		this.shortTermSuspensionsLatinxPercent = ReportCard.staticSetShortTermSuspensionsLatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxPercent(Double o) {
			this.shortTermSuspensionsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxPercent(Integer o) {
			this.shortTermSuspensionsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsLatinxPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsLatinxPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsLatinxPercent");
		if(shortTermSuspensionsLatinxPercent == null) {
			_shortTermSuspensionsLatinxPercent(shortTermSuspensionsLatinxPercentWrap);
			setShortTermSuspensionsLatinxPercent(shortTermSuspensionsLatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsLatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsLatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsLatinxPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsLatinxPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsLatinxPercent(siteRequest_, o)));
	}

	////////////////////////////////////
	// shortTermSuspensionsLatinxRate //
	////////////////////////////////////

	/**	 The entity shortTermSuspensionsLatinxRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsLatinxRate;

	/**	<br> The entity shortTermSuspensionsLatinxRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsLatinxRate">Find the entity shortTermSuspensionsLatinxRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsLatinxRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsLatinxRate() {
		return shortTermSuspensionsLatinxRate;
	}

	public void setShortTermSuspensionsLatinxRate(BigDecimal shortTermSuspensionsLatinxRate) {
		this.shortTermSuspensionsLatinxRate = shortTermSuspensionsLatinxRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxRate(String o) {
		this.shortTermSuspensionsLatinxRate = ReportCard.staticSetShortTermSuspensionsLatinxRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsLatinxRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxRate(Double o) {
			this.shortTermSuspensionsLatinxRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsLatinxRate(Integer o) {
			this.shortTermSuspensionsLatinxRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsLatinxRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsLatinxRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsLatinxRate");
		if(shortTermSuspensionsLatinxRate == null) {
			_shortTermSuspensionsLatinxRate(shortTermSuspensionsLatinxRateWrap);
			setShortTermSuspensionsLatinxRate(shortTermSuspensionsLatinxRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsLatinxRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsLatinxRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsLatinxRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsLatinxRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsLatinxRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsLatinxRate(siteRequest_, o)));
	}

	//////////////////////////////////////////
	// shortTermSuspensionsIndigenousFemale //
	//////////////////////////////////////////

	/**	 The entity shortTermSuspensionsIndigenousFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsIndigenousFemale;

	/**	<br> The entity shortTermSuspensionsIndigenousFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsIndigenousFemale">Find the entity shortTermSuspensionsIndigenousFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsIndigenousFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsIndigenousFemale() {
		return shortTermSuspensionsIndigenousFemale;
	}

	public void setShortTermSuspensionsIndigenousFemale(Long shortTermSuspensionsIndigenousFemale) {
		this.shortTermSuspensionsIndigenousFemale = shortTermSuspensionsIndigenousFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousFemale(String o) {
		this.shortTermSuspensionsIndigenousFemale = ReportCard.staticSetShortTermSuspensionsIndigenousFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsIndigenousFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsIndigenousFemaleInit() {
		Wrap<Long> shortTermSuspensionsIndigenousFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsIndigenousFemale");
		if(shortTermSuspensionsIndigenousFemale == null) {
			_shortTermSuspensionsIndigenousFemale(shortTermSuspensionsIndigenousFemaleWrap);
			setShortTermSuspensionsIndigenousFemale(shortTermSuspensionsIndigenousFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsIndigenousFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsIndigenousFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsIndigenousFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsIndigenousFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsIndigenousFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsIndigenousFemale(siteRequest_, o)));
	}

	////////////////////////////////////////
	// shortTermSuspensionsIndigenousMale //
	////////////////////////////////////////

	/**	 The entity shortTermSuspensionsIndigenousMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsIndigenousMale;

	/**	<br> The entity shortTermSuspensionsIndigenousMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsIndigenousMale">Find the entity shortTermSuspensionsIndigenousMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsIndigenousMale(Wrap<Long> c);

	public Long getShortTermSuspensionsIndigenousMale() {
		return shortTermSuspensionsIndigenousMale;
	}

	public void setShortTermSuspensionsIndigenousMale(Long shortTermSuspensionsIndigenousMale) {
		this.shortTermSuspensionsIndigenousMale = shortTermSuspensionsIndigenousMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousMale(String o) {
		this.shortTermSuspensionsIndigenousMale = ReportCard.staticSetShortTermSuspensionsIndigenousMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsIndigenousMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsIndigenousMaleInit() {
		Wrap<Long> shortTermSuspensionsIndigenousMaleWrap = new Wrap<Long>().var("shortTermSuspensionsIndigenousMale");
		if(shortTermSuspensionsIndigenousMale == null) {
			_shortTermSuspensionsIndigenousMale(shortTermSuspensionsIndigenousMaleWrap);
			setShortTermSuspensionsIndigenousMale(shortTermSuspensionsIndigenousMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsIndigenousMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsIndigenousMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsIndigenousMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsIndigenousMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsIndigenousMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsIndigenousMale(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// shortTermSuspensionsIndigenousTotal //
	/////////////////////////////////////////

	/**	 The entity shortTermSuspensionsIndigenousTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsIndigenousTotal;

	/**	<br> The entity shortTermSuspensionsIndigenousTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsIndigenousTotal">Find the entity shortTermSuspensionsIndigenousTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsIndigenousTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsIndigenousTotal() {
		return shortTermSuspensionsIndigenousTotal;
	}

	public void setShortTermSuspensionsIndigenousTotal(Long shortTermSuspensionsIndigenousTotal) {
		this.shortTermSuspensionsIndigenousTotal = shortTermSuspensionsIndigenousTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousTotal(String o) {
		this.shortTermSuspensionsIndigenousTotal = ReportCard.staticSetShortTermSuspensionsIndigenousTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsIndigenousTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsIndigenousTotalInit() {
		Wrap<Long> shortTermSuspensionsIndigenousTotalWrap = new Wrap<Long>().var("shortTermSuspensionsIndigenousTotal");
		if(shortTermSuspensionsIndigenousTotal == null) {
			_shortTermSuspensionsIndigenousTotal(shortTermSuspensionsIndigenousTotalWrap);
			setShortTermSuspensionsIndigenousTotal(shortTermSuspensionsIndigenousTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsIndigenousTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsIndigenousTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsIndigenousTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsIndigenousTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsIndigenousTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsIndigenousTotal(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// shortTermSuspensionsIndigenousPercent //
	///////////////////////////////////////////

	/**	 The entity shortTermSuspensionsIndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsIndigenousPercent;

	/**	<br> The entity shortTermSuspensionsIndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsIndigenousPercent">Find the entity shortTermSuspensionsIndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsIndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsIndigenousPercent() {
		return shortTermSuspensionsIndigenousPercent;
	}

	public void setShortTermSuspensionsIndigenousPercent(BigDecimal shortTermSuspensionsIndigenousPercent) {
		this.shortTermSuspensionsIndigenousPercent = shortTermSuspensionsIndigenousPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousPercent(String o) {
		this.shortTermSuspensionsIndigenousPercent = ReportCard.staticSetShortTermSuspensionsIndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousPercent(Double o) {
			this.shortTermSuspensionsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousPercent(Integer o) {
			this.shortTermSuspensionsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsIndigenousPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsIndigenousPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsIndigenousPercent");
		if(shortTermSuspensionsIndigenousPercent == null) {
			_shortTermSuspensionsIndigenousPercent(shortTermSuspensionsIndigenousPercentWrap);
			setShortTermSuspensionsIndigenousPercent(shortTermSuspensionsIndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsIndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsIndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsIndigenousPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsIndigenousPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsIndigenousPercent(siteRequest_, o)));
	}

	////////////////////////////////////////
	// shortTermSuspensionsIndigenousRate //
	////////////////////////////////////////

	/**	 The entity shortTermSuspensionsIndigenousRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsIndigenousRate;

	/**	<br> The entity shortTermSuspensionsIndigenousRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsIndigenousRate">Find the entity shortTermSuspensionsIndigenousRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsIndigenousRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsIndigenousRate() {
		return shortTermSuspensionsIndigenousRate;
	}

	public void setShortTermSuspensionsIndigenousRate(BigDecimal shortTermSuspensionsIndigenousRate) {
		this.shortTermSuspensionsIndigenousRate = shortTermSuspensionsIndigenousRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousRate(String o) {
		this.shortTermSuspensionsIndigenousRate = ReportCard.staticSetShortTermSuspensionsIndigenousRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsIndigenousRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousRate(Double o) {
			this.shortTermSuspensionsIndigenousRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsIndigenousRate(Integer o) {
			this.shortTermSuspensionsIndigenousRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsIndigenousRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsIndigenousRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsIndigenousRate");
		if(shortTermSuspensionsIndigenousRate == null) {
			_shortTermSuspensionsIndigenousRate(shortTermSuspensionsIndigenousRateWrap);
			setShortTermSuspensionsIndigenousRate(shortTermSuspensionsIndigenousRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsIndigenousRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsIndigenousRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsIndigenousRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsIndigenousRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsIndigenousRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsIndigenousRate(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// shortTermSuspensionsMultiRacialFemale //
	///////////////////////////////////////////

	/**	 The entity shortTermSuspensionsMultiRacialFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsMultiRacialFemale;

	/**	<br> The entity shortTermSuspensionsMultiRacialFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsMultiRacialFemale">Find the entity shortTermSuspensionsMultiRacialFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsMultiRacialFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsMultiRacialFemale() {
		return shortTermSuspensionsMultiRacialFemale;
	}

	public void setShortTermSuspensionsMultiRacialFemale(Long shortTermSuspensionsMultiRacialFemale) {
		this.shortTermSuspensionsMultiRacialFemale = shortTermSuspensionsMultiRacialFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialFemale(String o) {
		this.shortTermSuspensionsMultiRacialFemale = ReportCard.staticSetShortTermSuspensionsMultiRacialFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsMultiRacialFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsMultiRacialFemaleInit() {
		Wrap<Long> shortTermSuspensionsMultiRacialFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsMultiRacialFemale");
		if(shortTermSuspensionsMultiRacialFemale == null) {
			_shortTermSuspensionsMultiRacialFemale(shortTermSuspensionsMultiRacialFemaleWrap);
			setShortTermSuspensionsMultiRacialFemale(shortTermSuspensionsMultiRacialFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsMultiRacialFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsMultiRacialFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsMultiRacialFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsMultiRacialFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsMultiRacialFemale(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// shortTermSuspensionsMultiRacialMale //
	/////////////////////////////////////////

	/**	 The entity shortTermSuspensionsMultiRacialMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsMultiRacialMale;

	/**	<br> The entity shortTermSuspensionsMultiRacialMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsMultiRacialMale">Find the entity shortTermSuspensionsMultiRacialMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsMultiRacialMale(Wrap<Long> c);

	public Long getShortTermSuspensionsMultiRacialMale() {
		return shortTermSuspensionsMultiRacialMale;
	}

	public void setShortTermSuspensionsMultiRacialMale(Long shortTermSuspensionsMultiRacialMale) {
		this.shortTermSuspensionsMultiRacialMale = shortTermSuspensionsMultiRacialMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialMale(String o) {
		this.shortTermSuspensionsMultiRacialMale = ReportCard.staticSetShortTermSuspensionsMultiRacialMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsMultiRacialMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsMultiRacialMaleInit() {
		Wrap<Long> shortTermSuspensionsMultiRacialMaleWrap = new Wrap<Long>().var("shortTermSuspensionsMultiRacialMale");
		if(shortTermSuspensionsMultiRacialMale == null) {
			_shortTermSuspensionsMultiRacialMale(shortTermSuspensionsMultiRacialMaleWrap);
			setShortTermSuspensionsMultiRacialMale(shortTermSuspensionsMultiRacialMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsMultiRacialMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsMultiRacialMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsMultiRacialMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsMultiRacialMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsMultiRacialMale(siteRequest_, o)));
	}

	//////////////////////////////////////////
	// shortTermSuspensionsMultiRacialTotal //
	//////////////////////////////////////////

	/**	 The entity shortTermSuspensionsMultiRacialTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsMultiRacialTotal;

	/**	<br> The entity shortTermSuspensionsMultiRacialTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsMultiRacialTotal">Find the entity shortTermSuspensionsMultiRacialTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsMultiRacialTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsMultiRacialTotal() {
		return shortTermSuspensionsMultiRacialTotal;
	}

	public void setShortTermSuspensionsMultiRacialTotal(Long shortTermSuspensionsMultiRacialTotal) {
		this.shortTermSuspensionsMultiRacialTotal = shortTermSuspensionsMultiRacialTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialTotal(String o) {
		this.shortTermSuspensionsMultiRacialTotal = ReportCard.staticSetShortTermSuspensionsMultiRacialTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsMultiRacialTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsMultiRacialTotalInit() {
		Wrap<Long> shortTermSuspensionsMultiRacialTotalWrap = new Wrap<Long>().var("shortTermSuspensionsMultiRacialTotal");
		if(shortTermSuspensionsMultiRacialTotal == null) {
			_shortTermSuspensionsMultiRacialTotal(shortTermSuspensionsMultiRacialTotalWrap);
			setShortTermSuspensionsMultiRacialTotal(shortTermSuspensionsMultiRacialTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsMultiRacialTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsMultiRacialTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsMultiRacialTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsMultiRacialTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsMultiRacialTotal(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// shortTermSuspensionsMultiRacialPercent //
	////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsMultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsMultiRacialPercent;

	/**	<br> The entity shortTermSuspensionsMultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsMultiRacialPercent">Find the entity shortTermSuspensionsMultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsMultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsMultiRacialPercent() {
		return shortTermSuspensionsMultiRacialPercent;
	}

	public void setShortTermSuspensionsMultiRacialPercent(BigDecimal shortTermSuspensionsMultiRacialPercent) {
		this.shortTermSuspensionsMultiRacialPercent = shortTermSuspensionsMultiRacialPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialPercent(String o) {
		this.shortTermSuspensionsMultiRacialPercent = ReportCard.staticSetShortTermSuspensionsMultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialPercent(Double o) {
			this.shortTermSuspensionsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialPercent(Integer o) {
			this.shortTermSuspensionsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsMultiRacialPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsMultiRacialPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsMultiRacialPercent");
		if(shortTermSuspensionsMultiRacialPercent == null) {
			_shortTermSuspensionsMultiRacialPercent(shortTermSuspensionsMultiRacialPercentWrap);
			setShortTermSuspensionsMultiRacialPercent(shortTermSuspensionsMultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsMultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsMultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsMultiRacialPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsMultiRacialPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////
	// shortTermSuspensionsMultiRacialRate //
	/////////////////////////////////////////

	/**	 The entity shortTermSuspensionsMultiRacialRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsMultiRacialRate;

	/**	<br> The entity shortTermSuspensionsMultiRacialRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsMultiRacialRate">Find the entity shortTermSuspensionsMultiRacialRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsMultiRacialRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsMultiRacialRate() {
		return shortTermSuspensionsMultiRacialRate;
	}

	public void setShortTermSuspensionsMultiRacialRate(BigDecimal shortTermSuspensionsMultiRacialRate) {
		this.shortTermSuspensionsMultiRacialRate = shortTermSuspensionsMultiRacialRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialRate(String o) {
		this.shortTermSuspensionsMultiRacialRate = ReportCard.staticSetShortTermSuspensionsMultiRacialRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsMultiRacialRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialRate(Double o) {
			this.shortTermSuspensionsMultiRacialRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsMultiRacialRate(Integer o) {
			this.shortTermSuspensionsMultiRacialRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsMultiRacialRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsMultiRacialRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsMultiRacialRate");
		if(shortTermSuspensionsMultiRacialRate == null) {
			_shortTermSuspensionsMultiRacialRate(shortTermSuspensionsMultiRacialRateWrap);
			setShortTermSuspensionsMultiRacialRate(shortTermSuspensionsMultiRacialRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsMultiRacialRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsMultiRacialRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsMultiRacialRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsMultiRacialRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsMultiRacialRate(siteRequest_, o)));
	}

	///////////////////////////////////////////////
	// shortTermSuspensionsPacificIslanderFemale //
	///////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsPacificIslanderFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsPacificIslanderFemale;

	/**	<br> The entity shortTermSuspensionsPacificIslanderFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsPacificIslanderFemale">Find the entity shortTermSuspensionsPacificIslanderFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsPacificIslanderFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsPacificIslanderFemale() {
		return shortTermSuspensionsPacificIslanderFemale;
	}

	public void setShortTermSuspensionsPacificIslanderFemale(Long shortTermSuspensionsPacificIslanderFemale) {
		this.shortTermSuspensionsPacificIslanderFemale = shortTermSuspensionsPacificIslanderFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderFemale(String o) {
		this.shortTermSuspensionsPacificIslanderFemale = ReportCard.staticSetShortTermSuspensionsPacificIslanderFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsPacificIslanderFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsPacificIslanderFemaleInit() {
		Wrap<Long> shortTermSuspensionsPacificIslanderFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsPacificIslanderFemale");
		if(shortTermSuspensionsPacificIslanderFemale == null) {
			_shortTermSuspensionsPacificIslanderFemale(shortTermSuspensionsPacificIslanderFemaleWrap);
			setShortTermSuspensionsPacificIslanderFemale(shortTermSuspensionsPacificIslanderFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsPacificIslanderFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsPacificIslanderFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsPacificIslanderFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsPacificIslanderFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsPacificIslanderFemale(siteRequest_, o)));
	}

	/////////////////////////////////////////////
	// shortTermSuspensionsPacificIslanderMale //
	/////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsPacificIslanderMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsPacificIslanderMale;

	/**	<br> The entity shortTermSuspensionsPacificIslanderMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsPacificIslanderMale">Find the entity shortTermSuspensionsPacificIslanderMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsPacificIslanderMale(Wrap<Long> c);

	public Long getShortTermSuspensionsPacificIslanderMale() {
		return shortTermSuspensionsPacificIslanderMale;
	}

	public void setShortTermSuspensionsPacificIslanderMale(Long shortTermSuspensionsPacificIslanderMale) {
		this.shortTermSuspensionsPacificIslanderMale = shortTermSuspensionsPacificIslanderMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderMale(String o) {
		this.shortTermSuspensionsPacificIslanderMale = ReportCard.staticSetShortTermSuspensionsPacificIslanderMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsPacificIslanderMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsPacificIslanderMaleInit() {
		Wrap<Long> shortTermSuspensionsPacificIslanderMaleWrap = new Wrap<Long>().var("shortTermSuspensionsPacificIslanderMale");
		if(shortTermSuspensionsPacificIslanderMale == null) {
			_shortTermSuspensionsPacificIslanderMale(shortTermSuspensionsPacificIslanderMaleWrap);
			setShortTermSuspensionsPacificIslanderMale(shortTermSuspensionsPacificIslanderMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsPacificIslanderMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsPacificIslanderMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsPacificIslanderMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsPacificIslanderMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsPacificIslanderMale(siteRequest_, o)));
	}

	//////////////////////////////////////////////
	// shortTermSuspensionsPacificIslanderTotal //
	//////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsPacificIslanderTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsPacificIslanderTotal;

	/**	<br> The entity shortTermSuspensionsPacificIslanderTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsPacificIslanderTotal">Find the entity shortTermSuspensionsPacificIslanderTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsPacificIslanderTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsPacificIslanderTotal() {
		return shortTermSuspensionsPacificIslanderTotal;
	}

	public void setShortTermSuspensionsPacificIslanderTotal(Long shortTermSuspensionsPacificIslanderTotal) {
		this.shortTermSuspensionsPacificIslanderTotal = shortTermSuspensionsPacificIslanderTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderTotal(String o) {
		this.shortTermSuspensionsPacificIslanderTotal = ReportCard.staticSetShortTermSuspensionsPacificIslanderTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsPacificIslanderTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsPacificIslanderTotalInit() {
		Wrap<Long> shortTermSuspensionsPacificIslanderTotalWrap = new Wrap<Long>().var("shortTermSuspensionsPacificIslanderTotal");
		if(shortTermSuspensionsPacificIslanderTotal == null) {
			_shortTermSuspensionsPacificIslanderTotal(shortTermSuspensionsPacificIslanderTotalWrap);
			setShortTermSuspensionsPacificIslanderTotal(shortTermSuspensionsPacificIslanderTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsPacificIslanderTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsPacificIslanderTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsPacificIslanderTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsPacificIslanderTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsPacificIslanderTotal(siteRequest_, o)));
	}

	////////////////////////////////////////////////
	// shortTermSuspensionsPacificIslanderPercent //
	////////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsPacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsPacificIslanderPercent;

	/**	<br> The entity shortTermSuspensionsPacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsPacificIslanderPercent">Find the entity shortTermSuspensionsPacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsPacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsPacificIslanderPercent() {
		return shortTermSuspensionsPacificIslanderPercent;
	}

	public void setShortTermSuspensionsPacificIslanderPercent(BigDecimal shortTermSuspensionsPacificIslanderPercent) {
		this.shortTermSuspensionsPacificIslanderPercent = shortTermSuspensionsPacificIslanderPercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderPercent(String o) {
		this.shortTermSuspensionsPacificIslanderPercent = ReportCard.staticSetShortTermSuspensionsPacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderPercent(Double o) {
			this.shortTermSuspensionsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderPercent(Integer o) {
			this.shortTermSuspensionsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsPacificIslanderPercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsPacificIslanderPercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsPacificIslanderPercent");
		if(shortTermSuspensionsPacificIslanderPercent == null) {
			_shortTermSuspensionsPacificIslanderPercent(shortTermSuspensionsPacificIslanderPercentWrap);
			setShortTermSuspensionsPacificIslanderPercent(shortTermSuspensionsPacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsPacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsPacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderPercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsPacificIslanderPercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsPacificIslanderPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////////
	// shortTermSuspensionsPacificIslanderRate //
	/////////////////////////////////////////////

	/**	 The entity shortTermSuspensionsPacificIslanderRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsPacificIslanderRate;

	/**	<br> The entity shortTermSuspensionsPacificIslanderRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsPacificIslanderRate">Find the entity shortTermSuspensionsPacificIslanderRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsPacificIslanderRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsPacificIslanderRate() {
		return shortTermSuspensionsPacificIslanderRate;
	}

	public void setShortTermSuspensionsPacificIslanderRate(BigDecimal shortTermSuspensionsPacificIslanderRate) {
		this.shortTermSuspensionsPacificIslanderRate = shortTermSuspensionsPacificIslanderRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderRate(String o) {
		this.shortTermSuspensionsPacificIslanderRate = ReportCard.staticSetShortTermSuspensionsPacificIslanderRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsPacificIslanderRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderRate(Double o) {
			this.shortTermSuspensionsPacificIslanderRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsPacificIslanderRate(Integer o) {
			this.shortTermSuspensionsPacificIslanderRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsPacificIslanderRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsPacificIslanderRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsPacificIslanderRate");
		if(shortTermSuspensionsPacificIslanderRate == null) {
			_shortTermSuspensionsPacificIslanderRate(shortTermSuspensionsPacificIslanderRateWrap);
			setShortTermSuspensionsPacificIslanderRate(shortTermSuspensionsPacificIslanderRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsPacificIslanderRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsPacificIslanderRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsPacificIslanderRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsPacificIslanderRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsPacificIslanderRate(siteRequest_, o)));
	}

	/////////////////////////////////////
	// shortTermSuspensionsWhiteFemale //
	/////////////////////////////////////

	/**	 The entity shortTermSuspensionsWhiteFemale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsWhiteFemale;

	/**	<br> The entity shortTermSuspensionsWhiteFemale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsWhiteFemale">Find the entity shortTermSuspensionsWhiteFemale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsWhiteFemale(Wrap<Long> c);

	public Long getShortTermSuspensionsWhiteFemale() {
		return shortTermSuspensionsWhiteFemale;
	}

	public void setShortTermSuspensionsWhiteFemale(Long shortTermSuspensionsWhiteFemale) {
		this.shortTermSuspensionsWhiteFemale = shortTermSuspensionsWhiteFemale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteFemale(String o) {
		this.shortTermSuspensionsWhiteFemale = ReportCard.staticSetShortTermSuspensionsWhiteFemale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsWhiteFemale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsWhiteFemaleInit() {
		Wrap<Long> shortTermSuspensionsWhiteFemaleWrap = new Wrap<Long>().var("shortTermSuspensionsWhiteFemale");
		if(shortTermSuspensionsWhiteFemale == null) {
			_shortTermSuspensionsWhiteFemale(shortTermSuspensionsWhiteFemaleWrap);
			setShortTermSuspensionsWhiteFemale(shortTermSuspensionsWhiteFemaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsWhiteFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsWhiteFemale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsWhiteFemale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsWhiteFemale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsWhiteFemale(siteRequest_, ReportCard.staticSetShortTermSuspensionsWhiteFemale(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsWhiteMale //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsWhiteMale
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsWhiteMale;

	/**	<br> The entity shortTermSuspensionsWhiteMale
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsWhiteMale">Find the entity shortTermSuspensionsWhiteMale in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsWhiteMale(Wrap<Long> c);

	public Long getShortTermSuspensionsWhiteMale() {
		return shortTermSuspensionsWhiteMale;
	}

	public void setShortTermSuspensionsWhiteMale(Long shortTermSuspensionsWhiteMale) {
		this.shortTermSuspensionsWhiteMale = shortTermSuspensionsWhiteMale;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteMale(String o) {
		this.shortTermSuspensionsWhiteMale = ReportCard.staticSetShortTermSuspensionsWhiteMale(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsWhiteMale(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsWhiteMaleInit() {
		Wrap<Long> shortTermSuspensionsWhiteMaleWrap = new Wrap<Long>().var("shortTermSuspensionsWhiteMale");
		if(shortTermSuspensionsWhiteMale == null) {
			_shortTermSuspensionsWhiteMale(shortTermSuspensionsWhiteMaleWrap);
			setShortTermSuspensionsWhiteMale(shortTermSuspensionsWhiteMaleWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsWhiteMale(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsWhiteMale(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsWhiteMale(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsWhiteMale(siteRequest_, ReportCard.staticSearchShortTermSuspensionsWhiteMale(siteRequest_, ReportCard.staticSetShortTermSuspensionsWhiteMale(siteRequest_, o)));
	}

	////////////////////////////////////
	// shortTermSuspensionsWhiteTotal //
	////////////////////////////////////

	/**	 The entity shortTermSuspensionsWhiteTotal
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long shortTermSuspensionsWhiteTotal;

	/**	<br> The entity shortTermSuspensionsWhiteTotal
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsWhiteTotal">Find the entity shortTermSuspensionsWhiteTotal in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsWhiteTotal(Wrap<Long> c);

	public Long getShortTermSuspensionsWhiteTotal() {
		return shortTermSuspensionsWhiteTotal;
	}

	public void setShortTermSuspensionsWhiteTotal(Long shortTermSuspensionsWhiteTotal) {
		this.shortTermSuspensionsWhiteTotal = shortTermSuspensionsWhiteTotal;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteTotal(String o) {
		this.shortTermSuspensionsWhiteTotal = ReportCard.staticSetShortTermSuspensionsWhiteTotal(siteRequest_, o);
	}
	public static Long staticSetShortTermSuspensionsWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected ReportCard shortTermSuspensionsWhiteTotalInit() {
		Wrap<Long> shortTermSuspensionsWhiteTotalWrap = new Wrap<Long>().var("shortTermSuspensionsWhiteTotal");
		if(shortTermSuspensionsWhiteTotal == null) {
			_shortTermSuspensionsWhiteTotal(shortTermSuspensionsWhiteTotalWrap);
			setShortTermSuspensionsWhiteTotal(shortTermSuspensionsWhiteTotalWrap.o);
		}
		return (ReportCard)this;
	}

	public static Long staticSearchShortTermSuspensionsWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrShortTermSuspensionsWhiteTotal(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsWhiteTotal(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsWhiteTotal(siteRequest_, ReportCard.staticSearchShortTermSuspensionsWhiteTotal(siteRequest_, ReportCard.staticSetShortTermSuspensionsWhiteTotal(siteRequest_, o)));
	}

	//////////////////////////////////////
	// shortTermSuspensionsWhitePercent //
	//////////////////////////////////////

	/**	 The entity shortTermSuspensionsWhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsWhitePercent;

	/**	<br> The entity shortTermSuspensionsWhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsWhitePercent">Find the entity shortTermSuspensionsWhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsWhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsWhitePercent() {
		return shortTermSuspensionsWhitePercent;
	}

	public void setShortTermSuspensionsWhitePercent(BigDecimal shortTermSuspensionsWhitePercent) {
		this.shortTermSuspensionsWhitePercent = shortTermSuspensionsWhitePercent;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhitePercent(String o) {
		this.shortTermSuspensionsWhitePercent = ReportCard.staticSetShortTermSuspensionsWhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhitePercent(Double o) {
			this.shortTermSuspensionsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhitePercent(Integer o) {
			this.shortTermSuspensionsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsWhitePercentInit() {
		Wrap<BigDecimal> shortTermSuspensionsWhitePercentWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsWhitePercent");
		if(shortTermSuspensionsWhitePercent == null) {
			_shortTermSuspensionsWhitePercent(shortTermSuspensionsWhitePercentWrap);
			setShortTermSuspensionsWhitePercent(shortTermSuspensionsWhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsWhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsWhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsWhitePercent(siteRequest_, ReportCard.staticSearchShortTermSuspensionsWhitePercent(siteRequest_, ReportCard.staticSetShortTermSuspensionsWhitePercent(siteRequest_, o)));
	}

	///////////////////////////////////
	// shortTermSuspensionsWhiteRate //
	///////////////////////////////////

	/**	 The entity shortTermSuspensionsWhiteRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsWhiteRate;

	/**	<br> The entity shortTermSuspensionsWhiteRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsWhiteRate">Find the entity shortTermSuspensionsWhiteRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsWhiteRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsWhiteRate() {
		return shortTermSuspensionsWhiteRate;
	}

	public void setShortTermSuspensionsWhiteRate(BigDecimal shortTermSuspensionsWhiteRate) {
		this.shortTermSuspensionsWhiteRate = shortTermSuspensionsWhiteRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteRate(String o) {
		this.shortTermSuspensionsWhiteRate = ReportCard.staticSetShortTermSuspensionsWhiteRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsWhiteRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteRate(Double o) {
			this.shortTermSuspensionsWhiteRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsWhiteRate(Integer o) {
			this.shortTermSuspensionsWhiteRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsWhiteRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsWhiteRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsWhiteRate");
		if(shortTermSuspensionsWhiteRate == null) {
			_shortTermSuspensionsWhiteRate(shortTermSuspensionsWhiteRateWrap);
			setShortTermSuspensionsWhiteRate(shortTermSuspensionsWhiteRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsWhiteRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsWhiteRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsWhiteRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsWhiteRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsWhiteRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsWhiteRate(siteRequest_, o)));
	}

	/////////////////////////////////
	// shortTermSuspensionsAllRate //
	/////////////////////////////////

	/**	 The entity shortTermSuspensionsAllRate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsAllRate;

	/**	<br> The entity shortTermSuspensionsAllRate
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsAllRate">Find the entity shortTermSuspensionsAllRate in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsAllRate(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsAllRate() {
		return shortTermSuspensionsAllRate;
	}

	public void setShortTermSuspensionsAllRate(BigDecimal shortTermSuspensionsAllRate) {
		this.shortTermSuspensionsAllRate = shortTermSuspensionsAllRate;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAllRate(String o) {
		this.shortTermSuspensionsAllRate = ReportCard.staticSetShortTermSuspensionsAllRate(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsAllRate(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsAllRate(Double o) {
			this.shortTermSuspensionsAllRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsAllRate(Integer o) {
			this.shortTermSuspensionsAllRate = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsAllRateInit() {
		Wrap<BigDecimal> shortTermSuspensionsAllRateWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsAllRate");
		if(shortTermSuspensionsAllRate == null) {
			_shortTermSuspensionsAllRate(shortTermSuspensionsAllRateWrap);
			setShortTermSuspensionsAllRate(shortTermSuspensionsAllRateWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsAllRate(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsAllRate(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsAllRate(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsAllRate(siteRequest_, ReportCard.staticSearchShortTermSuspensionsAllRate(siteRequest_, ReportCard.staticSetShortTermSuspensionsAllRate(siteRequest_, o)));
	}

	//////////////////////////////////////
	// shortTermSuspensionsBlackVsWhite //
	//////////////////////////////////////

	/**	 The entity shortTermSuspensionsBlackVsWhite
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal shortTermSuspensionsBlackVsWhite;

	/**	<br> The entity shortTermSuspensionsBlackVsWhite
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:shortTermSuspensionsBlackVsWhite">Find the entity shortTermSuspensionsBlackVsWhite in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _shortTermSuspensionsBlackVsWhite(Wrap<BigDecimal> c);

	public BigDecimal getShortTermSuspensionsBlackVsWhite() {
		return shortTermSuspensionsBlackVsWhite;
	}

	public void setShortTermSuspensionsBlackVsWhite(BigDecimal shortTermSuspensionsBlackVsWhite) {
		this.shortTermSuspensionsBlackVsWhite = shortTermSuspensionsBlackVsWhite;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackVsWhite(String o) {
		this.shortTermSuspensionsBlackVsWhite = ReportCard.staticSetShortTermSuspensionsBlackVsWhite(siteRequest_, o);
	}
	public static BigDecimal staticSetShortTermSuspensionsBlackVsWhite(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackVsWhite(Double o) {
			this.shortTermSuspensionsBlackVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setShortTermSuspensionsBlackVsWhite(Integer o) {
			this.shortTermSuspensionsBlackVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard shortTermSuspensionsBlackVsWhiteInit() {
		Wrap<BigDecimal> shortTermSuspensionsBlackVsWhiteWrap = new Wrap<BigDecimal>().var("shortTermSuspensionsBlackVsWhite");
		if(shortTermSuspensionsBlackVsWhite == null) {
			_shortTermSuspensionsBlackVsWhite(shortTermSuspensionsBlackVsWhiteWrap);
			setShortTermSuspensionsBlackVsWhite(shortTermSuspensionsBlackVsWhiteWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchShortTermSuspensionsBlackVsWhite(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrShortTermSuspensionsBlackVsWhite(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqShortTermSuspensionsBlackVsWhite(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrShortTermSuspensionsBlackVsWhite(siteRequest_, ReportCard.staticSearchShortTermSuspensionsBlackVsWhite(siteRequest_, ReportCard.staticSetShortTermSuspensionsBlackVsWhite(siteRequest_, o)));
	}

	/////////////////////////////////////////////
	// examsCollegeReadyGrades38OverallPercent //
	/////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38OverallPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38OverallPercent;

	/**	<br> The entity examsCollegeReadyGrades38OverallPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38OverallPercent">Find the entity examsCollegeReadyGrades38OverallPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38OverallPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38OverallPercent() {
		return examsCollegeReadyGrades38OverallPercent;
	}

	public void setExamsCollegeReadyGrades38OverallPercent(BigDecimal examsCollegeReadyGrades38OverallPercent) {
		this.examsCollegeReadyGrades38OverallPercent = examsCollegeReadyGrades38OverallPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38OverallPercent(String o) {
		this.examsCollegeReadyGrades38OverallPercent = ReportCard.staticSetExamsCollegeReadyGrades38OverallPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38OverallPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38OverallPercent(Double o) {
			this.examsCollegeReadyGrades38OverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38OverallPercent(Integer o) {
			this.examsCollegeReadyGrades38OverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38OverallPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38OverallPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38OverallPercent");
		if(examsCollegeReadyGrades38OverallPercent == null) {
			_examsCollegeReadyGrades38OverallPercent(examsCollegeReadyGrades38OverallPercentWrap);
			setExamsCollegeReadyGrades38OverallPercent(examsCollegeReadyGrades38OverallPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38OverallPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38OverallPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38OverallPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38OverallPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38OverallPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38OverallPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////////
	// examsCollegeReadyGrades38IndigenousPercent //
	////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38IndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38IndigenousPercent;

	/**	<br> The entity examsCollegeReadyGrades38IndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38IndigenousPercent">Find the entity examsCollegeReadyGrades38IndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38IndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38IndigenousPercent() {
		return examsCollegeReadyGrades38IndigenousPercent;
	}

	public void setExamsCollegeReadyGrades38IndigenousPercent(BigDecimal examsCollegeReadyGrades38IndigenousPercent) {
		this.examsCollegeReadyGrades38IndigenousPercent = examsCollegeReadyGrades38IndigenousPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38IndigenousPercent(String o) {
		this.examsCollegeReadyGrades38IndigenousPercent = ReportCard.staticSetExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38IndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38IndigenousPercent(Double o) {
			this.examsCollegeReadyGrades38IndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38IndigenousPercent(Integer o) {
			this.examsCollegeReadyGrades38IndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38IndigenousPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38IndigenousPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38IndigenousPercent");
		if(examsCollegeReadyGrades38IndigenousPercent == null) {
			_examsCollegeReadyGrades38IndigenousPercent(examsCollegeReadyGrades38IndigenousPercentWrap);
			setExamsCollegeReadyGrades38IndigenousPercent(examsCollegeReadyGrades38IndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38IndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38IndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38IndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// examsCollegeReadyGrades38AsianPercent //
	///////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38AsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38AsianPercent;

	/**	<br> The entity examsCollegeReadyGrades38AsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38AsianPercent">Find the entity examsCollegeReadyGrades38AsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38AsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38AsianPercent() {
		return examsCollegeReadyGrades38AsianPercent;
	}

	public void setExamsCollegeReadyGrades38AsianPercent(BigDecimal examsCollegeReadyGrades38AsianPercent) {
		this.examsCollegeReadyGrades38AsianPercent = examsCollegeReadyGrades38AsianPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38AsianPercent(String o) {
		this.examsCollegeReadyGrades38AsianPercent = ReportCard.staticSetExamsCollegeReadyGrades38AsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38AsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38AsianPercent(Double o) {
			this.examsCollegeReadyGrades38AsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38AsianPercent(Integer o) {
			this.examsCollegeReadyGrades38AsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38AsianPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38AsianPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38AsianPercent");
		if(examsCollegeReadyGrades38AsianPercent == null) {
			_examsCollegeReadyGrades38AsianPercent(examsCollegeReadyGrades38AsianPercentWrap);
			setExamsCollegeReadyGrades38AsianPercent(examsCollegeReadyGrades38AsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38AsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38AsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38AsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38AsianPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38AsianPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38AsianPercent(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// examsCollegeReadyGrades38BlackPercent //
	///////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38BlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38BlackPercent;

	/**	<br> The entity examsCollegeReadyGrades38BlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38BlackPercent">Find the entity examsCollegeReadyGrades38BlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38BlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38BlackPercent() {
		return examsCollegeReadyGrades38BlackPercent;
	}

	public void setExamsCollegeReadyGrades38BlackPercent(BigDecimal examsCollegeReadyGrades38BlackPercent) {
		this.examsCollegeReadyGrades38BlackPercent = examsCollegeReadyGrades38BlackPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackPercent(String o) {
		this.examsCollegeReadyGrades38BlackPercent = ReportCard.staticSetExamsCollegeReadyGrades38BlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38BlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackPercent(Double o) {
			this.examsCollegeReadyGrades38BlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackPercent(Integer o) {
			this.examsCollegeReadyGrades38BlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38BlackPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38BlackPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38BlackPercent");
		if(examsCollegeReadyGrades38BlackPercent == null) {
			_examsCollegeReadyGrades38BlackPercent(examsCollegeReadyGrades38BlackPercentWrap);
			setExamsCollegeReadyGrades38BlackPercent(examsCollegeReadyGrades38BlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38BlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38BlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38BlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38BlackPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38BlackPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38BlackPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// examsCollegeReadyGrades38LatinxPercent //
	////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38LatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38LatinxPercent;

	/**	<br> The entity examsCollegeReadyGrades38LatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38LatinxPercent">Find the entity examsCollegeReadyGrades38LatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38LatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38LatinxPercent() {
		return examsCollegeReadyGrades38LatinxPercent;
	}

	public void setExamsCollegeReadyGrades38LatinxPercent(BigDecimal examsCollegeReadyGrades38LatinxPercent) {
		this.examsCollegeReadyGrades38LatinxPercent = examsCollegeReadyGrades38LatinxPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxPercent(String o) {
		this.examsCollegeReadyGrades38LatinxPercent = ReportCard.staticSetExamsCollegeReadyGrades38LatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38LatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxPercent(Double o) {
			this.examsCollegeReadyGrades38LatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxPercent(Integer o) {
			this.examsCollegeReadyGrades38LatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38LatinxPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38LatinxPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38LatinxPercent");
		if(examsCollegeReadyGrades38LatinxPercent == null) {
			_examsCollegeReadyGrades38LatinxPercent(examsCollegeReadyGrades38LatinxPercentWrap);
			setExamsCollegeReadyGrades38LatinxPercent(examsCollegeReadyGrades38LatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38LatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38LatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38LatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38LatinxPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38LatinxPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38LatinxPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////////////
	// examsCollegeReadyGrades38MultiRacialPercent //
	/////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38MultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38MultiRacialPercent;

	/**	<br> The entity examsCollegeReadyGrades38MultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38MultiRacialPercent">Find the entity examsCollegeReadyGrades38MultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38MultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38MultiRacialPercent() {
		return examsCollegeReadyGrades38MultiRacialPercent;
	}

	public void setExamsCollegeReadyGrades38MultiRacialPercent(BigDecimal examsCollegeReadyGrades38MultiRacialPercent) {
		this.examsCollegeReadyGrades38MultiRacialPercent = examsCollegeReadyGrades38MultiRacialPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38MultiRacialPercent(String o) {
		this.examsCollegeReadyGrades38MultiRacialPercent = ReportCard.staticSetExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38MultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38MultiRacialPercent(Double o) {
			this.examsCollegeReadyGrades38MultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38MultiRacialPercent(Integer o) {
			this.examsCollegeReadyGrades38MultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38MultiRacialPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38MultiRacialPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38MultiRacialPercent");
		if(examsCollegeReadyGrades38MultiRacialPercent == null) {
			_examsCollegeReadyGrades38MultiRacialPercent(examsCollegeReadyGrades38MultiRacialPercentWrap);
			setExamsCollegeReadyGrades38MultiRacialPercent(examsCollegeReadyGrades38MultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38MultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38MultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38MultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////////////////
	// examsCollegeReadyGrades38PacificIslanderPercent //
	/////////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38PacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38PacificIslanderPercent;

	/**	<br> The entity examsCollegeReadyGrades38PacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38PacificIslanderPercent">Find the entity examsCollegeReadyGrades38PacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38PacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38PacificIslanderPercent() {
		return examsCollegeReadyGrades38PacificIslanderPercent;
	}

	public void setExamsCollegeReadyGrades38PacificIslanderPercent(BigDecimal examsCollegeReadyGrades38PacificIslanderPercent) {
		this.examsCollegeReadyGrades38PacificIslanderPercent = examsCollegeReadyGrades38PacificIslanderPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38PacificIslanderPercent(String o) {
		this.examsCollegeReadyGrades38PacificIslanderPercent = ReportCard.staticSetExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38PacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38PacificIslanderPercent(Double o) {
			this.examsCollegeReadyGrades38PacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38PacificIslanderPercent(Integer o) {
			this.examsCollegeReadyGrades38PacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38PacificIslanderPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38PacificIslanderPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38PacificIslanderPercent");
		if(examsCollegeReadyGrades38PacificIslanderPercent == null) {
			_examsCollegeReadyGrades38PacificIslanderPercent(examsCollegeReadyGrades38PacificIslanderPercentWrap);
			setExamsCollegeReadyGrades38PacificIslanderPercent(examsCollegeReadyGrades38PacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38PacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38PacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38PacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// examsCollegeReadyGrades38WhitePercent //
	///////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38WhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38WhitePercent;

	/**	<br> The entity examsCollegeReadyGrades38WhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38WhitePercent">Find the entity examsCollegeReadyGrades38WhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38WhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38WhitePercent() {
		return examsCollegeReadyGrades38WhitePercent;
	}

	public void setExamsCollegeReadyGrades38WhitePercent(BigDecimal examsCollegeReadyGrades38WhitePercent) {
		this.examsCollegeReadyGrades38WhitePercent = examsCollegeReadyGrades38WhitePercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38WhitePercent(String o) {
		this.examsCollegeReadyGrades38WhitePercent = ReportCard.staticSetExamsCollegeReadyGrades38WhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38WhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38WhitePercent(Double o) {
			this.examsCollegeReadyGrades38WhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38WhitePercent(Integer o) {
			this.examsCollegeReadyGrades38WhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38WhitePercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38WhitePercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38WhitePercent");
		if(examsCollegeReadyGrades38WhitePercent == null) {
			_examsCollegeReadyGrades38WhitePercent(examsCollegeReadyGrades38WhitePercentWrap);
			setExamsCollegeReadyGrades38WhitePercent(examsCollegeReadyGrades38WhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38WhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38WhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38WhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38WhitePercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38WhitePercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38WhitePercent(siteRequest_, o)));
	}

	//////////////////////////////////////////////
	// examsCollegeReadyGrades912OverallPercent //
	//////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912OverallPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912OverallPercent;

	/**	<br> The entity examsCollegeReadyGrades912OverallPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912OverallPercent">Find the entity examsCollegeReadyGrades912OverallPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912OverallPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912OverallPercent() {
		return examsCollegeReadyGrades912OverallPercent;
	}

	public void setExamsCollegeReadyGrades912OverallPercent(BigDecimal examsCollegeReadyGrades912OverallPercent) {
		this.examsCollegeReadyGrades912OverallPercent = examsCollegeReadyGrades912OverallPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912OverallPercent(String o) {
		this.examsCollegeReadyGrades912OverallPercent = ReportCard.staticSetExamsCollegeReadyGrades912OverallPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912OverallPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912OverallPercent(Double o) {
			this.examsCollegeReadyGrades912OverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912OverallPercent(Integer o) {
			this.examsCollegeReadyGrades912OverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912OverallPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912OverallPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912OverallPercent");
		if(examsCollegeReadyGrades912OverallPercent == null) {
			_examsCollegeReadyGrades912OverallPercent(examsCollegeReadyGrades912OverallPercentWrap);
			setExamsCollegeReadyGrades912OverallPercent(examsCollegeReadyGrades912OverallPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912OverallPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912OverallPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912OverallPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912OverallPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912OverallPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912OverallPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////////////
	// examsCollegeReadyGrades912IndigenousPercent //
	/////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912IndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912IndigenousPercent;

	/**	<br> The entity examsCollegeReadyGrades912IndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912IndigenousPercent">Find the entity examsCollegeReadyGrades912IndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912IndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912IndigenousPercent() {
		return examsCollegeReadyGrades912IndigenousPercent;
	}

	public void setExamsCollegeReadyGrades912IndigenousPercent(BigDecimal examsCollegeReadyGrades912IndigenousPercent) {
		this.examsCollegeReadyGrades912IndigenousPercent = examsCollegeReadyGrades912IndigenousPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912IndigenousPercent(String o) {
		this.examsCollegeReadyGrades912IndigenousPercent = ReportCard.staticSetExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912IndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912IndigenousPercent(Double o) {
			this.examsCollegeReadyGrades912IndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912IndigenousPercent(Integer o) {
			this.examsCollegeReadyGrades912IndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912IndigenousPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912IndigenousPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912IndigenousPercent");
		if(examsCollegeReadyGrades912IndigenousPercent == null) {
			_examsCollegeReadyGrades912IndigenousPercent(examsCollegeReadyGrades912IndigenousPercentWrap);
			setExamsCollegeReadyGrades912IndigenousPercent(examsCollegeReadyGrades912IndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912IndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912IndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912IndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// examsCollegeReadyGrades912AsianPercent //
	////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912AsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912AsianPercent;

	/**	<br> The entity examsCollegeReadyGrades912AsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912AsianPercent">Find the entity examsCollegeReadyGrades912AsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912AsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912AsianPercent() {
		return examsCollegeReadyGrades912AsianPercent;
	}

	public void setExamsCollegeReadyGrades912AsianPercent(BigDecimal examsCollegeReadyGrades912AsianPercent) {
		this.examsCollegeReadyGrades912AsianPercent = examsCollegeReadyGrades912AsianPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912AsianPercent(String o) {
		this.examsCollegeReadyGrades912AsianPercent = ReportCard.staticSetExamsCollegeReadyGrades912AsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912AsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912AsianPercent(Double o) {
			this.examsCollegeReadyGrades912AsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912AsianPercent(Integer o) {
			this.examsCollegeReadyGrades912AsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912AsianPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912AsianPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912AsianPercent");
		if(examsCollegeReadyGrades912AsianPercent == null) {
			_examsCollegeReadyGrades912AsianPercent(examsCollegeReadyGrades912AsianPercentWrap);
			setExamsCollegeReadyGrades912AsianPercent(examsCollegeReadyGrades912AsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912AsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912AsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912AsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912AsianPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912AsianPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912AsianPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// examsCollegeReadyGrades912BlackPercent //
	////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912BlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912BlackPercent;

	/**	<br> The entity examsCollegeReadyGrades912BlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912BlackPercent">Find the entity examsCollegeReadyGrades912BlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912BlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912BlackPercent() {
		return examsCollegeReadyGrades912BlackPercent;
	}

	public void setExamsCollegeReadyGrades912BlackPercent(BigDecimal examsCollegeReadyGrades912BlackPercent) {
		this.examsCollegeReadyGrades912BlackPercent = examsCollegeReadyGrades912BlackPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912BlackPercent(String o) {
		this.examsCollegeReadyGrades912BlackPercent = ReportCard.staticSetExamsCollegeReadyGrades912BlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912BlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912BlackPercent(Double o) {
			this.examsCollegeReadyGrades912BlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912BlackPercent(Integer o) {
			this.examsCollegeReadyGrades912BlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912BlackPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912BlackPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912BlackPercent");
		if(examsCollegeReadyGrades912BlackPercent == null) {
			_examsCollegeReadyGrades912BlackPercent(examsCollegeReadyGrades912BlackPercentWrap);
			setExamsCollegeReadyGrades912BlackPercent(examsCollegeReadyGrades912BlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912BlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912BlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912BlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912BlackPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912BlackPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912BlackPercent(siteRequest_, o)));
	}

	/////////////////////////////////////////////
	// examsCollegeReadyGrades912LatinxPercent //
	/////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912LatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912LatinxPercent;

	/**	<br> The entity examsCollegeReadyGrades912LatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912LatinxPercent">Find the entity examsCollegeReadyGrades912LatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912LatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912LatinxPercent() {
		return examsCollegeReadyGrades912LatinxPercent;
	}

	public void setExamsCollegeReadyGrades912LatinxPercent(BigDecimal examsCollegeReadyGrades912LatinxPercent) {
		this.examsCollegeReadyGrades912LatinxPercent = examsCollegeReadyGrades912LatinxPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912LatinxPercent(String o) {
		this.examsCollegeReadyGrades912LatinxPercent = ReportCard.staticSetExamsCollegeReadyGrades912LatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912LatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912LatinxPercent(Double o) {
			this.examsCollegeReadyGrades912LatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912LatinxPercent(Integer o) {
			this.examsCollegeReadyGrades912LatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912LatinxPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912LatinxPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912LatinxPercent");
		if(examsCollegeReadyGrades912LatinxPercent == null) {
			_examsCollegeReadyGrades912LatinxPercent(examsCollegeReadyGrades912LatinxPercentWrap);
			setExamsCollegeReadyGrades912LatinxPercent(examsCollegeReadyGrades912LatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912LatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912LatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912LatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912LatinxPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912LatinxPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912LatinxPercent(siteRequest_, o)));
	}

	//////////////////////////////////////////////////
	// examsCollegeReadyGrades912MultiRacialPercent //
	//////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912MultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912MultiRacialPercent;

	/**	<br> The entity examsCollegeReadyGrades912MultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912MultiRacialPercent">Find the entity examsCollegeReadyGrades912MultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912MultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912MultiRacialPercent() {
		return examsCollegeReadyGrades912MultiRacialPercent;
	}

	public void setExamsCollegeReadyGrades912MultiRacialPercent(BigDecimal examsCollegeReadyGrades912MultiRacialPercent) {
		this.examsCollegeReadyGrades912MultiRacialPercent = examsCollegeReadyGrades912MultiRacialPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912MultiRacialPercent(String o) {
		this.examsCollegeReadyGrades912MultiRacialPercent = ReportCard.staticSetExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912MultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912MultiRacialPercent(Double o) {
			this.examsCollegeReadyGrades912MultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912MultiRacialPercent(Integer o) {
			this.examsCollegeReadyGrades912MultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912MultiRacialPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912MultiRacialPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912MultiRacialPercent");
		if(examsCollegeReadyGrades912MultiRacialPercent == null) {
			_examsCollegeReadyGrades912MultiRacialPercent(examsCollegeReadyGrades912MultiRacialPercentWrap);
			setExamsCollegeReadyGrades912MultiRacialPercent(examsCollegeReadyGrades912MultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912MultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912MultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912MultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, o)));
	}

	//////////////////////////////////////////////////////
	// examsCollegeReadyGrades912PacificIslanderPercent //
	//////////////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912PacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912PacificIslanderPercent;

	/**	<br> The entity examsCollegeReadyGrades912PacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912PacificIslanderPercent">Find the entity examsCollegeReadyGrades912PacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912PacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912PacificIslanderPercent() {
		return examsCollegeReadyGrades912PacificIslanderPercent;
	}

	public void setExamsCollegeReadyGrades912PacificIslanderPercent(BigDecimal examsCollegeReadyGrades912PacificIslanderPercent) {
		this.examsCollegeReadyGrades912PacificIslanderPercent = examsCollegeReadyGrades912PacificIslanderPercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912PacificIslanderPercent(String o) {
		this.examsCollegeReadyGrades912PacificIslanderPercent = ReportCard.staticSetExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912PacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912PacificIslanderPercent(Double o) {
			this.examsCollegeReadyGrades912PacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912PacificIslanderPercent(Integer o) {
			this.examsCollegeReadyGrades912PacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912PacificIslanderPercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912PacificIslanderPercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912PacificIslanderPercent");
		if(examsCollegeReadyGrades912PacificIslanderPercent == null) {
			_examsCollegeReadyGrades912PacificIslanderPercent(examsCollegeReadyGrades912PacificIslanderPercentWrap);
			setExamsCollegeReadyGrades912PacificIslanderPercent(examsCollegeReadyGrades912PacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912PacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912PacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912PacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// examsCollegeReadyGrades912WhitePercent //
	////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades912WhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades912WhitePercent;

	/**	<br> The entity examsCollegeReadyGrades912WhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades912WhitePercent">Find the entity examsCollegeReadyGrades912WhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades912WhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades912WhitePercent() {
		return examsCollegeReadyGrades912WhitePercent;
	}

	public void setExamsCollegeReadyGrades912WhitePercent(BigDecimal examsCollegeReadyGrades912WhitePercent) {
		this.examsCollegeReadyGrades912WhitePercent = examsCollegeReadyGrades912WhitePercent;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912WhitePercent(String o) {
		this.examsCollegeReadyGrades912WhitePercent = ReportCard.staticSetExamsCollegeReadyGrades912WhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades912WhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912WhitePercent(Double o) {
			this.examsCollegeReadyGrades912WhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades912WhitePercent(Integer o) {
			this.examsCollegeReadyGrades912WhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades912WhitePercentInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades912WhitePercentWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades912WhitePercent");
		if(examsCollegeReadyGrades912WhitePercent == null) {
			_examsCollegeReadyGrades912WhitePercent(examsCollegeReadyGrades912WhitePercentWrap);
			setExamsCollegeReadyGrades912WhitePercent(examsCollegeReadyGrades912WhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades912WhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades912WhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades912WhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades912WhitePercent(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades912WhitePercent(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades912WhitePercent(siteRequest_, o)));
	}

	////////////////////////////////////////
	// graduateWithin4YearsOverallPercent //
	////////////////////////////////////////

	/**	 The entity graduateWithin4YearsOverallPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsOverallPercent;

	/**	<br> The entity graduateWithin4YearsOverallPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsOverallPercent">Find the entity graduateWithin4YearsOverallPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsOverallPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsOverallPercent() {
		return graduateWithin4YearsOverallPercent;
	}

	public void setGraduateWithin4YearsOverallPercent(BigDecimal graduateWithin4YearsOverallPercent) {
		this.graduateWithin4YearsOverallPercent = graduateWithin4YearsOverallPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsOverallPercent(String o) {
		this.graduateWithin4YearsOverallPercent = ReportCard.staticSetGraduateWithin4YearsOverallPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsOverallPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsOverallPercent(Double o) {
			this.graduateWithin4YearsOverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsOverallPercent(Integer o) {
			this.graduateWithin4YearsOverallPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsOverallPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsOverallPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsOverallPercent");
		if(graduateWithin4YearsOverallPercent == null) {
			_graduateWithin4YearsOverallPercent(graduateWithin4YearsOverallPercentWrap);
			setGraduateWithin4YearsOverallPercent(graduateWithin4YearsOverallPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsOverallPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsOverallPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsOverallPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsOverallPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsOverallPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsOverallPercent(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// graduateWithin4YearsIndigenousPercent //
	///////////////////////////////////////////

	/**	 The entity graduateWithin4YearsIndigenousPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsIndigenousPercent;

	/**	<br> The entity graduateWithin4YearsIndigenousPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsIndigenousPercent">Find the entity graduateWithin4YearsIndigenousPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsIndigenousPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsIndigenousPercent() {
		return graduateWithin4YearsIndigenousPercent;
	}

	public void setGraduateWithin4YearsIndigenousPercent(BigDecimal graduateWithin4YearsIndigenousPercent) {
		this.graduateWithin4YearsIndigenousPercent = graduateWithin4YearsIndigenousPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsIndigenousPercent(String o) {
		this.graduateWithin4YearsIndigenousPercent = ReportCard.staticSetGraduateWithin4YearsIndigenousPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsIndigenousPercent(Double o) {
			this.graduateWithin4YearsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsIndigenousPercent(Integer o) {
			this.graduateWithin4YearsIndigenousPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsIndigenousPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsIndigenousPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsIndigenousPercent");
		if(graduateWithin4YearsIndigenousPercent == null) {
			_graduateWithin4YearsIndigenousPercent(graduateWithin4YearsIndigenousPercentWrap);
			setGraduateWithin4YearsIndigenousPercent(graduateWithin4YearsIndigenousPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsIndigenousPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsIndigenousPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsIndigenousPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsIndigenousPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsIndigenousPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsIndigenousPercent(siteRequest_, o)));
	}

	//////////////////////////////////////
	// graduateWithin4YearsAsianPercent //
	//////////////////////////////////////

	/**	 The entity graduateWithin4YearsAsianPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsAsianPercent;

	/**	<br> The entity graduateWithin4YearsAsianPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsAsianPercent">Find the entity graduateWithin4YearsAsianPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsAsianPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsAsianPercent() {
		return graduateWithin4YearsAsianPercent;
	}

	public void setGraduateWithin4YearsAsianPercent(BigDecimal graduateWithin4YearsAsianPercent) {
		this.graduateWithin4YearsAsianPercent = graduateWithin4YearsAsianPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsAsianPercent(String o) {
		this.graduateWithin4YearsAsianPercent = ReportCard.staticSetGraduateWithin4YearsAsianPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsAsianPercent(Double o) {
			this.graduateWithin4YearsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsAsianPercent(Integer o) {
			this.graduateWithin4YearsAsianPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsAsianPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsAsianPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsAsianPercent");
		if(graduateWithin4YearsAsianPercent == null) {
			_graduateWithin4YearsAsianPercent(graduateWithin4YearsAsianPercentWrap);
			setGraduateWithin4YearsAsianPercent(graduateWithin4YearsAsianPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsAsianPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsAsianPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsAsianPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsAsianPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsAsianPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsAsianPercent(siteRequest_, o)));
	}

	//////////////////////////////////////
	// graduateWithin4YearsBlackPercent //
	//////////////////////////////////////

	/**	 The entity graduateWithin4YearsBlackPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsBlackPercent;

	/**	<br> The entity graduateWithin4YearsBlackPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsBlackPercent">Find the entity graduateWithin4YearsBlackPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsBlackPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsBlackPercent() {
		return graduateWithin4YearsBlackPercent;
	}

	public void setGraduateWithin4YearsBlackPercent(BigDecimal graduateWithin4YearsBlackPercent) {
		this.graduateWithin4YearsBlackPercent = graduateWithin4YearsBlackPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsBlackPercent(String o) {
		this.graduateWithin4YearsBlackPercent = ReportCard.staticSetGraduateWithin4YearsBlackPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsBlackPercent(Double o) {
			this.graduateWithin4YearsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsBlackPercent(Integer o) {
			this.graduateWithin4YearsBlackPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsBlackPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsBlackPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsBlackPercent");
		if(graduateWithin4YearsBlackPercent == null) {
			_graduateWithin4YearsBlackPercent(graduateWithin4YearsBlackPercentWrap);
			setGraduateWithin4YearsBlackPercent(graduateWithin4YearsBlackPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsBlackPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsBlackPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsBlackPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsBlackPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsBlackPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsBlackPercent(siteRequest_, o)));
	}

	///////////////////////////////////////
	// graduateWithin4YearsLatinxPercent //
	///////////////////////////////////////

	/**	 The entity graduateWithin4YearsLatinxPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsLatinxPercent;

	/**	<br> The entity graduateWithin4YearsLatinxPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsLatinxPercent">Find the entity graduateWithin4YearsLatinxPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsLatinxPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsLatinxPercent() {
		return graduateWithin4YearsLatinxPercent;
	}

	public void setGraduateWithin4YearsLatinxPercent(BigDecimal graduateWithin4YearsLatinxPercent) {
		this.graduateWithin4YearsLatinxPercent = graduateWithin4YearsLatinxPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsLatinxPercent(String o) {
		this.graduateWithin4YearsLatinxPercent = ReportCard.staticSetGraduateWithin4YearsLatinxPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsLatinxPercent(Double o) {
			this.graduateWithin4YearsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsLatinxPercent(Integer o) {
			this.graduateWithin4YearsLatinxPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsLatinxPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsLatinxPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsLatinxPercent");
		if(graduateWithin4YearsLatinxPercent == null) {
			_graduateWithin4YearsLatinxPercent(graduateWithin4YearsLatinxPercentWrap);
			setGraduateWithin4YearsLatinxPercent(graduateWithin4YearsLatinxPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsLatinxPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsLatinxPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsLatinxPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsLatinxPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsLatinxPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsLatinxPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// graduateWithin4YearsMultiRacialPercent //
	////////////////////////////////////////////

	/**	 The entity graduateWithin4YearsMultiRacialPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsMultiRacialPercent;

	/**	<br> The entity graduateWithin4YearsMultiRacialPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsMultiRacialPercent">Find the entity graduateWithin4YearsMultiRacialPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsMultiRacialPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsMultiRacialPercent() {
		return graduateWithin4YearsMultiRacialPercent;
	}

	public void setGraduateWithin4YearsMultiRacialPercent(BigDecimal graduateWithin4YearsMultiRacialPercent) {
		this.graduateWithin4YearsMultiRacialPercent = graduateWithin4YearsMultiRacialPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsMultiRacialPercent(String o) {
		this.graduateWithin4YearsMultiRacialPercent = ReportCard.staticSetGraduateWithin4YearsMultiRacialPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsMultiRacialPercent(Double o) {
			this.graduateWithin4YearsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsMultiRacialPercent(Integer o) {
			this.graduateWithin4YearsMultiRacialPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsMultiRacialPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsMultiRacialPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsMultiRacialPercent");
		if(graduateWithin4YearsMultiRacialPercent == null) {
			_graduateWithin4YearsMultiRacialPercent(graduateWithin4YearsMultiRacialPercentWrap);
			setGraduateWithin4YearsMultiRacialPercent(graduateWithin4YearsMultiRacialPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsMultiRacialPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsMultiRacialPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsMultiRacialPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsMultiRacialPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsMultiRacialPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsMultiRacialPercent(siteRequest_, o)));
	}

	////////////////////////////////////////////////
	// graduateWithin4YearsPacificIslanderPercent //
	////////////////////////////////////////////////

	/**	 The entity graduateWithin4YearsPacificIslanderPercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsPacificIslanderPercent;

	/**	<br> The entity graduateWithin4YearsPacificIslanderPercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsPacificIslanderPercent">Find the entity graduateWithin4YearsPacificIslanderPercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsPacificIslanderPercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsPacificIslanderPercent() {
		return graduateWithin4YearsPacificIslanderPercent;
	}

	public void setGraduateWithin4YearsPacificIslanderPercent(BigDecimal graduateWithin4YearsPacificIslanderPercent) {
		this.graduateWithin4YearsPacificIslanderPercent = graduateWithin4YearsPacificIslanderPercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsPacificIslanderPercent(String o) {
		this.graduateWithin4YearsPacificIslanderPercent = ReportCard.staticSetGraduateWithin4YearsPacificIslanderPercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsPacificIslanderPercent(Double o) {
			this.graduateWithin4YearsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsPacificIslanderPercent(Integer o) {
			this.graduateWithin4YearsPacificIslanderPercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsPacificIslanderPercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsPacificIslanderPercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsPacificIslanderPercent");
		if(graduateWithin4YearsPacificIslanderPercent == null) {
			_graduateWithin4YearsPacificIslanderPercent(graduateWithin4YearsPacificIslanderPercentWrap);
			setGraduateWithin4YearsPacificIslanderPercent(graduateWithin4YearsPacificIslanderPercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsPacificIslanderPercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsPacificIslanderPercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsPacificIslanderPercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsPacificIslanderPercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsPacificIslanderPercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsPacificIslanderPercent(siteRequest_, o)));
	}

	//////////////////////////////////////
	// graduateWithin4YearsWhitePercent //
	//////////////////////////////////////

	/**	 The entity graduateWithin4YearsWhitePercent
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal graduateWithin4YearsWhitePercent;

	/**	<br> The entity graduateWithin4YearsWhitePercent
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:graduateWithin4YearsWhitePercent">Find the entity graduateWithin4YearsWhitePercent in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _graduateWithin4YearsWhitePercent(Wrap<BigDecimal> c);

	public BigDecimal getGraduateWithin4YearsWhitePercent() {
		return graduateWithin4YearsWhitePercent;
	}

	public void setGraduateWithin4YearsWhitePercent(BigDecimal graduateWithin4YearsWhitePercent) {
		this.graduateWithin4YearsWhitePercent = graduateWithin4YearsWhitePercent;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsWhitePercent(String o) {
		this.graduateWithin4YearsWhitePercent = ReportCard.staticSetGraduateWithin4YearsWhitePercent(siteRequest_, o);
	}
	public static BigDecimal staticSetGraduateWithin4YearsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setGraduateWithin4YearsWhitePercent(Double o) {
			this.graduateWithin4YearsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setGraduateWithin4YearsWhitePercent(Integer o) {
			this.graduateWithin4YearsWhitePercent = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard graduateWithin4YearsWhitePercentInit() {
		Wrap<BigDecimal> graduateWithin4YearsWhitePercentWrap = new Wrap<BigDecimal>().var("graduateWithin4YearsWhitePercent");
		if(graduateWithin4YearsWhitePercent == null) {
			_graduateWithin4YearsWhitePercent(graduateWithin4YearsWhitePercentWrap);
			setGraduateWithin4YearsWhitePercent(graduateWithin4YearsWhitePercentWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchGraduateWithin4YearsWhitePercent(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrGraduateWithin4YearsWhitePercent(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqGraduateWithin4YearsWhitePercent(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrGraduateWithin4YearsWhitePercent(siteRequest_, ReportCard.staticSearchGraduateWithin4YearsWhitePercent(siteRequest_, ReportCard.staticSetGraduateWithin4YearsWhitePercent(siteRequest_, o)));
	}

	///////////////////////////////////////////
	// examsCollegeReadyGrades38BlackVsWhite //
	///////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38BlackVsWhite
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38BlackVsWhite;

	/**	<br> The entity examsCollegeReadyGrades38BlackVsWhite
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38BlackVsWhite">Find the entity examsCollegeReadyGrades38BlackVsWhite in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38BlackVsWhite(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38BlackVsWhite() {
		return examsCollegeReadyGrades38BlackVsWhite;
	}

	public void setExamsCollegeReadyGrades38BlackVsWhite(BigDecimal examsCollegeReadyGrades38BlackVsWhite) {
		this.examsCollegeReadyGrades38BlackVsWhite = examsCollegeReadyGrades38BlackVsWhite;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackVsWhite(String o) {
		this.examsCollegeReadyGrades38BlackVsWhite = ReportCard.staticSetExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38BlackVsWhite(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackVsWhite(Double o) {
			this.examsCollegeReadyGrades38BlackVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38BlackVsWhite(Integer o) {
			this.examsCollegeReadyGrades38BlackVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38BlackVsWhiteInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38BlackVsWhiteWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38BlackVsWhite");
		if(examsCollegeReadyGrades38BlackVsWhite == null) {
			_examsCollegeReadyGrades38BlackVsWhite(examsCollegeReadyGrades38BlackVsWhiteWrap);
			setExamsCollegeReadyGrades38BlackVsWhite(examsCollegeReadyGrades38BlackVsWhiteWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38BlackVsWhite(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38BlackVsWhite(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38BlackVsWhite(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, o)));
	}

	////////////////////////////////////////////
	// examsCollegeReadyGrades38LatinxVsWhite //
	////////////////////////////////////////////

	/**	 The entity examsCollegeReadyGrades38LatinxVsWhite
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal examsCollegeReadyGrades38LatinxVsWhite;

	/**	<br> The entity examsCollegeReadyGrades38LatinxVsWhite
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:examsCollegeReadyGrades38LatinxVsWhite">Find the entity examsCollegeReadyGrades38LatinxVsWhite in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _examsCollegeReadyGrades38LatinxVsWhite(Wrap<BigDecimal> c);

	public BigDecimal getExamsCollegeReadyGrades38LatinxVsWhite() {
		return examsCollegeReadyGrades38LatinxVsWhite;
	}

	public void setExamsCollegeReadyGrades38LatinxVsWhite(BigDecimal examsCollegeReadyGrades38LatinxVsWhite) {
		this.examsCollegeReadyGrades38LatinxVsWhite = examsCollegeReadyGrades38LatinxVsWhite;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxVsWhite(String o) {
		this.examsCollegeReadyGrades38LatinxVsWhite = ReportCard.staticSetExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, o);
	}
	public static BigDecimal staticSetExamsCollegeReadyGrades38LatinxVsWhite(SiteRequestEnUS siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxVsWhite(Double o) {
			this.examsCollegeReadyGrades38LatinxVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setExamsCollegeReadyGrades38LatinxVsWhite(Integer o) {
			this.examsCollegeReadyGrades38LatinxVsWhite = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected ReportCard examsCollegeReadyGrades38LatinxVsWhiteInit() {
		Wrap<BigDecimal> examsCollegeReadyGrades38LatinxVsWhiteWrap = new Wrap<BigDecimal>().var("examsCollegeReadyGrades38LatinxVsWhite");
		if(examsCollegeReadyGrades38LatinxVsWhite == null) {
			_examsCollegeReadyGrades38LatinxVsWhite(examsCollegeReadyGrades38LatinxVsWhiteWrap);
			setExamsCollegeReadyGrades38LatinxVsWhite(examsCollegeReadyGrades38LatinxVsWhiteWrap.o);
		}
		return (ReportCard)this;
	}

	public static Double staticSearchExamsCollegeReadyGrades38LatinxVsWhite(SiteRequestEnUS siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrExamsCollegeReadyGrades38LatinxVsWhite(SiteRequestEnUS siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqExamsCollegeReadyGrades38LatinxVsWhite(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, ReportCard.staticSearchExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, ReportCard.staticSetExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, o)));
	}

	////////////////////////////
	// reportCardCompleteName //
	////////////////////////////

	/**	 The entity reportCardCompleteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportCardCompleteName;

	/**	<br> The entity reportCardCompleteName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardCompleteName">Find the entity reportCardCompleteName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardCompleteName(Wrap<String> c);

	public String getReportCardCompleteName() {
		return reportCardCompleteName;
	}
	public void setReportCardCompleteName(String o) {
		this.reportCardCompleteName = ReportCard.staticSetReportCardCompleteName(siteRequest_, o);
	}
	public static String staticSetReportCardCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard reportCardCompleteNameInit() {
		Wrap<String> reportCardCompleteNameWrap = new Wrap<String>().var("reportCardCompleteName");
		if(reportCardCompleteName == null) {
			_reportCardCompleteName(reportCardCompleteNameWrap);
			setReportCardCompleteName(reportCardCompleteNameWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchReportCardCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportCardCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardCompleteName(siteRequest_, ReportCard.staticSearchReportCardCompleteName(siteRequest_, ReportCard.staticSetReportCardCompleteName(siteRequest_, o)));
	}

	///////////////////////
	// reportCardNumber_ //
	///////////////////////

	/**	 The entity reportCardNumber_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer reportCardNumber_;

	/**	<br> The entity reportCardNumber_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardNumber_">Find the entity reportCardNumber_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardNumber_(Wrap<Integer> c);

	public Integer getReportCardNumber_() {
		return reportCardNumber_;
	}

	public void setReportCardNumber_(Integer reportCardNumber_) {
		this.reportCardNumber_ = reportCardNumber_;
	}
	@JsonIgnore
	public void setReportCardNumber_(String o) {
		this.reportCardNumber_ = ReportCard.staticSetReportCardNumber_(siteRequest_, o);
	}
	public static Integer staticSetReportCardNumber_(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected ReportCard reportCardNumber_Init() {
		Wrap<Integer> reportCardNumber_Wrap = new Wrap<Integer>().var("reportCardNumber_");
		if(reportCardNumber_ == null) {
			_reportCardNumber_(reportCardNumber_Wrap);
			setReportCardNumber_(reportCardNumber_Wrap.o);
		}
		return (ReportCard)this;
	}

	public static Integer staticSearchReportCardNumber_(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrReportCardNumber_(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardNumber_(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardNumber_(siteRequest_, ReportCard.staticSearchReportCardNumber_(siteRequest_, ReportCard.staticSetReportCardNumber_(siteRequest_, o)));
	}

	///////////////////////
	// reportCardStates_ //
	///////////////////////

	/**	 The entity reportCardStates_
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<ReportCard> reportCardStates_ = new ArrayList<ReportCard>();

	/**	<br> The entity reportCardStates_
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardStates_">Find the entity reportCardStates_ in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _reportCardStates_(List<ReportCard> l);

	public List<ReportCard> getReportCardStates_() {
		return reportCardStates_;
	}

	public void setReportCardStates_(List<ReportCard> reportCardStates_) {
		this.reportCardStates_ = reportCardStates_;
	}
	public static ReportCard staticSetReportCardStates_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	public ReportCard addReportCardStates_(ReportCard...objets) {
		for(ReportCard o : objets) {
			addReportCardStates_(o);
		}
		return (ReportCard)this;
	}
	public ReportCard addReportCardStates_(ReportCard o) {
		if(o != null)
			this.reportCardStates_.add(o);
		return (ReportCard)this;
	}
	protected ReportCard reportCardStates_Init() {
		_reportCardStates_(reportCardStates_);
		return (ReportCard)this;
	}

	/////////////////////////
	// reportCardAgencies_ //
	/////////////////////////

	/**	 The entity reportCardAgencies_
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<ReportCard> reportCardAgencies_ = new ArrayList<ReportCard>();

	/**	<br> The entity reportCardAgencies_
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardAgencies_">Find the entity reportCardAgencies_ in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _reportCardAgencies_(List<ReportCard> l);

	public List<ReportCard> getReportCardAgencies_() {
		return reportCardAgencies_;
	}

	public void setReportCardAgencies_(List<ReportCard> reportCardAgencies_) {
		this.reportCardAgencies_ = reportCardAgencies_;
	}
	public static ReportCard staticSetReportCardAgencies_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	public ReportCard addReportCardAgencies_(ReportCard...objets) {
		for(ReportCard o : objets) {
			addReportCardAgencies_(o);
		}
		return (ReportCard)this;
	}
	public ReportCard addReportCardAgencies_(ReportCard o) {
		if(o != null)
			this.reportCardAgencies_.add(o);
		return (ReportCard)this;
	}
	protected ReportCard reportCardAgencies_Init() {
		_reportCardAgencies_(reportCardAgencies_);
		return (ReportCard)this;
	}

	////////////////////////////
	// reportCardReportCards_ //
	////////////////////////////

	/**	 The entity reportCardReportCards_
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<ReportCard> reportCardReportCards_ = new ArrayList<ReportCard>();

	/**	<br> The entity reportCardReportCards_
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardReportCards_">Find the entity reportCardReportCards_ in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _reportCardReportCards_(List<ReportCard> l);

	public List<ReportCard> getReportCardReportCards_() {
		return reportCardReportCards_;
	}

	public void setReportCardReportCards_(List<ReportCard> reportCardReportCards_) {
		this.reportCardReportCards_ = reportCardReportCards_;
	}
	public static ReportCard staticSetReportCardReportCards_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	public ReportCard addReportCardReportCards_(ReportCard...objets) {
		for(ReportCard o : objets) {
			addReportCardReportCards_(o);
		}
		return (ReportCard)this;
	}
	public ReportCard addReportCardReportCards_(ReportCard o) {
		if(o != null)
			this.reportCardReportCards_.add(o);
		return (ReportCard)this;
	}
	protected ReportCard reportCardReportCards_Init() {
		_reportCardReportCards_(reportCardReportCards_);
		return (ReportCard)this;
	}

	/////////////////////////////
	// agencyDemographicsGraph //
	/////////////////////////////

	/**	 The entity agencyDemographicsGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyDemographicsGraph;

	/**	<br> The entity agencyDemographicsGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyDemographicsGraph">Find the entity agencyDemographicsGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyDemographicsGraph(Wrap<String> w);

	public String getAgencyDemographicsGraph() {
		return agencyDemographicsGraph;
	}
	public void setAgencyDemographicsGraph(String o) {
		this.agencyDemographicsGraph = ReportCard.staticSetAgencyDemographicsGraph(siteRequest_, o);
	}
	public static String staticSetAgencyDemographicsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyDemographicsGraphInit() {
		Wrap<String> agencyDemographicsGraphWrap = new Wrap<String>().var("agencyDemographicsGraph");
		if(agencyDemographicsGraph == null) {
			_agencyDemographicsGraph(agencyDemographicsGraphWrap);
			setAgencyDemographicsGraph(agencyDemographicsGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyDemographicsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyDemographicsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyDemographicsGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyDemographicsGraph(siteRequest_, ReportCard.staticSearchAgencyDemographicsGraph(siteRequest_, ReportCard.staticSetAgencyDemographicsGraph(siteRequest_, o)));
	}

	///////////////////////////////
	// agencyStudentsByRaceGraph //
	///////////////////////////////

	/**	 The entity agencyStudentsByRaceGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyStudentsByRaceGraph;

	/**	<br> The entity agencyStudentsByRaceGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyStudentsByRaceGraph">Find the entity agencyStudentsByRaceGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyStudentsByRaceGraph(Wrap<String> w);

	public String getAgencyStudentsByRaceGraph() {
		return agencyStudentsByRaceGraph;
	}
	public void setAgencyStudentsByRaceGraph(String o) {
		this.agencyStudentsByRaceGraph = ReportCard.staticSetAgencyStudentsByRaceGraph(siteRequest_, o);
	}
	public static String staticSetAgencyStudentsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyStudentsByRaceGraphInit() {
		Wrap<String> agencyStudentsByRaceGraphWrap = new Wrap<String>().var("agencyStudentsByRaceGraph");
		if(agencyStudentsByRaceGraph == null) {
			_agencyStudentsByRaceGraph(agencyStudentsByRaceGraphWrap);
			setAgencyStudentsByRaceGraph(agencyStudentsByRaceGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyStudentsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyStudentsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyStudentsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyStudentsByRaceGraph(siteRequest_, ReportCard.staticSearchAgencyStudentsByRaceGraph(siteRequest_, ReportCard.staticSetAgencyStudentsByRaceGraph(siteRequest_, o)));
	}

	///////////////////////////////
	// agencyTeachersByRaceGraph //
	///////////////////////////////

	/**	 The entity agencyTeachersByRaceGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyTeachersByRaceGraph;

	/**	<br> The entity agencyTeachersByRaceGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyTeachersByRaceGraph">Find the entity agencyTeachersByRaceGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyTeachersByRaceGraph(Wrap<String> w);

	public String getAgencyTeachersByRaceGraph() {
		return agencyTeachersByRaceGraph;
	}
	public void setAgencyTeachersByRaceGraph(String o) {
		this.agencyTeachersByRaceGraph = ReportCard.staticSetAgencyTeachersByRaceGraph(siteRequest_, o);
	}
	public static String staticSetAgencyTeachersByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyTeachersByRaceGraphInit() {
		Wrap<String> agencyTeachersByRaceGraphWrap = new Wrap<String>().var("agencyTeachersByRaceGraph");
		if(agencyTeachersByRaceGraph == null) {
			_agencyTeachersByRaceGraph(agencyTeachersByRaceGraphWrap);
			setAgencyTeachersByRaceGraph(agencyTeachersByRaceGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyTeachersByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyTeachersByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyTeachersByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyTeachersByRaceGraph(siteRequest_, ReportCard.staticSearchAgencyTeachersByRaceGraph(siteRequest_, ReportCard.staticSetAgencyTeachersByRaceGraph(siteRequest_, o)));
	}

	///////////////////////////
	// agencyGrades3To8Graph //
	///////////////////////////

	/**	 The entity agencyGrades3To8Graph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyGrades3To8Graph;

	/**	<br> The entity agencyGrades3To8Graph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyGrades3To8Graph">Find the entity agencyGrades3To8Graph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyGrades3To8Graph(Wrap<String> w);

	public String getAgencyGrades3To8Graph() {
		return agencyGrades3To8Graph;
	}
	public void setAgencyGrades3To8Graph(String o) {
		this.agencyGrades3To8Graph = ReportCard.staticSetAgencyGrades3To8Graph(siteRequest_, o);
	}
	public static String staticSetAgencyGrades3To8Graph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyGrades3To8GraphInit() {
		Wrap<String> agencyGrades3To8GraphWrap = new Wrap<String>().var("agencyGrades3To8Graph");
		if(agencyGrades3To8Graph == null) {
			_agencyGrades3To8Graph(agencyGrades3To8GraphWrap);
			setAgencyGrades3To8Graph(agencyGrades3To8GraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyGrades3To8Graph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyGrades3To8Graph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyGrades3To8Graph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyGrades3To8Graph(siteRequest_, ReportCard.staticSearchAgencyGrades3To8Graph(siteRequest_, ReportCard.staticSetAgencyGrades3To8Graph(siteRequest_, o)));
	}

	////////////////////////////
	// agencyGrades9To12Graph //
	////////////////////////////

	/**	 The entity agencyGrades9To12Graph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyGrades9To12Graph;

	/**	<br> The entity agencyGrades9To12Graph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyGrades9To12Graph">Find the entity agencyGrades9To12Graph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyGrades9To12Graph(Wrap<String> w);

	public String getAgencyGrades9To12Graph() {
		return agencyGrades9To12Graph;
	}
	public void setAgencyGrades9To12Graph(String o) {
		this.agencyGrades9To12Graph = ReportCard.staticSetAgencyGrades9To12Graph(siteRequest_, o);
	}
	public static String staticSetAgencyGrades9To12Graph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyGrades9To12GraphInit() {
		Wrap<String> agencyGrades9To12GraphWrap = new Wrap<String>().var("agencyGrades9To12Graph");
		if(agencyGrades9To12Graph == null) {
			_agencyGrades9To12Graph(agencyGrades9To12GraphWrap);
			setAgencyGrades9To12Graph(agencyGrades9To12GraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyGrades9To12Graph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyGrades9To12Graph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyGrades9To12Graph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyGrades9To12Graph(siteRequest_, ReportCard.staticSearchAgencyGrades9To12Graph(siteRequest_, ReportCard.staticSetAgencyGrades9To12Graph(siteRequest_, o)));
	}

	//////////////////////////////////////
	// agencyGraduatesWithin4YearsGraph //
	//////////////////////////////////////

	/**	 The entity agencyGraduatesWithin4YearsGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyGraduatesWithin4YearsGraph;

	/**	<br> The entity agencyGraduatesWithin4YearsGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyGraduatesWithin4YearsGraph">Find the entity agencyGraduatesWithin4YearsGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyGraduatesWithin4YearsGraph(Wrap<String> w);

	public String getAgencyGraduatesWithin4YearsGraph() {
		return agencyGraduatesWithin4YearsGraph;
	}
	public void setAgencyGraduatesWithin4YearsGraph(String o) {
		this.agencyGraduatesWithin4YearsGraph = ReportCard.staticSetAgencyGraduatesWithin4YearsGraph(siteRequest_, o);
	}
	public static String staticSetAgencyGraduatesWithin4YearsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyGraduatesWithin4YearsGraphInit() {
		Wrap<String> agencyGraduatesWithin4YearsGraphWrap = new Wrap<String>().var("agencyGraduatesWithin4YearsGraph");
		if(agencyGraduatesWithin4YearsGraph == null) {
			_agencyGraduatesWithin4YearsGraph(agencyGraduatesWithin4YearsGraphWrap);
			setAgencyGraduatesWithin4YearsGraph(agencyGraduatesWithin4YearsGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyGraduatesWithin4YearsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyGraduatesWithin4YearsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyGraduatesWithin4YearsGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyGraduatesWithin4YearsGraph(siteRequest_, ReportCard.staticSearchAgencyGraduatesWithin4YearsGraph(siteRequest_, ReportCard.staticSetAgencyGraduatesWithin4YearsGraph(siteRequest_, o)));
	}

	////////////////////////////
	// suspensionsByRaceGraph //
	////////////////////////////

	/**	 The entity suspensionsByRaceGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String suspensionsByRaceGraph;

	/**	<br> The entity suspensionsByRaceGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:suspensionsByRaceGraph">Find the entity suspensionsByRaceGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _suspensionsByRaceGraph(Wrap<String> w);

	public String getSuspensionsByRaceGraph() {
		return suspensionsByRaceGraph;
	}
	public void setSuspensionsByRaceGraph(String o) {
		this.suspensionsByRaceGraph = ReportCard.staticSetSuspensionsByRaceGraph(siteRequest_, o);
	}
	public static String staticSetSuspensionsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard suspensionsByRaceGraphInit() {
		Wrap<String> suspensionsByRaceGraphWrap = new Wrap<String>().var("suspensionsByRaceGraph");
		if(suspensionsByRaceGraph == null) {
			_suspensionsByRaceGraph(suspensionsByRaceGraphWrap);
			setSuspensionsByRaceGraph(suspensionsByRaceGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchSuspensionsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSuspensionsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSuspensionsByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrSuspensionsByRaceGraph(siteRequest_, ReportCard.staticSearchSuspensionsByRaceGraph(siteRequest_, ReportCard.staticSetSuspensionsByRaceGraph(siteRequest_, o)));
	}

	////////////////////////////////
	// suspensionRatesByRaceGraph //
	////////////////////////////////

	/**	 The entity suspensionRatesByRaceGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String suspensionRatesByRaceGraph;

	/**	<br> The entity suspensionRatesByRaceGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:suspensionRatesByRaceGraph">Find the entity suspensionRatesByRaceGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _suspensionRatesByRaceGraph(Wrap<String> w);

	public String getSuspensionRatesByRaceGraph() {
		return suspensionRatesByRaceGraph;
	}
	public void setSuspensionRatesByRaceGraph(String o) {
		this.suspensionRatesByRaceGraph = ReportCard.staticSetSuspensionRatesByRaceGraph(siteRequest_, o);
	}
	public static String staticSetSuspensionRatesByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard suspensionRatesByRaceGraphInit() {
		Wrap<String> suspensionRatesByRaceGraphWrap = new Wrap<String>().var("suspensionRatesByRaceGraph");
		if(suspensionRatesByRaceGraph == null) {
			_suspensionRatesByRaceGraph(suspensionRatesByRaceGraphWrap);
			setSuspensionRatesByRaceGraph(suspensionRatesByRaceGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchSuspensionRatesByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSuspensionRatesByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSuspensionRatesByRaceGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrSuspensionRatesByRaceGraph(siteRequest_, ReportCard.staticSearchSuspensionRatesByRaceGraph(siteRequest_, ReportCard.staticSetSuspensionRatesByRaceGraph(siteRequest_, o)));
	}

	//////////////////////////////////////
	// countySchoolBasedComplaintsGraph //
	//////////////////////////////////////

	/**	 The entity countySchoolBasedComplaintsGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String countySchoolBasedComplaintsGraph;

	/**	<br> The entity countySchoolBasedComplaintsGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:countySchoolBasedComplaintsGraph">Find the entity countySchoolBasedComplaintsGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _countySchoolBasedComplaintsGraph(Wrap<String> w);

	public String getCountySchoolBasedComplaintsGraph() {
		return countySchoolBasedComplaintsGraph;
	}
	public void setCountySchoolBasedComplaintsGraph(String o) {
		this.countySchoolBasedComplaintsGraph = ReportCard.staticSetCountySchoolBasedComplaintsGraph(siteRequest_, o);
	}
	public static String staticSetCountySchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard countySchoolBasedComplaintsGraphInit() {
		Wrap<String> countySchoolBasedComplaintsGraphWrap = new Wrap<String>().var("countySchoolBasedComplaintsGraph");
		if(countySchoolBasedComplaintsGraph == null) {
			_countySchoolBasedComplaintsGraph(countySchoolBasedComplaintsGraphWrap);
			setCountySchoolBasedComplaintsGraph(countySchoolBasedComplaintsGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchCountySchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrCountySchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCountySchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrCountySchoolBasedComplaintsGraph(siteRequest_, ReportCard.staticSearchCountySchoolBasedComplaintsGraph(siteRequest_, ReportCard.staticSetCountySchoolBasedComplaintsGraph(siteRequest_, o)));
	}

	////////////////////////////////
	// schoolBasedComplaintsGraph //
	////////////////////////////////

	/**	 The entity schoolBasedComplaintsGraph
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String schoolBasedComplaintsGraph;

	/**	<br> The entity schoolBasedComplaintsGraph
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:schoolBasedComplaintsGraph">Find the entity schoolBasedComplaintsGraph in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _schoolBasedComplaintsGraph(Wrap<String> w);

	public String getSchoolBasedComplaintsGraph() {
		return schoolBasedComplaintsGraph;
	}
	public void setSchoolBasedComplaintsGraph(String o) {
		this.schoolBasedComplaintsGraph = ReportCard.staticSetSchoolBasedComplaintsGraph(siteRequest_, o);
	}
	public static String staticSetSchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard schoolBasedComplaintsGraphInit() {
		Wrap<String> schoolBasedComplaintsGraphWrap = new Wrap<String>().var("schoolBasedComplaintsGraph");
		if(schoolBasedComplaintsGraph == null) {
			_schoolBasedComplaintsGraph(schoolBasedComplaintsGraphWrap);
			setSchoolBasedComplaintsGraph(schoolBasedComplaintsGraphWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchSchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSchoolBasedComplaintsGraph(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrSchoolBasedComplaintsGraph(siteRequest_, ReportCard.staticSearchSchoolBasedComplaintsGraph(siteRequest_, ReportCard.staticSetSchoolBasedComplaintsGraph(siteRequest_, o)));
	}

	////////////////////////////////
	// agencyStudentsByRaceGraph2 //
	////////////////////////////////

	/**	 The entity agencyStudentsByRaceGraph2
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyStudentsByRaceGraph2;

	/**	<br> The entity agencyStudentsByRaceGraph2
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyStudentsByRaceGraph2">Find the entity agencyStudentsByRaceGraph2 in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyStudentsByRaceGraph2(Wrap<String> w);

	public String getAgencyStudentsByRaceGraph2() {
		return agencyStudentsByRaceGraph2;
	}
	public void setAgencyStudentsByRaceGraph2(String o) {
		this.agencyStudentsByRaceGraph2 = ReportCard.staticSetAgencyStudentsByRaceGraph2(siteRequest_, o);
	}
	public static String staticSetAgencyStudentsByRaceGraph2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard agencyStudentsByRaceGraph2Init() {
		Wrap<String> agencyStudentsByRaceGraph2Wrap = new Wrap<String>().var("agencyStudentsByRaceGraph2");
		if(agencyStudentsByRaceGraph2 == null) {
			_agencyStudentsByRaceGraph2(agencyStudentsByRaceGraph2Wrap);
			setAgencyStudentsByRaceGraph2(agencyStudentsByRaceGraph2Wrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchAgencyStudentsByRaceGraph2(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyStudentsByRaceGraph2(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyStudentsByRaceGraph2(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrAgencyStudentsByRaceGraph2(siteRequest_, ReportCard.staticSearchAgencyStudentsByRaceGraph2(siteRequest_, ReportCard.staticSetAgencyStudentsByRaceGraph2(siteRequest_, o)));
	}

	/////////////////////
	// reportCardImage //
	/////////////////////

	/**	 The entity reportCardImage
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String reportCardImage;

	/**	<br> The entity reportCardImage
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.reportcard.ReportCard&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardImage">Find the entity reportCardImage in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _reportCardImage(Wrap<String> w);

	public String getReportCardImage() {
		return reportCardImage;
	}
	public void setReportCardImage(String o) {
		this.reportCardImage = ReportCard.staticSetReportCardImage(siteRequest_, o);
	}
	public static String staticSetReportCardImage(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected ReportCard reportCardImageInit() {
		Wrap<String> reportCardImageWrap = new Wrap<String>().var("reportCardImage");
		if(reportCardImage == null) {
			_reportCardImage(reportCardImageWrap);
			setReportCardImage(reportCardImageWrap.o);
		}
		return (ReportCard)this;
	}

	public static String staticSearchReportCardImage(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrReportCardImage(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardImage(SiteRequestEnUS siteRequest_, String o) {
		return ReportCard.staticSearchStrReportCardImage(siteRequest_, ReportCard.staticSearchReportCardImage(siteRequest_, ReportCard.staticSetReportCardImage(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepReportCard(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepReportCard();
	}

	public Future<Void> promiseDeepReportCard() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseReportCard(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseReportCard(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				reportCardKeyInit();
				reportCardStartYearInit();
				reportCardStartYearStrInit();
				reportCardEndYearInit();
				reportCardYearsStrInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			agencySearchPromise().onSuccess(agencySearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				agency_Init();
				agencyKeyInit();
				imageLeftInit();
				imageTopInit();
				stateKeyInit();
				stateIdInit();
				agencyIdInit();
				stateNameInit();
				stateAbbreviationInit();
				agencyOnlyNameInit();
				agencyNameInit();
				agencyIsStateInit();
				agencyCoordsInit();
				agencyLeftInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			stateReportCardSearchPromise().onSuccess(stateReportCardSearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				stateFacetsInit();
				pupilsTotalInit();
				pupilsIndigenousFemaleInit();
				pupilsIndigenousMaleInit();
				pupilsIndigenousTotalInit();
				pupilsIndigenousPercentInit();
				pupilsAsianFemaleInit();
				pupilsAsianMaleInit();
				pupilsAsianTotalInit();
				pupilsAsianPercentInit();
				pupilsLatinxFemaleInit();
				pupilsLatinxMaleInit();
				pupilsLatinxTotalInit();
				pupilsLatinxPercentInit();
				pupilsBlackFemaleInit();
				pupilsBlackMaleInit();
				pupilsBlackTotalInit();
				pupilsBlackPercentInit();
				pupilsWhiteFemaleInit();
				pupilsWhiteMaleInit();
				pupilsWhiteTotalInit();
				pupilsWhitePercentInit();
				pupilsPacificIslanderFemaleInit();
				pupilsPacificIslanderMaleInit();
				pupilsPacificIslanderTotalInit();
				pupilsPacificIslanderPercentInit();
				pupilsMultiRacialFemaleInit();
				pupilsMultiRacialMaleInit();
				pupilsMultiRacialTotalInit();
				pupilsMultiRacialPercentInit();
				pupilsOtherPercentInit();
				teachersMaleInit();
				teachersFemaleInit();
				teachersTotalInit();
				teachersWhiteTotalInit();
				teachersWhitePercentInit();
				teachersBlackTotalInit();
				teachersBlackPercentInit();
				teachersOtherTotalInit();
				teachersOtherPercentInit();
				delinquentComplaintsTotalInit();
				delinquentComplaintsAtSchoolInit();
				delinquentComplaintsAtSchoolPercentInit();
				delinquentComplaintsAsianInit();
				delinquentComplaintsAsianPercentInit();
				delinquentComplaintsBlackInit();
				delinquentComplaintsBlackPercentInit();
				delinquentComplaintsLatinxInit();
				delinquentComplaintsLatinxPercentInit();
				delinquentComplaintsMultiRacialInit();
				delinquentComplaintsMultiRacialPercentInit();
				delinquentComplaintsIndigenousInit();
				delinquentComplaintsIndigenousPercentInit();
				delinquentComplaintsWhiteInit();
				delinquentComplaintsWhitePercentInit();
				delinquentComplaintsPacificIslanderInit();
				delinquentComplaintsPacificIslanderPercentInit();
				shortTermSuspensionRateInit();
				shortTermSuspensionsTotalInit();
				longTermSuspensionsTotalInit();
				expulsionsTotalInit();
				shortTermSuspensionsAsianFemaleInit();
				shortTermSuspensionsAsianMaleInit();
				shortTermSuspensionsAsianTotalInit();
				shortTermSuspensionsAsianPercentInit();
				shortTermSuspensionsAsianRateInit();
				shortTermSuspensionsBlackFemaleInit();
				shortTermSuspensionsBlackMaleInit();
				shortTermSuspensionsBlackTotalInit();
				shortTermSuspensionsBlackPercentInit();
				shortTermSuspensionsBlackRateInit();
				shortTermSuspensionsLatinxFemaleInit();
				shortTermSuspensionsLatinxMaleInit();
				shortTermSuspensionsLatinxTotalInit();
				shortTermSuspensionsLatinxPercentInit();
				shortTermSuspensionsLatinxRateInit();
				shortTermSuspensionsIndigenousFemaleInit();
				shortTermSuspensionsIndigenousMaleInit();
				shortTermSuspensionsIndigenousTotalInit();
				shortTermSuspensionsIndigenousPercentInit();
				shortTermSuspensionsIndigenousRateInit();
				shortTermSuspensionsMultiRacialFemaleInit();
				shortTermSuspensionsMultiRacialMaleInit();
				shortTermSuspensionsMultiRacialTotalInit();
				shortTermSuspensionsMultiRacialPercentInit();
				shortTermSuspensionsMultiRacialRateInit();
				shortTermSuspensionsPacificIslanderFemaleInit();
				shortTermSuspensionsPacificIslanderMaleInit();
				shortTermSuspensionsPacificIslanderTotalInit();
				shortTermSuspensionsPacificIslanderPercentInit();
				shortTermSuspensionsPacificIslanderRateInit();
				shortTermSuspensionsWhiteFemaleInit();
				shortTermSuspensionsWhiteMaleInit();
				shortTermSuspensionsWhiteTotalInit();
				shortTermSuspensionsWhitePercentInit();
				shortTermSuspensionsWhiteRateInit();
				shortTermSuspensionsAllRateInit();
				shortTermSuspensionsBlackVsWhiteInit();
				examsCollegeReadyGrades38OverallPercentInit();
				examsCollegeReadyGrades38IndigenousPercentInit();
				examsCollegeReadyGrades38AsianPercentInit();
				examsCollegeReadyGrades38BlackPercentInit();
				examsCollegeReadyGrades38LatinxPercentInit();
				examsCollegeReadyGrades38MultiRacialPercentInit();
				examsCollegeReadyGrades38PacificIslanderPercentInit();
				examsCollegeReadyGrades38WhitePercentInit();
				examsCollegeReadyGrades912OverallPercentInit();
				examsCollegeReadyGrades912IndigenousPercentInit();
				examsCollegeReadyGrades912AsianPercentInit();
				examsCollegeReadyGrades912BlackPercentInit();
				examsCollegeReadyGrades912LatinxPercentInit();
				examsCollegeReadyGrades912MultiRacialPercentInit();
				examsCollegeReadyGrades912PacificIslanderPercentInit();
				examsCollegeReadyGrades912WhitePercentInit();
				graduateWithin4YearsOverallPercentInit();
				graduateWithin4YearsIndigenousPercentInit();
				graduateWithin4YearsAsianPercentInit();
				graduateWithin4YearsBlackPercentInit();
				graduateWithin4YearsLatinxPercentInit();
				graduateWithin4YearsMultiRacialPercentInit();
				graduateWithin4YearsPacificIslanderPercentInit();
				graduateWithin4YearsWhitePercentInit();
				examsCollegeReadyGrades38BlackVsWhiteInit();
				examsCollegeReadyGrades38LatinxVsWhiteInit();
				reportCardCompleteNameInit();
				reportCardNumber_Init();
				reportCardStates_Init();
				reportCardAgencies_Init();
				reportCardReportCards_Init();
				agencyDemographicsGraphInit();
				agencyStudentsByRaceGraphInit();
				agencyTeachersByRaceGraphInit();
				agencyGrades3To8GraphInit();
				agencyGrades9To12GraphInit();
				agencyGraduatesWithin4YearsGraphInit();
				suspensionsByRaceGraphInit();
				suspensionRatesByRaceGraphInit();
				countySchoolBasedComplaintsGraphInit();
				schoolBasedComplaintsGraphInit();
				agencyStudentsByRaceGraph2Init();
				reportCardImageInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promiseDeepForClass(SiteRequestEnUS siteRequest_) {
		return promiseDeepReportCard(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestReportCard(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
		if(agencySearch != null)
			agencySearch.setSiteRequest_(siteRequest_);
		if(stateReportCardSearch != null)
			stateReportCardSearch.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestReportCard(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainReportCard(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainReportCard(String var) {
		ReportCard oReportCard = (ReportCard)this;
		switch(var) {
			case "reportCardKey":
				return oReportCard.reportCardKey;
			case "reportCardStartYear":
				return oReportCard.reportCardStartYear;
			case "reportCardStartYearStr":
				return oReportCard.reportCardStartYearStr;
			case "reportCardEndYear":
				return oReportCard.reportCardEndYear;
			case "reportCardYearsStr":
				return oReportCard.reportCardYearsStr;
			case "agencySearch":
				return oReportCard.agencySearch;
			case "agency_":
				return oReportCard.agency_;
			case "agencyKey":
				return oReportCard.agencyKey;
			case "imageLeft":
				return oReportCard.imageLeft;
			case "imageTop":
				return oReportCard.imageTop;
			case "stateKey":
				return oReportCard.stateKey;
			case "stateId":
				return oReportCard.stateId;
			case "agencyId":
				return oReportCard.agencyId;
			case "stateName":
				return oReportCard.stateName;
			case "stateAbbreviation":
				return oReportCard.stateAbbreviation;
			case "agencyOnlyName":
				return oReportCard.agencyOnlyName;
			case "agencyName":
				return oReportCard.agencyName;
			case "agencyIsState":
				return oReportCard.agencyIsState;
			case "agencyCoords":
				return oReportCard.agencyCoords;
			case "agencyLeft":
				return oReportCard.agencyLeft;
			case "stateReportCardSearch":
				return oReportCard.stateReportCardSearch;
			case "stateFacets":
				return oReportCard.stateFacets;
			case "pupilsTotal":
				return oReportCard.pupilsTotal;
			case "pupilsIndigenousFemale":
				return oReportCard.pupilsIndigenousFemale;
			case "pupilsIndigenousMale":
				return oReportCard.pupilsIndigenousMale;
			case "pupilsIndigenousTotal":
				return oReportCard.pupilsIndigenousTotal;
			case "pupilsIndigenousPercent":
				return oReportCard.pupilsIndigenousPercent;
			case "pupilsAsianFemale":
				return oReportCard.pupilsAsianFemale;
			case "pupilsAsianMale":
				return oReportCard.pupilsAsianMale;
			case "pupilsAsianTotal":
				return oReportCard.pupilsAsianTotal;
			case "pupilsAsianPercent":
				return oReportCard.pupilsAsianPercent;
			case "pupilsLatinxFemale":
				return oReportCard.pupilsLatinxFemale;
			case "pupilsLatinxMale":
				return oReportCard.pupilsLatinxMale;
			case "pupilsLatinxTotal":
				return oReportCard.pupilsLatinxTotal;
			case "pupilsLatinxPercent":
				return oReportCard.pupilsLatinxPercent;
			case "pupilsBlackFemale":
				return oReportCard.pupilsBlackFemale;
			case "pupilsBlackMale":
				return oReportCard.pupilsBlackMale;
			case "pupilsBlackTotal":
				return oReportCard.pupilsBlackTotal;
			case "pupilsBlackPercent":
				return oReportCard.pupilsBlackPercent;
			case "pupilsWhiteFemale":
				return oReportCard.pupilsWhiteFemale;
			case "pupilsWhiteMale":
				return oReportCard.pupilsWhiteMale;
			case "pupilsWhiteTotal":
				return oReportCard.pupilsWhiteTotal;
			case "pupilsWhitePercent":
				return oReportCard.pupilsWhitePercent;
			case "pupilsPacificIslanderFemale":
				return oReportCard.pupilsPacificIslanderFemale;
			case "pupilsPacificIslanderMale":
				return oReportCard.pupilsPacificIslanderMale;
			case "pupilsPacificIslanderTotal":
				return oReportCard.pupilsPacificIslanderTotal;
			case "pupilsPacificIslanderPercent":
				return oReportCard.pupilsPacificIslanderPercent;
			case "pupilsMultiRacialFemale":
				return oReportCard.pupilsMultiRacialFemale;
			case "pupilsMultiRacialMale":
				return oReportCard.pupilsMultiRacialMale;
			case "pupilsMultiRacialTotal":
				return oReportCard.pupilsMultiRacialTotal;
			case "pupilsMultiRacialPercent":
				return oReportCard.pupilsMultiRacialPercent;
			case "pupilsOtherPercent":
				return oReportCard.pupilsOtherPercent;
			case "teachersMale":
				return oReportCard.teachersMale;
			case "teachersFemale":
				return oReportCard.teachersFemale;
			case "teachersTotal":
				return oReportCard.teachersTotal;
			case "teachersWhiteTotal":
				return oReportCard.teachersWhiteTotal;
			case "teachersWhitePercent":
				return oReportCard.teachersWhitePercent;
			case "teachersBlackTotal":
				return oReportCard.teachersBlackTotal;
			case "teachersBlackPercent":
				return oReportCard.teachersBlackPercent;
			case "teachersOtherTotal":
				return oReportCard.teachersOtherTotal;
			case "teachersOtherPercent":
				return oReportCard.teachersOtherPercent;
			case "delinquentComplaintsTotal":
				return oReportCard.delinquentComplaintsTotal;
			case "delinquentComplaintsAtSchool":
				return oReportCard.delinquentComplaintsAtSchool;
			case "delinquentComplaintsAtSchoolPercent":
				return oReportCard.delinquentComplaintsAtSchoolPercent;
			case "delinquentComplaintsAsian":
				return oReportCard.delinquentComplaintsAsian;
			case "delinquentComplaintsAsianPercent":
				return oReportCard.delinquentComplaintsAsianPercent;
			case "delinquentComplaintsBlack":
				return oReportCard.delinquentComplaintsBlack;
			case "delinquentComplaintsBlackPercent":
				return oReportCard.delinquentComplaintsBlackPercent;
			case "delinquentComplaintsLatinx":
				return oReportCard.delinquentComplaintsLatinx;
			case "delinquentComplaintsLatinxPercent":
				return oReportCard.delinquentComplaintsLatinxPercent;
			case "delinquentComplaintsMultiRacial":
				return oReportCard.delinquentComplaintsMultiRacial;
			case "delinquentComplaintsMultiRacialPercent":
				return oReportCard.delinquentComplaintsMultiRacialPercent;
			case "delinquentComplaintsIndigenous":
				return oReportCard.delinquentComplaintsIndigenous;
			case "delinquentComplaintsIndigenousPercent":
				return oReportCard.delinquentComplaintsIndigenousPercent;
			case "delinquentComplaintsWhite":
				return oReportCard.delinquentComplaintsWhite;
			case "delinquentComplaintsWhitePercent":
				return oReportCard.delinquentComplaintsWhitePercent;
			case "delinquentComplaintsPacificIslander":
				return oReportCard.delinquentComplaintsPacificIslander;
			case "delinquentComplaintsPacificIslanderPercent":
				return oReportCard.delinquentComplaintsPacificIslanderPercent;
			case "shortTermSuspensionRate":
				return oReportCard.shortTermSuspensionRate;
			case "shortTermSuspensionsTotal":
				return oReportCard.shortTermSuspensionsTotal;
			case "longTermSuspensionsTotal":
				return oReportCard.longTermSuspensionsTotal;
			case "expulsionsTotal":
				return oReportCard.expulsionsTotal;
			case "shortTermSuspensionsAsianFemale":
				return oReportCard.shortTermSuspensionsAsianFemale;
			case "shortTermSuspensionsAsianMale":
				return oReportCard.shortTermSuspensionsAsianMale;
			case "shortTermSuspensionsAsianTotal":
				return oReportCard.shortTermSuspensionsAsianTotal;
			case "shortTermSuspensionsAsianPercent":
				return oReportCard.shortTermSuspensionsAsianPercent;
			case "shortTermSuspensionsAsianRate":
				return oReportCard.shortTermSuspensionsAsianRate;
			case "shortTermSuspensionsBlackFemale":
				return oReportCard.shortTermSuspensionsBlackFemale;
			case "shortTermSuspensionsBlackMale":
				return oReportCard.shortTermSuspensionsBlackMale;
			case "shortTermSuspensionsBlackTotal":
				return oReportCard.shortTermSuspensionsBlackTotal;
			case "shortTermSuspensionsBlackPercent":
				return oReportCard.shortTermSuspensionsBlackPercent;
			case "shortTermSuspensionsBlackRate":
				return oReportCard.shortTermSuspensionsBlackRate;
			case "shortTermSuspensionsLatinxFemale":
				return oReportCard.shortTermSuspensionsLatinxFemale;
			case "shortTermSuspensionsLatinxMale":
				return oReportCard.shortTermSuspensionsLatinxMale;
			case "shortTermSuspensionsLatinxTotal":
				return oReportCard.shortTermSuspensionsLatinxTotal;
			case "shortTermSuspensionsLatinxPercent":
				return oReportCard.shortTermSuspensionsLatinxPercent;
			case "shortTermSuspensionsLatinxRate":
				return oReportCard.shortTermSuspensionsLatinxRate;
			case "shortTermSuspensionsIndigenousFemale":
				return oReportCard.shortTermSuspensionsIndigenousFemale;
			case "shortTermSuspensionsIndigenousMale":
				return oReportCard.shortTermSuspensionsIndigenousMale;
			case "shortTermSuspensionsIndigenousTotal":
				return oReportCard.shortTermSuspensionsIndigenousTotal;
			case "shortTermSuspensionsIndigenousPercent":
				return oReportCard.shortTermSuspensionsIndigenousPercent;
			case "shortTermSuspensionsIndigenousRate":
				return oReportCard.shortTermSuspensionsIndigenousRate;
			case "shortTermSuspensionsMultiRacialFemale":
				return oReportCard.shortTermSuspensionsMultiRacialFemale;
			case "shortTermSuspensionsMultiRacialMale":
				return oReportCard.shortTermSuspensionsMultiRacialMale;
			case "shortTermSuspensionsMultiRacialTotal":
				return oReportCard.shortTermSuspensionsMultiRacialTotal;
			case "shortTermSuspensionsMultiRacialPercent":
				return oReportCard.shortTermSuspensionsMultiRacialPercent;
			case "shortTermSuspensionsMultiRacialRate":
				return oReportCard.shortTermSuspensionsMultiRacialRate;
			case "shortTermSuspensionsPacificIslanderFemale":
				return oReportCard.shortTermSuspensionsPacificIslanderFemale;
			case "shortTermSuspensionsPacificIslanderMale":
				return oReportCard.shortTermSuspensionsPacificIslanderMale;
			case "shortTermSuspensionsPacificIslanderTotal":
				return oReportCard.shortTermSuspensionsPacificIslanderTotal;
			case "shortTermSuspensionsPacificIslanderPercent":
				return oReportCard.shortTermSuspensionsPacificIslanderPercent;
			case "shortTermSuspensionsPacificIslanderRate":
				return oReportCard.shortTermSuspensionsPacificIslanderRate;
			case "shortTermSuspensionsWhiteFemale":
				return oReportCard.shortTermSuspensionsWhiteFemale;
			case "shortTermSuspensionsWhiteMale":
				return oReportCard.shortTermSuspensionsWhiteMale;
			case "shortTermSuspensionsWhiteTotal":
				return oReportCard.shortTermSuspensionsWhiteTotal;
			case "shortTermSuspensionsWhitePercent":
				return oReportCard.shortTermSuspensionsWhitePercent;
			case "shortTermSuspensionsWhiteRate":
				return oReportCard.shortTermSuspensionsWhiteRate;
			case "shortTermSuspensionsAllRate":
				return oReportCard.shortTermSuspensionsAllRate;
			case "shortTermSuspensionsBlackVsWhite":
				return oReportCard.shortTermSuspensionsBlackVsWhite;
			case "examsCollegeReadyGrades38OverallPercent":
				return oReportCard.examsCollegeReadyGrades38OverallPercent;
			case "examsCollegeReadyGrades38IndigenousPercent":
				return oReportCard.examsCollegeReadyGrades38IndigenousPercent;
			case "examsCollegeReadyGrades38AsianPercent":
				return oReportCard.examsCollegeReadyGrades38AsianPercent;
			case "examsCollegeReadyGrades38BlackPercent":
				return oReportCard.examsCollegeReadyGrades38BlackPercent;
			case "examsCollegeReadyGrades38LatinxPercent":
				return oReportCard.examsCollegeReadyGrades38LatinxPercent;
			case "examsCollegeReadyGrades38MultiRacialPercent":
				return oReportCard.examsCollegeReadyGrades38MultiRacialPercent;
			case "examsCollegeReadyGrades38PacificIslanderPercent":
				return oReportCard.examsCollegeReadyGrades38PacificIslanderPercent;
			case "examsCollegeReadyGrades38WhitePercent":
				return oReportCard.examsCollegeReadyGrades38WhitePercent;
			case "examsCollegeReadyGrades912OverallPercent":
				return oReportCard.examsCollegeReadyGrades912OverallPercent;
			case "examsCollegeReadyGrades912IndigenousPercent":
				return oReportCard.examsCollegeReadyGrades912IndigenousPercent;
			case "examsCollegeReadyGrades912AsianPercent":
				return oReportCard.examsCollegeReadyGrades912AsianPercent;
			case "examsCollegeReadyGrades912BlackPercent":
				return oReportCard.examsCollegeReadyGrades912BlackPercent;
			case "examsCollegeReadyGrades912LatinxPercent":
				return oReportCard.examsCollegeReadyGrades912LatinxPercent;
			case "examsCollegeReadyGrades912MultiRacialPercent":
				return oReportCard.examsCollegeReadyGrades912MultiRacialPercent;
			case "examsCollegeReadyGrades912PacificIslanderPercent":
				return oReportCard.examsCollegeReadyGrades912PacificIslanderPercent;
			case "examsCollegeReadyGrades912WhitePercent":
				return oReportCard.examsCollegeReadyGrades912WhitePercent;
			case "graduateWithin4YearsOverallPercent":
				return oReportCard.graduateWithin4YearsOverallPercent;
			case "graduateWithin4YearsIndigenousPercent":
				return oReportCard.graduateWithin4YearsIndigenousPercent;
			case "graduateWithin4YearsAsianPercent":
				return oReportCard.graduateWithin4YearsAsianPercent;
			case "graduateWithin4YearsBlackPercent":
				return oReportCard.graduateWithin4YearsBlackPercent;
			case "graduateWithin4YearsLatinxPercent":
				return oReportCard.graduateWithin4YearsLatinxPercent;
			case "graduateWithin4YearsMultiRacialPercent":
				return oReportCard.graduateWithin4YearsMultiRacialPercent;
			case "graduateWithin4YearsPacificIslanderPercent":
				return oReportCard.graduateWithin4YearsPacificIslanderPercent;
			case "graduateWithin4YearsWhitePercent":
				return oReportCard.graduateWithin4YearsWhitePercent;
			case "examsCollegeReadyGrades38BlackVsWhite":
				return oReportCard.examsCollegeReadyGrades38BlackVsWhite;
			case "examsCollegeReadyGrades38LatinxVsWhite":
				return oReportCard.examsCollegeReadyGrades38LatinxVsWhite;
			case "reportCardCompleteName":
				return oReportCard.reportCardCompleteName;
			case "reportCardNumber_":
				return oReportCard.reportCardNumber_;
			case "reportCardStates_":
				return oReportCard.reportCardStates_;
			case "reportCardAgencies_":
				return oReportCard.reportCardAgencies_;
			case "reportCardReportCards_":
				return oReportCard.reportCardReportCards_;
			case "agencyDemographicsGraph":
				return oReportCard.agencyDemographicsGraph;
			case "agencyStudentsByRaceGraph":
				return oReportCard.agencyStudentsByRaceGraph;
			case "agencyTeachersByRaceGraph":
				return oReportCard.agencyTeachersByRaceGraph;
			case "agencyGrades3To8Graph":
				return oReportCard.agencyGrades3To8Graph;
			case "agencyGrades9To12Graph":
				return oReportCard.agencyGrades9To12Graph;
			case "agencyGraduatesWithin4YearsGraph":
				return oReportCard.agencyGraduatesWithin4YearsGraph;
			case "suspensionsByRaceGraph":
				return oReportCard.suspensionsByRaceGraph;
			case "suspensionRatesByRaceGraph":
				return oReportCard.suspensionRatesByRaceGraph;
			case "countySchoolBasedComplaintsGraph":
				return oReportCard.countySchoolBasedComplaintsGraph;
			case "schoolBasedComplaintsGraph":
				return oReportCard.schoolBasedComplaintsGraph;
			case "agencyStudentsByRaceGraph2":
				return oReportCard.agencyStudentsByRaceGraph2;
			case "reportCardImage":
				return oReportCard.reportCardImage;
			default:
				return super.obtainBaseModel(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateReportCard(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateReportCard(String var, Object val) {
		ReportCard oReportCard = (ReportCard)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetReportCard(entityVar,  siteRequest_, o);
	}
	public static Object staticSetReportCard(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "reportCardKey":
			return ReportCard.staticSetReportCardKey(siteRequest_, o);
		case "reportCardStartYear":
			return ReportCard.staticSetReportCardStartYear(siteRequest_, o);
		case "reportCardStartYearStr":
			return ReportCard.staticSetReportCardStartYearStr(siteRequest_, o);
		case "reportCardEndYear":
			return ReportCard.staticSetReportCardEndYear(siteRequest_, o);
		case "reportCardYearsStr":
			return ReportCard.staticSetReportCardYearsStr(siteRequest_, o);
		case "agencyKey":
			return ReportCard.staticSetAgencyKey(siteRequest_, o);
		case "imageLeft":
			return ReportCard.staticSetImageLeft(siteRequest_, o);
		case "imageTop":
			return ReportCard.staticSetImageTop(siteRequest_, o);
		case "stateKey":
			return ReportCard.staticSetStateKey(siteRequest_, o);
		case "stateId":
			return ReportCard.staticSetStateId(siteRequest_, o);
		case "agencyId":
			return ReportCard.staticSetAgencyId(siteRequest_, o);
		case "stateName":
			return ReportCard.staticSetStateName(siteRequest_, o);
		case "stateAbbreviation":
			return ReportCard.staticSetStateAbbreviation(siteRequest_, o);
		case "agencyOnlyName":
			return ReportCard.staticSetAgencyOnlyName(siteRequest_, o);
		case "agencyName":
			return ReportCard.staticSetAgencyName(siteRequest_, o);
		case "agencyIsState":
			return ReportCard.staticSetAgencyIsState(siteRequest_, o);
		case "agencyCoords":
			return ReportCard.staticSetAgencyCoords(siteRequest_, o);
		case "agencyLeft":
			return ReportCard.staticSetAgencyLeft(siteRequest_, o);
		case "pupilsTotal":
			return ReportCard.staticSetPupilsTotal(siteRequest_, o);
		case "pupilsIndigenousFemale":
			return ReportCard.staticSetPupilsIndigenousFemale(siteRequest_, o);
		case "pupilsIndigenousMale":
			return ReportCard.staticSetPupilsIndigenousMale(siteRequest_, o);
		case "pupilsIndigenousTotal":
			return ReportCard.staticSetPupilsIndigenousTotal(siteRequest_, o);
		case "pupilsIndigenousPercent":
			return ReportCard.staticSetPupilsIndigenousPercent(siteRequest_, o);
		case "pupilsAsianFemale":
			return ReportCard.staticSetPupilsAsianFemale(siteRequest_, o);
		case "pupilsAsianMale":
			return ReportCard.staticSetPupilsAsianMale(siteRequest_, o);
		case "pupilsAsianTotal":
			return ReportCard.staticSetPupilsAsianTotal(siteRequest_, o);
		case "pupilsAsianPercent":
			return ReportCard.staticSetPupilsAsianPercent(siteRequest_, o);
		case "pupilsLatinxFemale":
			return ReportCard.staticSetPupilsLatinxFemale(siteRequest_, o);
		case "pupilsLatinxMale":
			return ReportCard.staticSetPupilsLatinxMale(siteRequest_, o);
		case "pupilsLatinxTotal":
			return ReportCard.staticSetPupilsLatinxTotal(siteRequest_, o);
		case "pupilsLatinxPercent":
			return ReportCard.staticSetPupilsLatinxPercent(siteRequest_, o);
		case "pupilsBlackFemale":
			return ReportCard.staticSetPupilsBlackFemale(siteRequest_, o);
		case "pupilsBlackMale":
			return ReportCard.staticSetPupilsBlackMale(siteRequest_, o);
		case "pupilsBlackTotal":
			return ReportCard.staticSetPupilsBlackTotal(siteRequest_, o);
		case "pupilsBlackPercent":
			return ReportCard.staticSetPupilsBlackPercent(siteRequest_, o);
		case "pupilsWhiteFemale":
			return ReportCard.staticSetPupilsWhiteFemale(siteRequest_, o);
		case "pupilsWhiteMale":
			return ReportCard.staticSetPupilsWhiteMale(siteRequest_, o);
		case "pupilsWhiteTotal":
			return ReportCard.staticSetPupilsWhiteTotal(siteRequest_, o);
		case "pupilsWhitePercent":
			return ReportCard.staticSetPupilsWhitePercent(siteRequest_, o);
		case "pupilsPacificIslanderFemale":
			return ReportCard.staticSetPupilsPacificIslanderFemale(siteRequest_, o);
		case "pupilsPacificIslanderMale":
			return ReportCard.staticSetPupilsPacificIslanderMale(siteRequest_, o);
		case "pupilsPacificIslanderTotal":
			return ReportCard.staticSetPupilsPacificIslanderTotal(siteRequest_, o);
		case "pupilsPacificIslanderPercent":
			return ReportCard.staticSetPupilsPacificIslanderPercent(siteRequest_, o);
		case "pupilsMultiRacialFemale":
			return ReportCard.staticSetPupilsMultiRacialFemale(siteRequest_, o);
		case "pupilsMultiRacialMale":
			return ReportCard.staticSetPupilsMultiRacialMale(siteRequest_, o);
		case "pupilsMultiRacialTotal":
			return ReportCard.staticSetPupilsMultiRacialTotal(siteRequest_, o);
		case "pupilsMultiRacialPercent":
			return ReportCard.staticSetPupilsMultiRacialPercent(siteRequest_, o);
		case "pupilsOtherPercent":
			return ReportCard.staticSetPupilsOtherPercent(siteRequest_, o);
		case "teachersMale":
			return ReportCard.staticSetTeachersMale(siteRequest_, o);
		case "teachersFemale":
			return ReportCard.staticSetTeachersFemale(siteRequest_, o);
		case "teachersTotal":
			return ReportCard.staticSetTeachersTotal(siteRequest_, o);
		case "teachersWhiteTotal":
			return ReportCard.staticSetTeachersWhiteTotal(siteRequest_, o);
		case "teachersWhitePercent":
			return ReportCard.staticSetTeachersWhitePercent(siteRequest_, o);
		case "teachersBlackTotal":
			return ReportCard.staticSetTeachersBlackTotal(siteRequest_, o);
		case "teachersBlackPercent":
			return ReportCard.staticSetTeachersBlackPercent(siteRequest_, o);
		case "teachersOtherTotal":
			return ReportCard.staticSetTeachersOtherTotal(siteRequest_, o);
		case "teachersOtherPercent":
			return ReportCard.staticSetTeachersOtherPercent(siteRequest_, o);
		case "delinquentComplaintsTotal":
			return ReportCard.staticSetDelinquentComplaintsTotal(siteRequest_, o);
		case "delinquentComplaintsAtSchool":
			return ReportCard.staticSetDelinquentComplaintsAtSchool(siteRequest_, o);
		case "delinquentComplaintsAtSchoolPercent":
			return ReportCard.staticSetDelinquentComplaintsAtSchoolPercent(siteRequest_, o);
		case "delinquentComplaintsAsian":
			return ReportCard.staticSetDelinquentComplaintsAsian(siteRequest_, o);
		case "delinquentComplaintsAsianPercent":
			return ReportCard.staticSetDelinquentComplaintsAsianPercent(siteRequest_, o);
		case "delinquentComplaintsBlack":
			return ReportCard.staticSetDelinquentComplaintsBlack(siteRequest_, o);
		case "delinquentComplaintsBlackPercent":
			return ReportCard.staticSetDelinquentComplaintsBlackPercent(siteRequest_, o);
		case "delinquentComplaintsLatinx":
			return ReportCard.staticSetDelinquentComplaintsLatinx(siteRequest_, o);
		case "delinquentComplaintsLatinxPercent":
			return ReportCard.staticSetDelinquentComplaintsLatinxPercent(siteRequest_, o);
		case "delinquentComplaintsMultiRacial":
			return ReportCard.staticSetDelinquentComplaintsMultiRacial(siteRequest_, o);
		case "delinquentComplaintsMultiRacialPercent":
			return ReportCard.staticSetDelinquentComplaintsMultiRacialPercent(siteRequest_, o);
		case "delinquentComplaintsIndigenous":
			return ReportCard.staticSetDelinquentComplaintsIndigenous(siteRequest_, o);
		case "delinquentComplaintsIndigenousPercent":
			return ReportCard.staticSetDelinquentComplaintsIndigenousPercent(siteRequest_, o);
		case "delinquentComplaintsWhite":
			return ReportCard.staticSetDelinquentComplaintsWhite(siteRequest_, o);
		case "delinquentComplaintsWhitePercent":
			return ReportCard.staticSetDelinquentComplaintsWhitePercent(siteRequest_, o);
		case "delinquentComplaintsPacificIslander":
			return ReportCard.staticSetDelinquentComplaintsPacificIslander(siteRequest_, o);
		case "delinquentComplaintsPacificIslanderPercent":
			return ReportCard.staticSetDelinquentComplaintsPacificIslanderPercent(siteRequest_, o);
		case "shortTermSuspensionRate":
			return ReportCard.staticSetShortTermSuspensionRate(siteRequest_, o);
		case "shortTermSuspensionsTotal":
			return ReportCard.staticSetShortTermSuspensionsTotal(siteRequest_, o);
		case "longTermSuspensionsTotal":
			return ReportCard.staticSetLongTermSuspensionsTotal(siteRequest_, o);
		case "expulsionsTotal":
			return ReportCard.staticSetExpulsionsTotal(siteRequest_, o);
		case "shortTermSuspensionsAsianFemale":
			return ReportCard.staticSetShortTermSuspensionsAsianFemale(siteRequest_, o);
		case "shortTermSuspensionsAsianMale":
			return ReportCard.staticSetShortTermSuspensionsAsianMale(siteRequest_, o);
		case "shortTermSuspensionsAsianTotal":
			return ReportCard.staticSetShortTermSuspensionsAsianTotal(siteRequest_, o);
		case "shortTermSuspensionsAsianPercent":
			return ReportCard.staticSetShortTermSuspensionsAsianPercent(siteRequest_, o);
		case "shortTermSuspensionsAsianRate":
			return ReportCard.staticSetShortTermSuspensionsAsianRate(siteRequest_, o);
		case "shortTermSuspensionsBlackFemale":
			return ReportCard.staticSetShortTermSuspensionsBlackFemale(siteRequest_, o);
		case "shortTermSuspensionsBlackMale":
			return ReportCard.staticSetShortTermSuspensionsBlackMale(siteRequest_, o);
		case "shortTermSuspensionsBlackTotal":
			return ReportCard.staticSetShortTermSuspensionsBlackTotal(siteRequest_, o);
		case "shortTermSuspensionsBlackPercent":
			return ReportCard.staticSetShortTermSuspensionsBlackPercent(siteRequest_, o);
		case "shortTermSuspensionsBlackRate":
			return ReportCard.staticSetShortTermSuspensionsBlackRate(siteRequest_, o);
		case "shortTermSuspensionsLatinxFemale":
			return ReportCard.staticSetShortTermSuspensionsLatinxFemale(siteRequest_, o);
		case "shortTermSuspensionsLatinxMale":
			return ReportCard.staticSetShortTermSuspensionsLatinxMale(siteRequest_, o);
		case "shortTermSuspensionsLatinxTotal":
			return ReportCard.staticSetShortTermSuspensionsLatinxTotal(siteRequest_, o);
		case "shortTermSuspensionsLatinxPercent":
			return ReportCard.staticSetShortTermSuspensionsLatinxPercent(siteRequest_, o);
		case "shortTermSuspensionsLatinxRate":
			return ReportCard.staticSetShortTermSuspensionsLatinxRate(siteRequest_, o);
		case "shortTermSuspensionsIndigenousFemale":
			return ReportCard.staticSetShortTermSuspensionsIndigenousFemale(siteRequest_, o);
		case "shortTermSuspensionsIndigenousMale":
			return ReportCard.staticSetShortTermSuspensionsIndigenousMale(siteRequest_, o);
		case "shortTermSuspensionsIndigenousTotal":
			return ReportCard.staticSetShortTermSuspensionsIndigenousTotal(siteRequest_, o);
		case "shortTermSuspensionsIndigenousPercent":
			return ReportCard.staticSetShortTermSuspensionsIndigenousPercent(siteRequest_, o);
		case "shortTermSuspensionsIndigenousRate":
			return ReportCard.staticSetShortTermSuspensionsIndigenousRate(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialFemale":
			return ReportCard.staticSetShortTermSuspensionsMultiRacialFemale(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialMale":
			return ReportCard.staticSetShortTermSuspensionsMultiRacialMale(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialTotal":
			return ReportCard.staticSetShortTermSuspensionsMultiRacialTotal(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialPercent":
			return ReportCard.staticSetShortTermSuspensionsMultiRacialPercent(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialRate":
			return ReportCard.staticSetShortTermSuspensionsMultiRacialRate(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderFemale":
			return ReportCard.staticSetShortTermSuspensionsPacificIslanderFemale(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderMale":
			return ReportCard.staticSetShortTermSuspensionsPacificIslanderMale(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderTotal":
			return ReportCard.staticSetShortTermSuspensionsPacificIslanderTotal(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderPercent":
			return ReportCard.staticSetShortTermSuspensionsPacificIslanderPercent(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderRate":
			return ReportCard.staticSetShortTermSuspensionsPacificIslanderRate(siteRequest_, o);
		case "shortTermSuspensionsWhiteFemale":
			return ReportCard.staticSetShortTermSuspensionsWhiteFemale(siteRequest_, o);
		case "shortTermSuspensionsWhiteMale":
			return ReportCard.staticSetShortTermSuspensionsWhiteMale(siteRequest_, o);
		case "shortTermSuspensionsWhiteTotal":
			return ReportCard.staticSetShortTermSuspensionsWhiteTotal(siteRequest_, o);
		case "shortTermSuspensionsWhitePercent":
			return ReportCard.staticSetShortTermSuspensionsWhitePercent(siteRequest_, o);
		case "shortTermSuspensionsWhiteRate":
			return ReportCard.staticSetShortTermSuspensionsWhiteRate(siteRequest_, o);
		case "shortTermSuspensionsAllRate":
			return ReportCard.staticSetShortTermSuspensionsAllRate(siteRequest_, o);
		case "shortTermSuspensionsBlackVsWhite":
			return ReportCard.staticSetShortTermSuspensionsBlackVsWhite(siteRequest_, o);
		case "examsCollegeReadyGrades38OverallPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38OverallPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38IndigenousPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38AsianPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38AsianPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38BlackPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38BlackPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38LatinxPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38LatinxPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38MultiRacialPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38PacificIslanderPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38WhitePercent":
			return ReportCard.staticSetExamsCollegeReadyGrades38WhitePercent(siteRequest_, o);
		case "examsCollegeReadyGrades912OverallPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912OverallPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912IndigenousPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912AsianPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912AsianPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912BlackPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912BlackPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912LatinxPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912LatinxPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912MultiRacialPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912PacificIslanderPercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912WhitePercent":
			return ReportCard.staticSetExamsCollegeReadyGrades912WhitePercent(siteRequest_, o);
		case "graduateWithin4YearsOverallPercent":
			return ReportCard.staticSetGraduateWithin4YearsOverallPercent(siteRequest_, o);
		case "graduateWithin4YearsIndigenousPercent":
			return ReportCard.staticSetGraduateWithin4YearsIndigenousPercent(siteRequest_, o);
		case "graduateWithin4YearsAsianPercent":
			return ReportCard.staticSetGraduateWithin4YearsAsianPercent(siteRequest_, o);
		case "graduateWithin4YearsBlackPercent":
			return ReportCard.staticSetGraduateWithin4YearsBlackPercent(siteRequest_, o);
		case "graduateWithin4YearsLatinxPercent":
			return ReportCard.staticSetGraduateWithin4YearsLatinxPercent(siteRequest_, o);
		case "graduateWithin4YearsMultiRacialPercent":
			return ReportCard.staticSetGraduateWithin4YearsMultiRacialPercent(siteRequest_, o);
		case "graduateWithin4YearsPacificIslanderPercent":
			return ReportCard.staticSetGraduateWithin4YearsPacificIslanderPercent(siteRequest_, o);
		case "graduateWithin4YearsWhitePercent":
			return ReportCard.staticSetGraduateWithin4YearsWhitePercent(siteRequest_, o);
		case "examsCollegeReadyGrades38BlackVsWhite":
			return ReportCard.staticSetExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, o);
		case "examsCollegeReadyGrades38LatinxVsWhite":
			return ReportCard.staticSetExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, o);
		case "reportCardCompleteName":
			return ReportCard.staticSetReportCardCompleteName(siteRequest_, o);
		case "reportCardNumber_":
			return ReportCard.staticSetReportCardNumber_(siteRequest_, o);
		case "agencyDemographicsGraph":
			return ReportCard.staticSetAgencyDemographicsGraph(siteRequest_, o);
		case "agencyStudentsByRaceGraph":
			return ReportCard.staticSetAgencyStudentsByRaceGraph(siteRequest_, o);
		case "agencyTeachersByRaceGraph":
			return ReportCard.staticSetAgencyTeachersByRaceGraph(siteRequest_, o);
		case "agencyGrades3To8Graph":
			return ReportCard.staticSetAgencyGrades3To8Graph(siteRequest_, o);
		case "agencyGrades9To12Graph":
			return ReportCard.staticSetAgencyGrades9To12Graph(siteRequest_, o);
		case "agencyGraduatesWithin4YearsGraph":
			return ReportCard.staticSetAgencyGraduatesWithin4YearsGraph(siteRequest_, o);
		case "suspensionsByRaceGraph":
			return ReportCard.staticSetSuspensionsByRaceGraph(siteRequest_, o);
		case "suspensionRatesByRaceGraph":
			return ReportCard.staticSetSuspensionRatesByRaceGraph(siteRequest_, o);
		case "countySchoolBasedComplaintsGraph":
			return ReportCard.staticSetCountySchoolBasedComplaintsGraph(siteRequest_, o);
		case "schoolBasedComplaintsGraph":
			return ReportCard.staticSetSchoolBasedComplaintsGraph(siteRequest_, o);
		case "agencyStudentsByRaceGraph2":
			return ReportCard.staticSetAgencyStudentsByRaceGraph2(siteRequest_, o);
		case "reportCardImage":
			return ReportCard.staticSetReportCardImage(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchReportCard(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchReportCard(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "reportCardKey":
			return ReportCard.staticSearchReportCardKey(siteRequest_, (Long)o);
		case "reportCardStartYear":
			return ReportCard.staticSearchReportCardStartYear(siteRequest_, (Integer)o);
		case "reportCardStartYearStr":
			return ReportCard.staticSearchReportCardStartYearStr(siteRequest_, (String)o);
		case "reportCardEndYear":
			return ReportCard.staticSearchReportCardEndYear(siteRequest_, (Integer)o);
		case "reportCardYearsStr":
			return ReportCard.staticSearchReportCardYearsStr(siteRequest_, (String)o);
		case "agencyKey":
			return ReportCard.staticSearchAgencyKey(siteRequest_, (Long)o);
		case "imageLeft":
			return ReportCard.staticSearchImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return ReportCard.staticSearchImageTop(siteRequest_, (Integer)o);
		case "stateKey":
			return ReportCard.staticSearchStateKey(siteRequest_, (Long)o);
		case "stateId":
			return ReportCard.staticSearchStateId(siteRequest_, (String)o);
		case "agencyId":
			return ReportCard.staticSearchAgencyId(siteRequest_, (String)o);
		case "stateName":
			return ReportCard.staticSearchStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return ReportCard.staticSearchStateAbbreviation(siteRequest_, (String)o);
		case "agencyOnlyName":
			return ReportCard.staticSearchAgencyOnlyName(siteRequest_, (String)o);
		case "agencyName":
			return ReportCard.staticSearchAgencyName(siteRequest_, (String)o);
		case "agencyIsState":
			return ReportCard.staticSearchAgencyIsState(siteRequest_, (Boolean)o);
		case "agencyCoords":
			return ReportCard.staticSearchAgencyCoords(siteRequest_, (String)o);
		case "agencyLeft":
			return ReportCard.staticSearchAgencyLeft(siteRequest_, (Integer)o);
		case "pupilsTotal":
			return ReportCard.staticSearchPupilsTotal(siteRequest_, (Long)o);
		case "pupilsIndigenousFemale":
			return ReportCard.staticSearchPupilsIndigenousFemale(siteRequest_, (Long)o);
		case "pupilsIndigenousMale":
			return ReportCard.staticSearchPupilsIndigenousMale(siteRequest_, (Long)o);
		case "pupilsIndigenousTotal":
			return ReportCard.staticSearchPupilsIndigenousTotal(siteRequest_, (Long)o);
		case "pupilsIndigenousPercent":
			return ReportCard.staticSearchPupilsIndigenousPercent(siteRequest_, (BigDecimal)o);
		case "pupilsAsianFemale":
			return ReportCard.staticSearchPupilsAsianFemale(siteRequest_, (Long)o);
		case "pupilsAsianMale":
			return ReportCard.staticSearchPupilsAsianMale(siteRequest_, (Long)o);
		case "pupilsAsianTotal":
			return ReportCard.staticSearchPupilsAsianTotal(siteRequest_, (Long)o);
		case "pupilsAsianPercent":
			return ReportCard.staticSearchPupilsAsianPercent(siteRequest_, (BigDecimal)o);
		case "pupilsLatinxFemale":
			return ReportCard.staticSearchPupilsLatinxFemale(siteRequest_, (Long)o);
		case "pupilsLatinxMale":
			return ReportCard.staticSearchPupilsLatinxMale(siteRequest_, (Long)o);
		case "pupilsLatinxTotal":
			return ReportCard.staticSearchPupilsLatinxTotal(siteRequest_, (Long)o);
		case "pupilsLatinxPercent":
			return ReportCard.staticSearchPupilsLatinxPercent(siteRequest_, (BigDecimal)o);
		case "pupilsBlackFemale":
			return ReportCard.staticSearchPupilsBlackFemale(siteRequest_, (Long)o);
		case "pupilsBlackMale":
			return ReportCard.staticSearchPupilsBlackMale(siteRequest_, (Long)o);
		case "pupilsBlackTotal":
			return ReportCard.staticSearchPupilsBlackTotal(siteRequest_, (Long)o);
		case "pupilsBlackPercent":
			return ReportCard.staticSearchPupilsBlackPercent(siteRequest_, (BigDecimal)o);
		case "pupilsWhiteFemale":
			return ReportCard.staticSearchPupilsWhiteFemale(siteRequest_, (Long)o);
		case "pupilsWhiteMale":
			return ReportCard.staticSearchPupilsWhiteMale(siteRequest_, (Long)o);
		case "pupilsWhiteTotal":
			return ReportCard.staticSearchPupilsWhiteTotal(siteRequest_, (Long)o);
		case "pupilsWhitePercent":
			return ReportCard.staticSearchPupilsWhitePercent(siteRequest_, (BigDecimal)o);
		case "pupilsPacificIslanderFemale":
			return ReportCard.staticSearchPupilsPacificIslanderFemale(siteRequest_, (Long)o);
		case "pupilsPacificIslanderMale":
			return ReportCard.staticSearchPupilsPacificIslanderMale(siteRequest_, (Long)o);
		case "pupilsPacificIslanderTotal":
			return ReportCard.staticSearchPupilsPacificIslanderTotal(siteRequest_, (Long)o);
		case "pupilsPacificIslanderPercent":
			return ReportCard.staticSearchPupilsPacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "pupilsMultiRacialFemale":
			return ReportCard.staticSearchPupilsMultiRacialFemale(siteRequest_, (Long)o);
		case "pupilsMultiRacialMale":
			return ReportCard.staticSearchPupilsMultiRacialMale(siteRequest_, (Long)o);
		case "pupilsMultiRacialTotal":
			return ReportCard.staticSearchPupilsMultiRacialTotal(siteRequest_, (Long)o);
		case "pupilsMultiRacialPercent":
			return ReportCard.staticSearchPupilsMultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "pupilsOtherPercent":
			return ReportCard.staticSearchPupilsOtherPercent(siteRequest_, (BigDecimal)o);
		case "teachersMale":
			return ReportCard.staticSearchTeachersMale(siteRequest_, (Long)o);
		case "teachersFemale":
			return ReportCard.staticSearchTeachersFemale(siteRequest_, (Long)o);
		case "teachersTotal":
			return ReportCard.staticSearchTeachersTotal(siteRequest_, (Long)o);
		case "teachersWhiteTotal":
			return ReportCard.staticSearchTeachersWhiteTotal(siteRequest_, (Long)o);
		case "teachersWhitePercent":
			return ReportCard.staticSearchTeachersWhitePercent(siteRequest_, (BigDecimal)o);
		case "teachersBlackTotal":
			return ReportCard.staticSearchTeachersBlackTotal(siteRequest_, (Long)o);
		case "teachersBlackPercent":
			return ReportCard.staticSearchTeachersBlackPercent(siteRequest_, (BigDecimal)o);
		case "teachersOtherTotal":
			return ReportCard.staticSearchTeachersOtherTotal(siteRequest_, (Long)o);
		case "teachersOtherPercent":
			return ReportCard.staticSearchTeachersOtherPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsTotal":
			return ReportCard.staticSearchDelinquentComplaintsTotal(siteRequest_, (Long)o);
		case "delinquentComplaintsAtSchool":
			return ReportCard.staticSearchDelinquentComplaintsAtSchool(siteRequest_, (Long)o);
		case "delinquentComplaintsAtSchoolPercent":
			return ReportCard.staticSearchDelinquentComplaintsAtSchoolPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsAsian":
			return ReportCard.staticSearchDelinquentComplaintsAsian(siteRequest_, (Long)o);
		case "delinquentComplaintsAsianPercent":
			return ReportCard.staticSearchDelinquentComplaintsAsianPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsBlack":
			return ReportCard.staticSearchDelinquentComplaintsBlack(siteRequest_, (Long)o);
		case "delinquentComplaintsBlackPercent":
			return ReportCard.staticSearchDelinquentComplaintsBlackPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsLatinx":
			return ReportCard.staticSearchDelinquentComplaintsLatinx(siteRequest_, (Long)o);
		case "delinquentComplaintsLatinxPercent":
			return ReportCard.staticSearchDelinquentComplaintsLatinxPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsMultiRacial":
			return ReportCard.staticSearchDelinquentComplaintsMultiRacial(siteRequest_, (Long)o);
		case "delinquentComplaintsMultiRacialPercent":
			return ReportCard.staticSearchDelinquentComplaintsMultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsIndigenous":
			return ReportCard.staticSearchDelinquentComplaintsIndigenous(siteRequest_, (Long)o);
		case "delinquentComplaintsIndigenousPercent":
			return ReportCard.staticSearchDelinquentComplaintsIndigenousPercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsWhite":
			return ReportCard.staticSearchDelinquentComplaintsWhite(siteRequest_, (Long)o);
		case "delinquentComplaintsWhitePercent":
			return ReportCard.staticSearchDelinquentComplaintsWhitePercent(siteRequest_, (BigDecimal)o);
		case "delinquentComplaintsPacificIslander":
			return ReportCard.staticSearchDelinquentComplaintsPacificIslander(siteRequest_, (Long)o);
		case "delinquentComplaintsPacificIslanderPercent":
			return ReportCard.staticSearchDelinquentComplaintsPacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionRate":
			return ReportCard.staticSearchShortTermSuspensionRate(siteRequest_, (Long)o);
		case "shortTermSuspensionsTotal":
			return ReportCard.staticSearchShortTermSuspensionsTotal(siteRequest_, (Long)o);
		case "longTermSuspensionsTotal":
			return ReportCard.staticSearchLongTermSuspensionsTotal(siteRequest_, (Long)o);
		case "expulsionsTotal":
			return ReportCard.staticSearchExpulsionsTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianFemale":
			return ReportCard.staticSearchShortTermSuspensionsAsianFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianMale":
			return ReportCard.staticSearchShortTermSuspensionsAsianMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianTotal":
			return ReportCard.staticSearchShortTermSuspensionsAsianTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianPercent":
			return ReportCard.staticSearchShortTermSuspensionsAsianPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsAsianRate":
			return ReportCard.staticSearchShortTermSuspensionsAsianRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsBlackFemale":
			return ReportCard.staticSearchShortTermSuspensionsBlackFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackMale":
			return ReportCard.staticSearchShortTermSuspensionsBlackMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackTotal":
			return ReportCard.staticSearchShortTermSuspensionsBlackTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackPercent":
			return ReportCard.staticSearchShortTermSuspensionsBlackPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsBlackRate":
			return ReportCard.staticSearchShortTermSuspensionsBlackRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsLatinxFemale":
			return ReportCard.staticSearchShortTermSuspensionsLatinxFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxMale":
			return ReportCard.staticSearchShortTermSuspensionsLatinxMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxTotal":
			return ReportCard.staticSearchShortTermSuspensionsLatinxTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxPercent":
			return ReportCard.staticSearchShortTermSuspensionsLatinxPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsLatinxRate":
			return ReportCard.staticSearchShortTermSuspensionsLatinxRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsIndigenousFemale":
			return ReportCard.staticSearchShortTermSuspensionsIndigenousFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousMale":
			return ReportCard.staticSearchShortTermSuspensionsIndigenousMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousTotal":
			return ReportCard.staticSearchShortTermSuspensionsIndigenousTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousPercent":
			return ReportCard.staticSearchShortTermSuspensionsIndigenousPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsIndigenousRate":
			return ReportCard.staticSearchShortTermSuspensionsIndigenousRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsMultiRacialFemale":
			return ReportCard.staticSearchShortTermSuspensionsMultiRacialFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialMale":
			return ReportCard.staticSearchShortTermSuspensionsMultiRacialMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialTotal":
			return ReportCard.staticSearchShortTermSuspensionsMultiRacialTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialPercent":
			return ReportCard.staticSearchShortTermSuspensionsMultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsMultiRacialRate":
			return ReportCard.staticSearchShortTermSuspensionsMultiRacialRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsPacificIslanderFemale":
			return ReportCard.staticSearchShortTermSuspensionsPacificIslanderFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderMale":
			return ReportCard.staticSearchShortTermSuspensionsPacificIslanderMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderTotal":
			return ReportCard.staticSearchShortTermSuspensionsPacificIslanderTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderPercent":
			return ReportCard.staticSearchShortTermSuspensionsPacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsPacificIslanderRate":
			return ReportCard.staticSearchShortTermSuspensionsPacificIslanderRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsWhiteFemale":
			return ReportCard.staticSearchShortTermSuspensionsWhiteFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhiteMale":
			return ReportCard.staticSearchShortTermSuspensionsWhiteMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhiteTotal":
			return ReportCard.staticSearchShortTermSuspensionsWhiteTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhitePercent":
			return ReportCard.staticSearchShortTermSuspensionsWhitePercent(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsWhiteRate":
			return ReportCard.staticSearchShortTermSuspensionsWhiteRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsAllRate":
			return ReportCard.staticSearchShortTermSuspensionsAllRate(siteRequest_, (BigDecimal)o);
		case "shortTermSuspensionsBlackVsWhite":
			return ReportCard.staticSearchShortTermSuspensionsBlackVsWhite(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38OverallPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38OverallPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38IndigenousPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38AsianPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38AsianPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38BlackPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38BlackPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38LatinxPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38LatinxPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38MultiRacialPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38PacificIslanderPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38WhitePercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades38WhitePercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912OverallPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912OverallPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912IndigenousPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912AsianPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912AsianPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912BlackPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912BlackPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912LatinxPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912LatinxPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912MultiRacialPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912PacificIslanderPercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades912WhitePercent":
			return ReportCard.staticSearchExamsCollegeReadyGrades912WhitePercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsOverallPercent":
			return ReportCard.staticSearchGraduateWithin4YearsOverallPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsIndigenousPercent":
			return ReportCard.staticSearchGraduateWithin4YearsIndigenousPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsAsianPercent":
			return ReportCard.staticSearchGraduateWithin4YearsAsianPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsBlackPercent":
			return ReportCard.staticSearchGraduateWithin4YearsBlackPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsLatinxPercent":
			return ReportCard.staticSearchGraduateWithin4YearsLatinxPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsMultiRacialPercent":
			return ReportCard.staticSearchGraduateWithin4YearsMultiRacialPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsPacificIslanderPercent":
			return ReportCard.staticSearchGraduateWithin4YearsPacificIslanderPercent(siteRequest_, (BigDecimal)o);
		case "graduateWithin4YearsWhitePercent":
			return ReportCard.staticSearchGraduateWithin4YearsWhitePercent(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38BlackVsWhite":
			return ReportCard.staticSearchExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, (BigDecimal)o);
		case "examsCollegeReadyGrades38LatinxVsWhite":
			return ReportCard.staticSearchExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, (BigDecimal)o);
		case "reportCardCompleteName":
			return ReportCard.staticSearchReportCardCompleteName(siteRequest_, (String)o);
		case "reportCardNumber_":
			return ReportCard.staticSearchReportCardNumber_(siteRequest_, (Integer)o);
		case "agencyDemographicsGraph":
			return ReportCard.staticSearchAgencyDemographicsGraph(siteRequest_, (String)o);
		case "agencyStudentsByRaceGraph":
			return ReportCard.staticSearchAgencyStudentsByRaceGraph(siteRequest_, (String)o);
		case "agencyTeachersByRaceGraph":
			return ReportCard.staticSearchAgencyTeachersByRaceGraph(siteRequest_, (String)o);
		case "agencyGrades3To8Graph":
			return ReportCard.staticSearchAgencyGrades3To8Graph(siteRequest_, (String)o);
		case "agencyGrades9To12Graph":
			return ReportCard.staticSearchAgencyGrades9To12Graph(siteRequest_, (String)o);
		case "agencyGraduatesWithin4YearsGraph":
			return ReportCard.staticSearchAgencyGraduatesWithin4YearsGraph(siteRequest_, (String)o);
		case "suspensionsByRaceGraph":
			return ReportCard.staticSearchSuspensionsByRaceGraph(siteRequest_, (String)o);
		case "suspensionRatesByRaceGraph":
			return ReportCard.staticSearchSuspensionRatesByRaceGraph(siteRequest_, (String)o);
		case "countySchoolBasedComplaintsGraph":
			return ReportCard.staticSearchCountySchoolBasedComplaintsGraph(siteRequest_, (String)o);
		case "schoolBasedComplaintsGraph":
			return ReportCard.staticSearchSchoolBasedComplaintsGraph(siteRequest_, (String)o);
		case "agencyStudentsByRaceGraph2":
			return ReportCard.staticSearchAgencyStudentsByRaceGraph2(siteRequest_, (String)o);
		case "reportCardImage":
			return ReportCard.staticSearchReportCardImage(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrReportCard(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrReportCard(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "reportCardKey":
			return ReportCard.staticSearchStrReportCardKey(siteRequest_, (Long)o);
		case "reportCardStartYear":
			return ReportCard.staticSearchStrReportCardStartYear(siteRequest_, (Integer)o);
		case "reportCardStartYearStr":
			return ReportCard.staticSearchStrReportCardStartYearStr(siteRequest_, (String)o);
		case "reportCardEndYear":
			return ReportCard.staticSearchStrReportCardEndYear(siteRequest_, (Integer)o);
		case "reportCardYearsStr":
			return ReportCard.staticSearchStrReportCardYearsStr(siteRequest_, (String)o);
		case "agencyKey":
			return ReportCard.staticSearchStrAgencyKey(siteRequest_, (Long)o);
		case "imageLeft":
			return ReportCard.staticSearchStrImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return ReportCard.staticSearchStrImageTop(siteRequest_, (Integer)o);
		case "stateKey":
			return ReportCard.staticSearchStrStateKey(siteRequest_, (Long)o);
		case "stateId":
			return ReportCard.staticSearchStrStateId(siteRequest_, (String)o);
		case "agencyId":
			return ReportCard.staticSearchStrAgencyId(siteRequest_, (String)o);
		case "stateName":
			return ReportCard.staticSearchStrStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return ReportCard.staticSearchStrStateAbbreviation(siteRequest_, (String)o);
		case "agencyOnlyName":
			return ReportCard.staticSearchStrAgencyOnlyName(siteRequest_, (String)o);
		case "agencyName":
			return ReportCard.staticSearchStrAgencyName(siteRequest_, (String)o);
		case "agencyIsState":
			return ReportCard.staticSearchStrAgencyIsState(siteRequest_, (Boolean)o);
		case "agencyCoords":
			return ReportCard.staticSearchStrAgencyCoords(siteRequest_, (String)o);
		case "agencyLeft":
			return ReportCard.staticSearchStrAgencyLeft(siteRequest_, (Integer)o);
		case "pupilsTotal":
			return ReportCard.staticSearchStrPupilsTotal(siteRequest_, (Long)o);
		case "pupilsIndigenousFemale":
			return ReportCard.staticSearchStrPupilsIndigenousFemale(siteRequest_, (Long)o);
		case "pupilsIndigenousMale":
			return ReportCard.staticSearchStrPupilsIndigenousMale(siteRequest_, (Long)o);
		case "pupilsIndigenousTotal":
			return ReportCard.staticSearchStrPupilsIndigenousTotal(siteRequest_, (Long)o);
		case "pupilsIndigenousPercent":
			return ReportCard.staticSearchStrPupilsIndigenousPercent(siteRequest_, (Double)o);
		case "pupilsAsianFemale":
			return ReportCard.staticSearchStrPupilsAsianFemale(siteRequest_, (Long)o);
		case "pupilsAsianMale":
			return ReportCard.staticSearchStrPupilsAsianMale(siteRequest_, (Long)o);
		case "pupilsAsianTotal":
			return ReportCard.staticSearchStrPupilsAsianTotal(siteRequest_, (Long)o);
		case "pupilsAsianPercent":
			return ReportCard.staticSearchStrPupilsAsianPercent(siteRequest_, (Double)o);
		case "pupilsLatinxFemale":
			return ReportCard.staticSearchStrPupilsLatinxFemale(siteRequest_, (Long)o);
		case "pupilsLatinxMale":
			return ReportCard.staticSearchStrPupilsLatinxMale(siteRequest_, (Long)o);
		case "pupilsLatinxTotal":
			return ReportCard.staticSearchStrPupilsLatinxTotal(siteRequest_, (Long)o);
		case "pupilsLatinxPercent":
			return ReportCard.staticSearchStrPupilsLatinxPercent(siteRequest_, (Double)o);
		case "pupilsBlackFemale":
			return ReportCard.staticSearchStrPupilsBlackFemale(siteRequest_, (Long)o);
		case "pupilsBlackMale":
			return ReportCard.staticSearchStrPupilsBlackMale(siteRequest_, (Long)o);
		case "pupilsBlackTotal":
			return ReportCard.staticSearchStrPupilsBlackTotal(siteRequest_, (Long)o);
		case "pupilsBlackPercent":
			return ReportCard.staticSearchStrPupilsBlackPercent(siteRequest_, (Double)o);
		case "pupilsWhiteFemale":
			return ReportCard.staticSearchStrPupilsWhiteFemale(siteRequest_, (Long)o);
		case "pupilsWhiteMale":
			return ReportCard.staticSearchStrPupilsWhiteMale(siteRequest_, (Long)o);
		case "pupilsWhiteTotal":
			return ReportCard.staticSearchStrPupilsWhiteTotal(siteRequest_, (Long)o);
		case "pupilsWhitePercent":
			return ReportCard.staticSearchStrPupilsWhitePercent(siteRequest_, (Double)o);
		case "pupilsPacificIslanderFemale":
			return ReportCard.staticSearchStrPupilsPacificIslanderFemale(siteRequest_, (Long)o);
		case "pupilsPacificIslanderMale":
			return ReportCard.staticSearchStrPupilsPacificIslanderMale(siteRequest_, (Long)o);
		case "pupilsPacificIslanderTotal":
			return ReportCard.staticSearchStrPupilsPacificIslanderTotal(siteRequest_, (Long)o);
		case "pupilsPacificIslanderPercent":
			return ReportCard.staticSearchStrPupilsPacificIslanderPercent(siteRequest_, (Double)o);
		case "pupilsMultiRacialFemale":
			return ReportCard.staticSearchStrPupilsMultiRacialFemale(siteRequest_, (Long)o);
		case "pupilsMultiRacialMale":
			return ReportCard.staticSearchStrPupilsMultiRacialMale(siteRequest_, (Long)o);
		case "pupilsMultiRacialTotal":
			return ReportCard.staticSearchStrPupilsMultiRacialTotal(siteRequest_, (Long)o);
		case "pupilsMultiRacialPercent":
			return ReportCard.staticSearchStrPupilsMultiRacialPercent(siteRequest_, (Double)o);
		case "pupilsOtherPercent":
			return ReportCard.staticSearchStrPupilsOtherPercent(siteRequest_, (Double)o);
		case "teachersMale":
			return ReportCard.staticSearchStrTeachersMale(siteRequest_, (Long)o);
		case "teachersFemale":
			return ReportCard.staticSearchStrTeachersFemale(siteRequest_, (Long)o);
		case "teachersTotal":
			return ReportCard.staticSearchStrTeachersTotal(siteRequest_, (Long)o);
		case "teachersWhiteTotal":
			return ReportCard.staticSearchStrTeachersWhiteTotal(siteRequest_, (Long)o);
		case "teachersWhitePercent":
			return ReportCard.staticSearchStrTeachersWhitePercent(siteRequest_, (Double)o);
		case "teachersBlackTotal":
			return ReportCard.staticSearchStrTeachersBlackTotal(siteRequest_, (Long)o);
		case "teachersBlackPercent":
			return ReportCard.staticSearchStrTeachersBlackPercent(siteRequest_, (Double)o);
		case "teachersOtherTotal":
			return ReportCard.staticSearchStrTeachersOtherTotal(siteRequest_, (Long)o);
		case "teachersOtherPercent":
			return ReportCard.staticSearchStrTeachersOtherPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsTotal":
			return ReportCard.staticSearchStrDelinquentComplaintsTotal(siteRequest_, (Long)o);
		case "delinquentComplaintsAtSchool":
			return ReportCard.staticSearchStrDelinquentComplaintsAtSchool(siteRequest_, (Long)o);
		case "delinquentComplaintsAtSchoolPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsAtSchoolPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsAsian":
			return ReportCard.staticSearchStrDelinquentComplaintsAsian(siteRequest_, (Long)o);
		case "delinquentComplaintsAsianPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsAsianPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsBlack":
			return ReportCard.staticSearchStrDelinquentComplaintsBlack(siteRequest_, (Long)o);
		case "delinquentComplaintsBlackPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsBlackPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsLatinx":
			return ReportCard.staticSearchStrDelinquentComplaintsLatinx(siteRequest_, (Long)o);
		case "delinquentComplaintsLatinxPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsLatinxPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsMultiRacial":
			return ReportCard.staticSearchStrDelinquentComplaintsMultiRacial(siteRequest_, (Long)o);
		case "delinquentComplaintsMultiRacialPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsMultiRacialPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsIndigenous":
			return ReportCard.staticSearchStrDelinquentComplaintsIndigenous(siteRequest_, (Long)o);
		case "delinquentComplaintsIndigenousPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsIndigenousPercent(siteRequest_, (Double)o);
		case "delinquentComplaintsWhite":
			return ReportCard.staticSearchStrDelinquentComplaintsWhite(siteRequest_, (Long)o);
		case "delinquentComplaintsWhitePercent":
			return ReportCard.staticSearchStrDelinquentComplaintsWhitePercent(siteRequest_, (Double)o);
		case "delinquentComplaintsPacificIslander":
			return ReportCard.staticSearchStrDelinquentComplaintsPacificIslander(siteRequest_, (Long)o);
		case "delinquentComplaintsPacificIslanderPercent":
			return ReportCard.staticSearchStrDelinquentComplaintsPacificIslanderPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionRate":
			return ReportCard.staticSearchStrShortTermSuspensionRate(siteRequest_, (Long)o);
		case "shortTermSuspensionsTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsTotal(siteRequest_, (Long)o);
		case "longTermSuspensionsTotal":
			return ReportCard.staticSearchStrLongTermSuspensionsTotal(siteRequest_, (Long)o);
		case "expulsionsTotal":
			return ReportCard.staticSearchStrExpulsionsTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsAsianFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianMale":
			return ReportCard.staticSearchStrShortTermSuspensionsAsianMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsAsianTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsAsianPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsAsianPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsAsianRate":
			return ReportCard.staticSearchStrShortTermSuspensionsAsianRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsBlackFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackMale":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsBlackPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsBlackRate":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsLatinxFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsLatinxFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxMale":
			return ReportCard.staticSearchStrShortTermSuspensionsLatinxMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsLatinxTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsLatinxPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsLatinxPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsLatinxRate":
			return ReportCard.staticSearchStrShortTermSuspensionsLatinxRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsIndigenousFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsIndigenousFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousMale":
			return ReportCard.staticSearchStrShortTermSuspensionsIndigenousMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsIndigenousTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsIndigenousPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsIndigenousPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsIndigenousRate":
			return ReportCard.staticSearchStrShortTermSuspensionsIndigenousRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsMultiRacialFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialMale":
			return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsMultiRacialPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsMultiRacialRate":
			return ReportCard.staticSearchStrShortTermSuspensionsMultiRacialRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsPacificIslanderFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderMale":
			return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsPacificIslanderPercent":
			return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderPercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsPacificIslanderRate":
			return ReportCard.staticSearchStrShortTermSuspensionsPacificIslanderRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsWhiteFemale":
			return ReportCard.staticSearchStrShortTermSuspensionsWhiteFemale(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhiteMale":
			return ReportCard.staticSearchStrShortTermSuspensionsWhiteMale(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhiteTotal":
			return ReportCard.staticSearchStrShortTermSuspensionsWhiteTotal(siteRequest_, (Long)o);
		case "shortTermSuspensionsWhitePercent":
			return ReportCard.staticSearchStrShortTermSuspensionsWhitePercent(siteRequest_, (Double)o);
		case "shortTermSuspensionsWhiteRate":
			return ReportCard.staticSearchStrShortTermSuspensionsWhiteRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsAllRate":
			return ReportCard.staticSearchStrShortTermSuspensionsAllRate(siteRequest_, (Double)o);
		case "shortTermSuspensionsBlackVsWhite":
			return ReportCard.staticSearchStrShortTermSuspensionsBlackVsWhite(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38OverallPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38OverallPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38IndigenousPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38AsianPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38AsianPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38BlackPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38BlackPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38LatinxPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38LatinxPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38MultiRacialPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38PacificIslanderPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38WhitePercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38WhitePercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912OverallPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912OverallPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912IndigenousPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912AsianPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912AsianPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912BlackPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912BlackPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912LatinxPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912LatinxPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912MultiRacialPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912PacificIslanderPercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades912WhitePercent":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades912WhitePercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsOverallPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsOverallPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsIndigenousPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsIndigenousPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsAsianPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsAsianPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsBlackPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsBlackPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsLatinxPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsLatinxPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsMultiRacialPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsMultiRacialPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsPacificIslanderPercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsPacificIslanderPercent(siteRequest_, (Double)o);
		case "graduateWithin4YearsWhitePercent":
			return ReportCard.staticSearchStrGraduateWithin4YearsWhitePercent(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38BlackVsWhite":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, (Double)o);
		case "examsCollegeReadyGrades38LatinxVsWhite":
			return ReportCard.staticSearchStrExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, (Double)o);
		case "reportCardCompleteName":
			return ReportCard.staticSearchStrReportCardCompleteName(siteRequest_, (String)o);
		case "reportCardNumber_":
			return ReportCard.staticSearchStrReportCardNumber_(siteRequest_, (Integer)o);
		case "agencyDemographicsGraph":
			return ReportCard.staticSearchStrAgencyDemographicsGraph(siteRequest_, (String)o);
		case "agencyStudentsByRaceGraph":
			return ReportCard.staticSearchStrAgencyStudentsByRaceGraph(siteRequest_, (String)o);
		case "agencyTeachersByRaceGraph":
			return ReportCard.staticSearchStrAgencyTeachersByRaceGraph(siteRequest_, (String)o);
		case "agencyGrades3To8Graph":
			return ReportCard.staticSearchStrAgencyGrades3To8Graph(siteRequest_, (String)o);
		case "agencyGrades9To12Graph":
			return ReportCard.staticSearchStrAgencyGrades9To12Graph(siteRequest_, (String)o);
		case "agencyGraduatesWithin4YearsGraph":
			return ReportCard.staticSearchStrAgencyGraduatesWithin4YearsGraph(siteRequest_, (String)o);
		case "suspensionsByRaceGraph":
			return ReportCard.staticSearchStrSuspensionsByRaceGraph(siteRequest_, (String)o);
		case "suspensionRatesByRaceGraph":
			return ReportCard.staticSearchStrSuspensionRatesByRaceGraph(siteRequest_, (String)o);
		case "countySchoolBasedComplaintsGraph":
			return ReportCard.staticSearchStrCountySchoolBasedComplaintsGraph(siteRequest_, (String)o);
		case "schoolBasedComplaintsGraph":
			return ReportCard.staticSearchStrSchoolBasedComplaintsGraph(siteRequest_, (String)o);
		case "agencyStudentsByRaceGraph2":
			return ReportCard.staticSearchStrAgencyStudentsByRaceGraph2(siteRequest_, (String)o);
		case "reportCardImage":
			return ReportCard.staticSearchStrReportCardImage(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqReportCard(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqReportCard(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "reportCardKey":
			return ReportCard.staticSearchFqReportCardKey(siteRequest_, o);
		case "reportCardStartYear":
			return ReportCard.staticSearchFqReportCardStartYear(siteRequest_, o);
		case "reportCardStartYearStr":
			return ReportCard.staticSearchFqReportCardStartYearStr(siteRequest_, o);
		case "reportCardEndYear":
			return ReportCard.staticSearchFqReportCardEndYear(siteRequest_, o);
		case "reportCardYearsStr":
			return ReportCard.staticSearchFqReportCardYearsStr(siteRequest_, o);
		case "agencyKey":
			return ReportCard.staticSearchFqAgencyKey(siteRequest_, o);
		case "imageLeft":
			return ReportCard.staticSearchFqImageLeft(siteRequest_, o);
		case "imageTop":
			return ReportCard.staticSearchFqImageTop(siteRequest_, o);
		case "stateKey":
			return ReportCard.staticSearchFqStateKey(siteRequest_, o);
		case "stateId":
			return ReportCard.staticSearchFqStateId(siteRequest_, o);
		case "agencyId":
			return ReportCard.staticSearchFqAgencyId(siteRequest_, o);
		case "stateName":
			return ReportCard.staticSearchFqStateName(siteRequest_, o);
		case "stateAbbreviation":
			return ReportCard.staticSearchFqStateAbbreviation(siteRequest_, o);
		case "agencyOnlyName":
			return ReportCard.staticSearchFqAgencyOnlyName(siteRequest_, o);
		case "agencyName":
			return ReportCard.staticSearchFqAgencyName(siteRequest_, o);
		case "agencyIsState":
			return ReportCard.staticSearchFqAgencyIsState(siteRequest_, o);
		case "agencyCoords":
			return ReportCard.staticSearchFqAgencyCoords(siteRequest_, o);
		case "agencyLeft":
			return ReportCard.staticSearchFqAgencyLeft(siteRequest_, o);
		case "pupilsTotal":
			return ReportCard.staticSearchFqPupilsTotal(siteRequest_, o);
		case "pupilsIndigenousFemale":
			return ReportCard.staticSearchFqPupilsIndigenousFemale(siteRequest_, o);
		case "pupilsIndigenousMale":
			return ReportCard.staticSearchFqPupilsIndigenousMale(siteRequest_, o);
		case "pupilsIndigenousTotal":
			return ReportCard.staticSearchFqPupilsIndigenousTotal(siteRequest_, o);
		case "pupilsIndigenousPercent":
			return ReportCard.staticSearchFqPupilsIndigenousPercent(siteRequest_, o);
		case "pupilsAsianFemale":
			return ReportCard.staticSearchFqPupilsAsianFemale(siteRequest_, o);
		case "pupilsAsianMale":
			return ReportCard.staticSearchFqPupilsAsianMale(siteRequest_, o);
		case "pupilsAsianTotal":
			return ReportCard.staticSearchFqPupilsAsianTotal(siteRequest_, o);
		case "pupilsAsianPercent":
			return ReportCard.staticSearchFqPupilsAsianPercent(siteRequest_, o);
		case "pupilsLatinxFemale":
			return ReportCard.staticSearchFqPupilsLatinxFemale(siteRequest_, o);
		case "pupilsLatinxMale":
			return ReportCard.staticSearchFqPupilsLatinxMale(siteRequest_, o);
		case "pupilsLatinxTotal":
			return ReportCard.staticSearchFqPupilsLatinxTotal(siteRequest_, o);
		case "pupilsLatinxPercent":
			return ReportCard.staticSearchFqPupilsLatinxPercent(siteRequest_, o);
		case "pupilsBlackFemale":
			return ReportCard.staticSearchFqPupilsBlackFemale(siteRequest_, o);
		case "pupilsBlackMale":
			return ReportCard.staticSearchFqPupilsBlackMale(siteRequest_, o);
		case "pupilsBlackTotal":
			return ReportCard.staticSearchFqPupilsBlackTotal(siteRequest_, o);
		case "pupilsBlackPercent":
			return ReportCard.staticSearchFqPupilsBlackPercent(siteRequest_, o);
		case "pupilsWhiteFemale":
			return ReportCard.staticSearchFqPupilsWhiteFemale(siteRequest_, o);
		case "pupilsWhiteMale":
			return ReportCard.staticSearchFqPupilsWhiteMale(siteRequest_, o);
		case "pupilsWhiteTotal":
			return ReportCard.staticSearchFqPupilsWhiteTotal(siteRequest_, o);
		case "pupilsWhitePercent":
			return ReportCard.staticSearchFqPupilsWhitePercent(siteRequest_, o);
		case "pupilsPacificIslanderFemale":
			return ReportCard.staticSearchFqPupilsPacificIslanderFemale(siteRequest_, o);
		case "pupilsPacificIslanderMale":
			return ReportCard.staticSearchFqPupilsPacificIslanderMale(siteRequest_, o);
		case "pupilsPacificIslanderTotal":
			return ReportCard.staticSearchFqPupilsPacificIslanderTotal(siteRequest_, o);
		case "pupilsPacificIslanderPercent":
			return ReportCard.staticSearchFqPupilsPacificIslanderPercent(siteRequest_, o);
		case "pupilsMultiRacialFemale":
			return ReportCard.staticSearchFqPupilsMultiRacialFemale(siteRequest_, o);
		case "pupilsMultiRacialMale":
			return ReportCard.staticSearchFqPupilsMultiRacialMale(siteRequest_, o);
		case "pupilsMultiRacialTotal":
			return ReportCard.staticSearchFqPupilsMultiRacialTotal(siteRequest_, o);
		case "pupilsMultiRacialPercent":
			return ReportCard.staticSearchFqPupilsMultiRacialPercent(siteRequest_, o);
		case "pupilsOtherPercent":
			return ReportCard.staticSearchFqPupilsOtherPercent(siteRequest_, o);
		case "teachersMale":
			return ReportCard.staticSearchFqTeachersMale(siteRequest_, o);
		case "teachersFemale":
			return ReportCard.staticSearchFqTeachersFemale(siteRequest_, o);
		case "teachersTotal":
			return ReportCard.staticSearchFqTeachersTotal(siteRequest_, o);
		case "teachersWhiteTotal":
			return ReportCard.staticSearchFqTeachersWhiteTotal(siteRequest_, o);
		case "teachersWhitePercent":
			return ReportCard.staticSearchFqTeachersWhitePercent(siteRequest_, o);
		case "teachersBlackTotal":
			return ReportCard.staticSearchFqTeachersBlackTotal(siteRequest_, o);
		case "teachersBlackPercent":
			return ReportCard.staticSearchFqTeachersBlackPercent(siteRequest_, o);
		case "teachersOtherTotal":
			return ReportCard.staticSearchFqTeachersOtherTotal(siteRequest_, o);
		case "teachersOtherPercent":
			return ReportCard.staticSearchFqTeachersOtherPercent(siteRequest_, o);
		case "delinquentComplaintsTotal":
			return ReportCard.staticSearchFqDelinquentComplaintsTotal(siteRequest_, o);
		case "delinquentComplaintsAtSchool":
			return ReportCard.staticSearchFqDelinquentComplaintsAtSchool(siteRequest_, o);
		case "delinquentComplaintsAtSchoolPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsAtSchoolPercent(siteRequest_, o);
		case "delinquentComplaintsAsian":
			return ReportCard.staticSearchFqDelinquentComplaintsAsian(siteRequest_, o);
		case "delinquentComplaintsAsianPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsAsianPercent(siteRequest_, o);
		case "delinquentComplaintsBlack":
			return ReportCard.staticSearchFqDelinquentComplaintsBlack(siteRequest_, o);
		case "delinquentComplaintsBlackPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsBlackPercent(siteRequest_, o);
		case "delinquentComplaintsLatinx":
			return ReportCard.staticSearchFqDelinquentComplaintsLatinx(siteRequest_, o);
		case "delinquentComplaintsLatinxPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsLatinxPercent(siteRequest_, o);
		case "delinquentComplaintsMultiRacial":
			return ReportCard.staticSearchFqDelinquentComplaintsMultiRacial(siteRequest_, o);
		case "delinquentComplaintsMultiRacialPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsMultiRacialPercent(siteRequest_, o);
		case "delinquentComplaintsIndigenous":
			return ReportCard.staticSearchFqDelinquentComplaintsIndigenous(siteRequest_, o);
		case "delinquentComplaintsIndigenousPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsIndigenousPercent(siteRequest_, o);
		case "delinquentComplaintsWhite":
			return ReportCard.staticSearchFqDelinquentComplaintsWhite(siteRequest_, o);
		case "delinquentComplaintsWhitePercent":
			return ReportCard.staticSearchFqDelinquentComplaintsWhitePercent(siteRequest_, o);
		case "delinquentComplaintsPacificIslander":
			return ReportCard.staticSearchFqDelinquentComplaintsPacificIslander(siteRequest_, o);
		case "delinquentComplaintsPacificIslanderPercent":
			return ReportCard.staticSearchFqDelinquentComplaintsPacificIslanderPercent(siteRequest_, o);
		case "shortTermSuspensionRate":
			return ReportCard.staticSearchFqShortTermSuspensionRate(siteRequest_, o);
		case "shortTermSuspensionsTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsTotal(siteRequest_, o);
		case "longTermSuspensionsTotal":
			return ReportCard.staticSearchFqLongTermSuspensionsTotal(siteRequest_, o);
		case "expulsionsTotal":
			return ReportCard.staticSearchFqExpulsionsTotal(siteRequest_, o);
		case "shortTermSuspensionsAsianFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsAsianFemale(siteRequest_, o);
		case "shortTermSuspensionsAsianMale":
			return ReportCard.staticSearchFqShortTermSuspensionsAsianMale(siteRequest_, o);
		case "shortTermSuspensionsAsianTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsAsianTotal(siteRequest_, o);
		case "shortTermSuspensionsAsianPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsAsianPercent(siteRequest_, o);
		case "shortTermSuspensionsAsianRate":
			return ReportCard.staticSearchFqShortTermSuspensionsAsianRate(siteRequest_, o);
		case "shortTermSuspensionsBlackFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackFemale(siteRequest_, o);
		case "shortTermSuspensionsBlackMale":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackMale(siteRequest_, o);
		case "shortTermSuspensionsBlackTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackTotal(siteRequest_, o);
		case "shortTermSuspensionsBlackPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackPercent(siteRequest_, o);
		case "shortTermSuspensionsBlackRate":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackRate(siteRequest_, o);
		case "shortTermSuspensionsLatinxFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsLatinxFemale(siteRequest_, o);
		case "shortTermSuspensionsLatinxMale":
			return ReportCard.staticSearchFqShortTermSuspensionsLatinxMale(siteRequest_, o);
		case "shortTermSuspensionsLatinxTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsLatinxTotal(siteRequest_, o);
		case "shortTermSuspensionsLatinxPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsLatinxPercent(siteRequest_, o);
		case "shortTermSuspensionsLatinxRate":
			return ReportCard.staticSearchFqShortTermSuspensionsLatinxRate(siteRequest_, o);
		case "shortTermSuspensionsIndigenousFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsIndigenousFemale(siteRequest_, o);
		case "shortTermSuspensionsIndigenousMale":
			return ReportCard.staticSearchFqShortTermSuspensionsIndigenousMale(siteRequest_, o);
		case "shortTermSuspensionsIndigenousTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsIndigenousTotal(siteRequest_, o);
		case "shortTermSuspensionsIndigenousPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsIndigenousPercent(siteRequest_, o);
		case "shortTermSuspensionsIndigenousRate":
			return ReportCard.staticSearchFqShortTermSuspensionsIndigenousRate(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsMultiRacialFemale(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialMale":
			return ReportCard.staticSearchFqShortTermSuspensionsMultiRacialMale(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsMultiRacialTotal(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsMultiRacialPercent(siteRequest_, o);
		case "shortTermSuspensionsMultiRacialRate":
			return ReportCard.staticSearchFqShortTermSuspensionsMultiRacialRate(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsPacificIslanderFemale(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderMale":
			return ReportCard.staticSearchFqShortTermSuspensionsPacificIslanderMale(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsPacificIslanderTotal(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderPercent":
			return ReportCard.staticSearchFqShortTermSuspensionsPacificIslanderPercent(siteRequest_, o);
		case "shortTermSuspensionsPacificIslanderRate":
			return ReportCard.staticSearchFqShortTermSuspensionsPacificIslanderRate(siteRequest_, o);
		case "shortTermSuspensionsWhiteFemale":
			return ReportCard.staticSearchFqShortTermSuspensionsWhiteFemale(siteRequest_, o);
		case "shortTermSuspensionsWhiteMale":
			return ReportCard.staticSearchFqShortTermSuspensionsWhiteMale(siteRequest_, o);
		case "shortTermSuspensionsWhiteTotal":
			return ReportCard.staticSearchFqShortTermSuspensionsWhiteTotal(siteRequest_, o);
		case "shortTermSuspensionsWhitePercent":
			return ReportCard.staticSearchFqShortTermSuspensionsWhitePercent(siteRequest_, o);
		case "shortTermSuspensionsWhiteRate":
			return ReportCard.staticSearchFqShortTermSuspensionsWhiteRate(siteRequest_, o);
		case "shortTermSuspensionsAllRate":
			return ReportCard.staticSearchFqShortTermSuspensionsAllRate(siteRequest_, o);
		case "shortTermSuspensionsBlackVsWhite":
			return ReportCard.staticSearchFqShortTermSuspensionsBlackVsWhite(siteRequest_, o);
		case "examsCollegeReadyGrades38OverallPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38OverallPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38IndigenousPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38IndigenousPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38AsianPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38AsianPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38BlackPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38BlackPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38LatinxPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38LatinxPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38MultiRacialPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38MultiRacialPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38PacificIslanderPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38PacificIslanderPercent(siteRequest_, o);
		case "examsCollegeReadyGrades38WhitePercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38WhitePercent(siteRequest_, o);
		case "examsCollegeReadyGrades912OverallPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912OverallPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912IndigenousPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912IndigenousPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912AsianPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912AsianPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912BlackPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912BlackPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912LatinxPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912LatinxPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912MultiRacialPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912MultiRacialPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912PacificIslanderPercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912PacificIslanderPercent(siteRequest_, o);
		case "examsCollegeReadyGrades912WhitePercent":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades912WhitePercent(siteRequest_, o);
		case "graduateWithin4YearsOverallPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsOverallPercent(siteRequest_, o);
		case "graduateWithin4YearsIndigenousPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsIndigenousPercent(siteRequest_, o);
		case "graduateWithin4YearsAsianPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsAsianPercent(siteRequest_, o);
		case "graduateWithin4YearsBlackPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsBlackPercent(siteRequest_, o);
		case "graduateWithin4YearsLatinxPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsLatinxPercent(siteRequest_, o);
		case "graduateWithin4YearsMultiRacialPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsMultiRacialPercent(siteRequest_, o);
		case "graduateWithin4YearsPacificIslanderPercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsPacificIslanderPercent(siteRequest_, o);
		case "graduateWithin4YearsWhitePercent":
			return ReportCard.staticSearchFqGraduateWithin4YearsWhitePercent(siteRequest_, o);
		case "examsCollegeReadyGrades38BlackVsWhite":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38BlackVsWhite(siteRequest_, o);
		case "examsCollegeReadyGrades38LatinxVsWhite":
			return ReportCard.staticSearchFqExamsCollegeReadyGrades38LatinxVsWhite(siteRequest_, o);
		case "reportCardCompleteName":
			return ReportCard.staticSearchFqReportCardCompleteName(siteRequest_, o);
		case "reportCardNumber_":
			return ReportCard.staticSearchFqReportCardNumber_(siteRequest_, o);
		case "agencyDemographicsGraph":
			return ReportCard.staticSearchFqAgencyDemographicsGraph(siteRequest_, o);
		case "agencyStudentsByRaceGraph":
			return ReportCard.staticSearchFqAgencyStudentsByRaceGraph(siteRequest_, o);
		case "agencyTeachersByRaceGraph":
			return ReportCard.staticSearchFqAgencyTeachersByRaceGraph(siteRequest_, o);
		case "agencyGrades3To8Graph":
			return ReportCard.staticSearchFqAgencyGrades3To8Graph(siteRequest_, o);
		case "agencyGrades9To12Graph":
			return ReportCard.staticSearchFqAgencyGrades9To12Graph(siteRequest_, o);
		case "agencyGraduatesWithin4YearsGraph":
			return ReportCard.staticSearchFqAgencyGraduatesWithin4YearsGraph(siteRequest_, o);
		case "suspensionsByRaceGraph":
			return ReportCard.staticSearchFqSuspensionsByRaceGraph(siteRequest_, o);
		case "suspensionRatesByRaceGraph":
			return ReportCard.staticSearchFqSuspensionRatesByRaceGraph(siteRequest_, o);
		case "countySchoolBasedComplaintsGraph":
			return ReportCard.staticSearchFqCountySchoolBasedComplaintsGraph(siteRequest_, o);
		case "schoolBasedComplaintsGraph":
			return ReportCard.staticSearchFqSchoolBasedComplaintsGraph(siteRequest_, o);
		case "agencyStudentsByRaceGraph2":
			return ReportCard.staticSearchFqAgencyStudentsByRaceGraph2(siteRequest_, o);
		case "reportCardImage":
			return ReportCard.staticSearchFqReportCardImage(siteRequest_, o);
			default:
				return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistReportCard(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistReportCard(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateReportCard(doc);
	}
	public void populateReportCard(SolrResponse.Doc doc) {
		ReportCard oReportCard = (ReportCard)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("reportCardKey")) {
				Long reportCardKey = (Long)doc.get("reportCardKey_indexedstored_long");
				if(reportCardKey != null)
					oReportCard.setReportCardKey(reportCardKey);
			}

			if(saves.contains("reportCardStartYear")) {
				Integer reportCardStartYear = (Integer)doc.get("reportCardStartYear_indexedstored_int");
				if(reportCardStartYear != null)
					oReportCard.setReportCardStartYear(reportCardStartYear);
			}

			if(saves.contains("reportCardEndYear")) {
				Integer reportCardEndYear = (Integer)doc.get("reportCardEndYear_indexedstored_int");
				if(reportCardEndYear != null)
					oReportCard.setReportCardEndYear(reportCardEndYear);
			}

			if(saves.contains("reportCardYearsStr")) {
				String reportCardYearsStr = (String)doc.get("reportCardYearsStr_indexedstored_string");
				if(reportCardYearsStr != null)
					oReportCard.setReportCardYearsStr(reportCardYearsStr);
			}

			if(saves.contains("agencyKey")) {
				Long agencyKey = (Long)doc.get("agencyKey_indexedstored_long");
				if(agencyKey != null)
					oReportCard.setAgencyKey(agencyKey);
			}

			if(saves.contains("imageLeft")) {
				Integer imageLeft = (Integer)doc.get("imageLeft_indexedstored_int");
				if(imageLeft != null)
					oReportCard.setImageLeft(imageLeft);
			}

			if(saves.contains("imageTop")) {
				Integer imageTop = (Integer)doc.get("imageTop_indexedstored_int");
				if(imageTop != null)
					oReportCard.setImageTop(imageTop);
			}

			if(saves.contains("stateKey")) {
				Long stateKey = (Long)doc.get("stateKey_indexedstored_long");
				if(stateKey != null)
					oReportCard.setStateKey(stateKey);
			}

			if(saves.contains("stateId")) {
				String stateId = (String)doc.get("stateId_indexedstored_string");
				if(stateId != null)
					oReportCard.setStateId(stateId);
			}

			if(saves.contains("agencyId")) {
				String agencyId = (String)doc.get("agencyId_indexedstored_string");
				if(agencyId != null)
					oReportCard.setAgencyId(agencyId);
			}

			if(saves.contains("stateName")) {
				String stateName = (String)doc.get("stateName_indexedstored_string");
				if(stateName != null)
					oReportCard.setStateName(stateName);
			}

			if(saves.contains("stateAbbreviation")) {
				String stateAbbreviation = (String)doc.get("stateAbbreviation_indexedstored_string");
				if(stateAbbreviation != null)
					oReportCard.setStateAbbreviation(stateAbbreviation);
			}

			if(saves.contains("agencyOnlyName")) {
				String agencyOnlyName = (String)doc.get("agencyOnlyName_indexedstored_string");
				if(agencyOnlyName != null)
					oReportCard.setAgencyOnlyName(agencyOnlyName);
			}

			if(saves.contains("agencyName")) {
				String agencyName = (String)doc.get("agencyName_indexedstored_string");
				if(agencyName != null)
					oReportCard.setAgencyName(agencyName);
			}

			if(saves.contains("agencyIsState")) {
				Boolean agencyIsState = (Boolean)doc.get("agencyIsState_indexedstored_boolean");
				if(agencyIsState != null)
					oReportCard.setAgencyIsState(agencyIsState);
			}

			if(saves.contains("agencyCoords")) {
				String agencyCoords = (String)doc.get("agencyCoords_stored_string");
				if(agencyCoords != null)
					oReportCard.setAgencyCoords(agencyCoords);
			}

			if(saves.contains("agencyLeft")) {
				Integer agencyLeft = (Integer)doc.get("agencyLeft_stored_int");
				if(agencyLeft != null)
					oReportCard.setAgencyLeft(agencyLeft);
			}

			if(saves.contains("pupilsTotal")) {
				Long pupilsTotal = (Long)doc.get("pupilsTotal_indexedstored_long");
				if(pupilsTotal != null)
					oReportCard.setPupilsTotal(pupilsTotal);
			}

			if(saves.contains("pupilsIndigenousFemale")) {
				Long pupilsIndigenousFemale = (Long)doc.get("pupilsIndigenousFemale_indexedstored_long");
				if(pupilsIndigenousFemale != null)
					oReportCard.setPupilsIndigenousFemale(pupilsIndigenousFemale);
			}

			if(saves.contains("pupilsIndigenousMale")) {
				Long pupilsIndigenousMale = (Long)doc.get("pupilsIndigenousMale_indexedstored_long");
				if(pupilsIndigenousMale != null)
					oReportCard.setPupilsIndigenousMale(pupilsIndigenousMale);
			}

			if(saves.contains("pupilsIndigenousTotal")) {
				Long pupilsIndigenousTotal = (Long)doc.get("pupilsIndigenousTotal_indexedstored_long");
				if(pupilsIndigenousTotal != null)
					oReportCard.setPupilsIndigenousTotal(pupilsIndigenousTotal);
			}

			if(saves.contains("pupilsIndigenousPercent")) {
				Double pupilsIndigenousPercent = (Double)doc.get("pupilsIndigenousPercent_indexedstored_double");
				if(pupilsIndigenousPercent != null)
					oReportCard.setPupilsIndigenousPercent(pupilsIndigenousPercent);
			}

			if(saves.contains("pupilsAsianFemale")) {
				Long pupilsAsianFemale = (Long)doc.get("pupilsAsianFemale_indexedstored_long");
				if(pupilsAsianFemale != null)
					oReportCard.setPupilsAsianFemale(pupilsAsianFemale);
			}

			if(saves.contains("pupilsAsianMale")) {
				Long pupilsAsianMale = (Long)doc.get("pupilsAsianMale_indexedstored_long");
				if(pupilsAsianMale != null)
					oReportCard.setPupilsAsianMale(pupilsAsianMale);
			}

			if(saves.contains("pupilsAsianTotal")) {
				Long pupilsAsianTotal = (Long)doc.get("pupilsAsianTotal_indexedstored_long");
				if(pupilsAsianTotal != null)
					oReportCard.setPupilsAsianTotal(pupilsAsianTotal);
			}

			if(saves.contains("pupilsAsianPercent")) {
				Double pupilsAsianPercent = (Double)doc.get("pupilsAsianPercent_indexedstored_double");
				if(pupilsAsianPercent != null)
					oReportCard.setPupilsAsianPercent(pupilsAsianPercent);
			}

			if(saves.contains("pupilsLatinxFemale")) {
				Long pupilsLatinxFemale = (Long)doc.get("pupilsLatinxFemale_indexedstored_long");
				if(pupilsLatinxFemale != null)
					oReportCard.setPupilsLatinxFemale(pupilsLatinxFemale);
			}

			if(saves.contains("pupilsLatinxMale")) {
				Long pupilsLatinxMale = (Long)doc.get("pupilsLatinxMale_indexedstored_long");
				if(pupilsLatinxMale != null)
					oReportCard.setPupilsLatinxMale(pupilsLatinxMale);
			}

			if(saves.contains("pupilsLatinxTotal")) {
				Long pupilsLatinxTotal = (Long)doc.get("pupilsLatinxTotal_indexedstored_long");
				if(pupilsLatinxTotal != null)
					oReportCard.setPupilsLatinxTotal(pupilsLatinxTotal);
			}

			if(saves.contains("pupilsLatinxPercent")) {
				Double pupilsLatinxPercent = (Double)doc.get("pupilsLatinxPercent_indexedstored_double");
				if(pupilsLatinxPercent != null)
					oReportCard.setPupilsLatinxPercent(pupilsLatinxPercent);
			}

			if(saves.contains("pupilsBlackFemale")) {
				Long pupilsBlackFemale = (Long)doc.get("pupilsBlackFemale_indexedstored_long");
				if(pupilsBlackFemale != null)
					oReportCard.setPupilsBlackFemale(pupilsBlackFemale);
			}

			if(saves.contains("pupilsBlackMale")) {
				Long pupilsBlackMale = (Long)doc.get("pupilsBlackMale_indexedstored_long");
				if(pupilsBlackMale != null)
					oReportCard.setPupilsBlackMale(pupilsBlackMale);
			}

			if(saves.contains("pupilsBlackTotal")) {
				Long pupilsBlackTotal = (Long)doc.get("pupilsBlackTotal_indexedstored_long");
				if(pupilsBlackTotal != null)
					oReportCard.setPupilsBlackTotal(pupilsBlackTotal);
			}

			if(saves.contains("pupilsBlackPercent")) {
				Double pupilsBlackPercent = (Double)doc.get("pupilsBlackPercent_indexedstored_double");
				if(pupilsBlackPercent != null)
					oReportCard.setPupilsBlackPercent(pupilsBlackPercent);
			}

			if(saves.contains("pupilsWhiteFemale")) {
				Long pupilsWhiteFemale = (Long)doc.get("pupilsWhiteFemale_indexedstored_long");
				if(pupilsWhiteFemale != null)
					oReportCard.setPupilsWhiteFemale(pupilsWhiteFemale);
			}

			if(saves.contains("pupilsWhiteMale")) {
				Long pupilsWhiteMale = (Long)doc.get("pupilsWhiteMale_indexedstored_long");
				if(pupilsWhiteMale != null)
					oReportCard.setPupilsWhiteMale(pupilsWhiteMale);
			}

			if(saves.contains("pupilsWhiteTotal")) {
				Long pupilsWhiteTotal = (Long)doc.get("pupilsWhiteTotal_indexedstored_long");
				if(pupilsWhiteTotal != null)
					oReportCard.setPupilsWhiteTotal(pupilsWhiteTotal);
			}

			if(saves.contains("pupilsWhitePercent")) {
				Double pupilsWhitePercent = (Double)doc.get("pupilsWhitePercent_indexedstored_double");
				if(pupilsWhitePercent != null)
					oReportCard.setPupilsWhitePercent(pupilsWhitePercent);
			}

			if(saves.contains("pupilsPacificIslanderFemale")) {
				Long pupilsPacificIslanderFemale = (Long)doc.get("pupilsPacificIslanderFemale_indexedstored_long");
				if(pupilsPacificIslanderFemale != null)
					oReportCard.setPupilsPacificIslanderFemale(pupilsPacificIslanderFemale);
			}

			if(saves.contains("pupilsPacificIslanderMale")) {
				Long pupilsPacificIslanderMale = (Long)doc.get("pupilsPacificIslanderMale_indexedstored_long");
				if(pupilsPacificIslanderMale != null)
					oReportCard.setPupilsPacificIslanderMale(pupilsPacificIslanderMale);
			}

			if(saves.contains("pupilsPacificIslanderTotal")) {
				Long pupilsPacificIslanderTotal = (Long)doc.get("pupilsPacificIslanderTotal_indexedstored_long");
				if(pupilsPacificIslanderTotal != null)
					oReportCard.setPupilsPacificIslanderTotal(pupilsPacificIslanderTotal);
			}

			if(saves.contains("pupilsPacificIslanderPercent")) {
				Double pupilsPacificIslanderPercent = (Double)doc.get("pupilsPacificIslanderPercent_indexedstored_double");
				if(pupilsPacificIslanderPercent != null)
					oReportCard.setPupilsPacificIslanderPercent(pupilsPacificIslanderPercent);
			}

			if(saves.contains("pupilsMultiRacialFemale")) {
				Long pupilsMultiRacialFemale = (Long)doc.get("pupilsMultiRacialFemale_indexedstored_long");
				if(pupilsMultiRacialFemale != null)
					oReportCard.setPupilsMultiRacialFemale(pupilsMultiRacialFemale);
			}

			if(saves.contains("pupilsMultiRacialMale")) {
				Long pupilsMultiRacialMale = (Long)doc.get("pupilsMultiRacialMale_indexedstored_long");
				if(pupilsMultiRacialMale != null)
					oReportCard.setPupilsMultiRacialMale(pupilsMultiRacialMale);
			}

			if(saves.contains("pupilsMultiRacialTotal")) {
				Long pupilsMultiRacialTotal = (Long)doc.get("pupilsMultiRacialTotal_indexedstored_long");
				if(pupilsMultiRacialTotal != null)
					oReportCard.setPupilsMultiRacialTotal(pupilsMultiRacialTotal);
			}

			if(saves.contains("pupilsMultiRacialPercent")) {
				Double pupilsMultiRacialPercent = (Double)doc.get("pupilsMultiRacialPercent_indexedstored_double");
				if(pupilsMultiRacialPercent != null)
					oReportCard.setPupilsMultiRacialPercent(pupilsMultiRacialPercent);
			}

			if(saves.contains("pupilsOtherPercent")) {
				Double pupilsOtherPercent = (Double)doc.get("pupilsOtherPercent_indexedstored_double");
				if(pupilsOtherPercent != null)
					oReportCard.setPupilsOtherPercent(pupilsOtherPercent);
			}

			if(saves.contains("teachersMale")) {
				Long teachersMale = (Long)doc.get("teachersMale_indexedstored_long");
				if(teachersMale != null)
					oReportCard.setTeachersMale(teachersMale);
			}

			if(saves.contains("teachersFemale")) {
				Long teachersFemale = (Long)doc.get("teachersFemale_indexedstored_long");
				if(teachersFemale != null)
					oReportCard.setTeachersFemale(teachersFemale);
			}

			if(saves.contains("teachersTotal")) {
				Long teachersTotal = (Long)doc.get("teachersTotal_indexedstored_long");
				if(teachersTotal != null)
					oReportCard.setTeachersTotal(teachersTotal);
			}

			if(saves.contains("teachersWhiteTotal")) {
				Long teachersWhiteTotal = (Long)doc.get("teachersWhiteTotal_indexedstored_long");
				if(teachersWhiteTotal != null)
					oReportCard.setTeachersWhiteTotal(teachersWhiteTotal);
			}

			if(saves.contains("teachersWhitePercent")) {
				Double teachersWhitePercent = (Double)doc.get("teachersWhitePercent_indexedstored_double");
				if(teachersWhitePercent != null)
					oReportCard.setTeachersWhitePercent(teachersWhitePercent);
			}

			if(saves.contains("teachersBlackTotal")) {
				Long teachersBlackTotal = (Long)doc.get("teachersBlackTotal_indexedstored_long");
				if(teachersBlackTotal != null)
					oReportCard.setTeachersBlackTotal(teachersBlackTotal);
			}

			if(saves.contains("teachersBlackPercent")) {
				Double teachersBlackPercent = (Double)doc.get("teachersBlackPercent_indexedstored_double");
				if(teachersBlackPercent != null)
					oReportCard.setTeachersBlackPercent(teachersBlackPercent);
			}

			if(saves.contains("teachersOtherTotal")) {
				Long teachersOtherTotal = (Long)doc.get("teachersOtherTotal_indexedstored_long");
				if(teachersOtherTotal != null)
					oReportCard.setTeachersOtherTotal(teachersOtherTotal);
			}

			if(saves.contains("teachersOtherPercent")) {
				Double teachersOtherPercent = (Double)doc.get("teachersOtherPercent_indexedstored_double");
				if(teachersOtherPercent != null)
					oReportCard.setTeachersOtherPercent(teachersOtherPercent);
			}

			if(saves.contains("delinquentComplaintsTotal")) {
				Long delinquentComplaintsTotal = (Long)doc.get("delinquentComplaintsTotal_indexedstored_long");
				if(delinquentComplaintsTotal != null)
					oReportCard.setDelinquentComplaintsTotal(delinquentComplaintsTotal);
			}

			if(saves.contains("delinquentComplaintsAtSchool")) {
				Long delinquentComplaintsAtSchool = (Long)doc.get("delinquentComplaintsAtSchool_indexedstored_long");
				if(delinquentComplaintsAtSchool != null)
					oReportCard.setDelinquentComplaintsAtSchool(delinquentComplaintsAtSchool);
			}

			if(saves.contains("delinquentComplaintsAtSchoolPercent")) {
				Double delinquentComplaintsAtSchoolPercent = (Double)doc.get("delinquentComplaintsAtSchoolPercent_indexedstored_double");
				if(delinquentComplaintsAtSchoolPercent != null)
					oReportCard.setDelinquentComplaintsAtSchoolPercent(delinquentComplaintsAtSchoolPercent);
			}

			if(saves.contains("delinquentComplaintsAsian")) {
				Long delinquentComplaintsAsian = (Long)doc.get("delinquentComplaintsAsian_indexedstored_long");
				if(delinquentComplaintsAsian != null)
					oReportCard.setDelinquentComplaintsAsian(delinquentComplaintsAsian);
			}

			if(saves.contains("delinquentComplaintsAsianPercent")) {
				Double delinquentComplaintsAsianPercent = (Double)doc.get("delinquentComplaintsAsianPercent_indexedstored_double");
				if(delinquentComplaintsAsianPercent != null)
					oReportCard.setDelinquentComplaintsAsianPercent(delinquentComplaintsAsianPercent);
			}

			if(saves.contains("delinquentComplaintsBlack")) {
				Long delinquentComplaintsBlack = (Long)doc.get("delinquentComplaintsBlack_indexedstored_long");
				if(delinquentComplaintsBlack != null)
					oReportCard.setDelinquentComplaintsBlack(delinquentComplaintsBlack);
			}

			if(saves.contains("delinquentComplaintsBlackPercent")) {
				Double delinquentComplaintsBlackPercent = (Double)doc.get("delinquentComplaintsBlackPercent_indexedstored_double");
				if(delinquentComplaintsBlackPercent != null)
					oReportCard.setDelinquentComplaintsBlackPercent(delinquentComplaintsBlackPercent);
			}

			if(saves.contains("delinquentComplaintsLatinx")) {
				Long delinquentComplaintsLatinx = (Long)doc.get("delinquentComplaintsLatinx_indexedstored_long");
				if(delinquentComplaintsLatinx != null)
					oReportCard.setDelinquentComplaintsLatinx(delinquentComplaintsLatinx);
			}

			if(saves.contains("delinquentComplaintsLatinxPercent")) {
				Double delinquentComplaintsLatinxPercent = (Double)doc.get("delinquentComplaintsLatinxPercent_indexedstored_double");
				if(delinquentComplaintsLatinxPercent != null)
					oReportCard.setDelinquentComplaintsLatinxPercent(delinquentComplaintsLatinxPercent);
			}

			if(saves.contains("delinquentComplaintsMultiRacial")) {
				Long delinquentComplaintsMultiRacial = (Long)doc.get("delinquentComplaintsMultiRacial_indexedstored_long");
				if(delinquentComplaintsMultiRacial != null)
					oReportCard.setDelinquentComplaintsMultiRacial(delinquentComplaintsMultiRacial);
			}

			if(saves.contains("delinquentComplaintsMultiRacialPercent")) {
				Double delinquentComplaintsMultiRacialPercent = (Double)doc.get("delinquentComplaintsMultiRacialPercent_indexedstored_double");
				if(delinquentComplaintsMultiRacialPercent != null)
					oReportCard.setDelinquentComplaintsMultiRacialPercent(delinquentComplaintsMultiRacialPercent);
			}

			if(saves.contains("delinquentComplaintsIndigenous")) {
				Long delinquentComplaintsIndigenous = (Long)doc.get("delinquentComplaintsIndigenous_indexedstored_long");
				if(delinquentComplaintsIndigenous != null)
					oReportCard.setDelinquentComplaintsIndigenous(delinquentComplaintsIndigenous);
			}

			if(saves.contains("delinquentComplaintsIndigenousPercent")) {
				Double delinquentComplaintsIndigenousPercent = (Double)doc.get("delinquentComplaintsIndigenousPercent_indexedstored_double");
				if(delinquentComplaintsIndigenousPercent != null)
					oReportCard.setDelinquentComplaintsIndigenousPercent(delinquentComplaintsIndigenousPercent);
			}

			if(saves.contains("delinquentComplaintsWhite")) {
				Long delinquentComplaintsWhite = (Long)doc.get("delinquentComplaintsWhite_indexedstored_long");
				if(delinquentComplaintsWhite != null)
					oReportCard.setDelinquentComplaintsWhite(delinquentComplaintsWhite);
			}

			if(saves.contains("delinquentComplaintsWhitePercent")) {
				Double delinquentComplaintsWhitePercent = (Double)doc.get("delinquentComplaintsWhitePercent_indexedstored_double");
				if(delinquentComplaintsWhitePercent != null)
					oReportCard.setDelinquentComplaintsWhitePercent(delinquentComplaintsWhitePercent);
			}

			if(saves.contains("delinquentComplaintsPacificIslander")) {
				Long delinquentComplaintsPacificIslander = (Long)doc.get("delinquentComplaintsPacificIslander_indexedstored_long");
				if(delinquentComplaintsPacificIslander != null)
					oReportCard.setDelinquentComplaintsPacificIslander(delinquentComplaintsPacificIslander);
			}

			if(saves.contains("delinquentComplaintsPacificIslanderPercent")) {
				Double delinquentComplaintsPacificIslanderPercent = (Double)doc.get("delinquentComplaintsPacificIslanderPercent_indexedstored_double");
				if(delinquentComplaintsPacificIslanderPercent != null)
					oReportCard.setDelinquentComplaintsPacificIslanderPercent(delinquentComplaintsPacificIslanderPercent);
			}

			if(saves.contains("shortTermSuspensionRate")) {
				Long shortTermSuspensionRate = (Long)doc.get("shortTermSuspensionRate_indexedstored_long");
				if(shortTermSuspensionRate != null)
					oReportCard.setShortTermSuspensionRate(shortTermSuspensionRate);
			}

			if(saves.contains("shortTermSuspensionsTotal")) {
				Long shortTermSuspensionsTotal = (Long)doc.get("shortTermSuspensionsTotal_indexedstored_long");
				if(shortTermSuspensionsTotal != null)
					oReportCard.setShortTermSuspensionsTotal(shortTermSuspensionsTotal);
			}

			if(saves.contains("longTermSuspensionsTotal")) {
				Long longTermSuspensionsTotal = (Long)doc.get("longTermSuspensionsTotal_indexedstored_long");
				if(longTermSuspensionsTotal != null)
					oReportCard.setLongTermSuspensionsTotal(longTermSuspensionsTotal);
			}

			if(saves.contains("expulsionsTotal")) {
				Long expulsionsTotal = (Long)doc.get("expulsionsTotal_indexedstored_long");
				if(expulsionsTotal != null)
					oReportCard.setExpulsionsTotal(expulsionsTotal);
			}

			if(saves.contains("shortTermSuspensionsAsianFemale")) {
				Long shortTermSuspensionsAsianFemale = (Long)doc.get("shortTermSuspensionsAsianFemale_indexedstored_long");
				if(shortTermSuspensionsAsianFemale != null)
					oReportCard.setShortTermSuspensionsAsianFemale(shortTermSuspensionsAsianFemale);
			}

			if(saves.contains("shortTermSuspensionsAsianMale")) {
				Long shortTermSuspensionsAsianMale = (Long)doc.get("shortTermSuspensionsAsianMale_indexedstored_long");
				if(shortTermSuspensionsAsianMale != null)
					oReportCard.setShortTermSuspensionsAsianMale(shortTermSuspensionsAsianMale);
			}

			if(saves.contains("shortTermSuspensionsAsianTotal")) {
				Long shortTermSuspensionsAsianTotal = (Long)doc.get("shortTermSuspensionsAsianTotal_indexedstored_long");
				if(shortTermSuspensionsAsianTotal != null)
					oReportCard.setShortTermSuspensionsAsianTotal(shortTermSuspensionsAsianTotal);
			}

			if(saves.contains("shortTermSuspensionsAsianPercent")) {
				Double shortTermSuspensionsAsianPercent = (Double)doc.get("shortTermSuspensionsAsianPercent_indexedstored_double");
				if(shortTermSuspensionsAsianPercent != null)
					oReportCard.setShortTermSuspensionsAsianPercent(shortTermSuspensionsAsianPercent);
			}

			if(saves.contains("shortTermSuspensionsAsianRate")) {
				Double shortTermSuspensionsAsianRate = (Double)doc.get("shortTermSuspensionsAsianRate_indexedstored_double");
				if(shortTermSuspensionsAsianRate != null)
					oReportCard.setShortTermSuspensionsAsianRate(shortTermSuspensionsAsianRate);
			}

			if(saves.contains("shortTermSuspensionsBlackFemale")) {
				Long shortTermSuspensionsBlackFemale = (Long)doc.get("shortTermSuspensionsBlackFemale_indexedstored_long");
				if(shortTermSuspensionsBlackFemale != null)
					oReportCard.setShortTermSuspensionsBlackFemale(shortTermSuspensionsBlackFemale);
			}

			if(saves.contains("shortTermSuspensionsBlackMale")) {
				Long shortTermSuspensionsBlackMale = (Long)doc.get("shortTermSuspensionsBlackMale_indexedstored_long");
				if(shortTermSuspensionsBlackMale != null)
					oReportCard.setShortTermSuspensionsBlackMale(shortTermSuspensionsBlackMale);
			}

			if(saves.contains("shortTermSuspensionsBlackTotal")) {
				Long shortTermSuspensionsBlackTotal = (Long)doc.get("shortTermSuspensionsBlackTotal_indexedstored_long");
				if(shortTermSuspensionsBlackTotal != null)
					oReportCard.setShortTermSuspensionsBlackTotal(shortTermSuspensionsBlackTotal);
			}

			if(saves.contains("shortTermSuspensionsBlackPercent")) {
				Double shortTermSuspensionsBlackPercent = (Double)doc.get("shortTermSuspensionsBlackPercent_indexedstored_double");
				if(shortTermSuspensionsBlackPercent != null)
					oReportCard.setShortTermSuspensionsBlackPercent(shortTermSuspensionsBlackPercent);
			}

			if(saves.contains("shortTermSuspensionsBlackRate")) {
				Double shortTermSuspensionsBlackRate = (Double)doc.get("shortTermSuspensionsBlackRate_indexedstored_double");
				if(shortTermSuspensionsBlackRate != null)
					oReportCard.setShortTermSuspensionsBlackRate(shortTermSuspensionsBlackRate);
			}

			if(saves.contains("shortTermSuspensionsLatinxFemale")) {
				Long shortTermSuspensionsLatinxFemale = (Long)doc.get("shortTermSuspensionsLatinxFemale_indexedstored_long");
				if(shortTermSuspensionsLatinxFemale != null)
					oReportCard.setShortTermSuspensionsLatinxFemale(shortTermSuspensionsLatinxFemale);
			}

			if(saves.contains("shortTermSuspensionsLatinxMale")) {
				Long shortTermSuspensionsLatinxMale = (Long)doc.get("shortTermSuspensionsLatinxMale_indexedstored_long");
				if(shortTermSuspensionsLatinxMale != null)
					oReportCard.setShortTermSuspensionsLatinxMale(shortTermSuspensionsLatinxMale);
			}

			if(saves.contains("shortTermSuspensionsLatinxTotal")) {
				Long shortTermSuspensionsLatinxTotal = (Long)doc.get("shortTermSuspensionsLatinxTotal_indexedstored_long");
				if(shortTermSuspensionsLatinxTotal != null)
					oReportCard.setShortTermSuspensionsLatinxTotal(shortTermSuspensionsLatinxTotal);
			}

			if(saves.contains("shortTermSuspensionsLatinxPercent")) {
				Double shortTermSuspensionsLatinxPercent = (Double)doc.get("shortTermSuspensionsLatinxPercent_indexedstored_double");
				if(shortTermSuspensionsLatinxPercent != null)
					oReportCard.setShortTermSuspensionsLatinxPercent(shortTermSuspensionsLatinxPercent);
			}

			if(saves.contains("shortTermSuspensionsLatinxRate")) {
				Double shortTermSuspensionsLatinxRate = (Double)doc.get("shortTermSuspensionsLatinxRate_indexedstored_double");
				if(shortTermSuspensionsLatinxRate != null)
					oReportCard.setShortTermSuspensionsLatinxRate(shortTermSuspensionsLatinxRate);
			}

			if(saves.contains("shortTermSuspensionsIndigenousFemale")) {
				Long shortTermSuspensionsIndigenousFemale = (Long)doc.get("shortTermSuspensionsIndigenousFemale_indexedstored_long");
				if(shortTermSuspensionsIndigenousFemale != null)
					oReportCard.setShortTermSuspensionsIndigenousFemale(shortTermSuspensionsIndigenousFemale);
			}

			if(saves.contains("shortTermSuspensionsIndigenousMale")) {
				Long shortTermSuspensionsIndigenousMale = (Long)doc.get("shortTermSuspensionsIndigenousMale_indexedstored_long");
				if(shortTermSuspensionsIndigenousMale != null)
					oReportCard.setShortTermSuspensionsIndigenousMale(shortTermSuspensionsIndigenousMale);
			}

			if(saves.contains("shortTermSuspensionsIndigenousTotal")) {
				Long shortTermSuspensionsIndigenousTotal = (Long)doc.get("shortTermSuspensionsIndigenousTotal_indexedstored_long");
				if(shortTermSuspensionsIndigenousTotal != null)
					oReportCard.setShortTermSuspensionsIndigenousTotal(shortTermSuspensionsIndigenousTotal);
			}

			if(saves.contains("shortTermSuspensionsIndigenousPercent")) {
				Double shortTermSuspensionsIndigenousPercent = (Double)doc.get("shortTermSuspensionsIndigenousPercent_indexedstored_double");
				if(shortTermSuspensionsIndigenousPercent != null)
					oReportCard.setShortTermSuspensionsIndigenousPercent(shortTermSuspensionsIndigenousPercent);
			}

			if(saves.contains("shortTermSuspensionsIndigenousRate")) {
				Double shortTermSuspensionsIndigenousRate = (Double)doc.get("shortTermSuspensionsIndigenousRate_indexedstored_double");
				if(shortTermSuspensionsIndigenousRate != null)
					oReportCard.setShortTermSuspensionsIndigenousRate(shortTermSuspensionsIndigenousRate);
			}

			if(saves.contains("shortTermSuspensionsMultiRacialFemale")) {
				Long shortTermSuspensionsMultiRacialFemale = (Long)doc.get("shortTermSuspensionsMultiRacialFemale_indexedstored_long");
				if(shortTermSuspensionsMultiRacialFemale != null)
					oReportCard.setShortTermSuspensionsMultiRacialFemale(shortTermSuspensionsMultiRacialFemale);
			}

			if(saves.contains("shortTermSuspensionsMultiRacialMale")) {
				Long shortTermSuspensionsMultiRacialMale = (Long)doc.get("shortTermSuspensionsMultiRacialMale_indexedstored_long");
				if(shortTermSuspensionsMultiRacialMale != null)
					oReportCard.setShortTermSuspensionsMultiRacialMale(shortTermSuspensionsMultiRacialMale);
			}

			if(saves.contains("shortTermSuspensionsMultiRacialTotal")) {
				Long shortTermSuspensionsMultiRacialTotal = (Long)doc.get("shortTermSuspensionsMultiRacialTotal_indexedstored_long");
				if(shortTermSuspensionsMultiRacialTotal != null)
					oReportCard.setShortTermSuspensionsMultiRacialTotal(shortTermSuspensionsMultiRacialTotal);
			}

			if(saves.contains("shortTermSuspensionsMultiRacialPercent")) {
				Double shortTermSuspensionsMultiRacialPercent = (Double)doc.get("shortTermSuspensionsMultiRacialPercent_indexedstored_double");
				if(shortTermSuspensionsMultiRacialPercent != null)
					oReportCard.setShortTermSuspensionsMultiRacialPercent(shortTermSuspensionsMultiRacialPercent);
			}

			if(saves.contains("shortTermSuspensionsMultiRacialRate")) {
				Double shortTermSuspensionsMultiRacialRate = (Double)doc.get("shortTermSuspensionsMultiRacialRate_indexedstored_double");
				if(shortTermSuspensionsMultiRacialRate != null)
					oReportCard.setShortTermSuspensionsMultiRacialRate(shortTermSuspensionsMultiRacialRate);
			}

			if(saves.contains("shortTermSuspensionsPacificIslanderFemale")) {
				Long shortTermSuspensionsPacificIslanderFemale = (Long)doc.get("shortTermSuspensionsPacificIslanderFemale_indexedstored_long");
				if(shortTermSuspensionsPacificIslanderFemale != null)
					oReportCard.setShortTermSuspensionsPacificIslanderFemale(shortTermSuspensionsPacificIslanderFemale);
			}

			if(saves.contains("shortTermSuspensionsPacificIslanderMale")) {
				Long shortTermSuspensionsPacificIslanderMale = (Long)doc.get("shortTermSuspensionsPacificIslanderMale_indexedstored_long");
				if(shortTermSuspensionsPacificIslanderMale != null)
					oReportCard.setShortTermSuspensionsPacificIslanderMale(shortTermSuspensionsPacificIslanderMale);
			}

			if(saves.contains("shortTermSuspensionsPacificIslanderTotal")) {
				Long shortTermSuspensionsPacificIslanderTotal = (Long)doc.get("shortTermSuspensionsPacificIslanderTotal_indexedstored_long");
				if(shortTermSuspensionsPacificIslanderTotal != null)
					oReportCard.setShortTermSuspensionsPacificIslanderTotal(shortTermSuspensionsPacificIslanderTotal);
			}

			if(saves.contains("shortTermSuspensionsPacificIslanderPercent")) {
				Double shortTermSuspensionsPacificIslanderPercent = (Double)doc.get("shortTermSuspensionsPacificIslanderPercent_indexedstored_double");
				if(shortTermSuspensionsPacificIslanderPercent != null)
					oReportCard.setShortTermSuspensionsPacificIslanderPercent(shortTermSuspensionsPacificIslanderPercent);
			}

			if(saves.contains("shortTermSuspensionsPacificIslanderRate")) {
				Double shortTermSuspensionsPacificIslanderRate = (Double)doc.get("shortTermSuspensionsPacificIslanderRate_indexedstored_double");
				if(shortTermSuspensionsPacificIslanderRate != null)
					oReportCard.setShortTermSuspensionsPacificIslanderRate(shortTermSuspensionsPacificIslanderRate);
			}

			if(saves.contains("shortTermSuspensionsWhiteFemale")) {
				Long shortTermSuspensionsWhiteFemale = (Long)doc.get("shortTermSuspensionsWhiteFemale_indexedstored_long");
				if(shortTermSuspensionsWhiteFemale != null)
					oReportCard.setShortTermSuspensionsWhiteFemale(shortTermSuspensionsWhiteFemale);
			}

			if(saves.contains("shortTermSuspensionsWhiteMale")) {
				Long shortTermSuspensionsWhiteMale = (Long)doc.get("shortTermSuspensionsWhiteMale_indexedstored_long");
				if(shortTermSuspensionsWhiteMale != null)
					oReportCard.setShortTermSuspensionsWhiteMale(shortTermSuspensionsWhiteMale);
			}

			if(saves.contains("shortTermSuspensionsWhiteTotal")) {
				Long shortTermSuspensionsWhiteTotal = (Long)doc.get("shortTermSuspensionsWhiteTotal_indexedstored_long");
				if(shortTermSuspensionsWhiteTotal != null)
					oReportCard.setShortTermSuspensionsWhiteTotal(shortTermSuspensionsWhiteTotal);
			}

			if(saves.contains("shortTermSuspensionsWhitePercent")) {
				Double shortTermSuspensionsWhitePercent = (Double)doc.get("shortTermSuspensionsWhitePercent_indexedstored_double");
				if(shortTermSuspensionsWhitePercent != null)
					oReportCard.setShortTermSuspensionsWhitePercent(shortTermSuspensionsWhitePercent);
			}

			if(saves.contains("shortTermSuspensionsWhiteRate")) {
				Double shortTermSuspensionsWhiteRate = (Double)doc.get("shortTermSuspensionsWhiteRate_indexedstored_double");
				if(shortTermSuspensionsWhiteRate != null)
					oReportCard.setShortTermSuspensionsWhiteRate(shortTermSuspensionsWhiteRate);
			}

			if(saves.contains("shortTermSuspensionsAllRate")) {
				Double shortTermSuspensionsAllRate = (Double)doc.get("shortTermSuspensionsAllRate_indexedstored_double");
				if(shortTermSuspensionsAllRate != null)
					oReportCard.setShortTermSuspensionsAllRate(shortTermSuspensionsAllRate);
			}

			if(saves.contains("shortTermSuspensionsBlackVsWhite")) {
				Double shortTermSuspensionsBlackVsWhite = (Double)doc.get("shortTermSuspensionsBlackVsWhite_indexedstored_double");
				if(shortTermSuspensionsBlackVsWhite != null)
					oReportCard.setShortTermSuspensionsBlackVsWhite(shortTermSuspensionsBlackVsWhite);
			}

			if(saves.contains("examsCollegeReadyGrades38OverallPercent")) {
				Double examsCollegeReadyGrades38OverallPercent = (Double)doc.get("examsCollegeReadyGrades38OverallPercent_indexedstored_double");
				if(examsCollegeReadyGrades38OverallPercent != null)
					oReportCard.setExamsCollegeReadyGrades38OverallPercent(examsCollegeReadyGrades38OverallPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38IndigenousPercent")) {
				Double examsCollegeReadyGrades38IndigenousPercent = (Double)doc.get("examsCollegeReadyGrades38IndigenousPercent_indexedstored_double");
				if(examsCollegeReadyGrades38IndigenousPercent != null)
					oReportCard.setExamsCollegeReadyGrades38IndigenousPercent(examsCollegeReadyGrades38IndigenousPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38AsianPercent")) {
				Double examsCollegeReadyGrades38AsianPercent = (Double)doc.get("examsCollegeReadyGrades38AsianPercent_indexedstored_double");
				if(examsCollegeReadyGrades38AsianPercent != null)
					oReportCard.setExamsCollegeReadyGrades38AsianPercent(examsCollegeReadyGrades38AsianPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38BlackPercent")) {
				Double examsCollegeReadyGrades38BlackPercent = (Double)doc.get("examsCollegeReadyGrades38BlackPercent_indexedstored_double");
				if(examsCollegeReadyGrades38BlackPercent != null)
					oReportCard.setExamsCollegeReadyGrades38BlackPercent(examsCollegeReadyGrades38BlackPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38LatinxPercent")) {
				Double examsCollegeReadyGrades38LatinxPercent = (Double)doc.get("examsCollegeReadyGrades38LatinxPercent_indexedstored_double");
				if(examsCollegeReadyGrades38LatinxPercent != null)
					oReportCard.setExamsCollegeReadyGrades38LatinxPercent(examsCollegeReadyGrades38LatinxPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38MultiRacialPercent")) {
				Double examsCollegeReadyGrades38MultiRacialPercent = (Double)doc.get("examsCollegeReadyGrades38MultiRacialPercent_indexedstored_double");
				if(examsCollegeReadyGrades38MultiRacialPercent != null)
					oReportCard.setExamsCollegeReadyGrades38MultiRacialPercent(examsCollegeReadyGrades38MultiRacialPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38PacificIslanderPercent")) {
				Double examsCollegeReadyGrades38PacificIslanderPercent = (Double)doc.get("examsCollegeReadyGrades38PacificIslanderPercent_indexedstored_double");
				if(examsCollegeReadyGrades38PacificIslanderPercent != null)
					oReportCard.setExamsCollegeReadyGrades38PacificIslanderPercent(examsCollegeReadyGrades38PacificIslanderPercent);
			}

			if(saves.contains("examsCollegeReadyGrades38WhitePercent")) {
				Double examsCollegeReadyGrades38WhitePercent = (Double)doc.get("examsCollegeReadyGrades38WhitePercent_indexedstored_double");
				if(examsCollegeReadyGrades38WhitePercent != null)
					oReportCard.setExamsCollegeReadyGrades38WhitePercent(examsCollegeReadyGrades38WhitePercent);
			}

			if(saves.contains("examsCollegeReadyGrades912OverallPercent")) {
				Double examsCollegeReadyGrades912OverallPercent = (Double)doc.get("examsCollegeReadyGrades912OverallPercent_indexedstored_double");
				if(examsCollegeReadyGrades912OverallPercent != null)
					oReportCard.setExamsCollegeReadyGrades912OverallPercent(examsCollegeReadyGrades912OverallPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912IndigenousPercent")) {
				Double examsCollegeReadyGrades912IndigenousPercent = (Double)doc.get("examsCollegeReadyGrades912IndigenousPercent_indexedstored_double");
				if(examsCollegeReadyGrades912IndigenousPercent != null)
					oReportCard.setExamsCollegeReadyGrades912IndigenousPercent(examsCollegeReadyGrades912IndigenousPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912AsianPercent")) {
				Double examsCollegeReadyGrades912AsianPercent = (Double)doc.get("examsCollegeReadyGrades912AsianPercent_indexedstored_double");
				if(examsCollegeReadyGrades912AsianPercent != null)
					oReportCard.setExamsCollegeReadyGrades912AsianPercent(examsCollegeReadyGrades912AsianPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912BlackPercent")) {
				Double examsCollegeReadyGrades912BlackPercent = (Double)doc.get("examsCollegeReadyGrades912BlackPercent_indexedstored_double");
				if(examsCollegeReadyGrades912BlackPercent != null)
					oReportCard.setExamsCollegeReadyGrades912BlackPercent(examsCollegeReadyGrades912BlackPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912LatinxPercent")) {
				Double examsCollegeReadyGrades912LatinxPercent = (Double)doc.get("examsCollegeReadyGrades912LatinxPercent_indexedstored_double");
				if(examsCollegeReadyGrades912LatinxPercent != null)
					oReportCard.setExamsCollegeReadyGrades912LatinxPercent(examsCollegeReadyGrades912LatinxPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912MultiRacialPercent")) {
				Double examsCollegeReadyGrades912MultiRacialPercent = (Double)doc.get("examsCollegeReadyGrades912MultiRacialPercent_indexedstored_double");
				if(examsCollegeReadyGrades912MultiRacialPercent != null)
					oReportCard.setExamsCollegeReadyGrades912MultiRacialPercent(examsCollegeReadyGrades912MultiRacialPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912PacificIslanderPercent")) {
				Double examsCollegeReadyGrades912PacificIslanderPercent = (Double)doc.get("examsCollegeReadyGrades912PacificIslanderPercent_indexedstored_double");
				if(examsCollegeReadyGrades912PacificIslanderPercent != null)
					oReportCard.setExamsCollegeReadyGrades912PacificIslanderPercent(examsCollegeReadyGrades912PacificIslanderPercent);
			}

			if(saves.contains("examsCollegeReadyGrades912WhitePercent")) {
				Double examsCollegeReadyGrades912WhitePercent = (Double)doc.get("examsCollegeReadyGrades912WhitePercent_indexedstored_double");
				if(examsCollegeReadyGrades912WhitePercent != null)
					oReportCard.setExamsCollegeReadyGrades912WhitePercent(examsCollegeReadyGrades912WhitePercent);
			}

			if(saves.contains("graduateWithin4YearsOverallPercent")) {
				Double graduateWithin4YearsOverallPercent = (Double)doc.get("graduateWithin4YearsOverallPercent_indexedstored_double");
				if(graduateWithin4YearsOverallPercent != null)
					oReportCard.setGraduateWithin4YearsOverallPercent(graduateWithin4YearsOverallPercent);
			}

			if(saves.contains("graduateWithin4YearsIndigenousPercent")) {
				Double graduateWithin4YearsIndigenousPercent = (Double)doc.get("graduateWithin4YearsIndigenousPercent_indexedstored_double");
				if(graduateWithin4YearsIndigenousPercent != null)
					oReportCard.setGraduateWithin4YearsIndigenousPercent(graduateWithin4YearsIndigenousPercent);
			}

			if(saves.contains("graduateWithin4YearsAsianPercent")) {
				Double graduateWithin4YearsAsianPercent = (Double)doc.get("graduateWithin4YearsAsianPercent_indexedstored_double");
				if(graduateWithin4YearsAsianPercent != null)
					oReportCard.setGraduateWithin4YearsAsianPercent(graduateWithin4YearsAsianPercent);
			}

			if(saves.contains("graduateWithin4YearsBlackPercent")) {
				Double graduateWithin4YearsBlackPercent = (Double)doc.get("graduateWithin4YearsBlackPercent_indexedstored_double");
				if(graduateWithin4YearsBlackPercent != null)
					oReportCard.setGraduateWithin4YearsBlackPercent(graduateWithin4YearsBlackPercent);
			}

			if(saves.contains("graduateWithin4YearsLatinxPercent")) {
				Double graduateWithin4YearsLatinxPercent = (Double)doc.get("graduateWithin4YearsLatinxPercent_indexedstored_double");
				if(graduateWithin4YearsLatinxPercent != null)
					oReportCard.setGraduateWithin4YearsLatinxPercent(graduateWithin4YearsLatinxPercent);
			}

			if(saves.contains("graduateWithin4YearsMultiRacialPercent")) {
				Double graduateWithin4YearsMultiRacialPercent = (Double)doc.get("graduateWithin4YearsMultiRacialPercent_indexedstored_double");
				if(graduateWithin4YearsMultiRacialPercent != null)
					oReportCard.setGraduateWithin4YearsMultiRacialPercent(graduateWithin4YearsMultiRacialPercent);
			}

			if(saves.contains("graduateWithin4YearsPacificIslanderPercent")) {
				Double graduateWithin4YearsPacificIslanderPercent = (Double)doc.get("graduateWithin4YearsPacificIslanderPercent_indexedstored_double");
				if(graduateWithin4YearsPacificIslanderPercent != null)
					oReportCard.setGraduateWithin4YearsPacificIslanderPercent(graduateWithin4YearsPacificIslanderPercent);
			}

			if(saves.contains("graduateWithin4YearsWhitePercent")) {
				Double graduateWithin4YearsWhitePercent = (Double)doc.get("graduateWithin4YearsWhitePercent_indexedstored_double");
				if(graduateWithin4YearsWhitePercent != null)
					oReportCard.setGraduateWithin4YearsWhitePercent(graduateWithin4YearsWhitePercent);
			}

			if(saves.contains("examsCollegeReadyGrades38BlackVsWhite")) {
				Double examsCollegeReadyGrades38BlackVsWhite = (Double)doc.get("examsCollegeReadyGrades38BlackVsWhite_indexedstored_double");
				if(examsCollegeReadyGrades38BlackVsWhite != null)
					oReportCard.setExamsCollegeReadyGrades38BlackVsWhite(examsCollegeReadyGrades38BlackVsWhite);
			}

			if(saves.contains("examsCollegeReadyGrades38LatinxVsWhite")) {
				Double examsCollegeReadyGrades38LatinxVsWhite = (Double)doc.get("examsCollegeReadyGrades38LatinxVsWhite_indexedstored_double");
				if(examsCollegeReadyGrades38LatinxVsWhite != null)
					oReportCard.setExamsCollegeReadyGrades38LatinxVsWhite(examsCollegeReadyGrades38LatinxVsWhite);
			}

			if(saves.contains("reportCardCompleteName")) {
				String reportCardCompleteName = (String)doc.get("reportCardCompleteName_indexedstored_string");
				if(reportCardCompleteName != null)
					oReportCard.setReportCardCompleteName(reportCardCompleteName);
			}

			if(saves.contains("agencyDemographicsGraph")) {
				String agencyDemographicsGraph = (String)doc.get("agencyDemographicsGraph_stored_string");
				if(agencyDemographicsGraph != null)
					oReportCard.setAgencyDemographicsGraph(agencyDemographicsGraph);
			}

			if(saves.contains("agencyStudentsByRaceGraph")) {
				String agencyStudentsByRaceGraph = (String)doc.get("agencyStudentsByRaceGraph_stored_string");
				if(agencyStudentsByRaceGraph != null)
					oReportCard.setAgencyStudentsByRaceGraph(agencyStudentsByRaceGraph);
			}

			if(saves.contains("agencyTeachersByRaceGraph")) {
				String agencyTeachersByRaceGraph = (String)doc.get("agencyTeachersByRaceGraph_stored_string");
				if(agencyTeachersByRaceGraph != null)
					oReportCard.setAgencyTeachersByRaceGraph(agencyTeachersByRaceGraph);
			}

			if(saves.contains("agencyGrades3To8Graph")) {
				String agencyGrades3To8Graph = (String)doc.get("agencyGrades3To8Graph_stored_string");
				if(agencyGrades3To8Graph != null)
					oReportCard.setAgencyGrades3To8Graph(agencyGrades3To8Graph);
			}

			if(saves.contains("agencyGrades9To12Graph")) {
				String agencyGrades9To12Graph = (String)doc.get("agencyGrades9To12Graph_stored_string");
				if(agencyGrades9To12Graph != null)
					oReportCard.setAgencyGrades9To12Graph(agencyGrades9To12Graph);
			}

			if(saves.contains("agencyGraduatesWithin4YearsGraph")) {
				String agencyGraduatesWithin4YearsGraph = (String)doc.get("agencyGraduatesWithin4YearsGraph_stored_string");
				if(agencyGraduatesWithin4YearsGraph != null)
					oReportCard.setAgencyGraduatesWithin4YearsGraph(agencyGraduatesWithin4YearsGraph);
			}

			if(saves.contains("suspensionsByRaceGraph")) {
				String suspensionsByRaceGraph = (String)doc.get("suspensionsByRaceGraph_stored_string");
				if(suspensionsByRaceGraph != null)
					oReportCard.setSuspensionsByRaceGraph(suspensionsByRaceGraph);
			}

			if(saves.contains("suspensionRatesByRaceGraph")) {
				String suspensionRatesByRaceGraph = (String)doc.get("suspensionRatesByRaceGraph_stored_string");
				if(suspensionRatesByRaceGraph != null)
					oReportCard.setSuspensionRatesByRaceGraph(suspensionRatesByRaceGraph);
			}

			if(saves.contains("countySchoolBasedComplaintsGraph")) {
				String countySchoolBasedComplaintsGraph = (String)doc.get("countySchoolBasedComplaintsGraph_stored_string");
				if(countySchoolBasedComplaintsGraph != null)
					oReportCard.setCountySchoolBasedComplaintsGraph(countySchoolBasedComplaintsGraph);
			}

			if(saves.contains("schoolBasedComplaintsGraph")) {
				String schoolBasedComplaintsGraph = (String)doc.get("schoolBasedComplaintsGraph_stored_string");
				if(schoolBasedComplaintsGraph != null)
					oReportCard.setSchoolBasedComplaintsGraph(schoolBasedComplaintsGraph);
			}

			if(saves.contains("agencyStudentsByRaceGraph2")) {
				String agencyStudentsByRaceGraph2 = (String)doc.get("agencyStudentsByRaceGraph2_stored_string");
				if(agencyStudentsByRaceGraph2 != null)
					oReportCard.setAgencyStudentsByRaceGraph2(agencyStudentsByRaceGraph2);
			}

			if(saves.contains("reportCardImage")) {
				String reportCardImage = (String)doc.get("reportCardImage_stored_string");
				if(reportCardImage != null)
					oReportCard.setReportCardImage(reportCardImage);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexReportCard(JsonObject doc) {
		if(reportCardKey != null) {
			doc.put("reportCardKey_indexedstored_long", reportCardKey);
		}
		if(reportCardStartYear != null) {
			doc.put("reportCardStartYear_indexedstored_int", reportCardStartYear);
		}
		if(reportCardEndYear != null) {
			doc.put("reportCardEndYear_indexedstored_int", reportCardEndYear);
		}
		if(reportCardYearsStr != null) {
			doc.put("reportCardYearsStr_indexedstored_string", reportCardYearsStr);
		}
		if(agencyKey != null) {
			doc.put("agencyKey_indexedstored_long", agencyKey);
		}
		if(imageLeft != null) {
			doc.put("imageLeft_indexedstored_int", imageLeft);
		}
		if(imageTop != null) {
			doc.put("imageTop_indexedstored_int", imageTop);
		}
		if(stateKey != null) {
			doc.put("stateKey_indexedstored_long", stateKey);
		}
		if(stateId != null) {
			doc.put("stateId_indexedstored_string", stateId);
		}
		if(agencyId != null) {
			doc.put("agencyId_indexedstored_string", agencyId);
		}
		if(stateName != null) {
			doc.put("stateName_indexedstored_string", stateName);
		}
		if(stateAbbreviation != null) {
			doc.put("stateAbbreviation_indexedstored_string", stateAbbreviation);
		}
		if(agencyOnlyName != null) {
			doc.put("agencyOnlyName_indexedstored_string", agencyOnlyName);
		}
		if(agencyName != null) {
			doc.put("agencyName_indexedstored_string", agencyName);
		}
		if(agencyIsState != null) {
			doc.put("agencyIsState_indexedstored_boolean", agencyIsState);
		}
		if(agencyCoords != null) {
			doc.put("agencyCoords_stored_string", agencyCoords);
		}
		if(agencyLeft != null) {
			doc.put("agencyLeft_stored_int", agencyLeft);
		}
		if(pupilsTotal != null) {
			doc.put("pupilsTotal_indexedstored_long", pupilsTotal);
		}
		if(pupilsIndigenousFemale != null) {
			doc.put("pupilsIndigenousFemale_indexedstored_long", pupilsIndigenousFemale);
		}
		if(pupilsIndigenousMale != null) {
			doc.put("pupilsIndigenousMale_indexedstored_long", pupilsIndigenousMale);
		}
		if(pupilsIndigenousTotal != null) {
			doc.put("pupilsIndigenousTotal_indexedstored_long", pupilsIndigenousTotal);
		}
		if(pupilsIndigenousPercent != null) {
			doc.put("pupilsIndigenousPercent_indexedstored_double", pupilsIndigenousPercent.doubleValue());
		}
		if(pupilsAsianFemale != null) {
			doc.put("pupilsAsianFemale_indexedstored_long", pupilsAsianFemale);
		}
		if(pupilsAsianMale != null) {
			doc.put("pupilsAsianMale_indexedstored_long", pupilsAsianMale);
		}
		if(pupilsAsianTotal != null) {
			doc.put("pupilsAsianTotal_indexedstored_long", pupilsAsianTotal);
		}
		if(pupilsAsianPercent != null) {
			doc.put("pupilsAsianPercent_indexedstored_double", pupilsAsianPercent.doubleValue());
		}
		if(pupilsLatinxFemale != null) {
			doc.put("pupilsLatinxFemale_indexedstored_long", pupilsLatinxFemale);
		}
		if(pupilsLatinxMale != null) {
			doc.put("pupilsLatinxMale_indexedstored_long", pupilsLatinxMale);
		}
		if(pupilsLatinxTotal != null) {
			doc.put("pupilsLatinxTotal_indexedstored_long", pupilsLatinxTotal);
		}
		if(pupilsLatinxPercent != null) {
			doc.put("pupilsLatinxPercent_indexedstored_double", pupilsLatinxPercent.doubleValue());
		}
		if(pupilsBlackFemale != null) {
			doc.put("pupilsBlackFemale_indexedstored_long", pupilsBlackFemale);
		}
		if(pupilsBlackMale != null) {
			doc.put("pupilsBlackMale_indexedstored_long", pupilsBlackMale);
		}
		if(pupilsBlackTotal != null) {
			doc.put("pupilsBlackTotal_indexedstored_long", pupilsBlackTotal);
		}
		if(pupilsBlackPercent != null) {
			doc.put("pupilsBlackPercent_indexedstored_double", pupilsBlackPercent.doubleValue());
		}
		if(pupilsWhiteFemale != null) {
			doc.put("pupilsWhiteFemale_indexedstored_long", pupilsWhiteFemale);
		}
		if(pupilsWhiteMale != null) {
			doc.put("pupilsWhiteMale_indexedstored_long", pupilsWhiteMale);
		}
		if(pupilsWhiteTotal != null) {
			doc.put("pupilsWhiteTotal_indexedstored_long", pupilsWhiteTotal);
		}
		if(pupilsWhitePercent != null) {
			doc.put("pupilsWhitePercent_indexedstored_double", pupilsWhitePercent.doubleValue());
		}
		if(pupilsPacificIslanderFemale != null) {
			doc.put("pupilsPacificIslanderFemale_indexedstored_long", pupilsPacificIslanderFemale);
		}
		if(pupilsPacificIslanderMale != null) {
			doc.put("pupilsPacificIslanderMale_indexedstored_long", pupilsPacificIslanderMale);
		}
		if(pupilsPacificIslanderTotal != null) {
			doc.put("pupilsPacificIslanderTotal_indexedstored_long", pupilsPacificIslanderTotal);
		}
		if(pupilsPacificIslanderPercent != null) {
			doc.put("pupilsPacificIslanderPercent_indexedstored_double", pupilsPacificIslanderPercent.doubleValue());
		}
		if(pupilsMultiRacialFemale != null) {
			doc.put("pupilsMultiRacialFemale_indexedstored_long", pupilsMultiRacialFemale);
		}
		if(pupilsMultiRacialMale != null) {
			doc.put("pupilsMultiRacialMale_indexedstored_long", pupilsMultiRacialMale);
		}
		if(pupilsMultiRacialTotal != null) {
			doc.put("pupilsMultiRacialTotal_indexedstored_long", pupilsMultiRacialTotal);
		}
		if(pupilsMultiRacialPercent != null) {
			doc.put("pupilsMultiRacialPercent_indexedstored_double", pupilsMultiRacialPercent.doubleValue());
		}
		if(pupilsOtherPercent != null) {
			doc.put("pupilsOtherPercent_indexedstored_double", pupilsOtherPercent.doubleValue());
		}
		if(teachersMale != null) {
			doc.put("teachersMale_indexedstored_long", teachersMale);
		}
		if(teachersFemale != null) {
			doc.put("teachersFemale_indexedstored_long", teachersFemale);
		}
		if(teachersTotal != null) {
			doc.put("teachersTotal_indexedstored_long", teachersTotal);
		}
		if(teachersWhiteTotal != null) {
			doc.put("teachersWhiteTotal_indexedstored_long", teachersWhiteTotal);
		}
		if(teachersWhitePercent != null) {
			doc.put("teachersWhitePercent_indexedstored_double", teachersWhitePercent.doubleValue());
		}
		if(teachersBlackTotal != null) {
			doc.put("teachersBlackTotal_indexedstored_long", teachersBlackTotal);
		}
		if(teachersBlackPercent != null) {
			doc.put("teachersBlackPercent_indexedstored_double", teachersBlackPercent.doubleValue());
		}
		if(teachersOtherTotal != null) {
			doc.put("teachersOtherTotal_indexedstored_long", teachersOtherTotal);
		}
		if(teachersOtherPercent != null) {
			doc.put("teachersOtherPercent_indexedstored_double", teachersOtherPercent.doubleValue());
		}
		if(delinquentComplaintsTotal != null) {
			doc.put("delinquentComplaintsTotal_indexedstored_long", delinquentComplaintsTotal);
		}
		if(delinquentComplaintsAtSchool != null) {
			doc.put("delinquentComplaintsAtSchool_indexedstored_long", delinquentComplaintsAtSchool);
		}
		if(delinquentComplaintsAtSchoolPercent != null) {
			doc.put("delinquentComplaintsAtSchoolPercent_indexedstored_double", delinquentComplaintsAtSchoolPercent.doubleValue());
		}
		if(delinquentComplaintsAsian != null) {
			doc.put("delinquentComplaintsAsian_indexedstored_long", delinquentComplaintsAsian);
		}
		if(delinquentComplaintsAsianPercent != null) {
			doc.put("delinquentComplaintsAsianPercent_indexedstored_double", delinquentComplaintsAsianPercent.doubleValue());
		}
		if(delinquentComplaintsBlack != null) {
			doc.put("delinquentComplaintsBlack_indexedstored_long", delinquentComplaintsBlack);
		}
		if(delinquentComplaintsBlackPercent != null) {
			doc.put("delinquentComplaintsBlackPercent_indexedstored_double", delinquentComplaintsBlackPercent.doubleValue());
		}
		if(delinquentComplaintsLatinx != null) {
			doc.put("delinquentComplaintsLatinx_indexedstored_long", delinquentComplaintsLatinx);
		}
		if(delinquentComplaintsLatinxPercent != null) {
			doc.put("delinquentComplaintsLatinxPercent_indexedstored_double", delinquentComplaintsLatinxPercent.doubleValue());
		}
		if(delinquentComplaintsMultiRacial != null) {
			doc.put("delinquentComplaintsMultiRacial_indexedstored_long", delinquentComplaintsMultiRacial);
		}
		if(delinquentComplaintsMultiRacialPercent != null) {
			doc.put("delinquentComplaintsMultiRacialPercent_indexedstored_double", delinquentComplaintsMultiRacialPercent.doubleValue());
		}
		if(delinquentComplaintsIndigenous != null) {
			doc.put("delinquentComplaintsIndigenous_indexedstored_long", delinquentComplaintsIndigenous);
		}
		if(delinquentComplaintsIndigenousPercent != null) {
			doc.put("delinquentComplaintsIndigenousPercent_indexedstored_double", delinquentComplaintsIndigenousPercent.doubleValue());
		}
		if(delinquentComplaintsWhite != null) {
			doc.put("delinquentComplaintsWhite_indexedstored_long", delinquentComplaintsWhite);
		}
		if(delinquentComplaintsWhitePercent != null) {
			doc.put("delinquentComplaintsWhitePercent_indexedstored_double", delinquentComplaintsWhitePercent.doubleValue());
		}
		if(delinquentComplaintsPacificIslander != null) {
			doc.put("delinquentComplaintsPacificIslander_indexedstored_long", delinquentComplaintsPacificIslander);
		}
		if(delinquentComplaintsPacificIslanderPercent != null) {
			doc.put("delinquentComplaintsPacificIslanderPercent_indexedstored_double", delinquentComplaintsPacificIslanderPercent.doubleValue());
		}
		if(shortTermSuspensionRate != null) {
			doc.put("shortTermSuspensionRate_indexedstored_long", shortTermSuspensionRate);
		}
		if(shortTermSuspensionsTotal != null) {
			doc.put("shortTermSuspensionsTotal_indexedstored_long", shortTermSuspensionsTotal);
		}
		if(longTermSuspensionsTotal != null) {
			doc.put("longTermSuspensionsTotal_indexedstored_long", longTermSuspensionsTotal);
		}
		if(expulsionsTotal != null) {
			doc.put("expulsionsTotal_indexedstored_long", expulsionsTotal);
		}
		if(shortTermSuspensionsAsianFemale != null) {
			doc.put("shortTermSuspensionsAsianFemale_indexedstored_long", shortTermSuspensionsAsianFemale);
		}
		if(shortTermSuspensionsAsianMale != null) {
			doc.put("shortTermSuspensionsAsianMale_indexedstored_long", shortTermSuspensionsAsianMale);
		}
		if(shortTermSuspensionsAsianTotal != null) {
			doc.put("shortTermSuspensionsAsianTotal_indexedstored_long", shortTermSuspensionsAsianTotal);
		}
		if(shortTermSuspensionsAsianPercent != null) {
			doc.put("shortTermSuspensionsAsianPercent_indexedstored_double", shortTermSuspensionsAsianPercent.doubleValue());
		}
		if(shortTermSuspensionsAsianRate != null) {
			doc.put("shortTermSuspensionsAsianRate_indexedstored_double", shortTermSuspensionsAsianRate.doubleValue());
		}
		if(shortTermSuspensionsBlackFemale != null) {
			doc.put("shortTermSuspensionsBlackFemale_indexedstored_long", shortTermSuspensionsBlackFemale);
		}
		if(shortTermSuspensionsBlackMale != null) {
			doc.put("shortTermSuspensionsBlackMale_indexedstored_long", shortTermSuspensionsBlackMale);
		}
		if(shortTermSuspensionsBlackTotal != null) {
			doc.put("shortTermSuspensionsBlackTotal_indexedstored_long", shortTermSuspensionsBlackTotal);
		}
		if(shortTermSuspensionsBlackPercent != null) {
			doc.put("shortTermSuspensionsBlackPercent_indexedstored_double", shortTermSuspensionsBlackPercent.doubleValue());
		}
		if(shortTermSuspensionsBlackRate != null) {
			doc.put("shortTermSuspensionsBlackRate_indexedstored_double", shortTermSuspensionsBlackRate.doubleValue());
		}
		if(shortTermSuspensionsLatinxFemale != null) {
			doc.put("shortTermSuspensionsLatinxFemale_indexedstored_long", shortTermSuspensionsLatinxFemale);
		}
		if(shortTermSuspensionsLatinxMale != null) {
			doc.put("shortTermSuspensionsLatinxMale_indexedstored_long", shortTermSuspensionsLatinxMale);
		}
		if(shortTermSuspensionsLatinxTotal != null) {
			doc.put("shortTermSuspensionsLatinxTotal_indexedstored_long", shortTermSuspensionsLatinxTotal);
		}
		if(shortTermSuspensionsLatinxPercent != null) {
			doc.put("shortTermSuspensionsLatinxPercent_indexedstored_double", shortTermSuspensionsLatinxPercent.doubleValue());
		}
		if(shortTermSuspensionsLatinxRate != null) {
			doc.put("shortTermSuspensionsLatinxRate_indexedstored_double", shortTermSuspensionsLatinxRate.doubleValue());
		}
		if(shortTermSuspensionsIndigenousFemale != null) {
			doc.put("shortTermSuspensionsIndigenousFemale_indexedstored_long", shortTermSuspensionsIndigenousFemale);
		}
		if(shortTermSuspensionsIndigenousMale != null) {
			doc.put("shortTermSuspensionsIndigenousMale_indexedstored_long", shortTermSuspensionsIndigenousMale);
		}
		if(shortTermSuspensionsIndigenousTotal != null) {
			doc.put("shortTermSuspensionsIndigenousTotal_indexedstored_long", shortTermSuspensionsIndigenousTotal);
		}
		if(shortTermSuspensionsIndigenousPercent != null) {
			doc.put("shortTermSuspensionsIndigenousPercent_indexedstored_double", shortTermSuspensionsIndigenousPercent.doubleValue());
		}
		if(shortTermSuspensionsIndigenousRate != null) {
			doc.put("shortTermSuspensionsIndigenousRate_indexedstored_double", shortTermSuspensionsIndigenousRate.doubleValue());
		}
		if(shortTermSuspensionsMultiRacialFemale != null) {
			doc.put("shortTermSuspensionsMultiRacialFemale_indexedstored_long", shortTermSuspensionsMultiRacialFemale);
		}
		if(shortTermSuspensionsMultiRacialMale != null) {
			doc.put("shortTermSuspensionsMultiRacialMale_indexedstored_long", shortTermSuspensionsMultiRacialMale);
		}
		if(shortTermSuspensionsMultiRacialTotal != null) {
			doc.put("shortTermSuspensionsMultiRacialTotal_indexedstored_long", shortTermSuspensionsMultiRacialTotal);
		}
		if(shortTermSuspensionsMultiRacialPercent != null) {
			doc.put("shortTermSuspensionsMultiRacialPercent_indexedstored_double", shortTermSuspensionsMultiRacialPercent.doubleValue());
		}
		if(shortTermSuspensionsMultiRacialRate != null) {
			doc.put("shortTermSuspensionsMultiRacialRate_indexedstored_double", shortTermSuspensionsMultiRacialRate.doubleValue());
		}
		if(shortTermSuspensionsPacificIslanderFemale != null) {
			doc.put("shortTermSuspensionsPacificIslanderFemale_indexedstored_long", shortTermSuspensionsPacificIslanderFemale);
		}
		if(shortTermSuspensionsPacificIslanderMale != null) {
			doc.put("shortTermSuspensionsPacificIslanderMale_indexedstored_long", shortTermSuspensionsPacificIslanderMale);
		}
		if(shortTermSuspensionsPacificIslanderTotal != null) {
			doc.put("shortTermSuspensionsPacificIslanderTotal_indexedstored_long", shortTermSuspensionsPacificIslanderTotal);
		}
		if(shortTermSuspensionsPacificIslanderPercent != null) {
			doc.put("shortTermSuspensionsPacificIslanderPercent_indexedstored_double", shortTermSuspensionsPacificIslanderPercent.doubleValue());
		}
		if(shortTermSuspensionsPacificIslanderRate != null) {
			doc.put("shortTermSuspensionsPacificIslanderRate_indexedstored_double", shortTermSuspensionsPacificIslanderRate.doubleValue());
		}
		if(shortTermSuspensionsWhiteFemale != null) {
			doc.put("shortTermSuspensionsWhiteFemale_indexedstored_long", shortTermSuspensionsWhiteFemale);
		}
		if(shortTermSuspensionsWhiteMale != null) {
			doc.put("shortTermSuspensionsWhiteMale_indexedstored_long", shortTermSuspensionsWhiteMale);
		}
		if(shortTermSuspensionsWhiteTotal != null) {
			doc.put("shortTermSuspensionsWhiteTotal_indexedstored_long", shortTermSuspensionsWhiteTotal);
		}
		if(shortTermSuspensionsWhitePercent != null) {
			doc.put("shortTermSuspensionsWhitePercent_indexedstored_double", shortTermSuspensionsWhitePercent.doubleValue());
		}
		if(shortTermSuspensionsWhiteRate != null) {
			doc.put("shortTermSuspensionsWhiteRate_indexedstored_double", shortTermSuspensionsWhiteRate.doubleValue());
		}
		if(shortTermSuspensionsAllRate != null) {
			doc.put("shortTermSuspensionsAllRate_indexedstored_double", shortTermSuspensionsAllRate.doubleValue());
		}
		if(shortTermSuspensionsBlackVsWhite != null) {
			doc.put("shortTermSuspensionsBlackVsWhite_indexedstored_double", shortTermSuspensionsBlackVsWhite.doubleValue());
		}
		if(examsCollegeReadyGrades38OverallPercent != null) {
			doc.put("examsCollegeReadyGrades38OverallPercent_indexedstored_double", examsCollegeReadyGrades38OverallPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38IndigenousPercent != null) {
			doc.put("examsCollegeReadyGrades38IndigenousPercent_indexedstored_double", examsCollegeReadyGrades38IndigenousPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38AsianPercent != null) {
			doc.put("examsCollegeReadyGrades38AsianPercent_indexedstored_double", examsCollegeReadyGrades38AsianPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38BlackPercent != null) {
			doc.put("examsCollegeReadyGrades38BlackPercent_indexedstored_double", examsCollegeReadyGrades38BlackPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38LatinxPercent != null) {
			doc.put("examsCollegeReadyGrades38LatinxPercent_indexedstored_double", examsCollegeReadyGrades38LatinxPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38MultiRacialPercent != null) {
			doc.put("examsCollegeReadyGrades38MultiRacialPercent_indexedstored_double", examsCollegeReadyGrades38MultiRacialPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38PacificIslanderPercent != null) {
			doc.put("examsCollegeReadyGrades38PacificIslanderPercent_indexedstored_double", examsCollegeReadyGrades38PacificIslanderPercent.doubleValue());
		}
		if(examsCollegeReadyGrades38WhitePercent != null) {
			doc.put("examsCollegeReadyGrades38WhitePercent_indexedstored_double", examsCollegeReadyGrades38WhitePercent.doubleValue());
		}
		if(examsCollegeReadyGrades912OverallPercent != null) {
			doc.put("examsCollegeReadyGrades912OverallPercent_indexedstored_double", examsCollegeReadyGrades912OverallPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912IndigenousPercent != null) {
			doc.put("examsCollegeReadyGrades912IndigenousPercent_indexedstored_double", examsCollegeReadyGrades912IndigenousPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912AsianPercent != null) {
			doc.put("examsCollegeReadyGrades912AsianPercent_indexedstored_double", examsCollegeReadyGrades912AsianPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912BlackPercent != null) {
			doc.put("examsCollegeReadyGrades912BlackPercent_indexedstored_double", examsCollegeReadyGrades912BlackPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912LatinxPercent != null) {
			doc.put("examsCollegeReadyGrades912LatinxPercent_indexedstored_double", examsCollegeReadyGrades912LatinxPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912MultiRacialPercent != null) {
			doc.put("examsCollegeReadyGrades912MultiRacialPercent_indexedstored_double", examsCollegeReadyGrades912MultiRacialPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912PacificIslanderPercent != null) {
			doc.put("examsCollegeReadyGrades912PacificIslanderPercent_indexedstored_double", examsCollegeReadyGrades912PacificIslanderPercent.doubleValue());
		}
		if(examsCollegeReadyGrades912WhitePercent != null) {
			doc.put("examsCollegeReadyGrades912WhitePercent_indexedstored_double", examsCollegeReadyGrades912WhitePercent.doubleValue());
		}
		if(graduateWithin4YearsOverallPercent != null) {
			doc.put("graduateWithin4YearsOverallPercent_indexedstored_double", graduateWithin4YearsOverallPercent.doubleValue());
		}
		if(graduateWithin4YearsIndigenousPercent != null) {
			doc.put("graduateWithin4YearsIndigenousPercent_indexedstored_double", graduateWithin4YearsIndigenousPercent.doubleValue());
		}
		if(graduateWithin4YearsAsianPercent != null) {
			doc.put("graduateWithin4YearsAsianPercent_indexedstored_double", graduateWithin4YearsAsianPercent.doubleValue());
		}
		if(graduateWithin4YearsBlackPercent != null) {
			doc.put("graduateWithin4YearsBlackPercent_indexedstored_double", graduateWithin4YearsBlackPercent.doubleValue());
		}
		if(graduateWithin4YearsLatinxPercent != null) {
			doc.put("graduateWithin4YearsLatinxPercent_indexedstored_double", graduateWithin4YearsLatinxPercent.doubleValue());
		}
		if(graduateWithin4YearsMultiRacialPercent != null) {
			doc.put("graduateWithin4YearsMultiRacialPercent_indexedstored_double", graduateWithin4YearsMultiRacialPercent.doubleValue());
		}
		if(graduateWithin4YearsPacificIslanderPercent != null) {
			doc.put("graduateWithin4YearsPacificIslanderPercent_indexedstored_double", graduateWithin4YearsPacificIslanderPercent.doubleValue());
		}
		if(graduateWithin4YearsWhitePercent != null) {
			doc.put("graduateWithin4YearsWhitePercent_indexedstored_double", graduateWithin4YearsWhitePercent.doubleValue());
		}
		if(examsCollegeReadyGrades38BlackVsWhite != null) {
			doc.put("examsCollegeReadyGrades38BlackVsWhite_indexedstored_double", examsCollegeReadyGrades38BlackVsWhite.doubleValue());
		}
		if(examsCollegeReadyGrades38LatinxVsWhite != null) {
			doc.put("examsCollegeReadyGrades38LatinxVsWhite_indexedstored_double", examsCollegeReadyGrades38LatinxVsWhite.doubleValue());
		}
		if(reportCardCompleteName != null) {
			doc.put("reportCardCompleteName_indexedstored_string", reportCardCompleteName);
		}
		if(agencyDemographicsGraph != null) {
			doc.put("agencyDemographicsGraph_stored_string", agencyDemographicsGraph);
		}
		if(agencyStudentsByRaceGraph != null) {
			doc.put("agencyStudentsByRaceGraph_stored_string", agencyStudentsByRaceGraph);
		}
		if(agencyTeachersByRaceGraph != null) {
			doc.put("agencyTeachersByRaceGraph_stored_string", agencyTeachersByRaceGraph);
		}
		if(agencyGrades3To8Graph != null) {
			doc.put("agencyGrades3To8Graph_stored_string", agencyGrades3To8Graph);
		}
		if(agencyGrades9To12Graph != null) {
			doc.put("agencyGrades9To12Graph_stored_string", agencyGrades9To12Graph);
		}
		if(agencyGraduatesWithin4YearsGraph != null) {
			doc.put("agencyGraduatesWithin4YearsGraph_stored_string", agencyGraduatesWithin4YearsGraph);
		}
		if(suspensionsByRaceGraph != null) {
			doc.put("suspensionsByRaceGraph_stored_string", suspensionsByRaceGraph);
		}
		if(suspensionRatesByRaceGraph != null) {
			doc.put("suspensionRatesByRaceGraph_stored_string", suspensionRatesByRaceGraph);
		}
		if(countySchoolBasedComplaintsGraph != null) {
			doc.put("countySchoolBasedComplaintsGraph_stored_string", countySchoolBasedComplaintsGraph);
		}
		if(schoolBasedComplaintsGraph != null) {
			doc.put("schoolBasedComplaintsGraph_stored_string", schoolBasedComplaintsGraph);
		}
		if(agencyStudentsByRaceGraph2 != null) {
			doc.put("agencyStudentsByRaceGraph2_stored_string", agencyStudentsByRaceGraph2);
		}
		if(reportCardImage != null) {
			doc.put("reportCardImage_stored_string", reportCardImage);
		}
		super.indexBaseModel(doc);

	}

	public static String varIndexedReportCard(String entityVar) {
		switch(entityVar) {
			case "reportCardKey":
				return "reportCardKey_indexedstored_long";
			case "reportCardStartYear":
				return "reportCardStartYear_indexedstored_int";
			case "reportCardEndYear":
				return "reportCardEndYear_indexedstored_int";
			case "reportCardYearsStr":
				return "reportCardYearsStr_indexedstored_string";
			case "agencyKey":
				return "agencyKey_indexedstored_long";
			case "imageLeft":
				return "imageLeft_indexedstored_int";
			case "imageTop":
				return "imageTop_indexedstored_int";
			case "stateKey":
				return "stateKey_indexedstored_long";
			case "stateId":
				return "stateId_indexedstored_string";
			case "agencyId":
				return "agencyId_indexedstored_string";
			case "stateName":
				return "stateName_indexedstored_string";
			case "stateAbbreviation":
				return "stateAbbreviation_indexedstored_string";
			case "agencyOnlyName":
				return "agencyOnlyName_indexedstored_string";
			case "agencyName":
				return "agencyName_indexedstored_string";
			case "agencyIsState":
				return "agencyIsState_indexedstored_boolean";
			case "pupilsTotal":
				return "pupilsTotal_indexedstored_long";
			case "pupilsIndigenousFemale":
				return "pupilsIndigenousFemale_indexedstored_long";
			case "pupilsIndigenousMale":
				return "pupilsIndigenousMale_indexedstored_long";
			case "pupilsIndigenousTotal":
				return "pupilsIndigenousTotal_indexedstored_long";
			case "pupilsIndigenousPercent":
				return "pupilsIndigenousPercent_indexedstored_double";
			case "pupilsAsianFemale":
				return "pupilsAsianFemale_indexedstored_long";
			case "pupilsAsianMale":
				return "pupilsAsianMale_indexedstored_long";
			case "pupilsAsianTotal":
				return "pupilsAsianTotal_indexedstored_long";
			case "pupilsAsianPercent":
				return "pupilsAsianPercent_indexedstored_double";
			case "pupilsLatinxFemale":
				return "pupilsLatinxFemale_indexedstored_long";
			case "pupilsLatinxMale":
				return "pupilsLatinxMale_indexedstored_long";
			case "pupilsLatinxTotal":
				return "pupilsLatinxTotal_indexedstored_long";
			case "pupilsLatinxPercent":
				return "pupilsLatinxPercent_indexedstored_double";
			case "pupilsBlackFemale":
				return "pupilsBlackFemale_indexedstored_long";
			case "pupilsBlackMale":
				return "pupilsBlackMale_indexedstored_long";
			case "pupilsBlackTotal":
				return "pupilsBlackTotal_indexedstored_long";
			case "pupilsBlackPercent":
				return "pupilsBlackPercent_indexedstored_double";
			case "pupilsWhiteFemale":
				return "pupilsWhiteFemale_indexedstored_long";
			case "pupilsWhiteMale":
				return "pupilsWhiteMale_indexedstored_long";
			case "pupilsWhiteTotal":
				return "pupilsWhiteTotal_indexedstored_long";
			case "pupilsWhitePercent":
				return "pupilsWhitePercent_indexedstored_double";
			case "pupilsPacificIslanderFemale":
				return "pupilsPacificIslanderFemale_indexedstored_long";
			case "pupilsPacificIslanderMale":
				return "pupilsPacificIslanderMale_indexedstored_long";
			case "pupilsPacificIslanderTotal":
				return "pupilsPacificIslanderTotal_indexedstored_long";
			case "pupilsPacificIslanderPercent":
				return "pupilsPacificIslanderPercent_indexedstored_double";
			case "pupilsMultiRacialFemale":
				return "pupilsMultiRacialFemale_indexedstored_long";
			case "pupilsMultiRacialMale":
				return "pupilsMultiRacialMale_indexedstored_long";
			case "pupilsMultiRacialTotal":
				return "pupilsMultiRacialTotal_indexedstored_long";
			case "pupilsMultiRacialPercent":
				return "pupilsMultiRacialPercent_indexedstored_double";
			case "pupilsOtherPercent":
				return "pupilsOtherPercent_indexedstored_double";
			case "teachersMale":
				return "teachersMale_indexedstored_long";
			case "teachersFemale":
				return "teachersFemale_indexedstored_long";
			case "teachersTotal":
				return "teachersTotal_indexedstored_long";
			case "teachersWhiteTotal":
				return "teachersWhiteTotal_indexedstored_long";
			case "teachersWhitePercent":
				return "teachersWhitePercent_indexedstored_double";
			case "teachersBlackTotal":
				return "teachersBlackTotal_indexedstored_long";
			case "teachersBlackPercent":
				return "teachersBlackPercent_indexedstored_double";
			case "teachersOtherTotal":
				return "teachersOtherTotal_indexedstored_long";
			case "teachersOtherPercent":
				return "teachersOtherPercent_indexedstored_double";
			case "delinquentComplaintsTotal":
				return "delinquentComplaintsTotal_indexedstored_long";
			case "delinquentComplaintsAtSchool":
				return "delinquentComplaintsAtSchool_indexedstored_long";
			case "delinquentComplaintsAtSchoolPercent":
				return "delinquentComplaintsAtSchoolPercent_indexedstored_double";
			case "delinquentComplaintsAsian":
				return "delinquentComplaintsAsian_indexedstored_long";
			case "delinquentComplaintsAsianPercent":
				return "delinquentComplaintsAsianPercent_indexedstored_double";
			case "delinquentComplaintsBlack":
				return "delinquentComplaintsBlack_indexedstored_long";
			case "delinquentComplaintsBlackPercent":
				return "delinquentComplaintsBlackPercent_indexedstored_double";
			case "delinquentComplaintsLatinx":
				return "delinquentComplaintsLatinx_indexedstored_long";
			case "delinquentComplaintsLatinxPercent":
				return "delinquentComplaintsLatinxPercent_indexedstored_double";
			case "delinquentComplaintsMultiRacial":
				return "delinquentComplaintsMultiRacial_indexedstored_long";
			case "delinquentComplaintsMultiRacialPercent":
				return "delinquentComplaintsMultiRacialPercent_indexedstored_double";
			case "delinquentComplaintsIndigenous":
				return "delinquentComplaintsIndigenous_indexedstored_long";
			case "delinquentComplaintsIndigenousPercent":
				return "delinquentComplaintsIndigenousPercent_indexedstored_double";
			case "delinquentComplaintsWhite":
				return "delinquentComplaintsWhite_indexedstored_long";
			case "delinquentComplaintsWhitePercent":
				return "delinquentComplaintsWhitePercent_indexedstored_double";
			case "delinquentComplaintsPacificIslander":
				return "delinquentComplaintsPacificIslander_indexedstored_long";
			case "delinquentComplaintsPacificIslanderPercent":
				return "delinquentComplaintsPacificIslanderPercent_indexedstored_double";
			case "shortTermSuspensionRate":
				return "shortTermSuspensionRate_indexedstored_long";
			case "shortTermSuspensionsTotal":
				return "shortTermSuspensionsTotal_indexedstored_long";
			case "longTermSuspensionsTotal":
				return "longTermSuspensionsTotal_indexedstored_long";
			case "expulsionsTotal":
				return "expulsionsTotal_indexedstored_long";
			case "shortTermSuspensionsAsianFemale":
				return "shortTermSuspensionsAsianFemale_indexedstored_long";
			case "shortTermSuspensionsAsianMale":
				return "shortTermSuspensionsAsianMale_indexedstored_long";
			case "shortTermSuspensionsAsianTotal":
				return "shortTermSuspensionsAsianTotal_indexedstored_long";
			case "shortTermSuspensionsAsianPercent":
				return "shortTermSuspensionsAsianPercent_indexedstored_double";
			case "shortTermSuspensionsAsianRate":
				return "shortTermSuspensionsAsianRate_indexedstored_double";
			case "shortTermSuspensionsBlackFemale":
				return "shortTermSuspensionsBlackFemale_indexedstored_long";
			case "shortTermSuspensionsBlackMale":
				return "shortTermSuspensionsBlackMale_indexedstored_long";
			case "shortTermSuspensionsBlackTotal":
				return "shortTermSuspensionsBlackTotal_indexedstored_long";
			case "shortTermSuspensionsBlackPercent":
				return "shortTermSuspensionsBlackPercent_indexedstored_double";
			case "shortTermSuspensionsBlackRate":
				return "shortTermSuspensionsBlackRate_indexedstored_double";
			case "shortTermSuspensionsLatinxFemale":
				return "shortTermSuspensionsLatinxFemale_indexedstored_long";
			case "shortTermSuspensionsLatinxMale":
				return "shortTermSuspensionsLatinxMale_indexedstored_long";
			case "shortTermSuspensionsLatinxTotal":
				return "shortTermSuspensionsLatinxTotal_indexedstored_long";
			case "shortTermSuspensionsLatinxPercent":
				return "shortTermSuspensionsLatinxPercent_indexedstored_double";
			case "shortTermSuspensionsLatinxRate":
				return "shortTermSuspensionsLatinxRate_indexedstored_double";
			case "shortTermSuspensionsIndigenousFemale":
				return "shortTermSuspensionsIndigenousFemale_indexedstored_long";
			case "shortTermSuspensionsIndigenousMale":
				return "shortTermSuspensionsIndigenousMale_indexedstored_long";
			case "shortTermSuspensionsIndigenousTotal":
				return "shortTermSuspensionsIndigenousTotal_indexedstored_long";
			case "shortTermSuspensionsIndigenousPercent":
				return "shortTermSuspensionsIndigenousPercent_indexedstored_double";
			case "shortTermSuspensionsIndigenousRate":
				return "shortTermSuspensionsIndigenousRate_indexedstored_double";
			case "shortTermSuspensionsMultiRacialFemale":
				return "shortTermSuspensionsMultiRacialFemale_indexedstored_long";
			case "shortTermSuspensionsMultiRacialMale":
				return "shortTermSuspensionsMultiRacialMale_indexedstored_long";
			case "shortTermSuspensionsMultiRacialTotal":
				return "shortTermSuspensionsMultiRacialTotal_indexedstored_long";
			case "shortTermSuspensionsMultiRacialPercent":
				return "shortTermSuspensionsMultiRacialPercent_indexedstored_double";
			case "shortTermSuspensionsMultiRacialRate":
				return "shortTermSuspensionsMultiRacialRate_indexedstored_double";
			case "shortTermSuspensionsPacificIslanderFemale":
				return "shortTermSuspensionsPacificIslanderFemale_indexedstored_long";
			case "shortTermSuspensionsPacificIslanderMale":
				return "shortTermSuspensionsPacificIslanderMale_indexedstored_long";
			case "shortTermSuspensionsPacificIslanderTotal":
				return "shortTermSuspensionsPacificIslanderTotal_indexedstored_long";
			case "shortTermSuspensionsPacificIslanderPercent":
				return "shortTermSuspensionsPacificIslanderPercent_indexedstored_double";
			case "shortTermSuspensionsPacificIslanderRate":
				return "shortTermSuspensionsPacificIslanderRate_indexedstored_double";
			case "shortTermSuspensionsWhiteFemale":
				return "shortTermSuspensionsWhiteFemale_indexedstored_long";
			case "shortTermSuspensionsWhiteMale":
				return "shortTermSuspensionsWhiteMale_indexedstored_long";
			case "shortTermSuspensionsWhiteTotal":
				return "shortTermSuspensionsWhiteTotal_indexedstored_long";
			case "shortTermSuspensionsWhitePercent":
				return "shortTermSuspensionsWhitePercent_indexedstored_double";
			case "shortTermSuspensionsWhiteRate":
				return "shortTermSuspensionsWhiteRate_indexedstored_double";
			case "shortTermSuspensionsAllRate":
				return "shortTermSuspensionsAllRate_indexedstored_double";
			case "shortTermSuspensionsBlackVsWhite":
				return "shortTermSuspensionsBlackVsWhite_indexedstored_double";
			case "examsCollegeReadyGrades38OverallPercent":
				return "examsCollegeReadyGrades38OverallPercent_indexedstored_double";
			case "examsCollegeReadyGrades38IndigenousPercent":
				return "examsCollegeReadyGrades38IndigenousPercent_indexedstored_double";
			case "examsCollegeReadyGrades38AsianPercent":
				return "examsCollegeReadyGrades38AsianPercent_indexedstored_double";
			case "examsCollegeReadyGrades38BlackPercent":
				return "examsCollegeReadyGrades38BlackPercent_indexedstored_double";
			case "examsCollegeReadyGrades38LatinxPercent":
				return "examsCollegeReadyGrades38LatinxPercent_indexedstored_double";
			case "examsCollegeReadyGrades38MultiRacialPercent":
				return "examsCollegeReadyGrades38MultiRacialPercent_indexedstored_double";
			case "examsCollegeReadyGrades38PacificIslanderPercent":
				return "examsCollegeReadyGrades38PacificIslanderPercent_indexedstored_double";
			case "examsCollegeReadyGrades38WhitePercent":
				return "examsCollegeReadyGrades38WhitePercent_indexedstored_double";
			case "examsCollegeReadyGrades912OverallPercent":
				return "examsCollegeReadyGrades912OverallPercent_indexedstored_double";
			case "examsCollegeReadyGrades912IndigenousPercent":
				return "examsCollegeReadyGrades912IndigenousPercent_indexedstored_double";
			case "examsCollegeReadyGrades912AsianPercent":
				return "examsCollegeReadyGrades912AsianPercent_indexedstored_double";
			case "examsCollegeReadyGrades912BlackPercent":
				return "examsCollegeReadyGrades912BlackPercent_indexedstored_double";
			case "examsCollegeReadyGrades912LatinxPercent":
				return "examsCollegeReadyGrades912LatinxPercent_indexedstored_double";
			case "examsCollegeReadyGrades912MultiRacialPercent":
				return "examsCollegeReadyGrades912MultiRacialPercent_indexedstored_double";
			case "examsCollegeReadyGrades912PacificIslanderPercent":
				return "examsCollegeReadyGrades912PacificIslanderPercent_indexedstored_double";
			case "examsCollegeReadyGrades912WhitePercent":
				return "examsCollegeReadyGrades912WhitePercent_indexedstored_double";
			case "graduateWithin4YearsOverallPercent":
				return "graduateWithin4YearsOverallPercent_indexedstored_double";
			case "graduateWithin4YearsIndigenousPercent":
				return "graduateWithin4YearsIndigenousPercent_indexedstored_double";
			case "graduateWithin4YearsAsianPercent":
				return "graduateWithin4YearsAsianPercent_indexedstored_double";
			case "graduateWithin4YearsBlackPercent":
				return "graduateWithin4YearsBlackPercent_indexedstored_double";
			case "graduateWithin4YearsLatinxPercent":
				return "graduateWithin4YearsLatinxPercent_indexedstored_double";
			case "graduateWithin4YearsMultiRacialPercent":
				return "graduateWithin4YearsMultiRacialPercent_indexedstored_double";
			case "graduateWithin4YearsPacificIslanderPercent":
				return "graduateWithin4YearsPacificIslanderPercent_indexedstored_double";
			case "graduateWithin4YearsWhitePercent":
				return "graduateWithin4YearsWhitePercent_indexedstored_double";
			case "examsCollegeReadyGrades38BlackVsWhite":
				return "examsCollegeReadyGrades38BlackVsWhite_indexedstored_double";
			case "examsCollegeReadyGrades38LatinxVsWhite":
				return "examsCollegeReadyGrades38LatinxVsWhite_indexedstored_double";
			case "reportCardCompleteName":
				return "reportCardCompleteName_indexedstored_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String varSearchReportCard(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedReportCard(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeReportCard(doc);
	}
	public void storeReportCard(SolrResponse.Doc doc) {
		ReportCard oReportCard = (ReportCard)this;

		oReportCard.setReportCardKey(Optional.ofNullable(doc.get("reportCardKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setReportCardStartYear(Optional.ofNullable(doc.get("reportCardStartYear_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oReportCard.setReportCardEndYear(Optional.ofNullable(doc.get("reportCardEndYear_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oReportCard.setReportCardYearsStr(Optional.ofNullable(doc.get("reportCardYearsStr_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyKey(Optional.ofNullable(doc.get("agencyKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setImageLeft(Optional.ofNullable(doc.get("imageLeft_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oReportCard.setImageTop(Optional.ofNullable(doc.get("imageTop_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oReportCard.setStateKey(Optional.ofNullable(doc.get("stateKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setStateId(Optional.ofNullable(doc.get("stateId_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyId(Optional.ofNullable(doc.get("agencyId_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setStateName(Optional.ofNullable(doc.get("stateName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setStateAbbreviation(Optional.ofNullable(doc.get("stateAbbreviation_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyOnlyName(Optional.ofNullable(doc.get("agencyOnlyName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyName(Optional.ofNullable(doc.get("agencyName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyIsState(Optional.ofNullable(doc.get("agencyIsState_indexedstored_boolean")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyCoords(Optional.ofNullable(doc.get("agencyCoords_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyLeft(Optional.ofNullable(doc.get("agencyLeft_stored_int")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsTotal(Optional.ofNullable(doc.get("pupilsTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsIndigenousFemale(Optional.ofNullable(doc.get("pupilsIndigenousFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsIndigenousMale(Optional.ofNullable(doc.get("pupilsIndigenousMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsIndigenousTotal(Optional.ofNullable(doc.get("pupilsIndigenousTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsIndigenousPercent(Optional.ofNullable(doc.get("pupilsIndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsAsianFemale(Optional.ofNullable(doc.get("pupilsAsianFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsAsianMale(Optional.ofNullable(doc.get("pupilsAsianMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsAsianTotal(Optional.ofNullable(doc.get("pupilsAsianTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsAsianPercent(Optional.ofNullable(doc.get("pupilsAsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsLatinxFemale(Optional.ofNullable(doc.get("pupilsLatinxFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsLatinxMale(Optional.ofNullable(doc.get("pupilsLatinxMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsLatinxTotal(Optional.ofNullable(doc.get("pupilsLatinxTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsLatinxPercent(Optional.ofNullable(doc.get("pupilsLatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsBlackFemale(Optional.ofNullable(doc.get("pupilsBlackFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsBlackMale(Optional.ofNullable(doc.get("pupilsBlackMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsBlackTotal(Optional.ofNullable(doc.get("pupilsBlackTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsBlackPercent(Optional.ofNullable(doc.get("pupilsBlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsWhiteFemale(Optional.ofNullable(doc.get("pupilsWhiteFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsWhiteMale(Optional.ofNullable(doc.get("pupilsWhiteMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsWhiteTotal(Optional.ofNullable(doc.get("pupilsWhiteTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsWhitePercent(Optional.ofNullable(doc.get("pupilsWhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsPacificIslanderFemale(Optional.ofNullable(doc.get("pupilsPacificIslanderFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsPacificIslanderMale(Optional.ofNullable(doc.get("pupilsPacificIslanderMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsPacificIslanderTotal(Optional.ofNullable(doc.get("pupilsPacificIslanderTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsPacificIslanderPercent(Optional.ofNullable(doc.get("pupilsPacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsMultiRacialFemale(Optional.ofNullable(doc.get("pupilsMultiRacialFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsMultiRacialMale(Optional.ofNullable(doc.get("pupilsMultiRacialMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsMultiRacialTotal(Optional.ofNullable(doc.get("pupilsMultiRacialTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsMultiRacialPercent(Optional.ofNullable(doc.get("pupilsMultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setPupilsOtherPercent(Optional.ofNullable(doc.get("pupilsOtherPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersMale(Optional.ofNullable(doc.get("teachersMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersFemale(Optional.ofNullable(doc.get("teachersFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersTotal(Optional.ofNullable(doc.get("teachersTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersWhiteTotal(Optional.ofNullable(doc.get("teachersWhiteTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersWhitePercent(Optional.ofNullable(doc.get("teachersWhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersBlackTotal(Optional.ofNullable(doc.get("teachersBlackTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersBlackPercent(Optional.ofNullable(doc.get("teachersBlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersOtherTotal(Optional.ofNullable(doc.get("teachersOtherTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setTeachersOtherPercent(Optional.ofNullable(doc.get("teachersOtherPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsTotal(Optional.ofNullable(doc.get("delinquentComplaintsTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsAtSchool(Optional.ofNullable(doc.get("delinquentComplaintsAtSchool_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsAtSchoolPercent(Optional.ofNullable(doc.get("delinquentComplaintsAtSchoolPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsAsian(Optional.ofNullable(doc.get("delinquentComplaintsAsian_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsAsianPercent(Optional.ofNullable(doc.get("delinquentComplaintsAsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsBlack(Optional.ofNullable(doc.get("delinquentComplaintsBlack_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsBlackPercent(Optional.ofNullable(doc.get("delinquentComplaintsBlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsLatinx(Optional.ofNullable(doc.get("delinquentComplaintsLatinx_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsLatinxPercent(Optional.ofNullable(doc.get("delinquentComplaintsLatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsMultiRacial(Optional.ofNullable(doc.get("delinquentComplaintsMultiRacial_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsMultiRacialPercent(Optional.ofNullable(doc.get("delinquentComplaintsMultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsIndigenous(Optional.ofNullable(doc.get("delinquentComplaintsIndigenous_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsIndigenousPercent(Optional.ofNullable(doc.get("delinquentComplaintsIndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsWhite(Optional.ofNullable(doc.get("delinquentComplaintsWhite_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsWhitePercent(Optional.ofNullable(doc.get("delinquentComplaintsWhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsPacificIslander(Optional.ofNullable(doc.get("delinquentComplaintsPacificIslander_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setDelinquentComplaintsPacificIslanderPercent(Optional.ofNullable(doc.get("delinquentComplaintsPacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionRate(Optional.ofNullable(doc.get("shortTermSuspensionRate_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsTotal(Optional.ofNullable(doc.get("shortTermSuspensionsTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setLongTermSuspensionsTotal(Optional.ofNullable(doc.get("longTermSuspensionsTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setExpulsionsTotal(Optional.ofNullable(doc.get("expulsionsTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAsianFemale(Optional.ofNullable(doc.get("shortTermSuspensionsAsianFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAsianMale(Optional.ofNullable(doc.get("shortTermSuspensionsAsianMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAsianTotal(Optional.ofNullable(doc.get("shortTermSuspensionsAsianTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAsianPercent(Optional.ofNullable(doc.get("shortTermSuspensionsAsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAsianRate(Optional.ofNullable(doc.get("shortTermSuspensionsAsianRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackFemale(Optional.ofNullable(doc.get("shortTermSuspensionsBlackFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackMale(Optional.ofNullable(doc.get("shortTermSuspensionsBlackMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackTotal(Optional.ofNullable(doc.get("shortTermSuspensionsBlackTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackPercent(Optional.ofNullable(doc.get("shortTermSuspensionsBlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackRate(Optional.ofNullable(doc.get("shortTermSuspensionsBlackRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsLatinxFemale(Optional.ofNullable(doc.get("shortTermSuspensionsLatinxFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsLatinxMale(Optional.ofNullable(doc.get("shortTermSuspensionsLatinxMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsLatinxTotal(Optional.ofNullable(doc.get("shortTermSuspensionsLatinxTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsLatinxPercent(Optional.ofNullable(doc.get("shortTermSuspensionsLatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsLatinxRate(Optional.ofNullable(doc.get("shortTermSuspensionsLatinxRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsIndigenousFemale(Optional.ofNullable(doc.get("shortTermSuspensionsIndigenousFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsIndigenousMale(Optional.ofNullable(doc.get("shortTermSuspensionsIndigenousMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsIndigenousTotal(Optional.ofNullable(doc.get("shortTermSuspensionsIndigenousTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsIndigenousPercent(Optional.ofNullable(doc.get("shortTermSuspensionsIndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsIndigenousRate(Optional.ofNullable(doc.get("shortTermSuspensionsIndigenousRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsMultiRacialFemale(Optional.ofNullable(doc.get("shortTermSuspensionsMultiRacialFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsMultiRacialMale(Optional.ofNullable(doc.get("shortTermSuspensionsMultiRacialMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsMultiRacialTotal(Optional.ofNullable(doc.get("shortTermSuspensionsMultiRacialTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsMultiRacialPercent(Optional.ofNullable(doc.get("shortTermSuspensionsMultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsMultiRacialRate(Optional.ofNullable(doc.get("shortTermSuspensionsMultiRacialRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsPacificIslanderFemale(Optional.ofNullable(doc.get("shortTermSuspensionsPacificIslanderFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsPacificIslanderMale(Optional.ofNullable(doc.get("shortTermSuspensionsPacificIslanderMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsPacificIslanderTotal(Optional.ofNullable(doc.get("shortTermSuspensionsPacificIslanderTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsPacificIslanderPercent(Optional.ofNullable(doc.get("shortTermSuspensionsPacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsPacificIslanderRate(Optional.ofNullable(doc.get("shortTermSuspensionsPacificIslanderRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsWhiteFemale(Optional.ofNullable(doc.get("shortTermSuspensionsWhiteFemale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsWhiteMale(Optional.ofNullable(doc.get("shortTermSuspensionsWhiteMale_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsWhiteTotal(Optional.ofNullable(doc.get("shortTermSuspensionsWhiteTotal_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsWhitePercent(Optional.ofNullable(doc.get("shortTermSuspensionsWhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsWhiteRate(Optional.ofNullable(doc.get("shortTermSuspensionsWhiteRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsAllRate(Optional.ofNullable(doc.get("shortTermSuspensionsAllRate_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setShortTermSuspensionsBlackVsWhite(Optional.ofNullable(doc.get("shortTermSuspensionsBlackVsWhite_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38OverallPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38OverallPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38IndigenousPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38IndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38AsianPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38AsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38BlackPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38BlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38LatinxPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38LatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38MultiRacialPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38MultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38PacificIslanderPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38PacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38WhitePercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades38WhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912OverallPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912OverallPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912IndigenousPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912IndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912AsianPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912AsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912BlackPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912BlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912LatinxPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912LatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912MultiRacialPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912MultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912PacificIslanderPercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912PacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades912WhitePercent(Optional.ofNullable(doc.get("examsCollegeReadyGrades912WhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsOverallPercent(Optional.ofNullable(doc.get("graduateWithin4YearsOverallPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsIndigenousPercent(Optional.ofNullable(doc.get("graduateWithin4YearsIndigenousPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsAsianPercent(Optional.ofNullable(doc.get("graduateWithin4YearsAsianPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsBlackPercent(Optional.ofNullable(doc.get("graduateWithin4YearsBlackPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsLatinxPercent(Optional.ofNullable(doc.get("graduateWithin4YearsLatinxPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsMultiRacialPercent(Optional.ofNullable(doc.get("graduateWithin4YearsMultiRacialPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsPacificIslanderPercent(Optional.ofNullable(doc.get("graduateWithin4YearsPacificIslanderPercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setGraduateWithin4YearsWhitePercent(Optional.ofNullable(doc.get("graduateWithin4YearsWhitePercent_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38BlackVsWhite(Optional.ofNullable(doc.get("examsCollegeReadyGrades38BlackVsWhite_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setExamsCollegeReadyGrades38LatinxVsWhite(Optional.ofNullable(doc.get("examsCollegeReadyGrades38LatinxVsWhite_indexedstored_double")).map(v -> v.toString()).orElse(null));
		oReportCard.setReportCardCompleteName(Optional.ofNullable(doc.get("reportCardCompleteName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyDemographicsGraph(Optional.ofNullable(doc.get("agencyDemographicsGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyStudentsByRaceGraph(Optional.ofNullable(doc.get("agencyStudentsByRaceGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyTeachersByRaceGraph(Optional.ofNullable(doc.get("agencyTeachersByRaceGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyGrades3To8Graph(Optional.ofNullable(doc.get("agencyGrades3To8Graph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyGrades9To12Graph(Optional.ofNullable(doc.get("agencyGrades9To12Graph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyGraduatesWithin4YearsGraph(Optional.ofNullable(doc.get("agencyGraduatesWithin4YearsGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setSuspensionsByRaceGraph(Optional.ofNullable(doc.get("suspensionsByRaceGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setSuspensionRatesByRaceGraph(Optional.ofNullable(doc.get("suspensionRatesByRaceGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setCountySchoolBasedComplaintsGraph(Optional.ofNullable(doc.get("countySchoolBasedComplaintsGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setSchoolBasedComplaintsGraph(Optional.ofNullable(doc.get("schoolBasedComplaintsGraph_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setAgencyStudentsByRaceGraph2(Optional.ofNullable(doc.get("agencyStudentsByRaceGraph2_stored_string")).map(v -> v.toString()).orElse(null));
		oReportCard.setReportCardImage(Optional.ofNullable(doc.get("reportCardImage_stored_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestReportCard() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof ReportCard) {
			ReportCard original = (ReportCard)o;
			if(!Objects.equals(reportCardKey, original.getReportCardKey()))
				apiRequest.addVars("reportCardKey");
			if(!Objects.equals(reportCardStartYear, original.getReportCardStartYear()))
				apiRequest.addVars("reportCardStartYear");
			if(!Objects.equals(reportCardEndYear, original.getReportCardEndYear()))
				apiRequest.addVars("reportCardEndYear");
			if(!Objects.equals(reportCardYearsStr, original.getReportCardYearsStr()))
				apiRequest.addVars("reportCardYearsStr");
			if(!Objects.equals(agencyKey, original.getAgencyKey()))
				apiRequest.addVars("agencyKey");
			if(!Objects.equals(imageLeft, original.getImageLeft()))
				apiRequest.addVars("imageLeft");
			if(!Objects.equals(imageTop, original.getImageTop()))
				apiRequest.addVars("imageTop");
			if(!Objects.equals(stateKey, original.getStateKey()))
				apiRequest.addVars("stateKey");
			if(!Objects.equals(stateId, original.getStateId()))
				apiRequest.addVars("stateId");
			if(!Objects.equals(agencyId, original.getAgencyId()))
				apiRequest.addVars("agencyId");
			if(!Objects.equals(stateName, original.getStateName()))
				apiRequest.addVars("stateName");
			if(!Objects.equals(stateAbbreviation, original.getStateAbbreviation()))
				apiRequest.addVars("stateAbbreviation");
			if(!Objects.equals(agencyOnlyName, original.getAgencyOnlyName()))
				apiRequest.addVars("agencyOnlyName");
			if(!Objects.equals(agencyName, original.getAgencyName()))
				apiRequest.addVars("agencyName");
			if(!Objects.equals(agencyIsState, original.getAgencyIsState()))
				apiRequest.addVars("agencyIsState");
			if(!Objects.equals(agencyCoords, original.getAgencyCoords()))
				apiRequest.addVars("agencyCoords");
			if(!Objects.equals(agencyLeft, original.getAgencyLeft()))
				apiRequest.addVars("agencyLeft");
			if(!Objects.equals(pupilsTotal, original.getPupilsTotal()))
				apiRequest.addVars("pupilsTotal");
			if(!Objects.equals(pupilsIndigenousFemale, original.getPupilsIndigenousFemale()))
				apiRequest.addVars("pupilsIndigenousFemale");
			if(!Objects.equals(pupilsIndigenousMale, original.getPupilsIndigenousMale()))
				apiRequest.addVars("pupilsIndigenousMale");
			if(!Objects.equals(pupilsIndigenousTotal, original.getPupilsIndigenousTotal()))
				apiRequest.addVars("pupilsIndigenousTotal");
			if(!Objects.equals(pupilsIndigenousPercent, original.getPupilsIndigenousPercent()))
				apiRequest.addVars("pupilsIndigenousPercent");
			if(!Objects.equals(pupilsAsianFemale, original.getPupilsAsianFemale()))
				apiRequest.addVars("pupilsAsianFemale");
			if(!Objects.equals(pupilsAsianMale, original.getPupilsAsianMale()))
				apiRequest.addVars("pupilsAsianMale");
			if(!Objects.equals(pupilsAsianTotal, original.getPupilsAsianTotal()))
				apiRequest.addVars("pupilsAsianTotal");
			if(!Objects.equals(pupilsAsianPercent, original.getPupilsAsianPercent()))
				apiRequest.addVars("pupilsAsianPercent");
			if(!Objects.equals(pupilsLatinxFemale, original.getPupilsLatinxFemale()))
				apiRequest.addVars("pupilsLatinxFemale");
			if(!Objects.equals(pupilsLatinxMale, original.getPupilsLatinxMale()))
				apiRequest.addVars("pupilsLatinxMale");
			if(!Objects.equals(pupilsLatinxTotal, original.getPupilsLatinxTotal()))
				apiRequest.addVars("pupilsLatinxTotal");
			if(!Objects.equals(pupilsLatinxPercent, original.getPupilsLatinxPercent()))
				apiRequest.addVars("pupilsLatinxPercent");
			if(!Objects.equals(pupilsBlackFemale, original.getPupilsBlackFemale()))
				apiRequest.addVars("pupilsBlackFemale");
			if(!Objects.equals(pupilsBlackMale, original.getPupilsBlackMale()))
				apiRequest.addVars("pupilsBlackMale");
			if(!Objects.equals(pupilsBlackTotal, original.getPupilsBlackTotal()))
				apiRequest.addVars("pupilsBlackTotal");
			if(!Objects.equals(pupilsBlackPercent, original.getPupilsBlackPercent()))
				apiRequest.addVars("pupilsBlackPercent");
			if(!Objects.equals(pupilsWhiteFemale, original.getPupilsWhiteFemale()))
				apiRequest.addVars("pupilsWhiteFemale");
			if(!Objects.equals(pupilsWhiteMale, original.getPupilsWhiteMale()))
				apiRequest.addVars("pupilsWhiteMale");
			if(!Objects.equals(pupilsWhiteTotal, original.getPupilsWhiteTotal()))
				apiRequest.addVars("pupilsWhiteTotal");
			if(!Objects.equals(pupilsWhitePercent, original.getPupilsWhitePercent()))
				apiRequest.addVars("pupilsWhitePercent");
			if(!Objects.equals(pupilsPacificIslanderFemale, original.getPupilsPacificIslanderFemale()))
				apiRequest.addVars("pupilsPacificIslanderFemale");
			if(!Objects.equals(pupilsPacificIslanderMale, original.getPupilsPacificIslanderMale()))
				apiRequest.addVars("pupilsPacificIslanderMale");
			if(!Objects.equals(pupilsPacificIslanderTotal, original.getPupilsPacificIslanderTotal()))
				apiRequest.addVars("pupilsPacificIslanderTotal");
			if(!Objects.equals(pupilsPacificIslanderPercent, original.getPupilsPacificIslanderPercent()))
				apiRequest.addVars("pupilsPacificIslanderPercent");
			if(!Objects.equals(pupilsMultiRacialFemale, original.getPupilsMultiRacialFemale()))
				apiRequest.addVars("pupilsMultiRacialFemale");
			if(!Objects.equals(pupilsMultiRacialMale, original.getPupilsMultiRacialMale()))
				apiRequest.addVars("pupilsMultiRacialMale");
			if(!Objects.equals(pupilsMultiRacialTotal, original.getPupilsMultiRacialTotal()))
				apiRequest.addVars("pupilsMultiRacialTotal");
			if(!Objects.equals(pupilsMultiRacialPercent, original.getPupilsMultiRacialPercent()))
				apiRequest.addVars("pupilsMultiRacialPercent");
			if(!Objects.equals(pupilsOtherPercent, original.getPupilsOtherPercent()))
				apiRequest.addVars("pupilsOtherPercent");
			if(!Objects.equals(teachersMale, original.getTeachersMale()))
				apiRequest.addVars("teachersMale");
			if(!Objects.equals(teachersFemale, original.getTeachersFemale()))
				apiRequest.addVars("teachersFemale");
			if(!Objects.equals(teachersTotal, original.getTeachersTotal()))
				apiRequest.addVars("teachersTotal");
			if(!Objects.equals(teachersWhiteTotal, original.getTeachersWhiteTotal()))
				apiRequest.addVars("teachersWhiteTotal");
			if(!Objects.equals(teachersWhitePercent, original.getTeachersWhitePercent()))
				apiRequest.addVars("teachersWhitePercent");
			if(!Objects.equals(teachersBlackTotal, original.getTeachersBlackTotal()))
				apiRequest.addVars("teachersBlackTotal");
			if(!Objects.equals(teachersBlackPercent, original.getTeachersBlackPercent()))
				apiRequest.addVars("teachersBlackPercent");
			if(!Objects.equals(teachersOtherTotal, original.getTeachersOtherTotal()))
				apiRequest.addVars("teachersOtherTotal");
			if(!Objects.equals(teachersOtherPercent, original.getTeachersOtherPercent()))
				apiRequest.addVars("teachersOtherPercent");
			if(!Objects.equals(delinquentComplaintsTotal, original.getDelinquentComplaintsTotal()))
				apiRequest.addVars("delinquentComplaintsTotal");
			if(!Objects.equals(delinquentComplaintsAtSchool, original.getDelinquentComplaintsAtSchool()))
				apiRequest.addVars("delinquentComplaintsAtSchool");
			if(!Objects.equals(delinquentComplaintsAtSchoolPercent, original.getDelinquentComplaintsAtSchoolPercent()))
				apiRequest.addVars("delinquentComplaintsAtSchoolPercent");
			if(!Objects.equals(delinquentComplaintsAsian, original.getDelinquentComplaintsAsian()))
				apiRequest.addVars("delinquentComplaintsAsian");
			if(!Objects.equals(delinquentComplaintsAsianPercent, original.getDelinquentComplaintsAsianPercent()))
				apiRequest.addVars("delinquentComplaintsAsianPercent");
			if(!Objects.equals(delinquentComplaintsBlack, original.getDelinquentComplaintsBlack()))
				apiRequest.addVars("delinquentComplaintsBlack");
			if(!Objects.equals(delinquentComplaintsBlackPercent, original.getDelinquentComplaintsBlackPercent()))
				apiRequest.addVars("delinquentComplaintsBlackPercent");
			if(!Objects.equals(delinquentComplaintsLatinx, original.getDelinquentComplaintsLatinx()))
				apiRequest.addVars("delinquentComplaintsLatinx");
			if(!Objects.equals(delinquentComplaintsLatinxPercent, original.getDelinquentComplaintsLatinxPercent()))
				apiRequest.addVars("delinquentComplaintsLatinxPercent");
			if(!Objects.equals(delinquentComplaintsMultiRacial, original.getDelinquentComplaintsMultiRacial()))
				apiRequest.addVars("delinquentComplaintsMultiRacial");
			if(!Objects.equals(delinquentComplaintsMultiRacialPercent, original.getDelinquentComplaintsMultiRacialPercent()))
				apiRequest.addVars("delinquentComplaintsMultiRacialPercent");
			if(!Objects.equals(delinquentComplaintsIndigenous, original.getDelinquentComplaintsIndigenous()))
				apiRequest.addVars("delinquentComplaintsIndigenous");
			if(!Objects.equals(delinquentComplaintsIndigenousPercent, original.getDelinquentComplaintsIndigenousPercent()))
				apiRequest.addVars("delinquentComplaintsIndigenousPercent");
			if(!Objects.equals(delinquentComplaintsWhite, original.getDelinquentComplaintsWhite()))
				apiRequest.addVars("delinquentComplaintsWhite");
			if(!Objects.equals(delinquentComplaintsWhitePercent, original.getDelinquentComplaintsWhitePercent()))
				apiRequest.addVars("delinquentComplaintsWhitePercent");
			if(!Objects.equals(delinquentComplaintsPacificIslander, original.getDelinquentComplaintsPacificIslander()))
				apiRequest.addVars("delinquentComplaintsPacificIslander");
			if(!Objects.equals(delinquentComplaintsPacificIslanderPercent, original.getDelinquentComplaintsPacificIslanderPercent()))
				apiRequest.addVars("delinquentComplaintsPacificIslanderPercent");
			if(!Objects.equals(shortTermSuspensionRate, original.getShortTermSuspensionRate()))
				apiRequest.addVars("shortTermSuspensionRate");
			if(!Objects.equals(shortTermSuspensionsTotal, original.getShortTermSuspensionsTotal()))
				apiRequest.addVars("shortTermSuspensionsTotal");
			if(!Objects.equals(longTermSuspensionsTotal, original.getLongTermSuspensionsTotal()))
				apiRequest.addVars("longTermSuspensionsTotal");
			if(!Objects.equals(expulsionsTotal, original.getExpulsionsTotal()))
				apiRequest.addVars("expulsionsTotal");
			if(!Objects.equals(shortTermSuspensionsAsianFemale, original.getShortTermSuspensionsAsianFemale()))
				apiRequest.addVars("shortTermSuspensionsAsianFemale");
			if(!Objects.equals(shortTermSuspensionsAsianMale, original.getShortTermSuspensionsAsianMale()))
				apiRequest.addVars("shortTermSuspensionsAsianMale");
			if(!Objects.equals(shortTermSuspensionsAsianTotal, original.getShortTermSuspensionsAsianTotal()))
				apiRequest.addVars("shortTermSuspensionsAsianTotal");
			if(!Objects.equals(shortTermSuspensionsAsianPercent, original.getShortTermSuspensionsAsianPercent()))
				apiRequest.addVars("shortTermSuspensionsAsianPercent");
			if(!Objects.equals(shortTermSuspensionsAsianRate, original.getShortTermSuspensionsAsianRate()))
				apiRequest.addVars("shortTermSuspensionsAsianRate");
			if(!Objects.equals(shortTermSuspensionsBlackFemale, original.getShortTermSuspensionsBlackFemale()))
				apiRequest.addVars("shortTermSuspensionsBlackFemale");
			if(!Objects.equals(shortTermSuspensionsBlackMale, original.getShortTermSuspensionsBlackMale()))
				apiRequest.addVars("shortTermSuspensionsBlackMale");
			if(!Objects.equals(shortTermSuspensionsBlackTotal, original.getShortTermSuspensionsBlackTotal()))
				apiRequest.addVars("shortTermSuspensionsBlackTotal");
			if(!Objects.equals(shortTermSuspensionsBlackPercent, original.getShortTermSuspensionsBlackPercent()))
				apiRequest.addVars("shortTermSuspensionsBlackPercent");
			if(!Objects.equals(shortTermSuspensionsBlackRate, original.getShortTermSuspensionsBlackRate()))
				apiRequest.addVars("shortTermSuspensionsBlackRate");
			if(!Objects.equals(shortTermSuspensionsLatinxFemale, original.getShortTermSuspensionsLatinxFemale()))
				apiRequest.addVars("shortTermSuspensionsLatinxFemale");
			if(!Objects.equals(shortTermSuspensionsLatinxMale, original.getShortTermSuspensionsLatinxMale()))
				apiRequest.addVars("shortTermSuspensionsLatinxMale");
			if(!Objects.equals(shortTermSuspensionsLatinxTotal, original.getShortTermSuspensionsLatinxTotal()))
				apiRequest.addVars("shortTermSuspensionsLatinxTotal");
			if(!Objects.equals(shortTermSuspensionsLatinxPercent, original.getShortTermSuspensionsLatinxPercent()))
				apiRequest.addVars("shortTermSuspensionsLatinxPercent");
			if(!Objects.equals(shortTermSuspensionsLatinxRate, original.getShortTermSuspensionsLatinxRate()))
				apiRequest.addVars("shortTermSuspensionsLatinxRate");
			if(!Objects.equals(shortTermSuspensionsIndigenousFemale, original.getShortTermSuspensionsIndigenousFemale()))
				apiRequest.addVars("shortTermSuspensionsIndigenousFemale");
			if(!Objects.equals(shortTermSuspensionsIndigenousMale, original.getShortTermSuspensionsIndigenousMale()))
				apiRequest.addVars("shortTermSuspensionsIndigenousMale");
			if(!Objects.equals(shortTermSuspensionsIndigenousTotal, original.getShortTermSuspensionsIndigenousTotal()))
				apiRequest.addVars("shortTermSuspensionsIndigenousTotal");
			if(!Objects.equals(shortTermSuspensionsIndigenousPercent, original.getShortTermSuspensionsIndigenousPercent()))
				apiRequest.addVars("shortTermSuspensionsIndigenousPercent");
			if(!Objects.equals(shortTermSuspensionsIndigenousRate, original.getShortTermSuspensionsIndigenousRate()))
				apiRequest.addVars("shortTermSuspensionsIndigenousRate");
			if(!Objects.equals(shortTermSuspensionsMultiRacialFemale, original.getShortTermSuspensionsMultiRacialFemale()))
				apiRequest.addVars("shortTermSuspensionsMultiRacialFemale");
			if(!Objects.equals(shortTermSuspensionsMultiRacialMale, original.getShortTermSuspensionsMultiRacialMale()))
				apiRequest.addVars("shortTermSuspensionsMultiRacialMale");
			if(!Objects.equals(shortTermSuspensionsMultiRacialTotal, original.getShortTermSuspensionsMultiRacialTotal()))
				apiRequest.addVars("shortTermSuspensionsMultiRacialTotal");
			if(!Objects.equals(shortTermSuspensionsMultiRacialPercent, original.getShortTermSuspensionsMultiRacialPercent()))
				apiRequest.addVars("shortTermSuspensionsMultiRacialPercent");
			if(!Objects.equals(shortTermSuspensionsMultiRacialRate, original.getShortTermSuspensionsMultiRacialRate()))
				apiRequest.addVars("shortTermSuspensionsMultiRacialRate");
			if(!Objects.equals(shortTermSuspensionsPacificIslanderFemale, original.getShortTermSuspensionsPacificIslanderFemale()))
				apiRequest.addVars("shortTermSuspensionsPacificIslanderFemale");
			if(!Objects.equals(shortTermSuspensionsPacificIslanderMale, original.getShortTermSuspensionsPacificIslanderMale()))
				apiRequest.addVars("shortTermSuspensionsPacificIslanderMale");
			if(!Objects.equals(shortTermSuspensionsPacificIslanderTotal, original.getShortTermSuspensionsPacificIslanderTotal()))
				apiRequest.addVars("shortTermSuspensionsPacificIslanderTotal");
			if(!Objects.equals(shortTermSuspensionsPacificIslanderPercent, original.getShortTermSuspensionsPacificIslanderPercent()))
				apiRequest.addVars("shortTermSuspensionsPacificIslanderPercent");
			if(!Objects.equals(shortTermSuspensionsPacificIslanderRate, original.getShortTermSuspensionsPacificIslanderRate()))
				apiRequest.addVars("shortTermSuspensionsPacificIslanderRate");
			if(!Objects.equals(shortTermSuspensionsWhiteFemale, original.getShortTermSuspensionsWhiteFemale()))
				apiRequest.addVars("shortTermSuspensionsWhiteFemale");
			if(!Objects.equals(shortTermSuspensionsWhiteMale, original.getShortTermSuspensionsWhiteMale()))
				apiRequest.addVars("shortTermSuspensionsWhiteMale");
			if(!Objects.equals(shortTermSuspensionsWhiteTotal, original.getShortTermSuspensionsWhiteTotal()))
				apiRequest.addVars("shortTermSuspensionsWhiteTotal");
			if(!Objects.equals(shortTermSuspensionsWhitePercent, original.getShortTermSuspensionsWhitePercent()))
				apiRequest.addVars("shortTermSuspensionsWhitePercent");
			if(!Objects.equals(shortTermSuspensionsWhiteRate, original.getShortTermSuspensionsWhiteRate()))
				apiRequest.addVars("shortTermSuspensionsWhiteRate");
			if(!Objects.equals(shortTermSuspensionsAllRate, original.getShortTermSuspensionsAllRate()))
				apiRequest.addVars("shortTermSuspensionsAllRate");
			if(!Objects.equals(shortTermSuspensionsBlackVsWhite, original.getShortTermSuspensionsBlackVsWhite()))
				apiRequest.addVars("shortTermSuspensionsBlackVsWhite");
			if(!Objects.equals(examsCollegeReadyGrades38OverallPercent, original.getExamsCollegeReadyGrades38OverallPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38OverallPercent");
			if(!Objects.equals(examsCollegeReadyGrades38IndigenousPercent, original.getExamsCollegeReadyGrades38IndigenousPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38IndigenousPercent");
			if(!Objects.equals(examsCollegeReadyGrades38AsianPercent, original.getExamsCollegeReadyGrades38AsianPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38AsianPercent");
			if(!Objects.equals(examsCollegeReadyGrades38BlackPercent, original.getExamsCollegeReadyGrades38BlackPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38BlackPercent");
			if(!Objects.equals(examsCollegeReadyGrades38LatinxPercent, original.getExamsCollegeReadyGrades38LatinxPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38LatinxPercent");
			if(!Objects.equals(examsCollegeReadyGrades38MultiRacialPercent, original.getExamsCollegeReadyGrades38MultiRacialPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38MultiRacialPercent");
			if(!Objects.equals(examsCollegeReadyGrades38PacificIslanderPercent, original.getExamsCollegeReadyGrades38PacificIslanderPercent()))
				apiRequest.addVars("examsCollegeReadyGrades38PacificIslanderPercent");
			if(!Objects.equals(examsCollegeReadyGrades38WhitePercent, original.getExamsCollegeReadyGrades38WhitePercent()))
				apiRequest.addVars("examsCollegeReadyGrades38WhitePercent");
			if(!Objects.equals(examsCollegeReadyGrades912OverallPercent, original.getExamsCollegeReadyGrades912OverallPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912OverallPercent");
			if(!Objects.equals(examsCollegeReadyGrades912IndigenousPercent, original.getExamsCollegeReadyGrades912IndigenousPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912IndigenousPercent");
			if(!Objects.equals(examsCollegeReadyGrades912AsianPercent, original.getExamsCollegeReadyGrades912AsianPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912AsianPercent");
			if(!Objects.equals(examsCollegeReadyGrades912BlackPercent, original.getExamsCollegeReadyGrades912BlackPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912BlackPercent");
			if(!Objects.equals(examsCollegeReadyGrades912LatinxPercent, original.getExamsCollegeReadyGrades912LatinxPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912LatinxPercent");
			if(!Objects.equals(examsCollegeReadyGrades912MultiRacialPercent, original.getExamsCollegeReadyGrades912MultiRacialPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912MultiRacialPercent");
			if(!Objects.equals(examsCollegeReadyGrades912PacificIslanderPercent, original.getExamsCollegeReadyGrades912PacificIslanderPercent()))
				apiRequest.addVars("examsCollegeReadyGrades912PacificIslanderPercent");
			if(!Objects.equals(examsCollegeReadyGrades912WhitePercent, original.getExamsCollegeReadyGrades912WhitePercent()))
				apiRequest.addVars("examsCollegeReadyGrades912WhitePercent");
			if(!Objects.equals(graduateWithin4YearsOverallPercent, original.getGraduateWithin4YearsOverallPercent()))
				apiRequest.addVars("graduateWithin4YearsOverallPercent");
			if(!Objects.equals(graduateWithin4YearsIndigenousPercent, original.getGraduateWithin4YearsIndigenousPercent()))
				apiRequest.addVars("graduateWithin4YearsIndigenousPercent");
			if(!Objects.equals(graduateWithin4YearsAsianPercent, original.getGraduateWithin4YearsAsianPercent()))
				apiRequest.addVars("graduateWithin4YearsAsianPercent");
			if(!Objects.equals(graduateWithin4YearsBlackPercent, original.getGraduateWithin4YearsBlackPercent()))
				apiRequest.addVars("graduateWithin4YearsBlackPercent");
			if(!Objects.equals(graduateWithin4YearsLatinxPercent, original.getGraduateWithin4YearsLatinxPercent()))
				apiRequest.addVars("graduateWithin4YearsLatinxPercent");
			if(!Objects.equals(graduateWithin4YearsMultiRacialPercent, original.getGraduateWithin4YearsMultiRacialPercent()))
				apiRequest.addVars("graduateWithin4YearsMultiRacialPercent");
			if(!Objects.equals(graduateWithin4YearsPacificIslanderPercent, original.getGraduateWithin4YearsPacificIslanderPercent()))
				apiRequest.addVars("graduateWithin4YearsPacificIslanderPercent");
			if(!Objects.equals(graduateWithin4YearsWhitePercent, original.getGraduateWithin4YearsWhitePercent()))
				apiRequest.addVars("graduateWithin4YearsWhitePercent");
			if(!Objects.equals(examsCollegeReadyGrades38BlackVsWhite, original.getExamsCollegeReadyGrades38BlackVsWhite()))
				apiRequest.addVars("examsCollegeReadyGrades38BlackVsWhite");
			if(!Objects.equals(examsCollegeReadyGrades38LatinxVsWhite, original.getExamsCollegeReadyGrades38LatinxVsWhite()))
				apiRequest.addVars("examsCollegeReadyGrades38LatinxVsWhite");
			if(!Objects.equals(reportCardCompleteName, original.getReportCardCompleteName()))
				apiRequest.addVars("reportCardCompleteName");
			if(!Objects.equals(agencyDemographicsGraph, original.getAgencyDemographicsGraph()))
				apiRequest.addVars("agencyDemographicsGraph");
			if(!Objects.equals(agencyStudentsByRaceGraph, original.getAgencyStudentsByRaceGraph()))
				apiRequest.addVars("agencyStudentsByRaceGraph");
			if(!Objects.equals(agencyTeachersByRaceGraph, original.getAgencyTeachersByRaceGraph()))
				apiRequest.addVars("agencyTeachersByRaceGraph");
			if(!Objects.equals(agencyGrades3To8Graph, original.getAgencyGrades3To8Graph()))
				apiRequest.addVars("agencyGrades3To8Graph");
			if(!Objects.equals(agencyGrades9To12Graph, original.getAgencyGrades9To12Graph()))
				apiRequest.addVars("agencyGrades9To12Graph");
			if(!Objects.equals(agencyGraduatesWithin4YearsGraph, original.getAgencyGraduatesWithin4YearsGraph()))
				apiRequest.addVars("agencyGraduatesWithin4YearsGraph");
			if(!Objects.equals(suspensionsByRaceGraph, original.getSuspensionsByRaceGraph()))
				apiRequest.addVars("suspensionsByRaceGraph");
			if(!Objects.equals(suspensionRatesByRaceGraph, original.getSuspensionRatesByRaceGraph()))
				apiRequest.addVars("suspensionRatesByRaceGraph");
			if(!Objects.equals(countySchoolBasedComplaintsGraph, original.getCountySchoolBasedComplaintsGraph()))
				apiRequest.addVars("countySchoolBasedComplaintsGraph");
			if(!Objects.equals(schoolBasedComplaintsGraph, original.getSchoolBasedComplaintsGraph()))
				apiRequest.addVars("schoolBasedComplaintsGraph");
			if(!Objects.equals(agencyStudentsByRaceGraph2, original.getAgencyStudentsByRaceGraph2()))
				apiRequest.addVars("agencyStudentsByRaceGraph2");
			if(!Objects.equals(reportCardImage, original.getReportCardImage()))
				apiRequest.addVars("reportCardImage");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(reportCardKey).map(v -> "reportCardKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportCardStartYear).map(v -> "reportCardStartYear: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportCardEndYear).map(v -> "reportCardEndYear: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportCardYearsStr).map(v -> "reportCardYearsStr: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyKey).map(v -> "agencyKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageLeft).map(v -> "imageLeft: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageTop).map(v -> "imageTop: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stateKey).map(v -> "stateKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stateId).map(v -> "stateId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyId).map(v -> "agencyId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateName).map(v -> "stateName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateAbbreviation).map(v -> "stateAbbreviation: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyOnlyName).map(v -> "agencyOnlyName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyName).map(v -> "agencyName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyIsState).map(v -> "agencyIsState: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(agencyCoords).map(v -> "agencyCoords: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyLeft).map(v -> "agencyLeft: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsTotal).map(v -> "pupilsTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsIndigenousFemale).map(v -> "pupilsIndigenousFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsIndigenousMale).map(v -> "pupilsIndigenousMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsIndigenousTotal).map(v -> "pupilsIndigenousTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsIndigenousPercent).map(v -> "pupilsIndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsAsianFemale).map(v -> "pupilsAsianFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsAsianMale).map(v -> "pupilsAsianMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsAsianTotal).map(v -> "pupilsAsianTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsAsianPercent).map(v -> "pupilsAsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsLatinxFemale).map(v -> "pupilsLatinxFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsLatinxMale).map(v -> "pupilsLatinxMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsLatinxTotal).map(v -> "pupilsLatinxTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsLatinxPercent).map(v -> "pupilsLatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsBlackFemale).map(v -> "pupilsBlackFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsBlackMale).map(v -> "pupilsBlackMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsBlackTotal).map(v -> "pupilsBlackTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsBlackPercent).map(v -> "pupilsBlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsWhiteFemale).map(v -> "pupilsWhiteFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsWhiteMale).map(v -> "pupilsWhiteMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsWhiteTotal).map(v -> "pupilsWhiteTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsWhitePercent).map(v -> "pupilsWhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsPacificIslanderFemale).map(v -> "pupilsPacificIslanderFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsPacificIslanderMale).map(v -> "pupilsPacificIslanderMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsPacificIslanderTotal).map(v -> "pupilsPacificIslanderTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsPacificIslanderPercent).map(v -> "pupilsPacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsMultiRacialFemale).map(v -> "pupilsMultiRacialFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsMultiRacialMale).map(v -> "pupilsMultiRacialMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsMultiRacialTotal).map(v -> "pupilsMultiRacialTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsMultiRacialPercent).map(v -> "pupilsMultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pupilsOtherPercent).map(v -> "pupilsOtherPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersMale).map(v -> "teachersMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersFemale).map(v -> "teachersFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersTotal).map(v -> "teachersTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersWhiteTotal).map(v -> "teachersWhiteTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersWhitePercent).map(v -> "teachersWhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersBlackTotal).map(v -> "teachersBlackTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersBlackPercent).map(v -> "teachersBlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersOtherTotal).map(v -> "teachersOtherTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(teachersOtherPercent).map(v -> "teachersOtherPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsTotal).map(v -> "delinquentComplaintsTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsAtSchool).map(v -> "delinquentComplaintsAtSchool: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsAtSchoolPercent).map(v -> "delinquentComplaintsAtSchoolPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsAsian).map(v -> "delinquentComplaintsAsian: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsAsianPercent).map(v -> "delinquentComplaintsAsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsBlack).map(v -> "delinquentComplaintsBlack: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsBlackPercent).map(v -> "delinquentComplaintsBlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsLatinx).map(v -> "delinquentComplaintsLatinx: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsLatinxPercent).map(v -> "delinquentComplaintsLatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsMultiRacial).map(v -> "delinquentComplaintsMultiRacial: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsMultiRacialPercent).map(v -> "delinquentComplaintsMultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsIndigenous).map(v -> "delinquentComplaintsIndigenous: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsIndigenousPercent).map(v -> "delinquentComplaintsIndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsWhite).map(v -> "delinquentComplaintsWhite: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsWhitePercent).map(v -> "delinquentComplaintsWhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsPacificIslander).map(v -> "delinquentComplaintsPacificIslander: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(delinquentComplaintsPacificIslanderPercent).map(v -> "delinquentComplaintsPacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionRate).map(v -> "shortTermSuspensionRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsTotal).map(v -> "shortTermSuspensionsTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(longTermSuspensionsTotal).map(v -> "longTermSuspensionsTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(expulsionsTotal).map(v -> "expulsionsTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAsianFemale).map(v -> "shortTermSuspensionsAsianFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAsianMale).map(v -> "shortTermSuspensionsAsianMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAsianTotal).map(v -> "shortTermSuspensionsAsianTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAsianPercent).map(v -> "shortTermSuspensionsAsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAsianRate).map(v -> "shortTermSuspensionsAsianRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackFemale).map(v -> "shortTermSuspensionsBlackFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackMale).map(v -> "shortTermSuspensionsBlackMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackTotal).map(v -> "shortTermSuspensionsBlackTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackPercent).map(v -> "shortTermSuspensionsBlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackRate).map(v -> "shortTermSuspensionsBlackRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsLatinxFemale).map(v -> "shortTermSuspensionsLatinxFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsLatinxMale).map(v -> "shortTermSuspensionsLatinxMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsLatinxTotal).map(v -> "shortTermSuspensionsLatinxTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsLatinxPercent).map(v -> "shortTermSuspensionsLatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsLatinxRate).map(v -> "shortTermSuspensionsLatinxRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsIndigenousFemale).map(v -> "shortTermSuspensionsIndigenousFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsIndigenousMale).map(v -> "shortTermSuspensionsIndigenousMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsIndigenousTotal).map(v -> "shortTermSuspensionsIndigenousTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsIndigenousPercent).map(v -> "shortTermSuspensionsIndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsIndigenousRate).map(v -> "shortTermSuspensionsIndigenousRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsMultiRacialFemale).map(v -> "shortTermSuspensionsMultiRacialFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsMultiRacialMale).map(v -> "shortTermSuspensionsMultiRacialMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsMultiRacialTotal).map(v -> "shortTermSuspensionsMultiRacialTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsMultiRacialPercent).map(v -> "shortTermSuspensionsMultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsMultiRacialRate).map(v -> "shortTermSuspensionsMultiRacialRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsPacificIslanderFemale).map(v -> "shortTermSuspensionsPacificIslanderFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsPacificIslanderMale).map(v -> "shortTermSuspensionsPacificIslanderMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsPacificIslanderTotal).map(v -> "shortTermSuspensionsPacificIslanderTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsPacificIslanderPercent).map(v -> "shortTermSuspensionsPacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsPacificIslanderRate).map(v -> "shortTermSuspensionsPacificIslanderRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsWhiteFemale).map(v -> "shortTermSuspensionsWhiteFemale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsWhiteMale).map(v -> "shortTermSuspensionsWhiteMale: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsWhiteTotal).map(v -> "shortTermSuspensionsWhiteTotal: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsWhitePercent).map(v -> "shortTermSuspensionsWhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsWhiteRate).map(v -> "shortTermSuspensionsWhiteRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsAllRate).map(v -> "shortTermSuspensionsAllRate: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(shortTermSuspensionsBlackVsWhite).map(v -> "shortTermSuspensionsBlackVsWhite: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38OverallPercent).map(v -> "examsCollegeReadyGrades38OverallPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38IndigenousPercent).map(v -> "examsCollegeReadyGrades38IndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38AsianPercent).map(v -> "examsCollegeReadyGrades38AsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38BlackPercent).map(v -> "examsCollegeReadyGrades38BlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38LatinxPercent).map(v -> "examsCollegeReadyGrades38LatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38MultiRacialPercent).map(v -> "examsCollegeReadyGrades38MultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38PacificIslanderPercent).map(v -> "examsCollegeReadyGrades38PacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38WhitePercent).map(v -> "examsCollegeReadyGrades38WhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912OverallPercent).map(v -> "examsCollegeReadyGrades912OverallPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912IndigenousPercent).map(v -> "examsCollegeReadyGrades912IndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912AsianPercent).map(v -> "examsCollegeReadyGrades912AsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912BlackPercent).map(v -> "examsCollegeReadyGrades912BlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912LatinxPercent).map(v -> "examsCollegeReadyGrades912LatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912MultiRacialPercent).map(v -> "examsCollegeReadyGrades912MultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912PacificIslanderPercent).map(v -> "examsCollegeReadyGrades912PacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades912WhitePercent).map(v -> "examsCollegeReadyGrades912WhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsOverallPercent).map(v -> "graduateWithin4YearsOverallPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsIndigenousPercent).map(v -> "graduateWithin4YearsIndigenousPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsAsianPercent).map(v -> "graduateWithin4YearsAsianPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsBlackPercent).map(v -> "graduateWithin4YearsBlackPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsLatinxPercent).map(v -> "graduateWithin4YearsLatinxPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsMultiRacialPercent).map(v -> "graduateWithin4YearsMultiRacialPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsPacificIslanderPercent).map(v -> "graduateWithin4YearsPacificIslanderPercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(graduateWithin4YearsWhitePercent).map(v -> "graduateWithin4YearsWhitePercent: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38BlackVsWhite).map(v -> "examsCollegeReadyGrades38BlackVsWhite: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(examsCollegeReadyGrades38LatinxVsWhite).map(v -> "examsCollegeReadyGrades38LatinxVsWhite: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(reportCardCompleteName).map(v -> "reportCardCompleteName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyDemographicsGraph).map(v -> "agencyDemographicsGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyStudentsByRaceGraph).map(v -> "agencyStudentsByRaceGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyTeachersByRaceGraph).map(v -> "agencyTeachersByRaceGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyGrades3To8Graph).map(v -> "agencyGrades3To8Graph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyGrades9To12Graph).map(v -> "agencyGrades9To12Graph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyGraduatesWithin4YearsGraph).map(v -> "agencyGraduatesWithin4YearsGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(suspensionsByRaceGraph).map(v -> "suspensionsByRaceGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(suspensionRatesByRaceGraph).map(v -> "suspensionRatesByRaceGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(countySchoolBasedComplaintsGraph).map(v -> "countySchoolBasedComplaintsGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(schoolBasedComplaintsGraph).map(v -> "schoolBasedComplaintsGraph: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyStudentsByRaceGraph2).map(v -> "agencyStudentsByRaceGraph2: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(reportCardImage).map(v -> "reportCardImage: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String VAR_reportCardKey = "reportCardKey";
	public static final String VAR_reportCardStartYear = "reportCardStartYear";
	public static final String VAR_reportCardStartYearStr = "reportCardStartYearStr";
	public static final String VAR_reportCardEndYear = "reportCardEndYear";
	public static final String VAR_reportCardYearsStr = "reportCardYearsStr";
	public static final String VAR_agencySearch = "agencySearch";
	public static final String VAR_agency_ = "agency_";
	public static final String VAR_agencyKey = "agencyKey";
	public static final String VAR_imageLeft = "imageLeft";
	public static final String VAR_imageTop = "imageTop";
	public static final String VAR_stateKey = "stateKey";
	public static final String VAR_stateId = "stateId";
	public static final String VAR_agencyId = "agencyId";
	public static final String VAR_stateName = "stateName";
	public static final String VAR_stateAbbreviation = "stateAbbreviation";
	public static final String VAR_agencyOnlyName = "agencyOnlyName";
	public static final String VAR_agencyName = "agencyName";
	public static final String VAR_agencyIsState = "agencyIsState";
	public static final String VAR_agencyCoords = "agencyCoords";
	public static final String VAR_agencyLeft = "agencyLeft";
	public static final String VAR_stateReportCardSearch = "stateReportCardSearch";
	public static final String VAR_stateFacets = "stateFacets";
	public static final String VAR_pupilsTotal = "pupilsTotal";
	public static final String VAR_pupilsIndigenousFemale = "pupilsIndigenousFemale";
	public static final String VAR_pupilsIndigenousMale = "pupilsIndigenousMale";
	public static final String VAR_pupilsIndigenousTotal = "pupilsIndigenousTotal";
	public static final String VAR_pupilsIndigenousPercent = "pupilsIndigenousPercent";
	public static final String VAR_pupilsAsianFemale = "pupilsAsianFemale";
	public static final String VAR_pupilsAsianMale = "pupilsAsianMale";
	public static final String VAR_pupilsAsianTotal = "pupilsAsianTotal";
	public static final String VAR_pupilsAsianPercent = "pupilsAsianPercent";
	public static final String VAR_pupilsLatinxFemale = "pupilsLatinxFemale";
	public static final String VAR_pupilsLatinxMale = "pupilsLatinxMale";
	public static final String VAR_pupilsLatinxTotal = "pupilsLatinxTotal";
	public static final String VAR_pupilsLatinxPercent = "pupilsLatinxPercent";
	public static final String VAR_pupilsBlackFemale = "pupilsBlackFemale";
	public static final String VAR_pupilsBlackMale = "pupilsBlackMale";
	public static final String VAR_pupilsBlackTotal = "pupilsBlackTotal";
	public static final String VAR_pupilsBlackPercent = "pupilsBlackPercent";
	public static final String VAR_pupilsWhiteFemale = "pupilsWhiteFemale";
	public static final String VAR_pupilsWhiteMale = "pupilsWhiteMale";
	public static final String VAR_pupilsWhiteTotal = "pupilsWhiteTotal";
	public static final String VAR_pupilsWhitePercent = "pupilsWhitePercent";
	public static final String VAR_pupilsPacificIslanderFemale = "pupilsPacificIslanderFemale";
	public static final String VAR_pupilsPacificIslanderMale = "pupilsPacificIslanderMale";
	public static final String VAR_pupilsPacificIslanderTotal = "pupilsPacificIslanderTotal";
	public static final String VAR_pupilsPacificIslanderPercent = "pupilsPacificIslanderPercent";
	public static final String VAR_pupilsMultiRacialFemale = "pupilsMultiRacialFemale";
	public static final String VAR_pupilsMultiRacialMale = "pupilsMultiRacialMale";
	public static final String VAR_pupilsMultiRacialTotal = "pupilsMultiRacialTotal";
	public static final String VAR_pupilsMultiRacialPercent = "pupilsMultiRacialPercent";
	public static final String VAR_pupilsOtherPercent = "pupilsOtherPercent";
	public static final String VAR_teachersMale = "teachersMale";
	public static final String VAR_teachersFemale = "teachersFemale";
	public static final String VAR_teachersTotal = "teachersTotal";
	public static final String VAR_teachersWhiteTotal = "teachersWhiteTotal";
	public static final String VAR_teachersWhitePercent = "teachersWhitePercent";
	public static final String VAR_teachersBlackTotal = "teachersBlackTotal";
	public static final String VAR_teachersBlackPercent = "teachersBlackPercent";
	public static final String VAR_teachersOtherTotal = "teachersOtherTotal";
	public static final String VAR_teachersOtherPercent = "teachersOtherPercent";
	public static final String VAR_delinquentComplaintsTotal = "delinquentComplaintsTotal";
	public static final String VAR_delinquentComplaintsAtSchool = "delinquentComplaintsAtSchool";
	public static final String VAR_delinquentComplaintsAtSchoolPercent = "delinquentComplaintsAtSchoolPercent";
	public static final String VAR_delinquentComplaintsAsian = "delinquentComplaintsAsian";
	public static final String VAR_delinquentComplaintsAsianPercent = "delinquentComplaintsAsianPercent";
	public static final String VAR_delinquentComplaintsBlack = "delinquentComplaintsBlack";
	public static final String VAR_delinquentComplaintsBlackPercent = "delinquentComplaintsBlackPercent";
	public static final String VAR_delinquentComplaintsLatinx = "delinquentComplaintsLatinx";
	public static final String VAR_delinquentComplaintsLatinxPercent = "delinquentComplaintsLatinxPercent";
	public static final String VAR_delinquentComplaintsMultiRacial = "delinquentComplaintsMultiRacial";
	public static final String VAR_delinquentComplaintsMultiRacialPercent = "delinquentComplaintsMultiRacialPercent";
	public static final String VAR_delinquentComplaintsIndigenous = "delinquentComplaintsIndigenous";
	public static final String VAR_delinquentComplaintsIndigenousPercent = "delinquentComplaintsIndigenousPercent";
	public static final String VAR_delinquentComplaintsWhite = "delinquentComplaintsWhite";
	public static final String VAR_delinquentComplaintsWhitePercent = "delinquentComplaintsWhitePercent";
	public static final String VAR_delinquentComplaintsPacificIslander = "delinquentComplaintsPacificIslander";
	public static final String VAR_delinquentComplaintsPacificIslanderPercent = "delinquentComplaintsPacificIslanderPercent";
	public static final String VAR_shortTermSuspensionRate = "shortTermSuspensionRate";
	public static final String VAR_shortTermSuspensionsTotal = "shortTermSuspensionsTotal";
	public static final String VAR_longTermSuspensionsTotal = "longTermSuspensionsTotal";
	public static final String VAR_expulsionsTotal = "expulsionsTotal";
	public static final String VAR_shortTermSuspensionsAsianFemale = "shortTermSuspensionsAsianFemale";
	public static final String VAR_shortTermSuspensionsAsianMale = "shortTermSuspensionsAsianMale";
	public static final String VAR_shortTermSuspensionsAsianTotal = "shortTermSuspensionsAsianTotal";
	public static final String VAR_shortTermSuspensionsAsianPercent = "shortTermSuspensionsAsianPercent";
	public static final String VAR_shortTermSuspensionsAsianRate = "shortTermSuspensionsAsianRate";
	public static final String VAR_shortTermSuspensionsBlackFemale = "shortTermSuspensionsBlackFemale";
	public static final String VAR_shortTermSuspensionsBlackMale = "shortTermSuspensionsBlackMale";
	public static final String VAR_shortTermSuspensionsBlackTotal = "shortTermSuspensionsBlackTotal";
	public static final String VAR_shortTermSuspensionsBlackPercent = "shortTermSuspensionsBlackPercent";
	public static final String VAR_shortTermSuspensionsBlackRate = "shortTermSuspensionsBlackRate";
	public static final String VAR_shortTermSuspensionsLatinxFemale = "shortTermSuspensionsLatinxFemale";
	public static final String VAR_shortTermSuspensionsLatinxMale = "shortTermSuspensionsLatinxMale";
	public static final String VAR_shortTermSuspensionsLatinxTotal = "shortTermSuspensionsLatinxTotal";
	public static final String VAR_shortTermSuspensionsLatinxPercent = "shortTermSuspensionsLatinxPercent";
	public static final String VAR_shortTermSuspensionsLatinxRate = "shortTermSuspensionsLatinxRate";
	public static final String VAR_shortTermSuspensionsIndigenousFemale = "shortTermSuspensionsIndigenousFemale";
	public static final String VAR_shortTermSuspensionsIndigenousMale = "shortTermSuspensionsIndigenousMale";
	public static final String VAR_shortTermSuspensionsIndigenousTotal = "shortTermSuspensionsIndigenousTotal";
	public static final String VAR_shortTermSuspensionsIndigenousPercent = "shortTermSuspensionsIndigenousPercent";
	public static final String VAR_shortTermSuspensionsIndigenousRate = "shortTermSuspensionsIndigenousRate";
	public static final String VAR_shortTermSuspensionsMultiRacialFemale = "shortTermSuspensionsMultiRacialFemale";
	public static final String VAR_shortTermSuspensionsMultiRacialMale = "shortTermSuspensionsMultiRacialMale";
	public static final String VAR_shortTermSuspensionsMultiRacialTotal = "shortTermSuspensionsMultiRacialTotal";
	public static final String VAR_shortTermSuspensionsMultiRacialPercent = "shortTermSuspensionsMultiRacialPercent";
	public static final String VAR_shortTermSuspensionsMultiRacialRate = "shortTermSuspensionsMultiRacialRate";
	public static final String VAR_shortTermSuspensionsPacificIslanderFemale = "shortTermSuspensionsPacificIslanderFemale";
	public static final String VAR_shortTermSuspensionsPacificIslanderMale = "shortTermSuspensionsPacificIslanderMale";
	public static final String VAR_shortTermSuspensionsPacificIslanderTotal = "shortTermSuspensionsPacificIslanderTotal";
	public static final String VAR_shortTermSuspensionsPacificIslanderPercent = "shortTermSuspensionsPacificIslanderPercent";
	public static final String VAR_shortTermSuspensionsPacificIslanderRate = "shortTermSuspensionsPacificIslanderRate";
	public static final String VAR_shortTermSuspensionsWhiteFemale = "shortTermSuspensionsWhiteFemale";
	public static final String VAR_shortTermSuspensionsWhiteMale = "shortTermSuspensionsWhiteMale";
	public static final String VAR_shortTermSuspensionsWhiteTotal = "shortTermSuspensionsWhiteTotal";
	public static final String VAR_shortTermSuspensionsWhitePercent = "shortTermSuspensionsWhitePercent";
	public static final String VAR_shortTermSuspensionsWhiteRate = "shortTermSuspensionsWhiteRate";
	public static final String VAR_shortTermSuspensionsAllRate = "shortTermSuspensionsAllRate";
	public static final String VAR_shortTermSuspensionsBlackVsWhite = "shortTermSuspensionsBlackVsWhite";
	public static final String VAR_examsCollegeReadyGrades38OverallPercent = "examsCollegeReadyGrades38OverallPercent";
	public static final String VAR_examsCollegeReadyGrades38IndigenousPercent = "examsCollegeReadyGrades38IndigenousPercent";
	public static final String VAR_examsCollegeReadyGrades38AsianPercent = "examsCollegeReadyGrades38AsianPercent";
	public static final String VAR_examsCollegeReadyGrades38BlackPercent = "examsCollegeReadyGrades38BlackPercent";
	public static final String VAR_examsCollegeReadyGrades38LatinxPercent = "examsCollegeReadyGrades38LatinxPercent";
	public static final String VAR_examsCollegeReadyGrades38MultiRacialPercent = "examsCollegeReadyGrades38MultiRacialPercent";
	public static final String VAR_examsCollegeReadyGrades38PacificIslanderPercent = "examsCollegeReadyGrades38PacificIslanderPercent";
	public static final String VAR_examsCollegeReadyGrades38WhitePercent = "examsCollegeReadyGrades38WhitePercent";
	public static final String VAR_examsCollegeReadyGrades912OverallPercent = "examsCollegeReadyGrades912OverallPercent";
	public static final String VAR_examsCollegeReadyGrades912IndigenousPercent = "examsCollegeReadyGrades912IndigenousPercent";
	public static final String VAR_examsCollegeReadyGrades912AsianPercent = "examsCollegeReadyGrades912AsianPercent";
	public static final String VAR_examsCollegeReadyGrades912BlackPercent = "examsCollegeReadyGrades912BlackPercent";
	public static final String VAR_examsCollegeReadyGrades912LatinxPercent = "examsCollegeReadyGrades912LatinxPercent";
	public static final String VAR_examsCollegeReadyGrades912MultiRacialPercent = "examsCollegeReadyGrades912MultiRacialPercent";
	public static final String VAR_examsCollegeReadyGrades912PacificIslanderPercent = "examsCollegeReadyGrades912PacificIslanderPercent";
	public static final String VAR_examsCollegeReadyGrades912WhitePercent = "examsCollegeReadyGrades912WhitePercent";
	public static final String VAR_graduateWithin4YearsOverallPercent = "graduateWithin4YearsOverallPercent";
	public static final String VAR_graduateWithin4YearsIndigenousPercent = "graduateWithin4YearsIndigenousPercent";
	public static final String VAR_graduateWithin4YearsAsianPercent = "graduateWithin4YearsAsianPercent";
	public static final String VAR_graduateWithin4YearsBlackPercent = "graduateWithin4YearsBlackPercent";
	public static final String VAR_graduateWithin4YearsLatinxPercent = "graduateWithin4YearsLatinxPercent";
	public static final String VAR_graduateWithin4YearsMultiRacialPercent = "graduateWithin4YearsMultiRacialPercent";
	public static final String VAR_graduateWithin4YearsPacificIslanderPercent = "graduateWithin4YearsPacificIslanderPercent";
	public static final String VAR_graduateWithin4YearsWhitePercent = "graduateWithin4YearsWhitePercent";
	public static final String VAR_examsCollegeReadyGrades38BlackVsWhite = "examsCollegeReadyGrades38BlackVsWhite";
	public static final String VAR_examsCollegeReadyGrades38LatinxVsWhite = "examsCollegeReadyGrades38LatinxVsWhite";
	public static final String VAR_reportCardCompleteName = "reportCardCompleteName";
	public static final String VAR_reportCardNumber_ = "reportCardNumber_";
	public static final String VAR_reportCardStates_ = "reportCardStates_";
	public static final String VAR_reportCardAgencies_ = "reportCardAgencies_";
	public static final String VAR_reportCardReportCards_ = "reportCardReportCards_";
	public static final String VAR_agencyDemographicsGraph = "agencyDemographicsGraph";
	public static final String VAR_agencyStudentsByRaceGraph = "agencyStudentsByRaceGraph";
	public static final String VAR_agencyTeachersByRaceGraph = "agencyTeachersByRaceGraph";
	public static final String VAR_agencyGrades3To8Graph = "agencyGrades3To8Graph";
	public static final String VAR_agencyGrades9To12Graph = "agencyGrades9To12Graph";
	public static final String VAR_agencyGraduatesWithin4YearsGraph = "agencyGraduatesWithin4YearsGraph";
	public static final String VAR_suspensionsByRaceGraph = "suspensionsByRaceGraph";
	public static final String VAR_suspensionRatesByRaceGraph = "suspensionRatesByRaceGraph";
	public static final String VAR_countySchoolBasedComplaintsGraph = "countySchoolBasedComplaintsGraph";
	public static final String VAR_schoolBasedComplaintsGraph = "schoolBasedComplaintsGraph";
	public static final String VAR_agencyStudentsByRaceGraph2 = "agencyStudentsByRaceGraph2";
	public static final String VAR_reportCardImage = "reportCardImage";

	public static List<String> varsQForClass() {
		return ReportCard.varsQReportCard(new ArrayList<String>());
	}
	public static List<String> varsQReportCard(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return ReportCard.varsFqReportCard(new ArrayList<String>());
	}
	public static List<String> varsFqReportCard(List<String> vars) {
		vars.add(VAR_reportCardKey);
		vars.add(VAR_reportCardStartYear);
		vars.add(VAR_reportCardEndYear);
		vars.add(VAR_reportCardYearsStr);
		vars.add(VAR_agencyKey);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		vars.add(VAR_stateKey);
		vars.add(VAR_stateId);
		vars.add(VAR_agencyId);
		vars.add(VAR_stateName);
		vars.add(VAR_stateAbbreviation);
		vars.add(VAR_agencyOnlyName);
		vars.add(VAR_agencyName);
		vars.add(VAR_agencyIsState);
		vars.add(VAR_pupilsTotal);
		vars.add(VAR_pupilsIndigenousFemale);
		vars.add(VAR_pupilsIndigenousMale);
		vars.add(VAR_pupilsIndigenousTotal);
		vars.add(VAR_pupilsIndigenousPercent);
		vars.add(VAR_pupilsAsianFemale);
		vars.add(VAR_pupilsAsianMale);
		vars.add(VAR_pupilsAsianTotal);
		vars.add(VAR_pupilsAsianPercent);
		vars.add(VAR_pupilsLatinxFemale);
		vars.add(VAR_pupilsLatinxMale);
		vars.add(VAR_pupilsLatinxTotal);
		vars.add(VAR_pupilsLatinxPercent);
		vars.add(VAR_pupilsBlackFemale);
		vars.add(VAR_pupilsBlackMale);
		vars.add(VAR_pupilsBlackTotal);
		vars.add(VAR_pupilsBlackPercent);
		vars.add(VAR_pupilsWhiteFemale);
		vars.add(VAR_pupilsWhiteMale);
		vars.add(VAR_pupilsWhiteTotal);
		vars.add(VAR_pupilsWhitePercent);
		vars.add(VAR_pupilsPacificIslanderFemale);
		vars.add(VAR_pupilsPacificIslanderMale);
		vars.add(VAR_pupilsPacificIslanderTotal);
		vars.add(VAR_pupilsPacificIslanderPercent);
		vars.add(VAR_pupilsMultiRacialFemale);
		vars.add(VAR_pupilsMultiRacialMale);
		vars.add(VAR_pupilsMultiRacialTotal);
		vars.add(VAR_pupilsMultiRacialPercent);
		vars.add(VAR_pupilsOtherPercent);
		vars.add(VAR_teachersMale);
		vars.add(VAR_teachersFemale);
		vars.add(VAR_teachersTotal);
		vars.add(VAR_teachersWhiteTotal);
		vars.add(VAR_teachersWhitePercent);
		vars.add(VAR_teachersBlackTotal);
		vars.add(VAR_teachersBlackPercent);
		vars.add(VAR_teachersOtherTotal);
		vars.add(VAR_teachersOtherPercent);
		vars.add(VAR_delinquentComplaintsTotal);
		vars.add(VAR_delinquentComplaintsAtSchool);
		vars.add(VAR_delinquentComplaintsAtSchoolPercent);
		vars.add(VAR_delinquentComplaintsAsian);
		vars.add(VAR_delinquentComplaintsAsianPercent);
		vars.add(VAR_delinquentComplaintsBlack);
		vars.add(VAR_delinquentComplaintsBlackPercent);
		vars.add(VAR_delinquentComplaintsLatinx);
		vars.add(VAR_delinquentComplaintsLatinxPercent);
		vars.add(VAR_delinquentComplaintsMultiRacial);
		vars.add(VAR_delinquentComplaintsMultiRacialPercent);
		vars.add(VAR_delinquentComplaintsIndigenous);
		vars.add(VAR_delinquentComplaintsIndigenousPercent);
		vars.add(VAR_delinquentComplaintsWhite);
		vars.add(VAR_delinquentComplaintsWhitePercent);
		vars.add(VAR_delinquentComplaintsPacificIslander);
		vars.add(VAR_delinquentComplaintsPacificIslanderPercent);
		vars.add(VAR_shortTermSuspensionRate);
		vars.add(VAR_shortTermSuspensionsTotal);
		vars.add(VAR_longTermSuspensionsTotal);
		vars.add(VAR_expulsionsTotal);
		vars.add(VAR_shortTermSuspensionsAsianFemale);
		vars.add(VAR_shortTermSuspensionsAsianMale);
		vars.add(VAR_shortTermSuspensionsAsianTotal);
		vars.add(VAR_shortTermSuspensionsAsianPercent);
		vars.add(VAR_shortTermSuspensionsAsianRate);
		vars.add(VAR_shortTermSuspensionsBlackFemale);
		vars.add(VAR_shortTermSuspensionsBlackMale);
		vars.add(VAR_shortTermSuspensionsBlackTotal);
		vars.add(VAR_shortTermSuspensionsBlackPercent);
		vars.add(VAR_shortTermSuspensionsBlackRate);
		vars.add(VAR_shortTermSuspensionsLatinxFemale);
		vars.add(VAR_shortTermSuspensionsLatinxMale);
		vars.add(VAR_shortTermSuspensionsLatinxTotal);
		vars.add(VAR_shortTermSuspensionsLatinxPercent);
		vars.add(VAR_shortTermSuspensionsLatinxRate);
		vars.add(VAR_shortTermSuspensionsIndigenousFemale);
		vars.add(VAR_shortTermSuspensionsIndigenousMale);
		vars.add(VAR_shortTermSuspensionsIndigenousTotal);
		vars.add(VAR_shortTermSuspensionsIndigenousPercent);
		vars.add(VAR_shortTermSuspensionsIndigenousRate);
		vars.add(VAR_shortTermSuspensionsMultiRacialFemale);
		vars.add(VAR_shortTermSuspensionsMultiRacialMale);
		vars.add(VAR_shortTermSuspensionsMultiRacialTotal);
		vars.add(VAR_shortTermSuspensionsMultiRacialPercent);
		vars.add(VAR_shortTermSuspensionsMultiRacialRate);
		vars.add(VAR_shortTermSuspensionsPacificIslanderFemale);
		vars.add(VAR_shortTermSuspensionsPacificIslanderMale);
		vars.add(VAR_shortTermSuspensionsPacificIslanderTotal);
		vars.add(VAR_shortTermSuspensionsPacificIslanderPercent);
		vars.add(VAR_shortTermSuspensionsPacificIslanderRate);
		vars.add(VAR_shortTermSuspensionsWhiteFemale);
		vars.add(VAR_shortTermSuspensionsWhiteMale);
		vars.add(VAR_shortTermSuspensionsWhiteTotal);
		vars.add(VAR_shortTermSuspensionsWhitePercent);
		vars.add(VAR_shortTermSuspensionsWhiteRate);
		vars.add(VAR_shortTermSuspensionsAllRate);
		vars.add(VAR_shortTermSuspensionsBlackVsWhite);
		vars.add(VAR_examsCollegeReadyGrades38OverallPercent);
		vars.add(VAR_examsCollegeReadyGrades38IndigenousPercent);
		vars.add(VAR_examsCollegeReadyGrades38AsianPercent);
		vars.add(VAR_examsCollegeReadyGrades38BlackPercent);
		vars.add(VAR_examsCollegeReadyGrades38LatinxPercent);
		vars.add(VAR_examsCollegeReadyGrades38MultiRacialPercent);
		vars.add(VAR_examsCollegeReadyGrades38PacificIslanderPercent);
		vars.add(VAR_examsCollegeReadyGrades38WhitePercent);
		vars.add(VAR_examsCollegeReadyGrades912OverallPercent);
		vars.add(VAR_examsCollegeReadyGrades912IndigenousPercent);
		vars.add(VAR_examsCollegeReadyGrades912AsianPercent);
		vars.add(VAR_examsCollegeReadyGrades912BlackPercent);
		vars.add(VAR_examsCollegeReadyGrades912LatinxPercent);
		vars.add(VAR_examsCollegeReadyGrades912MultiRacialPercent);
		vars.add(VAR_examsCollegeReadyGrades912PacificIslanderPercent);
		vars.add(VAR_examsCollegeReadyGrades912WhitePercent);
		vars.add(VAR_graduateWithin4YearsOverallPercent);
		vars.add(VAR_graduateWithin4YearsIndigenousPercent);
		vars.add(VAR_graduateWithin4YearsAsianPercent);
		vars.add(VAR_graduateWithin4YearsBlackPercent);
		vars.add(VAR_graduateWithin4YearsLatinxPercent);
		vars.add(VAR_graduateWithin4YearsMultiRacialPercent);
		vars.add(VAR_graduateWithin4YearsPacificIslanderPercent);
		vars.add(VAR_graduateWithin4YearsWhitePercent);
		vars.add(VAR_examsCollegeReadyGrades38BlackVsWhite);
		vars.add(VAR_examsCollegeReadyGrades38LatinxVsWhite);
		vars.add(VAR_reportCardCompleteName);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return ReportCard.varsRangeReportCard(new ArrayList<String>());
	}
	public static List<String> varsRangeReportCard(List<String> vars) {
		vars.add(VAR_reportCardKey);
		vars.add(VAR_reportCardStartYear);
		vars.add(VAR_reportCardEndYear);
		vars.add(VAR_agencyKey);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		vars.add(VAR_stateKey);
		vars.add(VAR_pupilsTotal);
		vars.add(VAR_pupilsIndigenousFemale);
		vars.add(VAR_pupilsIndigenousMale);
		vars.add(VAR_pupilsIndigenousTotal);
		vars.add(VAR_pupilsIndigenousPercent);
		vars.add(VAR_pupilsAsianFemale);
		vars.add(VAR_pupilsAsianMale);
		vars.add(VAR_pupilsAsianTotal);
		vars.add(VAR_pupilsAsianPercent);
		vars.add(VAR_pupilsLatinxFemale);
		vars.add(VAR_pupilsLatinxMale);
		vars.add(VAR_pupilsLatinxTotal);
		vars.add(VAR_pupilsLatinxPercent);
		vars.add(VAR_pupilsBlackFemale);
		vars.add(VAR_pupilsBlackMale);
		vars.add(VAR_pupilsBlackTotal);
		vars.add(VAR_pupilsBlackPercent);
		vars.add(VAR_pupilsWhiteFemale);
		vars.add(VAR_pupilsWhiteMale);
		vars.add(VAR_pupilsWhiteTotal);
		vars.add(VAR_pupilsWhitePercent);
		vars.add(VAR_pupilsPacificIslanderFemale);
		vars.add(VAR_pupilsPacificIslanderMale);
		vars.add(VAR_pupilsPacificIslanderTotal);
		vars.add(VAR_pupilsPacificIslanderPercent);
		vars.add(VAR_pupilsMultiRacialFemale);
		vars.add(VAR_pupilsMultiRacialMale);
		vars.add(VAR_pupilsMultiRacialTotal);
		vars.add(VAR_pupilsMultiRacialPercent);
		vars.add(VAR_pupilsOtherPercent);
		vars.add(VAR_teachersMale);
		vars.add(VAR_teachersFemale);
		vars.add(VAR_teachersTotal);
		vars.add(VAR_teachersWhiteTotal);
		vars.add(VAR_teachersWhitePercent);
		vars.add(VAR_teachersBlackTotal);
		vars.add(VAR_teachersBlackPercent);
		vars.add(VAR_teachersOtherTotal);
		vars.add(VAR_teachersOtherPercent);
		vars.add(VAR_delinquentComplaintsTotal);
		vars.add(VAR_delinquentComplaintsAtSchool);
		vars.add(VAR_delinquentComplaintsAtSchoolPercent);
		vars.add(VAR_delinquentComplaintsAsian);
		vars.add(VAR_delinquentComplaintsAsianPercent);
		vars.add(VAR_delinquentComplaintsBlack);
		vars.add(VAR_delinquentComplaintsBlackPercent);
		vars.add(VAR_delinquentComplaintsLatinx);
		vars.add(VAR_delinquentComplaintsLatinxPercent);
		vars.add(VAR_delinquentComplaintsMultiRacial);
		vars.add(VAR_delinquentComplaintsMultiRacialPercent);
		vars.add(VAR_delinquentComplaintsIndigenous);
		vars.add(VAR_delinquentComplaintsIndigenousPercent);
		vars.add(VAR_delinquentComplaintsWhite);
		vars.add(VAR_delinquentComplaintsWhitePercent);
		vars.add(VAR_delinquentComplaintsPacificIslander);
		vars.add(VAR_delinquentComplaintsPacificIslanderPercent);
		vars.add(VAR_shortTermSuspensionRate);
		vars.add(VAR_shortTermSuspensionsTotal);
		vars.add(VAR_longTermSuspensionsTotal);
		vars.add(VAR_expulsionsTotal);
		vars.add(VAR_shortTermSuspensionsAsianFemale);
		vars.add(VAR_shortTermSuspensionsAsianMale);
		vars.add(VAR_shortTermSuspensionsAsianTotal);
		vars.add(VAR_shortTermSuspensionsAsianPercent);
		vars.add(VAR_shortTermSuspensionsAsianRate);
		vars.add(VAR_shortTermSuspensionsBlackFemale);
		vars.add(VAR_shortTermSuspensionsBlackMale);
		vars.add(VAR_shortTermSuspensionsBlackTotal);
		vars.add(VAR_shortTermSuspensionsBlackPercent);
		vars.add(VAR_shortTermSuspensionsBlackRate);
		vars.add(VAR_shortTermSuspensionsLatinxFemale);
		vars.add(VAR_shortTermSuspensionsLatinxMale);
		vars.add(VAR_shortTermSuspensionsLatinxTotal);
		vars.add(VAR_shortTermSuspensionsLatinxPercent);
		vars.add(VAR_shortTermSuspensionsLatinxRate);
		vars.add(VAR_shortTermSuspensionsIndigenousFemale);
		vars.add(VAR_shortTermSuspensionsIndigenousMale);
		vars.add(VAR_shortTermSuspensionsIndigenousTotal);
		vars.add(VAR_shortTermSuspensionsIndigenousPercent);
		vars.add(VAR_shortTermSuspensionsIndigenousRate);
		vars.add(VAR_shortTermSuspensionsMultiRacialFemale);
		vars.add(VAR_shortTermSuspensionsMultiRacialMale);
		vars.add(VAR_shortTermSuspensionsMultiRacialTotal);
		vars.add(VAR_shortTermSuspensionsMultiRacialPercent);
		vars.add(VAR_shortTermSuspensionsMultiRacialRate);
		vars.add(VAR_shortTermSuspensionsPacificIslanderFemale);
		vars.add(VAR_shortTermSuspensionsPacificIslanderMale);
		vars.add(VAR_shortTermSuspensionsPacificIslanderTotal);
		vars.add(VAR_shortTermSuspensionsPacificIslanderPercent);
		vars.add(VAR_shortTermSuspensionsPacificIslanderRate);
		vars.add(VAR_shortTermSuspensionsWhiteFemale);
		vars.add(VAR_shortTermSuspensionsWhiteMale);
		vars.add(VAR_shortTermSuspensionsWhiteTotal);
		vars.add(VAR_shortTermSuspensionsWhitePercent);
		vars.add(VAR_shortTermSuspensionsWhiteRate);
		vars.add(VAR_shortTermSuspensionsAllRate);
		vars.add(VAR_shortTermSuspensionsBlackVsWhite);
		vars.add(VAR_examsCollegeReadyGrades38OverallPercent);
		vars.add(VAR_examsCollegeReadyGrades38IndigenousPercent);
		vars.add(VAR_examsCollegeReadyGrades38AsianPercent);
		vars.add(VAR_examsCollegeReadyGrades38BlackPercent);
		vars.add(VAR_examsCollegeReadyGrades38LatinxPercent);
		vars.add(VAR_examsCollegeReadyGrades38MultiRacialPercent);
		vars.add(VAR_examsCollegeReadyGrades38PacificIslanderPercent);
		vars.add(VAR_examsCollegeReadyGrades38WhitePercent);
		vars.add(VAR_examsCollegeReadyGrades912OverallPercent);
		vars.add(VAR_examsCollegeReadyGrades912IndigenousPercent);
		vars.add(VAR_examsCollegeReadyGrades912AsianPercent);
		vars.add(VAR_examsCollegeReadyGrades912BlackPercent);
		vars.add(VAR_examsCollegeReadyGrades912LatinxPercent);
		vars.add(VAR_examsCollegeReadyGrades912MultiRacialPercent);
		vars.add(VAR_examsCollegeReadyGrades912PacificIslanderPercent);
		vars.add(VAR_examsCollegeReadyGrades912WhitePercent);
		vars.add(VAR_graduateWithin4YearsOverallPercent);
		vars.add(VAR_graduateWithin4YearsIndigenousPercent);
		vars.add(VAR_graduateWithin4YearsAsianPercent);
		vars.add(VAR_graduateWithin4YearsBlackPercent);
		vars.add(VAR_graduateWithin4YearsLatinxPercent);
		vars.add(VAR_graduateWithin4YearsMultiRacialPercent);
		vars.add(VAR_graduateWithin4YearsPacificIslanderPercent);
		vars.add(VAR_graduateWithin4YearsWhitePercent);
		vars.add(VAR_examsCollegeReadyGrades38BlackVsWhite);
		vars.add(VAR_examsCollegeReadyGrades38LatinxVsWhite);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_reportCardKey = "";
	public static final String DISPLAY_NAME_reportCardStartYear = "start year";
	public static final String DISPLAY_NAME_reportCardStartYearStr = "";
	public static final String DISPLAY_NAME_reportCardEndYear = "end year";
	public static final String DISPLAY_NAME_reportCardYearsStr = "";
	public static final String DISPLAY_NAME_agencySearch = "";
	public static final String DISPLAY_NAME_agency_ = "";
	public static final String DISPLAY_NAME_agencyKey = "agency";
	public static final String DISPLAY_NAME_imageLeft = "";
	public static final String DISPLAY_NAME_imageTop = "";
	public static final String DISPLAY_NAME_stateKey = "";
	public static final String DISPLAY_NAME_stateId = "";
	public static final String DISPLAY_NAME_agencyId = "";
	public static final String DISPLAY_NAME_stateName = "";
	public static final String DISPLAY_NAME_stateAbbreviation = "";
	public static final String DISPLAY_NAME_agencyOnlyName = "";
	public static final String DISPLAY_NAME_agencyName = "";
	public static final String DISPLAY_NAME_agencyIsState = "";
	public static final String DISPLAY_NAME_agencyCoords = "";
	public static final String DISPLAY_NAME_agencyLeft = "";
	public static final String DISPLAY_NAME_stateReportCardSearch = "";
	public static final String DISPLAY_NAME_stateFacets = "";
	public static final String DISPLAY_NAME_pupilsTotal = "pupils total";
	public static final String DISPLAY_NAME_pupilsIndigenousFemale = "Indigenous female";
	public static final String DISPLAY_NAME_pupilsIndigenousMale = "Indigenous male";
	public static final String DISPLAY_NAME_pupilsIndigenousTotal = "Indigenous total";
	public static final String DISPLAY_NAME_pupilsIndigenousPercent = "Indigenous percent";
	public static final String DISPLAY_NAME_pupilsAsianFemale = "Asian female";
	public static final String DISPLAY_NAME_pupilsAsianMale = "Asian male";
	public static final String DISPLAY_NAME_pupilsAsianTotal = "Asians total";
	public static final String DISPLAY_NAME_pupilsAsianPercent = "Asians percent";
	public static final String DISPLAY_NAME_pupilsLatinxFemale = "Latinx female";
	public static final String DISPLAY_NAME_pupilsLatinxMale = "Latinx male";
	public static final String DISPLAY_NAME_pupilsLatinxTotal = "Latinx total";
	public static final String DISPLAY_NAME_pupilsLatinxPercent = "Latinx percent";
	public static final String DISPLAY_NAME_pupilsBlackFemale = "Black female";
	public static final String DISPLAY_NAME_pupilsBlackMale = "Black male";
	public static final String DISPLAY_NAME_pupilsBlackTotal = "Blacks total";
	public static final String DISPLAY_NAME_pupilsBlackPercent = "Blacks percent";
	public static final String DISPLAY_NAME_pupilsWhiteFemale = "White female";
	public static final String DISPLAY_NAME_pupilsWhiteMale = "White male";
	public static final String DISPLAY_NAME_pupilsWhiteTotal = "Whites total";
	public static final String DISPLAY_NAME_pupilsWhitePercent = "Whites percent";
	public static final String DISPLAY_NAME_pupilsPacificIslanderFemale = "Pacific Islander female";
	public static final String DISPLAY_NAME_pupilsPacificIslanderMale = "Pacific Islander male";
	public static final String DISPLAY_NAME_pupilsPacificIslanderTotal = "Pacific Islanders total";
	public static final String DISPLAY_NAME_pupilsPacificIslanderPercent = "Pacific Islanders percent";
	public static final String DISPLAY_NAME_pupilsMultiRacialFemale = "Multi Racial female";
	public static final String DISPLAY_NAME_pupilsMultiRacialMale = "Multi Racial male";
	public static final String DISPLAY_NAME_pupilsMultiRacialTotal = "Multi Racial total";
	public static final String DISPLAY_NAME_pupilsMultiRacialPercent = "Multi Racial percent";
	public static final String DISPLAY_NAME_pupilsOtherPercent = "";
	public static final String DISPLAY_NAME_teachersMale = "male teachers total";
	public static final String DISPLAY_NAME_teachersFemale = "female teachers total";
	public static final String DISPLAY_NAME_teachersTotal = "teachers total";
	public static final String DISPLAY_NAME_teachersWhiteTotal = "White teachers";
	public static final String DISPLAY_NAME_teachersWhitePercent = "White teachers percent";
	public static final String DISPLAY_NAME_teachersBlackTotal = "Black teachers";
	public static final String DISPLAY_NAME_teachersBlackPercent = "Black teachers percent";
	public static final String DISPLAY_NAME_teachersOtherTotal = "Other teachers";
	public static final String DISPLAY_NAME_teachersOtherPercent = "Others percent";
	public static final String DISPLAY_NAME_delinquentComplaintsTotal = "delinquent complaints total";
	public static final String DISPLAY_NAME_delinquentComplaintsAtSchool = "delinquent complaints at school";
	public static final String DISPLAY_NAME_delinquentComplaintsAtSchoolPercent = "delinquent complaints at school percent";
	public static final String DISPLAY_NAME_delinquentComplaintsAsian = "Asian complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsAsianPercent = "Asian complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsBlack = "Black complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsBlackPercent = "Black complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsLatinx = "Latinx complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsLatinxPercent = "Latinx complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsMultiRacial = "Multi Racial complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsMultiRacialPercent = "Multi Racial complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsIndigenous = "Indigenous complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsIndigenousPercent = "Indigenous complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsWhite = "White complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsWhitePercent = "White complaints percent";
	public static final String DISPLAY_NAME_delinquentComplaintsPacificIslander = "Pacific Islander complaints";
	public static final String DISPLAY_NAME_delinquentComplaintsPacificIslanderPercent = "Pacific Islander complaints percent";
	public static final String DISPLAY_NAME_shortTermSuspensionRate = "short-term suspension rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsTotal = "short-term suspensions total";
	public static final String DISPLAY_NAME_longTermSuspensionsTotal = "long-term suspensions total";
	public static final String DISPLAY_NAME_expulsionsTotal = "expulsions total";
	public static final String DISPLAY_NAME_shortTermSuspensionsAsianFemale = "short-term suspensions Asian female";
	public static final String DISPLAY_NAME_shortTermSuspensionsAsianMale = "short-term suspensions Asian male";
	public static final String DISPLAY_NAME_shortTermSuspensionsAsianTotal = "short-term suspensions Asians total";
	public static final String DISPLAY_NAME_shortTermSuspensionsAsianPercent = "short-term suspensions Asians percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsAsianRate = "short-term suspensions Asians rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackFemale = "short-term suspensions Black female";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackMale = "short-term suspensions Black male";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackTotal = "short-term suspensions Blacks total";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackPercent = "short-term suspensions Blacks percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackRate = "short-term suspensions Blacks rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsLatinxFemale = "short-term suspensions Latinx female";
	public static final String DISPLAY_NAME_shortTermSuspensionsLatinxMale = "short-term suspensions Latinx male";
	public static final String DISPLAY_NAME_shortTermSuspensionsLatinxTotal = "short-term suspensions Latinx total";
	public static final String DISPLAY_NAME_shortTermSuspensionsLatinxPercent = "short-term suspensions Latinx percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsLatinxRate = "short-term suspensions Latinx rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsIndigenousFemale = "short-term suspensions Indigenous female";
	public static final String DISPLAY_NAME_shortTermSuspensionsIndigenousMale = "short-term suspensions Indigenous male";
	public static final String DISPLAY_NAME_shortTermSuspensionsIndigenousTotal = "short-term suspensions Indigenous total";
	public static final String DISPLAY_NAME_shortTermSuspensionsIndigenousPercent = "short-term suspensions Indigenous percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsIndigenousRate = "short-term suspensions Indigenous rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsMultiRacialFemale = "short-term suspensions Multi Racial female";
	public static final String DISPLAY_NAME_shortTermSuspensionsMultiRacialMale = "short-term suspensions Multi Racial male";
	public static final String DISPLAY_NAME_shortTermSuspensionsMultiRacialTotal = "short-term suspensions Multi Racial total";
	public static final String DISPLAY_NAME_shortTermSuspensionsMultiRacialPercent = "short-term suspensions Multi Racial percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsMultiRacialRate = "short-term suspensions Multi Racial rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsPacificIslanderFemale = "short-term suspensions Pacific Islander female";
	public static final String DISPLAY_NAME_shortTermSuspensionsPacificIslanderMale = "short-term suspensions Pacific Islander male";
	public static final String DISPLAY_NAME_shortTermSuspensionsPacificIslanderTotal = "short-term suspensions Pacific Islanders total";
	public static final String DISPLAY_NAME_shortTermSuspensionsPacificIslanderPercent = "short-term suspensions Pacific Islanders percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsPacificIslanderRate = "short-term suspensions Pacific Islanders rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsWhiteFemale = "short-term suspensions White female";
	public static final String DISPLAY_NAME_shortTermSuspensionsWhiteMale = "short-term suspensions White male";
	public static final String DISPLAY_NAME_shortTermSuspensionsWhiteTotal = "short-term suspensions Whites total";
	public static final String DISPLAY_NAME_shortTermSuspensionsWhitePercent = "short-term suspensions Whites percent";
	public static final String DISPLAY_NAME_shortTermSuspensionsWhiteRate = "short-term suspensions Whites rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsAllRate = "short-term suspensions all rate";
	public static final String DISPLAY_NAME_shortTermSuspensionsBlackVsWhite = "short-term suspensions black vs white";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38OverallPercent = "College ready exams grades 3-8 overall";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38IndigenousPercent = "College ready exams grades 3-8 indigenous";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38AsianPercent = "College ready exams grades 3-8 asian";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38BlackPercent = "College ready exams grades 3-8 black";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38LatinxPercent = "College ready exams grades 3-8 latinx";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38MultiRacialPercent = "College ready exams grades 3-8 multi-racial";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38PacificIslanderPercent = "College ready exams grades 3-8 pacific islander";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38WhitePercent = "College ready exams grades 3-8 white";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912OverallPercent = "College ready exams grades 9-12 overall";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912IndigenousPercent = "College ready exams grades 9-12 indigenous";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912AsianPercent = "College ready exams grades 9-12 asian";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912BlackPercent = "College ready exams grades 9-12 black";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912LatinxPercent = "College ready exams grades 9-12 latinx";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912MultiRacialPercent = "College ready exams grades 9-12 multi-racial";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912PacificIslanderPercent = "College ready exams grades 9-12 pacific islander";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades912WhitePercent = "College ready exams grades 9-12 white";
	public static final String DISPLAY_NAME_graduateWithin4YearsOverallPercent = "Graduate HS within 4 years overall";
	public static final String DISPLAY_NAME_graduateWithin4YearsIndigenousPercent = "Graduate HS within 4 years indigenous";
	public static final String DISPLAY_NAME_graduateWithin4YearsAsianPercent = "Graduate HS within 4 years asian";
	public static final String DISPLAY_NAME_graduateWithin4YearsBlackPercent = "Graduate HS within 4 years black";
	public static final String DISPLAY_NAME_graduateWithin4YearsLatinxPercent = "Graduate HS within 4 years latinx";
	public static final String DISPLAY_NAME_graduateWithin4YearsMultiRacialPercent = "Graduate HS within 4 years multi-racial";
	public static final String DISPLAY_NAME_graduateWithin4YearsPacificIslanderPercent = "Graduate HS within 4 years pacific islander";
	public static final String DISPLAY_NAME_graduateWithin4YearsWhitePercent = "Graduate HS within 4 years white";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38BlackVsWhite = "exams college ready grades 3-8 black vs white";
	public static final String DISPLAY_NAME_examsCollegeReadyGrades38LatinxVsWhite = "exams colege ready grades 3-8 Latinx vs white";
	public static final String DISPLAY_NAME_reportCardCompleteName = "";
	public static final String DISPLAY_NAME_reportCardNumber_ = "";
	public static final String DISPLAY_NAME_reportCardStates_ = "";
	public static final String DISPLAY_NAME_reportCardAgencies_ = "";
	public static final String DISPLAY_NAME_reportCardReportCards_ = "";
	public static final String DISPLAY_NAME_agencyDemographicsGraph = "";
	public static final String DISPLAY_NAME_agencyStudentsByRaceGraph = "";
	public static final String DISPLAY_NAME_agencyTeachersByRaceGraph = "";
	public static final String DISPLAY_NAME_agencyGrades3To8Graph = "";
	public static final String DISPLAY_NAME_agencyGrades9To12Graph = "";
	public static final String DISPLAY_NAME_agencyGraduatesWithin4YearsGraph = "";
	public static final String DISPLAY_NAME_suspensionsByRaceGraph = "";
	public static final String DISPLAY_NAME_suspensionRatesByRaceGraph = "";
	public static final String DISPLAY_NAME_countySchoolBasedComplaintsGraph = "";
	public static final String DISPLAY_NAME_schoolBasedComplaintsGraph = "";
	public static final String DISPLAY_NAME_agencyStudentsByRaceGraph2 = "";
	public static final String DISPLAY_NAME_reportCardImage = "";

	public static String displayNameForClass(String var) {
		return ReportCard.displayNameReportCard(var);
	}
	public static String displayNameReportCard(String var) {
		switch(var) {
		case VAR_reportCardKey:
			return DISPLAY_NAME_reportCardKey;
		case VAR_reportCardStartYear:
			return DISPLAY_NAME_reportCardStartYear;
		case VAR_reportCardStartYearStr:
			return DISPLAY_NAME_reportCardStartYearStr;
		case VAR_reportCardEndYear:
			return DISPLAY_NAME_reportCardEndYear;
		case VAR_reportCardYearsStr:
			return DISPLAY_NAME_reportCardYearsStr;
		case VAR_agencySearch:
			return DISPLAY_NAME_agencySearch;
		case VAR_agency_:
			return DISPLAY_NAME_agency_;
		case VAR_agencyKey:
			return DISPLAY_NAME_agencyKey;
		case VAR_imageLeft:
			return DISPLAY_NAME_imageLeft;
		case VAR_imageTop:
			return DISPLAY_NAME_imageTop;
		case VAR_stateKey:
			return DISPLAY_NAME_stateKey;
		case VAR_stateId:
			return DISPLAY_NAME_stateId;
		case VAR_agencyId:
			return DISPLAY_NAME_agencyId;
		case VAR_stateName:
			return DISPLAY_NAME_stateName;
		case VAR_stateAbbreviation:
			return DISPLAY_NAME_stateAbbreviation;
		case VAR_agencyOnlyName:
			return DISPLAY_NAME_agencyOnlyName;
		case VAR_agencyName:
			return DISPLAY_NAME_agencyName;
		case VAR_agencyIsState:
			return DISPLAY_NAME_agencyIsState;
		case VAR_agencyCoords:
			return DISPLAY_NAME_agencyCoords;
		case VAR_agencyLeft:
			return DISPLAY_NAME_agencyLeft;
		case VAR_stateReportCardSearch:
			return DISPLAY_NAME_stateReportCardSearch;
		case VAR_stateFacets:
			return DISPLAY_NAME_stateFacets;
		case VAR_pupilsTotal:
			return DISPLAY_NAME_pupilsTotal;
		case VAR_pupilsIndigenousFemale:
			return DISPLAY_NAME_pupilsIndigenousFemale;
		case VAR_pupilsIndigenousMale:
			return DISPLAY_NAME_pupilsIndigenousMale;
		case VAR_pupilsIndigenousTotal:
			return DISPLAY_NAME_pupilsIndigenousTotal;
		case VAR_pupilsIndigenousPercent:
			return DISPLAY_NAME_pupilsIndigenousPercent;
		case VAR_pupilsAsianFemale:
			return DISPLAY_NAME_pupilsAsianFemale;
		case VAR_pupilsAsianMale:
			return DISPLAY_NAME_pupilsAsianMale;
		case VAR_pupilsAsianTotal:
			return DISPLAY_NAME_pupilsAsianTotal;
		case VAR_pupilsAsianPercent:
			return DISPLAY_NAME_pupilsAsianPercent;
		case VAR_pupilsLatinxFemale:
			return DISPLAY_NAME_pupilsLatinxFemale;
		case VAR_pupilsLatinxMale:
			return DISPLAY_NAME_pupilsLatinxMale;
		case VAR_pupilsLatinxTotal:
			return DISPLAY_NAME_pupilsLatinxTotal;
		case VAR_pupilsLatinxPercent:
			return DISPLAY_NAME_pupilsLatinxPercent;
		case VAR_pupilsBlackFemale:
			return DISPLAY_NAME_pupilsBlackFemale;
		case VAR_pupilsBlackMale:
			return DISPLAY_NAME_pupilsBlackMale;
		case VAR_pupilsBlackTotal:
			return DISPLAY_NAME_pupilsBlackTotal;
		case VAR_pupilsBlackPercent:
			return DISPLAY_NAME_pupilsBlackPercent;
		case VAR_pupilsWhiteFemale:
			return DISPLAY_NAME_pupilsWhiteFemale;
		case VAR_pupilsWhiteMale:
			return DISPLAY_NAME_pupilsWhiteMale;
		case VAR_pupilsWhiteTotal:
			return DISPLAY_NAME_pupilsWhiteTotal;
		case VAR_pupilsWhitePercent:
			return DISPLAY_NAME_pupilsWhitePercent;
		case VAR_pupilsPacificIslanderFemale:
			return DISPLAY_NAME_pupilsPacificIslanderFemale;
		case VAR_pupilsPacificIslanderMale:
			return DISPLAY_NAME_pupilsPacificIslanderMale;
		case VAR_pupilsPacificIslanderTotal:
			return DISPLAY_NAME_pupilsPacificIslanderTotal;
		case VAR_pupilsPacificIslanderPercent:
			return DISPLAY_NAME_pupilsPacificIslanderPercent;
		case VAR_pupilsMultiRacialFemale:
			return DISPLAY_NAME_pupilsMultiRacialFemale;
		case VAR_pupilsMultiRacialMale:
			return DISPLAY_NAME_pupilsMultiRacialMale;
		case VAR_pupilsMultiRacialTotal:
			return DISPLAY_NAME_pupilsMultiRacialTotal;
		case VAR_pupilsMultiRacialPercent:
			return DISPLAY_NAME_pupilsMultiRacialPercent;
		case VAR_pupilsOtherPercent:
			return DISPLAY_NAME_pupilsOtherPercent;
		case VAR_teachersMale:
			return DISPLAY_NAME_teachersMale;
		case VAR_teachersFemale:
			return DISPLAY_NAME_teachersFemale;
		case VAR_teachersTotal:
			return DISPLAY_NAME_teachersTotal;
		case VAR_teachersWhiteTotal:
			return DISPLAY_NAME_teachersWhiteTotal;
		case VAR_teachersWhitePercent:
			return DISPLAY_NAME_teachersWhitePercent;
		case VAR_teachersBlackTotal:
			return DISPLAY_NAME_teachersBlackTotal;
		case VAR_teachersBlackPercent:
			return DISPLAY_NAME_teachersBlackPercent;
		case VAR_teachersOtherTotal:
			return DISPLAY_NAME_teachersOtherTotal;
		case VAR_teachersOtherPercent:
			return DISPLAY_NAME_teachersOtherPercent;
		case VAR_delinquentComplaintsTotal:
			return DISPLAY_NAME_delinquentComplaintsTotal;
		case VAR_delinquentComplaintsAtSchool:
			return DISPLAY_NAME_delinquentComplaintsAtSchool;
		case VAR_delinquentComplaintsAtSchoolPercent:
			return DISPLAY_NAME_delinquentComplaintsAtSchoolPercent;
		case VAR_delinquentComplaintsAsian:
			return DISPLAY_NAME_delinquentComplaintsAsian;
		case VAR_delinquentComplaintsAsianPercent:
			return DISPLAY_NAME_delinquentComplaintsAsianPercent;
		case VAR_delinquentComplaintsBlack:
			return DISPLAY_NAME_delinquentComplaintsBlack;
		case VAR_delinquentComplaintsBlackPercent:
			return DISPLAY_NAME_delinquentComplaintsBlackPercent;
		case VAR_delinquentComplaintsLatinx:
			return DISPLAY_NAME_delinquentComplaintsLatinx;
		case VAR_delinquentComplaintsLatinxPercent:
			return DISPLAY_NAME_delinquentComplaintsLatinxPercent;
		case VAR_delinquentComplaintsMultiRacial:
			return DISPLAY_NAME_delinquentComplaintsMultiRacial;
		case VAR_delinquentComplaintsMultiRacialPercent:
			return DISPLAY_NAME_delinquentComplaintsMultiRacialPercent;
		case VAR_delinquentComplaintsIndigenous:
			return DISPLAY_NAME_delinquentComplaintsIndigenous;
		case VAR_delinquentComplaintsIndigenousPercent:
			return DISPLAY_NAME_delinquentComplaintsIndigenousPercent;
		case VAR_delinquentComplaintsWhite:
			return DISPLAY_NAME_delinquentComplaintsWhite;
		case VAR_delinquentComplaintsWhitePercent:
			return DISPLAY_NAME_delinquentComplaintsWhitePercent;
		case VAR_delinquentComplaintsPacificIslander:
			return DISPLAY_NAME_delinquentComplaintsPacificIslander;
		case VAR_delinquentComplaintsPacificIslanderPercent:
			return DISPLAY_NAME_delinquentComplaintsPacificIslanderPercent;
		case VAR_shortTermSuspensionRate:
			return DISPLAY_NAME_shortTermSuspensionRate;
		case VAR_shortTermSuspensionsTotal:
			return DISPLAY_NAME_shortTermSuspensionsTotal;
		case VAR_longTermSuspensionsTotal:
			return DISPLAY_NAME_longTermSuspensionsTotal;
		case VAR_expulsionsTotal:
			return DISPLAY_NAME_expulsionsTotal;
		case VAR_shortTermSuspensionsAsianFemale:
			return DISPLAY_NAME_shortTermSuspensionsAsianFemale;
		case VAR_shortTermSuspensionsAsianMale:
			return DISPLAY_NAME_shortTermSuspensionsAsianMale;
		case VAR_shortTermSuspensionsAsianTotal:
			return DISPLAY_NAME_shortTermSuspensionsAsianTotal;
		case VAR_shortTermSuspensionsAsianPercent:
			return DISPLAY_NAME_shortTermSuspensionsAsianPercent;
		case VAR_shortTermSuspensionsAsianRate:
			return DISPLAY_NAME_shortTermSuspensionsAsianRate;
		case VAR_shortTermSuspensionsBlackFemale:
			return DISPLAY_NAME_shortTermSuspensionsBlackFemale;
		case VAR_shortTermSuspensionsBlackMale:
			return DISPLAY_NAME_shortTermSuspensionsBlackMale;
		case VAR_shortTermSuspensionsBlackTotal:
			return DISPLAY_NAME_shortTermSuspensionsBlackTotal;
		case VAR_shortTermSuspensionsBlackPercent:
			return DISPLAY_NAME_shortTermSuspensionsBlackPercent;
		case VAR_shortTermSuspensionsBlackRate:
			return DISPLAY_NAME_shortTermSuspensionsBlackRate;
		case VAR_shortTermSuspensionsLatinxFemale:
			return DISPLAY_NAME_shortTermSuspensionsLatinxFemale;
		case VAR_shortTermSuspensionsLatinxMale:
			return DISPLAY_NAME_shortTermSuspensionsLatinxMale;
		case VAR_shortTermSuspensionsLatinxTotal:
			return DISPLAY_NAME_shortTermSuspensionsLatinxTotal;
		case VAR_shortTermSuspensionsLatinxPercent:
			return DISPLAY_NAME_shortTermSuspensionsLatinxPercent;
		case VAR_shortTermSuspensionsLatinxRate:
			return DISPLAY_NAME_shortTermSuspensionsLatinxRate;
		case VAR_shortTermSuspensionsIndigenousFemale:
			return DISPLAY_NAME_shortTermSuspensionsIndigenousFemale;
		case VAR_shortTermSuspensionsIndigenousMale:
			return DISPLAY_NAME_shortTermSuspensionsIndigenousMale;
		case VAR_shortTermSuspensionsIndigenousTotal:
			return DISPLAY_NAME_shortTermSuspensionsIndigenousTotal;
		case VAR_shortTermSuspensionsIndigenousPercent:
			return DISPLAY_NAME_shortTermSuspensionsIndigenousPercent;
		case VAR_shortTermSuspensionsIndigenousRate:
			return DISPLAY_NAME_shortTermSuspensionsIndigenousRate;
		case VAR_shortTermSuspensionsMultiRacialFemale:
			return DISPLAY_NAME_shortTermSuspensionsMultiRacialFemale;
		case VAR_shortTermSuspensionsMultiRacialMale:
			return DISPLAY_NAME_shortTermSuspensionsMultiRacialMale;
		case VAR_shortTermSuspensionsMultiRacialTotal:
			return DISPLAY_NAME_shortTermSuspensionsMultiRacialTotal;
		case VAR_shortTermSuspensionsMultiRacialPercent:
			return DISPLAY_NAME_shortTermSuspensionsMultiRacialPercent;
		case VAR_shortTermSuspensionsMultiRacialRate:
			return DISPLAY_NAME_shortTermSuspensionsMultiRacialRate;
		case VAR_shortTermSuspensionsPacificIslanderFemale:
			return DISPLAY_NAME_shortTermSuspensionsPacificIslanderFemale;
		case VAR_shortTermSuspensionsPacificIslanderMale:
			return DISPLAY_NAME_shortTermSuspensionsPacificIslanderMale;
		case VAR_shortTermSuspensionsPacificIslanderTotal:
			return DISPLAY_NAME_shortTermSuspensionsPacificIslanderTotal;
		case VAR_shortTermSuspensionsPacificIslanderPercent:
			return DISPLAY_NAME_shortTermSuspensionsPacificIslanderPercent;
		case VAR_shortTermSuspensionsPacificIslanderRate:
			return DISPLAY_NAME_shortTermSuspensionsPacificIslanderRate;
		case VAR_shortTermSuspensionsWhiteFemale:
			return DISPLAY_NAME_shortTermSuspensionsWhiteFemale;
		case VAR_shortTermSuspensionsWhiteMale:
			return DISPLAY_NAME_shortTermSuspensionsWhiteMale;
		case VAR_shortTermSuspensionsWhiteTotal:
			return DISPLAY_NAME_shortTermSuspensionsWhiteTotal;
		case VAR_shortTermSuspensionsWhitePercent:
			return DISPLAY_NAME_shortTermSuspensionsWhitePercent;
		case VAR_shortTermSuspensionsWhiteRate:
			return DISPLAY_NAME_shortTermSuspensionsWhiteRate;
		case VAR_shortTermSuspensionsAllRate:
			return DISPLAY_NAME_shortTermSuspensionsAllRate;
		case VAR_shortTermSuspensionsBlackVsWhite:
			return DISPLAY_NAME_shortTermSuspensionsBlackVsWhite;
		case VAR_examsCollegeReadyGrades38OverallPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38OverallPercent;
		case VAR_examsCollegeReadyGrades38IndigenousPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38IndigenousPercent;
		case VAR_examsCollegeReadyGrades38AsianPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38AsianPercent;
		case VAR_examsCollegeReadyGrades38BlackPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38BlackPercent;
		case VAR_examsCollegeReadyGrades38LatinxPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38LatinxPercent;
		case VAR_examsCollegeReadyGrades38MultiRacialPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38MultiRacialPercent;
		case VAR_examsCollegeReadyGrades38PacificIslanderPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38PacificIslanderPercent;
		case VAR_examsCollegeReadyGrades38WhitePercent:
			return DISPLAY_NAME_examsCollegeReadyGrades38WhitePercent;
		case VAR_examsCollegeReadyGrades912OverallPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912OverallPercent;
		case VAR_examsCollegeReadyGrades912IndigenousPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912IndigenousPercent;
		case VAR_examsCollegeReadyGrades912AsianPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912AsianPercent;
		case VAR_examsCollegeReadyGrades912BlackPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912BlackPercent;
		case VAR_examsCollegeReadyGrades912LatinxPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912LatinxPercent;
		case VAR_examsCollegeReadyGrades912MultiRacialPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912MultiRacialPercent;
		case VAR_examsCollegeReadyGrades912PacificIslanderPercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912PacificIslanderPercent;
		case VAR_examsCollegeReadyGrades912WhitePercent:
			return DISPLAY_NAME_examsCollegeReadyGrades912WhitePercent;
		case VAR_graduateWithin4YearsOverallPercent:
			return DISPLAY_NAME_graduateWithin4YearsOverallPercent;
		case VAR_graduateWithin4YearsIndigenousPercent:
			return DISPLAY_NAME_graduateWithin4YearsIndigenousPercent;
		case VAR_graduateWithin4YearsAsianPercent:
			return DISPLAY_NAME_graduateWithin4YearsAsianPercent;
		case VAR_graduateWithin4YearsBlackPercent:
			return DISPLAY_NAME_graduateWithin4YearsBlackPercent;
		case VAR_graduateWithin4YearsLatinxPercent:
			return DISPLAY_NAME_graduateWithin4YearsLatinxPercent;
		case VAR_graduateWithin4YearsMultiRacialPercent:
			return DISPLAY_NAME_graduateWithin4YearsMultiRacialPercent;
		case VAR_graduateWithin4YearsPacificIslanderPercent:
			return DISPLAY_NAME_graduateWithin4YearsPacificIslanderPercent;
		case VAR_graduateWithin4YearsWhitePercent:
			return DISPLAY_NAME_graduateWithin4YearsWhitePercent;
		case VAR_examsCollegeReadyGrades38BlackVsWhite:
			return DISPLAY_NAME_examsCollegeReadyGrades38BlackVsWhite;
		case VAR_examsCollegeReadyGrades38LatinxVsWhite:
			return DISPLAY_NAME_examsCollegeReadyGrades38LatinxVsWhite;
		case VAR_reportCardCompleteName:
			return DISPLAY_NAME_reportCardCompleteName;
		case VAR_reportCardNumber_:
			return DISPLAY_NAME_reportCardNumber_;
		case VAR_reportCardStates_:
			return DISPLAY_NAME_reportCardStates_;
		case VAR_reportCardAgencies_:
			return DISPLAY_NAME_reportCardAgencies_;
		case VAR_reportCardReportCards_:
			return DISPLAY_NAME_reportCardReportCards_;
		case VAR_agencyDemographicsGraph:
			return DISPLAY_NAME_agencyDemographicsGraph;
		case VAR_agencyStudentsByRaceGraph:
			return DISPLAY_NAME_agencyStudentsByRaceGraph;
		case VAR_agencyTeachersByRaceGraph:
			return DISPLAY_NAME_agencyTeachersByRaceGraph;
		case VAR_agencyGrades3To8Graph:
			return DISPLAY_NAME_agencyGrades3To8Graph;
		case VAR_agencyGrades9To12Graph:
			return DISPLAY_NAME_agencyGrades9To12Graph;
		case VAR_agencyGraduatesWithin4YearsGraph:
			return DISPLAY_NAME_agencyGraduatesWithin4YearsGraph;
		case VAR_suspensionsByRaceGraph:
			return DISPLAY_NAME_suspensionsByRaceGraph;
		case VAR_suspensionRatesByRaceGraph:
			return DISPLAY_NAME_suspensionRatesByRaceGraph;
		case VAR_countySchoolBasedComplaintsGraph:
			return DISPLAY_NAME_countySchoolBasedComplaintsGraph;
		case VAR_schoolBasedComplaintsGraph:
			return DISPLAY_NAME_schoolBasedComplaintsGraph;
		case VAR_agencyStudentsByRaceGraph2:
			return DISPLAY_NAME_agencyStudentsByRaceGraph2;
		case VAR_reportCardImage:
			return DISPLAY_NAME_reportCardImage;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionReportCard(String var) {
		switch(var) {
		case VAR_reportCardKey:
			return "The primary key of the report card in the database. ";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameReportCard(String var) {
		switch(var) {
		case VAR_reportCardKey:
			return "Long";
		case VAR_reportCardStartYear:
			return "Integer";
		case VAR_reportCardStartYearStr:
			return "String";
		case VAR_reportCardEndYear:
			return "Integer";
		case VAR_reportCardYearsStr:
			return "String";
		case VAR_agencySearch:
			return "SearchList";
		case VAR_agency_:
			return "SiteAgency";
		case VAR_agencyKey:
			return "Long";
		case VAR_imageLeft:
			return "Integer";
		case VAR_imageTop:
			return "Integer";
		case VAR_stateKey:
			return "Long";
		case VAR_stateId:
			return "String";
		case VAR_agencyId:
			return "String";
		case VAR_stateName:
			return "String";
		case VAR_stateAbbreviation:
			return "String";
		case VAR_agencyOnlyName:
			return "String";
		case VAR_agencyName:
			return "String";
		case VAR_agencyIsState:
			return "Boolean";
		case VAR_agencyCoords:
			return "String";
		case VAR_agencyLeft:
			return "Integer";
		case VAR_stateReportCardSearch:
			return "SearchList";
		case VAR_stateFacets:
			return "Map";
		case VAR_pupilsTotal:
			return "Long";
		case VAR_pupilsIndigenousFemale:
			return "Long";
		case VAR_pupilsIndigenousMale:
			return "Long";
		case VAR_pupilsIndigenousTotal:
			return "Long";
		case VAR_pupilsIndigenousPercent:
			return "BigDecimal";
		case VAR_pupilsAsianFemale:
			return "Long";
		case VAR_pupilsAsianMale:
			return "Long";
		case VAR_pupilsAsianTotal:
			return "Long";
		case VAR_pupilsAsianPercent:
			return "BigDecimal";
		case VAR_pupilsLatinxFemale:
			return "Long";
		case VAR_pupilsLatinxMale:
			return "Long";
		case VAR_pupilsLatinxTotal:
			return "Long";
		case VAR_pupilsLatinxPercent:
			return "BigDecimal";
		case VAR_pupilsBlackFemale:
			return "Long";
		case VAR_pupilsBlackMale:
			return "Long";
		case VAR_pupilsBlackTotal:
			return "Long";
		case VAR_pupilsBlackPercent:
			return "BigDecimal";
		case VAR_pupilsWhiteFemale:
			return "Long";
		case VAR_pupilsWhiteMale:
			return "Long";
		case VAR_pupilsWhiteTotal:
			return "Long";
		case VAR_pupilsWhitePercent:
			return "BigDecimal";
		case VAR_pupilsPacificIslanderFemale:
			return "Long";
		case VAR_pupilsPacificIslanderMale:
			return "Long";
		case VAR_pupilsPacificIslanderTotal:
			return "Long";
		case VAR_pupilsPacificIslanderPercent:
			return "BigDecimal";
		case VAR_pupilsMultiRacialFemale:
			return "Long";
		case VAR_pupilsMultiRacialMale:
			return "Long";
		case VAR_pupilsMultiRacialTotal:
			return "Long";
		case VAR_pupilsMultiRacialPercent:
			return "BigDecimal";
		case VAR_pupilsOtherPercent:
			return "BigDecimal";
		case VAR_teachersMale:
			return "Long";
		case VAR_teachersFemale:
			return "Long";
		case VAR_teachersTotal:
			return "Long";
		case VAR_teachersWhiteTotal:
			return "Long";
		case VAR_teachersWhitePercent:
			return "BigDecimal";
		case VAR_teachersBlackTotal:
			return "Long";
		case VAR_teachersBlackPercent:
			return "BigDecimal";
		case VAR_teachersOtherTotal:
			return "Long";
		case VAR_teachersOtherPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsTotal:
			return "Long";
		case VAR_delinquentComplaintsAtSchool:
			return "Long";
		case VAR_delinquentComplaintsAtSchoolPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsAsian:
			return "Long";
		case VAR_delinquentComplaintsAsianPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsBlack:
			return "Long";
		case VAR_delinquentComplaintsBlackPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsLatinx:
			return "Long";
		case VAR_delinquentComplaintsLatinxPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsMultiRacial:
			return "Long";
		case VAR_delinquentComplaintsMultiRacialPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsIndigenous:
			return "Long";
		case VAR_delinquentComplaintsIndigenousPercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsWhite:
			return "Long";
		case VAR_delinquentComplaintsWhitePercent:
			return "BigDecimal";
		case VAR_delinquentComplaintsPacificIslander:
			return "Long";
		case VAR_delinquentComplaintsPacificIslanderPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionRate:
			return "Long";
		case VAR_shortTermSuspensionsTotal:
			return "Long";
		case VAR_longTermSuspensionsTotal:
			return "Long";
		case VAR_expulsionsTotal:
			return "Long";
		case VAR_shortTermSuspensionsAsianFemale:
			return "Long";
		case VAR_shortTermSuspensionsAsianMale:
			return "Long";
		case VAR_shortTermSuspensionsAsianTotal:
			return "Long";
		case VAR_shortTermSuspensionsAsianPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsAsianRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsBlackFemale:
			return "Long";
		case VAR_shortTermSuspensionsBlackMale:
			return "Long";
		case VAR_shortTermSuspensionsBlackTotal:
			return "Long";
		case VAR_shortTermSuspensionsBlackPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsBlackRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsLatinxFemale:
			return "Long";
		case VAR_shortTermSuspensionsLatinxMale:
			return "Long";
		case VAR_shortTermSuspensionsLatinxTotal:
			return "Long";
		case VAR_shortTermSuspensionsLatinxPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsLatinxRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsIndigenousFemale:
			return "Long";
		case VAR_shortTermSuspensionsIndigenousMale:
			return "Long";
		case VAR_shortTermSuspensionsIndigenousTotal:
			return "Long";
		case VAR_shortTermSuspensionsIndigenousPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsIndigenousRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsMultiRacialFemale:
			return "Long";
		case VAR_shortTermSuspensionsMultiRacialMale:
			return "Long";
		case VAR_shortTermSuspensionsMultiRacialTotal:
			return "Long";
		case VAR_shortTermSuspensionsMultiRacialPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsMultiRacialRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsPacificIslanderFemale:
			return "Long";
		case VAR_shortTermSuspensionsPacificIslanderMale:
			return "Long";
		case VAR_shortTermSuspensionsPacificIslanderTotal:
			return "Long";
		case VAR_shortTermSuspensionsPacificIslanderPercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsPacificIslanderRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsWhiteFemale:
			return "Long";
		case VAR_shortTermSuspensionsWhiteMale:
			return "Long";
		case VAR_shortTermSuspensionsWhiteTotal:
			return "Long";
		case VAR_shortTermSuspensionsWhitePercent:
			return "BigDecimal";
		case VAR_shortTermSuspensionsWhiteRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsAllRate:
			return "BigDecimal";
		case VAR_shortTermSuspensionsBlackVsWhite:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38OverallPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38IndigenousPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38AsianPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38BlackPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38LatinxPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38MultiRacialPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38PacificIslanderPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38WhitePercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912OverallPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912IndigenousPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912AsianPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912BlackPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912LatinxPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912MultiRacialPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912PacificIslanderPercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades912WhitePercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsOverallPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsIndigenousPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsAsianPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsBlackPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsLatinxPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsMultiRacialPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsPacificIslanderPercent:
			return "BigDecimal";
		case VAR_graduateWithin4YearsWhitePercent:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38BlackVsWhite:
			return "BigDecimal";
		case VAR_examsCollegeReadyGrades38LatinxVsWhite:
			return "BigDecimal";
		case VAR_reportCardCompleteName:
			return "String";
		case VAR_reportCardNumber_:
			return "Integer";
		case VAR_reportCardStates_:
			return "List";
		case VAR_reportCardAgencies_:
			return "List";
		case VAR_reportCardReportCards_:
			return "List";
		case VAR_agencyDemographicsGraph:
			return "String";
		case VAR_agencyStudentsByRaceGraph:
			return "String";
		case VAR_agencyTeachersByRaceGraph:
			return "String";
		case VAR_agencyGrades3To8Graph:
			return "String";
		case VAR_agencyGrades9To12Graph:
			return "String";
		case VAR_agencyGraduatesWithin4YearsGraph:
			return "String";
		case VAR_suspensionsByRaceGraph:
			return "String";
		case VAR_suspensionRatesByRaceGraph:
			return "String";
		case VAR_countySchoolBasedComplaintsGraph:
			return "String";
		case VAR_schoolBasedComplaintsGraph:
			return "String";
		case VAR_agencyStudentsByRaceGraph2:
			return "String";
		case VAR_reportCardImage:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnReportCard(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowReportCard(String var) {
		switch(var) {
		case VAR_reportCardStartYear:
			return 3;
		case VAR_reportCardEndYear:
			return 3;
		case VAR_agencyKey:
			return 4;
		case VAR_pupilsTotal:
			return 12;
		case VAR_pupilsIndigenousFemale:
			return 5;
		case VAR_pupilsIndigenousMale:
			return 5;
		case VAR_pupilsIndigenousTotal:
			return 5;
		case VAR_pupilsIndigenousPercent:
			return 5;
		case VAR_pupilsAsianFemale:
			return 6;
		case VAR_pupilsAsianMale:
			return 6;
		case VAR_pupilsAsianTotal:
			return 6;
		case VAR_pupilsAsianPercent:
			return 6;
		case VAR_pupilsLatinxFemale:
			return 7;
		case VAR_pupilsLatinxMale:
			return 7;
		case VAR_pupilsLatinxTotal:
			return 7;
		case VAR_pupilsLatinxPercent:
			return 7;
		case VAR_pupilsBlackFemale:
			return 8;
		case VAR_pupilsBlackMale:
			return 8;
		case VAR_pupilsBlackTotal:
			return 8;
		case VAR_pupilsBlackPercent:
			return 8;
		case VAR_pupilsWhiteFemale:
			return 9;
		case VAR_pupilsWhiteMale:
			return 9;
		case VAR_pupilsWhiteTotal:
			return 9;
		case VAR_pupilsWhitePercent:
			return 9;
		case VAR_pupilsPacificIslanderFemale:
			return 10;
		case VAR_pupilsPacificIslanderMale:
			return 10;
		case VAR_pupilsPacificIslanderTotal:
			return 10;
		case VAR_pupilsPacificIslanderPercent:
			return 10;
		case VAR_pupilsMultiRacialFemale:
			return 11;
		case VAR_pupilsMultiRacialMale:
			return 11;
		case VAR_pupilsMultiRacialTotal:
			return 11;
		case VAR_pupilsMultiRacialPercent:
			return 11;
		case VAR_teachersMale:
			return 12;
		case VAR_teachersFemale:
			return 12;
		case VAR_teachersTotal:
			return 12;
		case VAR_teachersWhiteTotal:
			return 13;
		case VAR_teachersWhitePercent:
			return 13;
		case VAR_teachersBlackTotal:
			return 13;
		case VAR_teachersBlackPercent:
			return 13;
		case VAR_teachersOtherTotal:
			return 13;
		case VAR_teachersOtherPercent:
			return 13;
		case VAR_delinquentComplaintsTotal:
			return 14;
		case VAR_delinquentComplaintsAtSchool:
			return 14;
		case VAR_delinquentComplaintsAtSchoolPercent:
			return 14;
		case VAR_delinquentComplaintsAsian:
			return 15;
		case VAR_delinquentComplaintsAsianPercent:
			return 15;
		case VAR_delinquentComplaintsBlack:
			return 15;
		case VAR_delinquentComplaintsBlackPercent:
			return 15;
		case VAR_delinquentComplaintsLatinx:
			return 16;
		case VAR_delinquentComplaintsLatinxPercent:
			return 16;
		case VAR_delinquentComplaintsMultiRacial:
			return 16;
		case VAR_delinquentComplaintsMultiRacialPercent:
			return 16;
		case VAR_delinquentComplaintsIndigenous:
			return 16;
		case VAR_delinquentComplaintsIndigenousPercent:
			return 16;
		case VAR_delinquentComplaintsWhite:
			return 17;
		case VAR_delinquentComplaintsWhitePercent:
			return 17;
		case VAR_delinquentComplaintsPacificIslander:
			return 17;
		case VAR_delinquentComplaintsPacificIslanderPercent:
			return 17;
		case VAR_shortTermSuspensionRate:
			return 18;
		case VAR_shortTermSuspensionsTotal:
			return 18;
		case VAR_longTermSuspensionsTotal:
			return 18;
		case VAR_expulsionsTotal:
			return 18;
		case VAR_shortTermSuspensionsAsianFemale:
			return 19;
		case VAR_shortTermSuspensionsAsianMale:
			return 19;
		case VAR_shortTermSuspensionsAsianTotal:
			return 19;
		case VAR_shortTermSuspensionsAsianPercent:
			return 19;
		case VAR_shortTermSuspensionsAsianRate:
			return 19;
		case VAR_shortTermSuspensionsBlackFemale:
			return 20;
		case VAR_shortTermSuspensionsBlackMale:
			return 20;
		case VAR_shortTermSuspensionsBlackTotal:
			return 20;
		case VAR_shortTermSuspensionsBlackPercent:
			return 20;
		case VAR_shortTermSuspensionsBlackRate:
			return 20;
		case VAR_shortTermSuspensionsLatinxFemale:
			return 21;
		case VAR_shortTermSuspensionsLatinxMale:
			return 21;
		case VAR_shortTermSuspensionsLatinxTotal:
			return 21;
		case VAR_shortTermSuspensionsLatinxPercent:
			return 21;
		case VAR_shortTermSuspensionsLatinxRate:
			return 21;
		case VAR_shortTermSuspensionsIndigenousFemale:
			return 22;
		case VAR_shortTermSuspensionsIndigenousMale:
			return 22;
		case VAR_shortTermSuspensionsIndigenousTotal:
			return 22;
		case VAR_shortTermSuspensionsIndigenousPercent:
			return 22;
		case VAR_shortTermSuspensionsIndigenousRate:
			return 22;
		case VAR_shortTermSuspensionsMultiRacialFemale:
			return 23;
		case VAR_shortTermSuspensionsMultiRacialMale:
			return 23;
		case VAR_shortTermSuspensionsMultiRacialTotal:
			return 23;
		case VAR_shortTermSuspensionsMultiRacialPercent:
			return 23;
		case VAR_shortTermSuspensionsMultiRacialRate:
			return 23;
		case VAR_shortTermSuspensionsPacificIslanderFemale:
			return 24;
		case VAR_shortTermSuspensionsPacificIslanderMale:
			return 24;
		case VAR_shortTermSuspensionsPacificIslanderTotal:
			return 24;
		case VAR_shortTermSuspensionsPacificIslanderPercent:
			return 24;
		case VAR_shortTermSuspensionsPacificIslanderRate:
			return 24;
		case VAR_shortTermSuspensionsWhiteFemale:
			return 25;
		case VAR_shortTermSuspensionsWhiteMale:
			return 25;
		case VAR_shortTermSuspensionsWhiteTotal:
			return 25;
		case VAR_shortTermSuspensionsWhitePercent:
			return 25;
		case VAR_shortTermSuspensionsWhiteRate:
			return 25;
		case VAR_shortTermSuspensionsAllRate:
			return 26;
		case VAR_shortTermSuspensionsBlackVsWhite:
			return 26;
		case VAR_examsCollegeReadyGrades38OverallPercent:
			return 27;
		case VAR_examsCollegeReadyGrades38IndigenousPercent:
			return 27;
		case VAR_examsCollegeReadyGrades38AsianPercent:
			return 27;
		case VAR_examsCollegeReadyGrades38BlackPercent:
			return 27;
		case VAR_examsCollegeReadyGrades38LatinxPercent:
			return 28;
		case VAR_examsCollegeReadyGrades38MultiRacialPercent:
			return 28;
		case VAR_examsCollegeReadyGrades38PacificIslanderPercent:
			return 28;
		case VAR_examsCollegeReadyGrades38WhitePercent:
			return 28;
		case VAR_examsCollegeReadyGrades912OverallPercent:
			return 29;
		case VAR_examsCollegeReadyGrades912IndigenousPercent:
			return 29;
		case VAR_examsCollegeReadyGrades912AsianPercent:
			return 29;
		case VAR_examsCollegeReadyGrades912BlackPercent:
			return 29;
		case VAR_examsCollegeReadyGrades912LatinxPercent:
			return 30;
		case VAR_examsCollegeReadyGrades912MultiRacialPercent:
			return 30;
		case VAR_examsCollegeReadyGrades912PacificIslanderPercent:
			return 30;
		case VAR_examsCollegeReadyGrades912WhitePercent:
			return 30;
		case VAR_graduateWithin4YearsOverallPercent:
			return 31;
		case VAR_graduateWithin4YearsIndigenousPercent:
			return 31;
		case VAR_graduateWithin4YearsAsianPercent:
			return 31;
		case VAR_graduateWithin4YearsBlackPercent:
			return 31;
		case VAR_graduateWithin4YearsLatinxPercent:
			return 32;
		case VAR_graduateWithin4YearsMultiRacialPercent:
			return 32;
		case VAR_graduateWithin4YearsPacificIslanderPercent:
			return 32;
		case VAR_graduateWithin4YearsWhitePercent:
			return 32;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellReportCard(String var) {
		switch(var) {
		case VAR_reportCardStartYear:
			return 1;
		case VAR_reportCardEndYear:
			return 2;
		case VAR_agencyKey:
			return 1;
		case VAR_pupilsTotal:
			return 1;
		case VAR_pupilsIndigenousFemale:
			return 3;
		case VAR_pupilsIndigenousMale:
			return 2;
		case VAR_pupilsIndigenousTotal:
			return 4;
		case VAR_pupilsIndigenousPercent:
			return 5;
		case VAR_pupilsAsianFemale:
			return 2;
		case VAR_pupilsAsianMale:
			return 1;
		case VAR_pupilsAsianTotal:
			return 3;
		case VAR_pupilsAsianPercent:
			return 4;
		case VAR_pupilsLatinxFemale:
			return 2;
		case VAR_pupilsLatinxMale:
			return 1;
		case VAR_pupilsLatinxTotal:
			return 3;
		case VAR_pupilsLatinxPercent:
			return 4;
		case VAR_pupilsBlackFemale:
			return 2;
		case VAR_pupilsBlackMale:
			return 1;
		case VAR_pupilsBlackTotal:
			return 3;
		case VAR_pupilsBlackPercent:
			return 4;
		case VAR_pupilsWhiteFemale:
			return 2;
		case VAR_pupilsWhiteMale:
			return 1;
		case VAR_pupilsWhiteTotal:
			return 3;
		case VAR_pupilsWhitePercent:
			return 4;
		case VAR_pupilsPacificIslanderFemale:
			return 2;
		case VAR_pupilsPacificIslanderMale:
			return 1;
		case VAR_pupilsPacificIslanderTotal:
			return 3;
		case VAR_pupilsPacificIslanderPercent:
			return 4;
		case VAR_pupilsMultiRacialFemale:
			return 2;
		case VAR_pupilsMultiRacialMale:
			return 1;
		case VAR_pupilsMultiRacialTotal:
			return 4;
		case VAR_pupilsMultiRacialPercent:
			return 5;
		case VAR_teachersMale:
			return 2;
		case VAR_teachersFemale:
			return 3;
		case VAR_teachersTotal:
			return 4;
		case VAR_teachersWhiteTotal:
			return 2;
		case VAR_teachersWhitePercent:
			return 3;
		case VAR_teachersBlackTotal:
			return 4;
		case VAR_teachersBlackPercent:
			return 5;
		case VAR_teachersOtherTotal:
			return 6;
		case VAR_teachersOtherPercent:
			return 7;
		case VAR_delinquentComplaintsTotal:
			return 1;
		case VAR_delinquentComplaintsAtSchool:
			return 2;
		case VAR_delinquentComplaintsAtSchoolPercent:
			return 3;
		case VAR_delinquentComplaintsAsian:
			return 3;
		case VAR_delinquentComplaintsAsianPercent:
			return 4;
		case VAR_delinquentComplaintsBlack:
			return 5;
		case VAR_delinquentComplaintsBlackPercent:
			return 6;
		case VAR_delinquentComplaintsLatinx:
			return 1;
		case VAR_delinquentComplaintsLatinxPercent:
			return 2;
		case VAR_delinquentComplaintsMultiRacial:
			return 3;
		case VAR_delinquentComplaintsMultiRacialPercent:
			return 4;
		case VAR_delinquentComplaintsIndigenous:
			return 5;
		case VAR_delinquentComplaintsIndigenousPercent:
			return 6;
		case VAR_delinquentComplaintsWhite:
			return 1;
		case VAR_delinquentComplaintsWhitePercent:
			return 2;
		case VAR_delinquentComplaintsPacificIslander:
			return 3;
		case VAR_delinquentComplaintsPacificIslanderPercent:
			return 4;
		case VAR_shortTermSuspensionRate:
			return 1;
		case VAR_shortTermSuspensionsTotal:
			return 2;
		case VAR_longTermSuspensionsTotal:
			return 3;
		case VAR_expulsionsTotal:
			return 4;
		case VAR_shortTermSuspensionsAsianFemale:
			return 1;
		case VAR_shortTermSuspensionsAsianMale:
			return 2;
		case VAR_shortTermSuspensionsAsianTotal:
			return 3;
		case VAR_shortTermSuspensionsAsianPercent:
			return 4;
		case VAR_shortTermSuspensionsAsianRate:
			return 5;
		case VAR_shortTermSuspensionsBlackFemale:
			return 1;
		case VAR_shortTermSuspensionsBlackMale:
			return 2;
		case VAR_shortTermSuspensionsBlackTotal:
			return 3;
		case VAR_shortTermSuspensionsBlackPercent:
			return 4;
		case VAR_shortTermSuspensionsBlackRate:
			return 5;
		case VAR_shortTermSuspensionsLatinxFemale:
			return 1;
		case VAR_shortTermSuspensionsLatinxMale:
			return 2;
		case VAR_shortTermSuspensionsLatinxTotal:
			return 3;
		case VAR_shortTermSuspensionsLatinxPercent:
			return 4;
		case VAR_shortTermSuspensionsLatinxRate:
			return 5;
		case VAR_shortTermSuspensionsIndigenousFemale:
			return 1;
		case VAR_shortTermSuspensionsIndigenousMale:
			return 2;
		case VAR_shortTermSuspensionsIndigenousTotal:
			return 3;
		case VAR_shortTermSuspensionsIndigenousPercent:
			return 4;
		case VAR_shortTermSuspensionsIndigenousRate:
			return 5;
		case VAR_shortTermSuspensionsMultiRacialFemale:
			return 1;
		case VAR_shortTermSuspensionsMultiRacialMale:
			return 2;
		case VAR_shortTermSuspensionsMultiRacialTotal:
			return 3;
		case VAR_shortTermSuspensionsMultiRacialPercent:
			return 4;
		case VAR_shortTermSuspensionsMultiRacialRate:
			return 5;
		case VAR_shortTermSuspensionsPacificIslanderFemale:
			return 1;
		case VAR_shortTermSuspensionsPacificIslanderMale:
			return 2;
		case VAR_shortTermSuspensionsPacificIslanderTotal:
			return 3;
		case VAR_shortTermSuspensionsPacificIslanderPercent:
			return 4;
		case VAR_shortTermSuspensionsPacificIslanderRate:
			return 5;
		case VAR_shortTermSuspensionsWhiteFemale:
			return 1;
		case VAR_shortTermSuspensionsWhiteMale:
			return 2;
		case VAR_shortTermSuspensionsWhiteTotal:
			return 3;
		case VAR_shortTermSuspensionsWhitePercent:
			return 4;
		case VAR_shortTermSuspensionsWhiteRate:
			return 5;
		case VAR_shortTermSuspensionsAllRate:
			return 1;
		case VAR_shortTermSuspensionsBlackVsWhite:
			return 2;
		case VAR_examsCollegeReadyGrades38OverallPercent:
			return 1;
		case VAR_examsCollegeReadyGrades38IndigenousPercent:
			return 2;
		case VAR_examsCollegeReadyGrades38AsianPercent:
			return 3;
		case VAR_examsCollegeReadyGrades38BlackPercent:
			return 4;
		case VAR_examsCollegeReadyGrades38LatinxPercent:
			return 1;
		case VAR_examsCollegeReadyGrades38MultiRacialPercent:
			return 2;
		case VAR_examsCollegeReadyGrades38PacificIslanderPercent:
			return 3;
		case VAR_examsCollegeReadyGrades38WhitePercent:
			return 4;
		case VAR_examsCollegeReadyGrades912OverallPercent:
			return 1;
		case VAR_examsCollegeReadyGrades912IndigenousPercent:
			return 2;
		case VAR_examsCollegeReadyGrades912AsianPercent:
			return 3;
		case VAR_examsCollegeReadyGrades912BlackPercent:
			return 4;
		case VAR_examsCollegeReadyGrades912LatinxPercent:
			return 1;
		case VAR_examsCollegeReadyGrades912MultiRacialPercent:
			return 2;
		case VAR_examsCollegeReadyGrades912PacificIslanderPercent:
			return 3;
		case VAR_examsCollegeReadyGrades912WhitePercent:
			return 4;
		case VAR_graduateWithin4YearsOverallPercent:
			return 1;
		case VAR_graduateWithin4YearsIndigenousPercent:
			return 2;
		case VAR_graduateWithin4YearsAsianPercent:
			return 3;
		case VAR_graduateWithin4YearsBlackPercent:
			return 4;
		case VAR_graduateWithin4YearsLatinxPercent:
			return 1;
		case VAR_graduateWithin4YearsMultiRacialPercent:
			return 2;
		case VAR_graduateWithin4YearsPacificIslanderPercent:
			return 3;
		case VAR_graduateWithin4YearsWhitePercent:
			return 4;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinReportCard(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxReportCard(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxReportCard(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minReportCard(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
