package Base;

import jdk.internal.org.jline.utils.Log;
import utils.Config;
import utils.YamlReader;

public class commons {
	public static Config config;
	
	static {
		Log.debug("starting config block");
		
		config = new YamlReader("config.yml").readConfig();
		
		
		
	}

}
