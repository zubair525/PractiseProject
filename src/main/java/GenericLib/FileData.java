package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileData {
	public String propertiesData(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(CommonDataPath.propertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
