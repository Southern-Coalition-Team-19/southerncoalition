package org.southerncoalition.enus.model.agency;

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
import java.lang.Long;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import org.southerncoalition.enus.model.state.SiteState;
import java.lang.String;
import org.computate.vertx.config.ComputateVertxConfigKeys;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import java.util.Set;
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
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br>
 **/
public abstract class SiteAgencyGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteAgency.class);

	public static final String SiteAgency_AName = "a agency";
	public static final String SiteAgency_This = "this ";
	public static final String SiteAgency_ThisName = "this agency";
	public static final String SiteAgency_A = "a ";
	public static final String SiteAgency_TheName = "theagency";
	public static final String SiteAgency_NameSingular = "agency";
	public static final String SiteAgency_NamePlural = "agencies";
	public static final String SiteAgency_NameActual = "current agency";
	public static final String SiteAgency_AllName = "all the agencies";
	public static final String SiteAgency_SearchAllNameBy = "search agencies by ";
	public static final String SiteAgency_Title = "agencies";
	public static final String SiteAgency_ThePluralName = "the agencies";
	public static final String SiteAgency_NoNameFound = "no agency found";
	public static final String SiteAgency_NameVar = "agency";
	public static final String SiteAgency_OfName = "of agency";
	public static final String SiteAgency_ANameAdjective = "an agency";
	public static final String SiteAgency_NameAdjectiveSingular = "agency";
	public static final String SiteAgency_NameAdjectivePlural = "agencies";
	public static final String SiteAgency_Color = "pale-yellow";
	public static final String SiteAgency_IconGroup = "regular";
	public static final String SiteAgency_IconName = "road";
	public static final Integer SiteAgency_Rows = 300;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyKey">Find the entity agencyKey in Solr</a>
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
		this.agencyKey = SiteAgency.staticSetAgencyKey(siteRequest_, o);
	}
	public static Long staticSetAgencyKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteAgency agencyKeyInit() {
		Wrap<Long> agencyKeyWrap = new Wrap<Long>().var("agencyKey");
		if(agencyKey == null) {
			_agencyKey(agencyKeyWrap);
			setAgencyKey(agencyKeyWrap.o);
		}
		return (SiteAgency)this;
	}

	public static Long staticSearchAgencyKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrAgencyKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyKey(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrAgencyKey(siteRequest_, SiteAgency.staticSearchAgencyKey(siteRequest_, SiteAgency.staticSetAgencyKey(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyName">Find the entity agencyName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyName(Wrap<String> c);

	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String o) {
		this.agencyName = SiteAgency.staticSetAgencyName(siteRequest_, o);
	}
	public static String staticSetAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency agencyNameInit() {
		Wrap<String> agencyNameWrap = new Wrap<String>().var("agencyName");
		if(agencyName == null) {
			_agencyName(agencyNameWrap);
			setAgencyName(agencyNameWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyName(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrAgencyName(siteRequest_, SiteAgency.staticSearchAgencyName(siteRequest_, SiteAgency.staticSetAgencyName(siteRequest_, o)));
	}

	/////////////////
	// stateSearch //
	/////////////////

	/**	 The entity stateSearch
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<SiteState> stateSearch;

	/**	<br> The entity stateSearch
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateSearch">Find the entity stateSearch in Solr</a>
	 * <br>
	 * @param promise is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateSearch(Promise<SearchList<SiteState>> promise);

	public SearchList<SiteState> getStateSearch() {
		return stateSearch;
	}

	public void setStateSearch(SearchList<SiteState> stateSearch) {
		this.stateSearch = stateSearch;
	}
	public static SearchList<SiteState> staticSetStateSearch(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected Future<SearchList<SiteState>> stateSearchPromise() {
		Promise<SearchList<SiteState>> promise = Promise.promise();
		Promise<SearchList<SiteState>> promise2 = Promise.promise();
		_stateSearch(promise2);
		promise2.future().onSuccess(o -> {
			if(o != null && stateSearch == null) {
				o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
					setStateSearch(o);
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

	////////////
	// state_ //
	////////////

	/**	 The entity state_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected SiteState state_;

	/**	<br> The entity state_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:state_">Find the entity state_ in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _state_(Wrap<SiteState> c);

	public SiteState getState_() {
		return state_;
	}

	public void setState_(SiteState state_) {
		this.state_ = state_;
	}
	public static SiteState staticSetState_(SiteRequestEnUS siteRequest_, String o) {
		return null;
	}
	protected SiteAgency state_Init() {
		Wrap<SiteState> state_Wrap = new Wrap<SiteState>().var("state_");
		if(state_ == null) {
			_state_(state_Wrap);
			setState_(state_Wrap.o);
		}
		return (SiteAgency)this;
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateKey">Find the entity stateKey in Solr</a>
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
		this.stateKey = SiteAgency.staticSetStateKey(siteRequest_, o);
	}
	public static Long staticSetStateKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteAgency stateKeyInit() {
		Wrap<Long> stateKeyWrap = new Wrap<Long>().var("stateKey");
		if(stateKey == null) {
			_stateKey(stateKeyWrap);
			setStateKey(stateKeyWrap.o);
		}
		return (SiteAgency)this;
	}

	public static Long staticSearchStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateKey(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrStateKey(siteRequest_, SiteAgency.staticSearchStateKey(siteRequest_, SiteAgency.staticSetStateKey(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageLeft">Find the entity imageLeft in Solr</a>
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
		this.imageLeft = SiteAgency.staticSetImageLeft(siteRequest_, o);
	}
	public static Integer staticSetImageLeft(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteAgency imageLeftInit() {
		Wrap<Integer> imageLeftWrap = new Wrap<Integer>().var("imageLeft");
		if(imageLeft == null) {
			_imageLeft(imageLeftWrap);
			setImageLeft(imageLeftWrap.o);
		}
		return (SiteAgency)this;
	}

	public static Integer staticSearchImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageLeft(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrImageLeft(siteRequest_, SiteAgency.staticSearchImageLeft(siteRequest_, SiteAgency.staticSetImageLeft(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageTop">Find the entity imageTop in Solr</a>
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
		this.imageTop = SiteAgency.staticSetImageTop(siteRequest_, o);
	}
	public static Integer staticSetImageTop(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteAgency imageTopInit() {
		Wrap<Integer> imageTopWrap = new Wrap<Integer>().var("imageTop");
		if(imageTop == null) {
			_imageTop(imageTopWrap);
			setImageTop(imageTopWrap.o);
		}
		return (SiteAgency)this;
	}

	public static Integer staticSearchImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageTop(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrImageTop(siteRequest_, SiteAgency.staticSearchImageTop(siteRequest_, SiteAgency.staticSetImageTop(siteRequest_, o)));
	}

	/////////////////
	// imageCoords //
	/////////////////

	/**	 The entity imageCoords
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String imageCoords;

	/**	<br> The entity imageCoords
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageCoords">Find the entity imageCoords in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _imageCoords(Wrap<String> c);

	public String getImageCoords() {
		return imageCoords;
	}
	public void setImageCoords(String o) {
		this.imageCoords = SiteAgency.staticSetImageCoords(siteRequest_, o);
	}
	public static String staticSetImageCoords(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency imageCoordsInit() {
		Wrap<String> imageCoordsWrap = new Wrap<String>().var("imageCoords");
		if(imageCoords == null) {
			_imageCoords(imageCoordsWrap);
			setImageCoords(imageCoordsWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchImageCoords(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrImageCoords(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageCoords(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrImageCoords(siteRequest_, SiteAgency.staticSearchImageCoords(siteRequest_, SiteAgency.staticSetImageCoords(siteRequest_, o)));
	}

	////////////////////
	// reportCardKeys //
	////////////////////

	/**	 The entity reportCardKeys
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> reportCardKeys = new ArrayList<Long>();

	/**	<br> The entity reportCardKeys
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reportCardKeys">Find the entity reportCardKeys in Solr</a>
	 * <br>
	 * @param c is the entity already constructed. 
	 **/
	protected abstract void _reportCardKeys(List<Long> c);

	public List<Long> getReportCardKeys() {
		return reportCardKeys;
	}

	public void setReportCardKeys(List<Long> reportCardKeys) {
		this.reportCardKeys = reportCardKeys;
	}
	@JsonIgnore
	public void setReportCardKeys(String o) {
		Long l = SiteAgency.staticSetReportCardKeys(siteRequest_, o);
		if(l != null)
			addReportCardKeys(l);
	}
	public static Long staticSetReportCardKeys(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public SiteAgency addReportCardKeys(Long...objets) {
		for(Long o : objets) {
			addReportCardKeys(o);
		}
		return (SiteAgency)this;
	}
	public SiteAgency addReportCardKeys(Long o) {
		if(o != null)
			this.reportCardKeys.add(o);
		return (SiteAgency)this;
	}
	@JsonIgnore
	public void setReportCardKeys(JsonArray objets) {
		reportCardKeys.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addReportCardKeys(o);
		}
	}
	public SiteAgency addReportCardKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addReportCardKeys(p);
		}
		return (SiteAgency)this;
	}
	protected SiteAgency reportCardKeysInit() {
		_reportCardKeys(reportCardKeys);
		return (SiteAgency)this;
	}

	public static Long staticSearchReportCardKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrReportCardKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqReportCardKeys(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrReportCardKeys(siteRequest_, SiteAgency.staticSearchReportCardKeys(siteRequest_, SiteAgency.staticSetReportCardKeys(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateId">Find the entity stateId in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateId(Wrap<String> c);

	public String getStateId() {
		return stateId;
	}
	public void setStateId(String o) {
		this.stateId = SiteAgency.staticSetStateId(siteRequest_, o);
	}
	public static String staticSetStateId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency stateIdInit() {
		Wrap<String> stateIdWrap = new Wrap<String>().var("stateId");
		if(stateId == null) {
			_stateId(stateIdWrap);
			setStateId(stateIdWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchStateId(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateId(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateId(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrStateId(siteRequest_, SiteAgency.staticSearchStateId(siteRequest_, SiteAgency.staticSetStateId(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateName">Find the entity stateName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateName(Wrap<String> c);

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String o) {
		this.stateName = SiteAgency.staticSetStateName(siteRequest_, o);
	}
	public static String staticSetStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency stateNameInit() {
		Wrap<String> stateNameWrap = new Wrap<String>().var("stateName");
		if(stateName == null) {
			_stateName(stateNameWrap);
			setStateName(stateNameWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateName(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrStateName(siteRequest_, SiteAgency.staticSearchStateName(siteRequest_, SiteAgency.staticSetStateName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateAbbreviation">Find the entity stateAbbreviation in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateAbbreviation(Wrap<String> c);

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}
	public void setStateAbbreviation(String o) {
		this.stateAbbreviation = SiteAgency.staticSetStateAbbreviation(siteRequest_, o);
	}
	public static String staticSetStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency stateAbbreviationInit() {
		Wrap<String> stateAbbreviationWrap = new Wrap<String>().var("stateAbbreviation");
		if(stateAbbreviation == null) {
			_stateAbbreviation(stateAbbreviationWrap);
			setStateAbbreviation(stateAbbreviationWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrStateAbbreviation(siteRequest_, SiteAgency.staticSearchStateAbbreviation(siteRequest_, SiteAgency.staticSetStateAbbreviation(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyIsState">Find the entity agencyIsState in Solr</a>
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
		this.agencyIsState = SiteAgency.staticSetAgencyIsState(siteRequest_, o);
	}
	public static Boolean staticSetAgencyIsState(SiteRequestEnUS siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SiteAgency agencyIsStateInit() {
		Wrap<Boolean> agencyIsStateWrap = new Wrap<Boolean>().var("agencyIsState");
		if(agencyIsState == null) {
			_agencyIsState(agencyIsStateWrap);
			setAgencyIsState(agencyIsStateWrap.o);
		}
		return (SiteAgency)this;
	}

	public static Boolean staticSearchAgencyIsState(SiteRequestEnUS siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrAgencyIsState(SiteRequestEnUS siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyIsState(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrAgencyIsState(siteRequest_, SiteAgency.staticSearchAgencyIsState(siteRequest_, SiteAgency.staticSetAgencyIsState(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyOnlyName">Find the entity agencyOnlyName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyOnlyName(Wrap<String> c);

	public String getAgencyOnlyName() {
		return agencyOnlyName;
	}
	public void setAgencyOnlyName(String o) {
		this.agencyOnlyName = SiteAgency.staticSetAgencyOnlyName(siteRequest_, o);
	}
	public static String staticSetAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency agencyOnlyNameInit() {
		Wrap<String> agencyOnlyNameWrap = new Wrap<String>().var("agencyOnlyName");
		if(agencyOnlyName == null) {
			_agencyOnlyName(agencyOnlyNameWrap);
			setAgencyOnlyName(agencyOnlyNameWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyOnlyName(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrAgencyOnlyName(siteRequest_, SiteAgency.staticSearchAgencyOnlyName(siteRequest_, SiteAgency.staticSetAgencyOnlyName(siteRequest_, o)));
	}

	////////////////////////
	// agencyCompleteName //
	////////////////////////

	/**	 The entity agencyCompleteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String agencyCompleteName;

	/**	<br> The entity agencyCompleteName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.agency.SiteAgency&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyCompleteName">Find the entity agencyCompleteName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _agencyCompleteName(Wrap<String> c);

	public String getAgencyCompleteName() {
		return agencyCompleteName;
	}
	public void setAgencyCompleteName(String o) {
		this.agencyCompleteName = SiteAgency.staticSetAgencyCompleteName(siteRequest_, o);
	}
	public static String staticSetAgencyCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteAgency agencyCompleteNameInit() {
		Wrap<String> agencyCompleteNameWrap = new Wrap<String>().var("agencyCompleteName");
		if(agencyCompleteName == null) {
			_agencyCompleteName(agencyCompleteNameWrap);
			setAgencyCompleteName(agencyCompleteNameWrap.o);
		}
		return (SiteAgency)this;
	}

	public static String staticSearchAgencyCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrAgencyCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return SiteAgency.staticSearchStrAgencyCompleteName(siteRequest_, SiteAgency.staticSearchAgencyCompleteName(siteRequest_, SiteAgency.staticSetAgencyCompleteName(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteAgency(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteAgency();
	}

	public Future<Void> promiseDeepSiteAgency() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteAgency(promise2);
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

	public Future<Void> promiseSiteAgency(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				agencyKeyInit();
				agencyNameInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			stateSearchPromise().onSuccess(stateSearch -> {
				promise2.complete();
			}).onFailure(ex -> {
				promise2.fail(ex);
			});
			return promise2.future();
		}).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				state_Init();
				stateKeyInit();
				imageLeftInit();
				imageTopInit();
				imageCoordsInit();
				reportCardKeysInit();
				stateIdInit();
				stateNameInit();
				stateAbbreviationInit();
				agencyIsStateInit();
				agencyOnlyNameInit();
				agencyCompleteNameInit();
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
		return promiseDeepSiteAgency(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteAgency(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
		if(stateSearch != null)
			stateSearch.setSiteRequest_(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteAgency(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteAgency(v);
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
	public Object obtainSiteAgency(String var) {
		SiteAgency oSiteAgency = (SiteAgency)this;
		switch(var) {
			case "agencyKey":
				return oSiteAgency.agencyKey;
			case "agencyName":
				return oSiteAgency.agencyName;
			case "stateSearch":
				return oSiteAgency.stateSearch;
			case "state_":
				return oSiteAgency.state_;
			case "stateKey":
				return oSiteAgency.stateKey;
			case "imageLeft":
				return oSiteAgency.imageLeft;
			case "imageTop":
				return oSiteAgency.imageTop;
			case "imageCoords":
				return oSiteAgency.imageCoords;
			case "reportCardKeys":
				return oSiteAgency.reportCardKeys;
			case "stateId":
				return oSiteAgency.stateId;
			case "stateName":
				return oSiteAgency.stateName;
			case "stateAbbreviation":
				return oSiteAgency.stateAbbreviation;
			case "agencyIsState":
				return oSiteAgency.agencyIsState;
			case "agencyOnlyName":
				return oSiteAgency.agencyOnlyName;
			case "agencyCompleteName":
				return oSiteAgency.agencyCompleteName;
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
				o = relateSiteAgency(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteAgency(String var, Object val) {
		SiteAgency oSiteAgency = (SiteAgency)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteAgency(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteAgency(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "agencyKey":
			return SiteAgency.staticSetAgencyKey(siteRequest_, o);
		case "agencyName":
			return SiteAgency.staticSetAgencyName(siteRequest_, o);
		case "stateKey":
			return SiteAgency.staticSetStateKey(siteRequest_, o);
		case "imageLeft":
			return SiteAgency.staticSetImageLeft(siteRequest_, o);
		case "imageTop":
			return SiteAgency.staticSetImageTop(siteRequest_, o);
		case "imageCoords":
			return SiteAgency.staticSetImageCoords(siteRequest_, o);
		case "reportCardKeys":
			return SiteAgency.staticSetReportCardKeys(siteRequest_, o);
		case "stateId":
			return SiteAgency.staticSetStateId(siteRequest_, o);
		case "stateName":
			return SiteAgency.staticSetStateName(siteRequest_, o);
		case "stateAbbreviation":
			return SiteAgency.staticSetStateAbbreviation(siteRequest_, o);
		case "agencyIsState":
			return SiteAgency.staticSetAgencyIsState(siteRequest_, o);
		case "agencyOnlyName":
			return SiteAgency.staticSetAgencyOnlyName(siteRequest_, o);
		case "agencyCompleteName":
			return SiteAgency.staticSetAgencyCompleteName(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteAgency(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteAgency(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "agencyKey":
			return SiteAgency.staticSearchAgencyKey(siteRequest_, (Long)o);
		case "agencyName":
			return SiteAgency.staticSearchAgencyName(siteRequest_, (String)o);
		case "stateKey":
			return SiteAgency.staticSearchStateKey(siteRequest_, (Long)o);
		case "imageLeft":
			return SiteAgency.staticSearchImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return SiteAgency.staticSearchImageTop(siteRequest_, (Integer)o);
		case "imageCoords":
			return SiteAgency.staticSearchImageCoords(siteRequest_, (String)o);
		case "reportCardKeys":
			return SiteAgency.staticSearchReportCardKeys(siteRequest_, (Long)o);
		case "stateId":
			return SiteAgency.staticSearchStateId(siteRequest_, (String)o);
		case "stateName":
			return SiteAgency.staticSearchStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return SiteAgency.staticSearchStateAbbreviation(siteRequest_, (String)o);
		case "agencyIsState":
			return SiteAgency.staticSearchAgencyIsState(siteRequest_, (Boolean)o);
		case "agencyOnlyName":
			return SiteAgency.staticSearchAgencyOnlyName(siteRequest_, (String)o);
		case "agencyCompleteName":
			return SiteAgency.staticSearchAgencyCompleteName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteAgency(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteAgency(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "agencyKey":
			return SiteAgency.staticSearchStrAgencyKey(siteRequest_, (Long)o);
		case "agencyName":
			return SiteAgency.staticSearchStrAgencyName(siteRequest_, (String)o);
		case "stateKey":
			return SiteAgency.staticSearchStrStateKey(siteRequest_, (Long)o);
		case "imageLeft":
			return SiteAgency.staticSearchStrImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return SiteAgency.staticSearchStrImageTop(siteRequest_, (Integer)o);
		case "imageCoords":
			return SiteAgency.staticSearchStrImageCoords(siteRequest_, (String)o);
		case "reportCardKeys":
			return SiteAgency.staticSearchStrReportCardKeys(siteRequest_, (Long)o);
		case "stateId":
			return SiteAgency.staticSearchStrStateId(siteRequest_, (String)o);
		case "stateName":
			return SiteAgency.staticSearchStrStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return SiteAgency.staticSearchStrStateAbbreviation(siteRequest_, (String)o);
		case "agencyIsState":
			return SiteAgency.staticSearchStrAgencyIsState(siteRequest_, (Boolean)o);
		case "agencyOnlyName":
			return SiteAgency.staticSearchStrAgencyOnlyName(siteRequest_, (String)o);
		case "agencyCompleteName":
			return SiteAgency.staticSearchStrAgencyCompleteName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteAgency(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteAgency(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "agencyKey":
			return SiteAgency.staticSearchFqAgencyKey(siteRequest_, o);
		case "agencyName":
			return SiteAgency.staticSearchFqAgencyName(siteRequest_, o);
		case "stateKey":
			return SiteAgency.staticSearchFqStateKey(siteRequest_, o);
		case "imageLeft":
			return SiteAgency.staticSearchFqImageLeft(siteRequest_, o);
		case "imageTop":
			return SiteAgency.staticSearchFqImageTop(siteRequest_, o);
		case "imageCoords":
			return SiteAgency.staticSearchFqImageCoords(siteRequest_, o);
		case "reportCardKeys":
			return SiteAgency.staticSearchFqReportCardKeys(siteRequest_, o);
		case "stateId":
			return SiteAgency.staticSearchFqStateId(siteRequest_, o);
		case "stateName":
			return SiteAgency.staticSearchFqStateName(siteRequest_, o);
		case "stateAbbreviation":
			return SiteAgency.staticSearchFqStateAbbreviation(siteRequest_, o);
		case "agencyIsState":
			return SiteAgency.staticSearchFqAgencyIsState(siteRequest_, o);
		case "agencyOnlyName":
			return SiteAgency.staticSearchFqAgencyOnlyName(siteRequest_, o);
		case "agencyCompleteName":
			return SiteAgency.staticSearchFqAgencyCompleteName(siteRequest_, o);
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
					o = persistSiteAgency(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteAgency(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSiteAgency(doc);
	}
	public void populateSiteAgency(SolrResponse.Doc doc) {
		SiteAgency oSiteAgency = (SiteAgency)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("agencyKey")) {
				Long agencyKey = (Long)doc.get("agencyKey_indexedstored_long");
				if(agencyKey != null)
					oSiteAgency.setAgencyKey(agencyKey);
			}

			if(saves.contains("agencyName")) {
				String agencyName = (String)doc.get("agencyName_indexedstored_string");
				if(agencyName != null)
					oSiteAgency.setAgencyName(agencyName);
			}

			if(saves.contains("stateKey")) {
				Long stateKey = (Long)doc.get("stateKey_indexedstored_long");
				if(stateKey != null)
					oSiteAgency.setStateKey(stateKey);
			}

			if(saves.contains("imageLeft")) {
				Integer imageLeft = (Integer)doc.get("imageLeft_indexedstored_int");
				if(imageLeft != null)
					oSiteAgency.setImageLeft(imageLeft);
			}

			if(saves.contains("imageTop")) {
				Integer imageTop = (Integer)doc.get("imageTop_indexedstored_int");
				if(imageTop != null)
					oSiteAgency.setImageTop(imageTop);
			}

			if(saves.contains("imageCoords")) {
				String imageCoords = (String)doc.get("imageCoords_indexedstored_string");
				if(imageCoords != null)
					oSiteAgency.setImageCoords(imageCoords);
			}

			if(saves.contains("reportCardKeys")) {
				List<Long> reportCardKeys = (List<Long>)doc.get("reportCardKeys_indexedstored_longs");
				if(reportCardKeys != null)
					oSiteAgency.reportCardKeys.addAll(reportCardKeys);
			}

			if(saves.contains("stateId")) {
				String stateId = (String)doc.get("stateId_indexedstored_string");
				if(stateId != null)
					oSiteAgency.setStateId(stateId);
			}

			if(saves.contains("stateName")) {
				String stateName = (String)doc.get("stateName_indexedstored_string");
				if(stateName != null)
					oSiteAgency.setStateName(stateName);
			}

			if(saves.contains("stateAbbreviation")) {
				String stateAbbreviation = (String)doc.get("stateAbbreviation_indexedstored_string");
				if(stateAbbreviation != null)
					oSiteAgency.setStateAbbreviation(stateAbbreviation);
			}

			if(saves.contains("agencyIsState")) {
				Boolean agencyIsState = (Boolean)doc.get("agencyIsState_indexedstored_boolean");
				if(agencyIsState != null)
					oSiteAgency.setAgencyIsState(agencyIsState);
			}

			if(saves.contains("agencyOnlyName")) {
				String agencyOnlyName = (String)doc.get("agencyOnlyName_indexedstored_string");
				if(agencyOnlyName != null)
					oSiteAgency.setAgencyOnlyName(agencyOnlyName);
			}

			if(saves.contains("agencyCompleteName")) {
				String agencyCompleteName = (String)doc.get("agencyCompleteName_indexedstored_string");
				if(agencyCompleteName != null)
					oSiteAgency.setAgencyCompleteName(agencyCompleteName);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexSiteAgency(JsonObject doc) {
		if(agencyKey != null) {
			doc.put("agencyKey_indexedstored_long", agencyKey);
		}
		if(agencyName != null) {
			doc.put("agencyName_indexedstored_string", agencyName);
		}
		if(stateKey != null) {
			doc.put("stateKey_indexedstored_long", stateKey);
		}
		if(imageLeft != null) {
			doc.put("imageLeft_indexedstored_int", imageLeft);
		}
		if(imageTop != null) {
			doc.put("imageTop_indexedstored_int", imageTop);
		}
		if(imageCoords != null) {
			doc.put("imageCoords_indexedstored_string", imageCoords);
		}
		if(reportCardKeys != null) {
			JsonArray l = new JsonArray();
			doc.put("reportCardKeys_indexedstored_longs", l);
			for(Long o : reportCardKeys) {
				l.add(o);
			}
		}
		if(stateId != null) {
			doc.put("stateId_indexedstored_string", stateId);
		}
		if(stateName != null) {
			doc.put("stateName_indexedstored_string", stateName);
		}
		if(stateAbbreviation != null) {
			doc.put("stateAbbreviation_indexedstored_string", stateAbbreviation);
		}
		if(agencyIsState != null) {
			doc.put("agencyIsState_indexedstored_boolean", agencyIsState);
		}
		if(agencyOnlyName != null) {
			doc.put("agencyOnlyName_indexedstored_string", agencyOnlyName);
		}
		if(agencyCompleteName != null) {
			doc.put("agencyCompleteName_indexedstored_string", agencyCompleteName);
		}
		super.indexBaseModel(doc);

	}

	public static String varIndexedSiteAgency(String entityVar) {
		switch(entityVar) {
			case "agencyKey":
				return "agencyKey_indexedstored_long";
			case "agencyName":
				return "agencyName_indexedstored_string";
			case "stateKey":
				return "stateKey_indexedstored_long";
			case "imageLeft":
				return "imageLeft_indexedstored_int";
			case "imageTop":
				return "imageTop_indexedstored_int";
			case "imageCoords":
				return "imageCoords_indexedstored_string";
			case "reportCardKeys":
				return "reportCardKeys_indexedstored_longs";
			case "stateId":
				return "stateId_indexedstored_string";
			case "stateName":
				return "stateName_indexedstored_string";
			case "stateAbbreviation":
				return "stateAbbreviation_indexedstored_string";
			case "agencyIsState":
				return "agencyIsState_indexedstored_boolean";
			case "agencyOnlyName":
				return "agencyOnlyName_indexedstored_string";
			case "agencyCompleteName":
				return "agencyCompleteName_indexedstored_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String varSearchSiteAgency(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedSiteAgency(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSiteAgency(doc);
	}
	public void storeSiteAgency(SolrResponse.Doc doc) {
		SiteAgency oSiteAgency = (SiteAgency)this;

		oSiteAgency.setAgencyKey(Optional.ofNullable(doc.get("agencyKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setAgencyName(Optional.ofNullable(doc.get("agencyName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setStateKey(Optional.ofNullable(doc.get("stateKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setImageLeft(Optional.ofNullable(doc.get("imageLeft_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setImageTop(Optional.ofNullable(doc.get("imageTop_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setImageCoords(Optional.ofNullable(doc.get("imageCoords_indexedstored_string")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("reportCardKeys_indexedstored_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteAgency.addReportCardKeys(v.toString());
		});
		oSiteAgency.setStateId(Optional.ofNullable(doc.get("stateId_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setStateName(Optional.ofNullable(doc.get("stateName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setStateAbbreviation(Optional.ofNullable(doc.get("stateAbbreviation_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setAgencyIsState(Optional.ofNullable(doc.get("agencyIsState_indexedstored_boolean")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setAgencyOnlyName(Optional.ofNullable(doc.get("agencyOnlyName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteAgency.setAgencyCompleteName(Optional.ofNullable(doc.get("agencyCompleteName_indexedstored_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteAgency() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteAgency) {
			SiteAgency original = (SiteAgency)o;
			if(!Objects.equals(agencyKey, original.getAgencyKey()))
				apiRequest.addVars("agencyKey");
			if(!Objects.equals(agencyName, original.getAgencyName()))
				apiRequest.addVars("agencyName");
			if(!Objects.equals(stateKey, original.getStateKey()))
				apiRequest.addVars("stateKey");
			if(!Objects.equals(imageLeft, original.getImageLeft()))
				apiRequest.addVars("imageLeft");
			if(!Objects.equals(imageTop, original.getImageTop()))
				apiRequest.addVars("imageTop");
			if(!Objects.equals(imageCoords, original.getImageCoords()))
				apiRequest.addVars("imageCoords");
			if(!Objects.equals(reportCardKeys, original.getReportCardKeys()))
				apiRequest.addVars("reportCardKeys");
			if(!Objects.equals(stateId, original.getStateId()))
				apiRequest.addVars("stateId");
			if(!Objects.equals(stateName, original.getStateName()))
				apiRequest.addVars("stateName");
			if(!Objects.equals(stateAbbreviation, original.getStateAbbreviation()))
				apiRequest.addVars("stateAbbreviation");
			if(!Objects.equals(agencyIsState, original.getAgencyIsState()))
				apiRequest.addVars("agencyIsState");
			if(!Objects.equals(agencyOnlyName, original.getAgencyOnlyName()))
				apiRequest.addVars("agencyOnlyName");
			if(!Objects.equals(agencyCompleteName, original.getAgencyCompleteName()))
				apiRequest.addVars("agencyCompleteName");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(agencyKey).map(v -> "agencyKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(agencyName).map(v -> "agencyName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateKey).map(v -> "stateKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageLeft).map(v -> "imageLeft: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageTop).map(v -> "imageTop: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageCoords).map(v -> "imageCoords: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(reportCardKeys).map(v -> "reportCardKeys: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stateId).map(v -> "stateId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateName).map(v -> "stateName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateAbbreviation).map(v -> "stateAbbreviation: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyIsState).map(v -> "agencyIsState: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(agencyOnlyName).map(v -> "agencyOnlyName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(agencyCompleteName).map(v -> "agencyCompleteName: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String VAR_agencyKey = "agencyKey";
	public static final String VAR_agencyName = "agencyName";
	public static final String VAR_stateSearch = "stateSearch";
	public static final String VAR_state_ = "state_";
	public static final String VAR_stateKey = "stateKey";
	public static final String VAR_imageLeft = "imageLeft";
	public static final String VAR_imageTop = "imageTop";
	public static final String VAR_imageCoords = "imageCoords";
	public static final String VAR_reportCardKeys = "reportCardKeys";
	public static final String VAR_stateId = "stateId";
	public static final String VAR_stateName = "stateName";
	public static final String VAR_stateAbbreviation = "stateAbbreviation";
	public static final String VAR_agencyIsState = "agencyIsState";
	public static final String VAR_agencyOnlyName = "agencyOnlyName";
	public static final String VAR_agencyCompleteName = "agencyCompleteName";

	public static List<String> varsQForClass() {
		return SiteAgency.varsQSiteAgency(new ArrayList<String>());
	}
	public static List<String> varsQSiteAgency(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteAgency.varsFqSiteAgency(new ArrayList<String>());
	}
	public static List<String> varsFqSiteAgency(List<String> vars) {
		vars.add(VAR_agencyKey);
		vars.add(VAR_agencyName);
		vars.add(VAR_stateKey);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		vars.add(VAR_imageCoords);
		vars.add(VAR_reportCardKeys);
		vars.add(VAR_stateId);
		vars.add(VAR_stateName);
		vars.add(VAR_stateAbbreviation);
		vars.add(VAR_agencyIsState);
		vars.add(VAR_agencyOnlyName);
		vars.add(VAR_agencyCompleteName);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteAgency.varsRangeSiteAgency(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteAgency(List<String> vars) {
		vars.add(VAR_agencyKey);
		vars.add(VAR_stateKey);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_agencyKey = "";
	public static final String DISPLAY_NAME_agencyName = "name";
	public static final String DISPLAY_NAME_stateSearch = "";
	public static final String DISPLAY_NAME_state_ = "";
	public static final String DISPLAY_NAME_stateKey = "state";
	public static final String DISPLAY_NAME_imageLeft = "image left pixels";
	public static final String DISPLAY_NAME_imageTop = "image top pixels";
	public static final String DISPLAY_NAME_imageCoords = "image map coordinates";
	public static final String DISPLAY_NAME_reportCardKeys = "report cards";
	public static final String DISPLAY_NAME_stateId = "";
	public static final String DISPLAY_NAME_stateName = "";
	public static final String DISPLAY_NAME_stateAbbreviation = "";
	public static final String DISPLAY_NAME_agencyIsState = "";
	public static final String DISPLAY_NAME_agencyOnlyName = "";
	public static final String DISPLAY_NAME_agencyCompleteName = "";

	public static String displayNameForClass(String var) {
		return SiteAgency.displayNameSiteAgency(var);
	}
	public static String displayNameSiteAgency(String var) {
		switch(var) {
		case VAR_agencyKey:
			return DISPLAY_NAME_agencyKey;
		case VAR_agencyName:
			return DISPLAY_NAME_agencyName;
		case VAR_stateSearch:
			return DISPLAY_NAME_stateSearch;
		case VAR_state_:
			return DISPLAY_NAME_state_;
		case VAR_stateKey:
			return DISPLAY_NAME_stateKey;
		case VAR_imageLeft:
			return DISPLAY_NAME_imageLeft;
		case VAR_imageTop:
			return DISPLAY_NAME_imageTop;
		case VAR_imageCoords:
			return DISPLAY_NAME_imageCoords;
		case VAR_reportCardKeys:
			return DISPLAY_NAME_reportCardKeys;
		case VAR_stateId:
			return DISPLAY_NAME_stateId;
		case VAR_stateName:
			return DISPLAY_NAME_stateName;
		case VAR_stateAbbreviation:
			return DISPLAY_NAME_stateAbbreviation;
		case VAR_agencyIsState:
			return DISPLAY_NAME_agencyIsState;
		case VAR_agencyOnlyName:
			return DISPLAY_NAME_agencyOnlyName;
		case VAR_agencyCompleteName:
			return DISPLAY_NAME_agencyCompleteName;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSiteAgency(String var) {
		switch(var) {
		case VAR_agencyKey:
			return "The primary key of the agency in the database. ";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSiteAgency(String var) {
		switch(var) {
		case VAR_agencyKey:
			return "Long";
		case VAR_agencyName:
			return "String";
		case VAR_stateSearch:
			return "SearchList";
		case VAR_state_:
			return "SiteState";
		case VAR_stateKey:
			return "Long";
		case VAR_imageLeft:
			return "Integer";
		case VAR_imageTop:
			return "Integer";
		case VAR_imageCoords:
			return "String";
		case VAR_reportCardKeys:
			return "List";
		case VAR_stateId:
			return "String";
		case VAR_stateName:
			return "String";
		case VAR_stateAbbreviation:
			return "String";
		case VAR_agencyIsState:
			return "Boolean";
		case VAR_agencyOnlyName:
			return "String";
		case VAR_agencyCompleteName:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnSiteAgency(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowSiteAgency(String var) {
		switch(var) {
		case VAR_agencyName:
			return 3;
		case VAR_stateKey:
			return 5;
		case VAR_imageLeft:
			return 4;
		case VAR_imageTop:
			return 4;
		case VAR_imageCoords:
			return 4;
		case VAR_reportCardKeys:
			return 5;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellSiteAgency(String var) {
		switch(var) {
		case VAR_agencyName:
			return 1;
		case VAR_stateKey:
			return 1;
		case VAR_imageLeft:
			return 1;
		case VAR_imageTop:
			return 2;
		case VAR_imageCoords:
			return 3;
		case VAR_reportCardKeys:
			return 2;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinSiteAgency(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxSiteAgency(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxSiteAgency(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minSiteAgency(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
