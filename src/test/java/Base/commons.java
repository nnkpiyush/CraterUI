package Base;

import jdk.internal.org.jline.utils.Log;
import utils.Config;
import utils.YamlReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class commons {
	public static Config config;
	protected static final Logger log = LogManager.getLogger(commons.class);
	static {
		log.info("starting config block");
		
		config = new YamlReader("config.yml").readConfig();	
	}
	public commons() {
		
	}
	
	

}
