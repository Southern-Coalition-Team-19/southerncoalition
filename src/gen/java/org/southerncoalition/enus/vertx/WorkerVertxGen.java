package org.southerncoalition.enus.vertx;

import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.southerncoalition.enus.cluster.Cluster;
import org.southerncoalition.enus.request.SiteRequestEnUS;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

/**	
 * A Java class to start the Vert.x application as a main method. 
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.scolaire.enUS.vertx.WorkerVertx&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class WorkerVertxGen<DEV> extends AbstractVerticle {
	protected static final Logger LOGGER = LoggerFactory.getLogger(WorkerVertx.class);
	public static final String configureDataConnectionError1 = "Could not open the database client connection. ";
	public static final String configureDataConnectionError = configureDataConnectionError1;
	public static final String configureDataConnectionSuccess1 = "The database client connection was successful. ";
	public static final String configureDataConnectionSuccess = configureDataConnectionSuccess1;
	public static final String configureDataInitError1 = "Could not initialize the database tables. ";
	public static final String configureDataInitError = configureDataInitError1;
	public static final String configureDataInitSuccess1 = "The database tables were created successfully. ";
	public static final String configureDataInitSuccess = configureDataInitSuccess1;

	public static final String configureClusterDataError1 = "Could not configure the shared cluster data. ";
	public static final String configureClusterDataError = configureClusterDataError1;
	public static final String configureClusterDataSuccess1 = "The shared cluster data was configured successfully. ";
	public static final String configureClusterDataSuccess = configureClusterDataSuccess1;

	public static final String closeDataError1 = "Could not close the database client connection. ";
	public static final String closeDataError = closeDataError1;
	public static final String closeDataSuccess1 = "The database client connextion was closed. ";
	public static final String closeDataSuccess = closeDataSuccess1;


	//////////////
	// initDeep //
	//////////////

	protected boolean alreadyInitializedWorkerVertx = false;

	public WorkerVertx initDeepWorkerVertx(SiteRequestEnUS siteRequest_) {
		if(!alreadyInitializedWorkerVertx) {
			alreadyInitializedWorkerVertx = true;
			initDeepWorkerVertx();
		}
		return (WorkerVertx)this;
	}

	public void initDeepWorkerVertx() {
		initWorkerVertx();
	}

	public void initWorkerVertx() {
	}

	public void initDeepForClass(SiteRequestEnUS siteRequest_) {
		initDeepWorkerVertx(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainWorkerVertx(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainWorkerVertx(String var) {
		WorkerVertx oWorkerVertx = (WorkerVertx)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// attribute //
	///////////////

	public boolean attributeForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attributeWorkerVertx(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attributeForClass(v, val);
			}
		}
		return o != null;
	}
	public Object attributeWorkerVertx(String var, Object val) {
		WorkerVertx oWorkerVertx = (WorkerVertx)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSetWorkerVertx(entityVar,  siteRequest_, o);
	}
	public static Object staticSetWorkerVertx(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSolrWorkerVertx(entityVar,  siteRequest_, o);
	}
	public static Object staticSolrWorkerVertx(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrForClass(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		return staticSolrStrWorkerVertx(entityVar,  siteRequest_, o);
	}
	public static String staticSolrStrWorkerVertx(String entityVar, SiteRequestEnUS siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqForClass(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		return staticSolrFqWorkerVertx(entityVar,  siteRequest_, o);
	}
	public static String staticSolrFqWorkerVertx(String entityVar, SiteRequestEnUS siteRequest_, String o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	/////////////
	// define //
	/////////////

	public boolean defineForClass(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineWorkerVertx(v, val);
				else if(o instanceof Cluster) {
					Cluster oCluster = (Cluster)o;
					o = oCluster.defineForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object defineWorkerVertx(String var, String val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	public boolean defineForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineWorkerVertx(v, val);
				else if(o instanceof Cluster) {
					Cluster oCluster = (Cluster)o;
					o = oCluster.defineForClass(v, val.toString());
				}
			}
		}
		return o != null;
	}
	public Object defineWorkerVertx(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof WorkerVertx))
			return false;
		WorkerVertx that = (WorkerVertx)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("WorkerVertx { ");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] WorkerVertxVals = new String[] { configureDataConnectionError1, configureDataConnectionSuccess1, configureDataInitError1, configureDataInitSuccess1, configureClusterDataError1, configureClusterDataSuccess1, closeDataError1, closeDataSuccess1 };
}
