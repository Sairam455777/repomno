package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilities77{
public static String getProperty(String key) throws IOException {
	FileInputStream stream=new FileInputStream("src//test//resources//env.properties");
	
	Properties p=new Properties();
p.load(stream);
	return p.getProperty(key);
}
}
