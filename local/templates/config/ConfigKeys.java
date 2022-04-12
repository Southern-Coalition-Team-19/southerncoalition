package {{ PROJECT_JAVA_PACKAGE }}.config;

import org.computate.vertx.config.ComputateVertxConfigKeys;

/**
 * Keyword: classSimpleNameConfigKeys
 * Description: To organize all the environment variables for the site in one place
 */
public class {{ CLASS_SIMPLE_NAME_ConfigKeys }} extends ComputateVertxConfigKeys {

	/**
	 * 
	 **/
	public static final String ENABLE_MIGRATE_DATA = "ENABLE_MIGRATE_DATA";

	/**
	 * 
	 **/
	public static final String MIGRATE_DATA_FETCH_SIZE = "MIGRATE_DATA_FETCH_SIZE";
}
