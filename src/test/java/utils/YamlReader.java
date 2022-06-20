package utils;


import org.yaml.snakeyaml.Yaml;

public class YamlReader {
	private String filePath;
	public YamlReader(String filePath) {
		this.filePath = filePath;
	}
	
	public Config readConfig() {
		 return new Yaml().loadAs(FileReader.read(filePath), Config.class);
	}
}
