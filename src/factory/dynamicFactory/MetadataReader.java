package factory.dynamicFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MetadataReader {

	private static Properties props;
	private static String path = "C:\\Users\\FL\\workspace\\PUC-AbstractFactory\\src\\factory\\dynamicFactory\\anotherPackage\\conf.prop";
	
	private MetadataReader(){}
	
	public static Properties loadClass() throws FileNotFoundException, IOException{
	
		props = new Properties();
		props.load(new FileInputStream(path));
			
		return props;
	}
		
}

