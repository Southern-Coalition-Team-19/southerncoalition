package org.southerncoalition.enus.model.state;

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
import io.vertx.core.json.JsonObject;
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
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br>
 **/
public abstract class SiteStateGen<DEV> extends BaseModel {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteState.class);

	public static final String SiteState_AName = "a state";
	public static final String SiteState_This = "this ";
	public static final String SiteState_ThisName = "this state";
	public static final String SiteState_A = "a ";
	public static final String SiteState_TheName = "the state";
	public static final String SiteState_NameSingular = "state";
	public static final String SiteState_NamePlural = "states";
	public static final String SiteState_NameActual = "current state";
	public static final String SiteState_AllName = "all the states";
	public static final String SiteState_SearchAllNameBy = "search states by ";
	public static final String SiteState_Title = "states";
	public static final String SiteState_ThePluralName = "the states";
	public static final String SiteState_NoNameFound = "no state found";
	public static final String SiteState_NameVar = "state";
	public static final String SiteState_OfName = "of state";
	public static final String SiteState_ANameAdjective = "a state";
	public static final String SiteState_NameAdjectiveSingular = "state";
	public static final String SiteState_NameAdjectivePlural = "states";
	public static final String SiteState_Color = "pale-blue";
	public static final String SiteState_IconGroup = "regular";
	public static final String SiteState_IconName = "globe-americas";
	public static final Integer SiteState_Rows = 100;

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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateKey">Find the entity stateKey in Solr</a>
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
		this.stateKey = SiteState.staticSetStateKey(siteRequest_, o);
	}
	public static Long staticSetStateKey(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SiteState stateKeyInit() {
		Wrap<Long> stateKeyWrap = new Wrap<Long>().var("stateKey");
		if(stateKey == null) {
			_stateKey(stateKeyWrap);
			setStateKey(stateKeyWrap.o);
		}
		return (SiteState)this;
	}

	public static Long staticSearchStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrStateKey(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateKey(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrStateKey(siteRequest_, SiteState.staticSearchStateKey(siteRequest_, SiteState.staticSetStateKey(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateName">Find the entity stateName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateName(Wrap<String> c);

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String o) {
		this.stateName = SiteState.staticSetStateName(siteRequest_, o);
	}
	public static String staticSetStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteState stateNameInit() {
		Wrap<String> stateNameWrap = new Wrap<String>().var("stateName");
		if(stateName == null) {
			_stateName(stateNameWrap);
			setStateName(stateNameWrap.o);
		}
		return (SiteState)this;
	}

	public static String staticSearchStateName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateName(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrStateName(siteRequest_, SiteState.staticSearchStateName(siteRequest_, SiteState.staticSetStateName(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateAbbreviation">Find the entity stateAbbreviation in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateAbbreviation(Wrap<String> c);

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}
	public void setStateAbbreviation(String o) {
		this.stateAbbreviation = SiteState.staticSetStateAbbreviation(siteRequest_, o);
	}
	public static String staticSetStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteState stateAbbreviationInit() {
		Wrap<String> stateAbbreviationWrap = new Wrap<String>().var("stateAbbreviation");
		if(stateAbbreviation == null) {
			_stateAbbreviation(stateAbbreviationWrap);
			setStateAbbreviation(stateAbbreviationWrap.o);
		}
		return (SiteState)this;
	}

	public static String staticSearchStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateAbbreviation(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrStateAbbreviation(siteRequest_, SiteState.staticSearchStateAbbreviation(siteRequest_, SiteState.staticSetStateAbbreviation(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageLeft">Find the entity imageLeft in Solr</a>
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
		this.imageLeft = SiteState.staticSetImageLeft(siteRequest_, o);
	}
	public static Integer staticSetImageLeft(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteState imageLeftInit() {
		Wrap<Integer> imageLeftWrap = new Wrap<Integer>().var("imageLeft");
		if(imageLeft == null) {
			_imageLeft(imageLeftWrap);
			setImageLeft(imageLeftWrap.o);
		}
		return (SiteState)this;
	}

	public static Integer staticSearchImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageLeft(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageLeft(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrImageLeft(siteRequest_, SiteState.staticSearchImageLeft(siteRequest_, SiteState.staticSetImageLeft(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:imageTop">Find the entity imageTop in Solr</a>
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
		this.imageTop = SiteState.staticSetImageTop(siteRequest_, o);
	}
	public static Integer staticSetImageTop(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SiteState imageTopInit() {
		Wrap<Integer> imageTopWrap = new Wrap<Integer>().var("imageTop");
		if(imageTop == null) {
			_imageTop(imageTopWrap);
			setImageTop(imageTopWrap.o);
		}
		return (SiteState)this;
	}

	public static Integer staticSearchImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrImageTop(SiteRequestEnUS siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqImageTop(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrImageTop(siteRequest_, SiteState.staticSearchImageTop(siteRequest_, SiteState.staticSetImageTop(siteRequest_, o)));
	}

	////////////////
	// agencyKeys //
	////////////////

	/**	 The entity agencyKeys
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> agencyKeys = new ArrayList<Long>();

	/**	<br> The entity agencyKeys
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:agencyKeys">Find the entity agencyKeys in Solr</a>
	 * <br>
	 * @param o is the entity already constructed. 
	 **/
	protected abstract void _agencyKeys(List<Long> o);

	public List<Long> getAgencyKeys() {
		return agencyKeys;
	}

	public void setAgencyKeys(List<Long> agencyKeys) {
		this.agencyKeys = agencyKeys;
	}
	@JsonIgnore
	public void setAgencyKeys(String o) {
		Long l = SiteState.staticSetAgencyKeys(siteRequest_, o);
		if(l != null)
			addAgencyKeys(l);
	}
	public static Long staticSetAgencyKeys(SiteRequestEnUS siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	public SiteState addAgencyKeys(Long...objets) {
		for(Long o : objets) {
			addAgencyKeys(o);
		}
		return (SiteState)this;
	}
	public SiteState addAgencyKeys(Long o) {
		if(o != null)
			this.agencyKeys.add(o);
		return (SiteState)this;
	}
	@JsonIgnore
	public void setAgencyKeys(JsonArray objets) {
		agencyKeys.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addAgencyKeys(o);
		}
	}
	public SiteState addAgencyKeys(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addAgencyKeys(p);
		}
		return (SiteState)this;
	}
	protected SiteState agencyKeysInit() {
		_agencyKeys(agencyKeys);
		return (SiteState)this;
	}

	public static Long staticSearchAgencyKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrAgencyKeys(SiteRequestEnUS siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqAgencyKeys(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrAgencyKeys(siteRequest_, SiteState.staticSearchAgencyKeys(siteRequest_, SiteState.staticSetAgencyKeys(siteRequest_, o)));
	}

	///////////////////////
	// stateCompleteName //
	///////////////////////

	/**	 The entity stateCompleteName
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String stateCompleteName;

	/**	<br> The entity stateCompleteName
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.southerncoalition.enus.model.state.SiteState&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:stateCompleteName">Find the entity stateCompleteName in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stateCompleteName(Wrap<String> c);

	public String getStateCompleteName() {
		return stateCompleteName;
	}
	public void setStateCompleteName(String o) {
		this.stateCompleteName = SiteState.staticSetStateCompleteName(siteRequest_, o);
	}
	public static String staticSetStateCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}
	protected SiteState stateCompleteNameInit() {
		Wrap<String> stateCompleteNameWrap = new Wrap<String>().var("stateCompleteName");
		if(stateCompleteName == null) {
			_stateCompleteName(stateCompleteNameWrap);
			setStateCompleteName(stateCompleteNameWrap.o);
		}
		return (SiteState)this;
	}

	public static String staticSearchStateCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStateCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStateCompleteName(SiteRequestEnUS siteRequest_, String o) {
		return SiteState.staticSearchStrStateCompleteName(siteRequest_, SiteState.staticSearchStateCompleteName(siteRequest_, SiteState.staticSetStateCompleteName(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepSiteState(SiteRequestEnUS siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepSiteState();
	}

	public Future<Void> promiseDeepSiteState() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseSiteState(promise2);
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

	public Future<Void> promiseSiteState(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				stateKeyInit();
				stateNameInit();
				stateAbbreviationInit();
				imageLeftInit();
				imageTopInit();
				agencyKeysInit();
				stateCompleteNameInit();
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
		return promiseDeepSiteState(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSiteState(SiteRequestEnUS siteRequest_) {
			super.siteRequestBaseModel(siteRequest_);
	}

	public void siteRequestForClass(SiteRequestEnUS siteRequest_) {
		siteRequestSiteState(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteState(v);
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
	public Object obtainSiteState(String var) {
		SiteState oSiteState = (SiteState)this;
		switch(var) {
			case "stateKey":
				return oSiteState.stateKey;
			case "stateName":
				return oSiteState.stateName;
			case "stateAbbreviation":
				return oSiteState.stateAbbreviation;
			case "imageLeft":
				return oSiteState.imageLeft;
			case "imageTop":
				return oSiteState.imageTop;
			case "agencyKeys":
				return oSiteState.agencyKeys;
			case "stateCompleteName":
				return oSiteState.stateCompleteName;
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
				o = relateSiteState(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateSiteState(String var, Object val) {
		SiteState oSiteState = (SiteState)this;
		switch(var) {
			default:
				return super.relateBaseModel(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetSiteState(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteState(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "stateKey":
			return SiteState.staticSetStateKey(siteRequest_, o);
		case "stateName":
			return SiteState.staticSetStateName(siteRequest_, o);
		case "stateAbbreviation":
			return SiteState.staticSetStateAbbreviation(siteRequest_, o);
		case "imageLeft":
			return SiteState.staticSetImageLeft(siteRequest_, o);
		case "imageTop":
			return SiteState.staticSetImageTop(siteRequest_, o);
		case "agencyKeys":
			return SiteState.staticSetAgencyKeys(siteRequest_, o);
		case "stateCompleteName":
			return SiteState.staticSetStateCompleteName(siteRequest_, o);
			default:
				return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchSiteState(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSiteState(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "stateKey":
			return SiteState.staticSearchStateKey(siteRequest_, (Long)o);
		case "stateName":
			return SiteState.staticSearchStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return SiteState.staticSearchStateAbbreviation(siteRequest_, (String)o);
		case "imageLeft":
			return SiteState.staticSearchImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return SiteState.staticSearchImageTop(siteRequest_, (Integer)o);
		case "agencyKeys":
			return SiteState.staticSearchAgencyKeys(siteRequest_, (Long)o);
		case "stateCompleteName":
			return SiteState.staticSearchStateCompleteName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSearchStrSiteState(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSiteState(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
		case "stateKey":
			return SiteState.staticSearchStrStateKey(siteRequest_, (Long)o);
		case "stateName":
			return SiteState.staticSearchStrStateName(siteRequest_, (String)o);
		case "stateAbbreviation":
			return SiteState.staticSearchStrStateAbbreviation(siteRequest_, (String)o);
		case "imageLeft":
			return SiteState.staticSearchStrImageLeft(siteRequest_, (Integer)o);
		case "imageTop":
			return SiteState.staticSearchStrImageTop(siteRequest_, (Integer)o);
		case "agencyKeys":
			return SiteState.staticSearchStrAgencyKeys(siteRequest_, (Long)o);
		case "stateCompleteName":
			return SiteState.staticSearchStrStateCompleteName(siteRequest_, (String)o);
			default:
				return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSearchFqSiteState(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSiteState(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
		case "stateKey":
			return SiteState.staticSearchFqStateKey(siteRequest_, o);
		case "stateName":
			return SiteState.staticSearchFqStateName(siteRequest_, o);
		case "stateAbbreviation":
			return SiteState.staticSearchFqStateAbbreviation(siteRequest_, o);
		case "imageLeft":
			return SiteState.staticSearchFqImageLeft(siteRequest_, o);
		case "imageTop":
			return SiteState.staticSearchFqImageTop(siteRequest_, o);
		case "agencyKeys":
			return SiteState.staticSearchFqAgencyKeys(siteRequest_, o);
		case "stateCompleteName":
			return SiteState.staticSearchFqStateCompleteName(siteRequest_, o);
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
					o = persistSiteState(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistSiteState(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.persistBaseModel(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateSiteState(doc);
	}
	public void populateSiteState(SolrResponse.Doc doc) {
		SiteState oSiteState = (SiteState)this;
		saves = doc.get("saves_docvalues_strings");
		if(saves != null) {

			if(saves.contains("stateKey")) {
				Long stateKey = (Long)doc.get("stateKey_indexedstored_long");
				if(stateKey != null)
					oSiteState.setStateKey(stateKey);
			}

			if(saves.contains("stateName")) {
				String stateName = (String)doc.get("stateName_indexedstored_string");
				if(stateName != null)
					oSiteState.setStateName(stateName);
			}

			if(saves.contains("stateAbbreviation")) {
				String stateAbbreviation = (String)doc.get("stateAbbreviation_indexedstored_string");
				if(stateAbbreviation != null)
					oSiteState.setStateAbbreviation(stateAbbreviation);
			}

			if(saves.contains("imageLeft")) {
				Integer imageLeft = (Integer)doc.get("imageLeft_indexedstored_int");
				if(imageLeft != null)
					oSiteState.setImageLeft(imageLeft);
			}

			if(saves.contains("imageTop")) {
				Integer imageTop = (Integer)doc.get("imageTop_indexedstored_int");
				if(imageTop != null)
					oSiteState.setImageTop(imageTop);
			}

			if(saves.contains("agencyKeys")) {
				List<Long> agencyKeys = (List<Long>)doc.get("agencyKeys_indexedstored_longs");
				if(agencyKeys != null)
					oSiteState.agencyKeys.addAll(agencyKeys);
			}

			if(saves.contains("stateCompleteName")) {
				String stateCompleteName = (String)doc.get("stateCompleteName_indexedstored_string");
				if(stateCompleteName != null)
					oSiteState.setStateCompleteName(stateCompleteName);
			}
		}

		super.populateBaseModel(doc);
	}

	public void indexSiteState(JsonObject doc) {
		if(stateKey != null) {
			doc.put("stateKey_indexedstored_long", stateKey);
		}
		if(stateName != null) {
			doc.put("stateName_indexedstored_string", stateName);
		}
		if(stateAbbreviation != null) {
			doc.put("stateAbbreviation_indexedstored_string", stateAbbreviation);
		}
		if(imageLeft != null) {
			doc.put("imageLeft_indexedstored_int", imageLeft);
		}
		if(imageTop != null) {
			doc.put("imageTop_indexedstored_int", imageTop);
		}
		if(agencyKeys != null) {
			JsonArray l = new JsonArray();
			doc.put("agencyKeys_indexedstored_longs", l);
			for(Long o : agencyKeys) {
				l.add(o);
			}
		}
		if(stateCompleteName != null) {
			doc.put("stateCompleteName_indexedstored_string", stateCompleteName);
		}
		super.indexBaseModel(doc);

	}

	public static String varIndexedSiteState(String entityVar) {
		switch(entityVar) {
			case "stateKey":
				return "stateKey_indexedstored_long";
			case "stateName":
				return "stateName_indexedstored_string";
			case "stateAbbreviation":
				return "stateAbbreviation_indexedstored_string";
			case "imageLeft":
				return "imageLeft_indexedstored_int";
			case "imageTop":
				return "imageTop_indexedstored_int";
			case "agencyKeys":
				return "agencyKeys_indexedstored_longs";
			case "stateCompleteName":
				return "stateCompleteName_indexedstored_string";
			default:
				return BaseModel.varIndexedBaseModel(entityVar);
		}
	}

	public static String varSearchSiteState(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSearchBaseModel(entityVar);
		}
	}

	public static String varSuggestedSiteState(String entityVar) {
		switch(entityVar) {
			default:
				return BaseModel.varSuggestedBaseModel(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeSiteState(doc);
	}
	public void storeSiteState(SolrResponse.Doc doc) {
		SiteState oSiteState = (SiteState)this;

		oSiteState.setStateKey(Optional.ofNullable(doc.get("stateKey_indexedstored_long")).map(v -> v.toString()).orElse(null));
		oSiteState.setStateName(Optional.ofNullable(doc.get("stateName_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteState.setStateAbbreviation(Optional.ofNullable(doc.get("stateAbbreviation_indexedstored_string")).map(v -> v.toString()).orElse(null));
		oSiteState.setImageLeft(Optional.ofNullable(doc.get("imageLeft_indexedstored_int")).map(v -> v.toString()).orElse(null));
		oSiteState.setImageTop(Optional.ofNullable(doc.get("imageTop_indexedstored_int")).map(v -> v.toString()).orElse(null));
		Optional.ofNullable((List<?>)doc.get("agencyKeys_indexedstored_longs")).orElse(Arrays.asList()).stream().filter(v -> v != null).forEach(v -> {
			oSiteState.addAgencyKeys(v.toString());
		});
		oSiteState.setStateCompleteName(Optional.ofNullable(doc.get("stateCompleteName_indexedstored_string")).map(v -> v.toString()).orElse(null));

		super.storeBaseModel(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestSiteState() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof SiteState) {
			SiteState original = (SiteState)o;
			if(!Objects.equals(stateKey, original.getStateKey()))
				apiRequest.addVars("stateKey");
			if(!Objects.equals(stateName, original.getStateName()))
				apiRequest.addVars("stateName");
			if(!Objects.equals(stateAbbreviation, original.getStateAbbreviation()))
				apiRequest.addVars("stateAbbreviation");
			if(!Objects.equals(imageLeft, original.getImageLeft()))
				apiRequest.addVars("imageLeft");
			if(!Objects.equals(imageTop, original.getImageTop()))
				apiRequest.addVars("imageTop");
			if(!Objects.equals(agencyKeys, original.getAgencyKeys()))
				apiRequest.addVars("agencyKeys");
			if(!Objects.equals(stateCompleteName, original.getStateCompleteName()))
				apiRequest.addVars("stateCompleteName");
			super.apiRequestBaseModel();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(stateKey).map(v -> "stateKey: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stateName).map(v -> "stateName: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(stateAbbreviation).map(v -> "stateAbbreviation: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(imageLeft).map(v -> "imageLeft: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(imageTop).map(v -> "imageTop: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(agencyKeys).map(v -> "agencyKeys: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(stateCompleteName).map(v -> "stateCompleteName: \"" + v + "\"\n" ).orElse(""));
		return sb.toString();
	}

	public static final String VAR_stateKey = "stateKey";
	public static final String VAR_stateName = "stateName";
	public static final String VAR_stateAbbreviation = "stateAbbreviation";
	public static final String VAR_imageLeft = "imageLeft";
	public static final String VAR_imageTop = "imageTop";
	public static final String VAR_agencyKeys = "agencyKeys";
	public static final String VAR_stateCompleteName = "stateCompleteName";

	public static List<String> varsQForClass() {
		return SiteState.varsQSiteState(new ArrayList<String>());
	}
	public static List<String> varsQSiteState(List<String> vars) {
		BaseModel.varsQBaseModel(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return SiteState.varsFqSiteState(new ArrayList<String>());
	}
	public static List<String> varsFqSiteState(List<String> vars) {
		vars.add(VAR_stateKey);
		vars.add(VAR_stateName);
		vars.add(VAR_stateAbbreviation);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		vars.add(VAR_agencyKeys);
		vars.add(VAR_stateCompleteName);
		BaseModel.varsFqBaseModel(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return SiteState.varsRangeSiteState(new ArrayList<String>());
	}
	public static List<String> varsRangeSiteState(List<String> vars) {
		vars.add(VAR_stateKey);
		vars.add(VAR_imageLeft);
		vars.add(VAR_imageTop);
		BaseModel.varsRangeBaseModel(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_stateKey = "";
	public static final String DISPLAY_NAME_stateName = "name";
	public static final String DISPLAY_NAME_stateAbbreviation = "abbreviation";
	public static final String DISPLAY_NAME_imageLeft = "image left pixels";
	public static final String DISPLAY_NAME_imageTop = "image top pixels";
	public static final String DISPLAY_NAME_agencyKeys = "agencies";
	public static final String DISPLAY_NAME_stateCompleteName = "";

	public static String displayNameForClass(String var) {
		return SiteState.displayNameSiteState(var);
	}
	public static String displayNameSiteState(String var) {
		switch(var) {
		case VAR_stateKey:
			return DISPLAY_NAME_stateKey;
		case VAR_stateName:
			return DISPLAY_NAME_stateName;
		case VAR_stateAbbreviation:
			return DISPLAY_NAME_stateAbbreviation;
		case VAR_imageLeft:
			return DISPLAY_NAME_imageLeft;
		case VAR_imageTop:
			return DISPLAY_NAME_imageTop;
		case VAR_agencyKeys:
			return DISPLAY_NAME_agencyKeys;
		case VAR_stateCompleteName:
			return DISPLAY_NAME_stateCompleteName;
		default:
			return BaseModel.displayNameBaseModel(var);
		}
	}

	public static String descriptionSiteState(String var) {
		switch(var) {
		case VAR_stateKey:
			return "The primary key of the state in the database. ";
			default:
				return BaseModel.descriptionBaseModel(var);
		}
	}

	public static String classSimpleNameSiteState(String var) {
		switch(var) {
		case VAR_stateKey:
			return "Long";
		case VAR_stateName:
			return "String";
		case VAR_stateAbbreviation:
			return "String";
		case VAR_imageLeft:
			return "Integer";
		case VAR_imageTop:
			return "Integer";
		case VAR_agencyKeys:
			return "List";
		case VAR_stateCompleteName:
			return "String";
			default:
				return BaseModel.classSimpleNameBaseModel(var);
		}
	}

	public static Integer htmlColumnSiteState(String var) {
		switch(var) {
			default:
				return BaseModel.htmlColumnBaseModel(var);
		}
	}

	public static Integer htmlRowSiteState(String var) {
		switch(var) {
		case VAR_stateName:
			return 3;
		case VAR_stateAbbreviation:
			return 3;
		case VAR_imageLeft:
			return 4;
		case VAR_imageTop:
			return 4;
		case VAR_agencyKeys:
			return 5;
			default:
				return BaseModel.htmlRowBaseModel(var);
		}
	}

	public static Integer htmlCellSiteState(String var) {
		switch(var) {
		case VAR_stateName:
			return 1;
		case VAR_stateAbbreviation:
			return 2;
		case VAR_imageLeft:
			return 1;
		case VAR_imageTop:
			return 2;
		case VAR_agencyKeys:
			return 1;
			default:
				return BaseModel.htmlCellBaseModel(var);
		}
	}

	public static Integer lengthMinSiteState(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMinBaseModel(var);
		}
	}

	public static Integer lengthMaxSiteState(String var) {
		switch(var) {
			default:
				return BaseModel.lengthMaxBaseModel(var);
		}
	}

	public static Integer maxSiteState(String var) {
		switch(var) {
			default:
				return BaseModel.maxBaseModel(var);
		}
	}

	public static Integer minSiteState(String var) {
		switch(var) {
			default:
				return BaseModel.minBaseModel(var);
		}
	}
}
