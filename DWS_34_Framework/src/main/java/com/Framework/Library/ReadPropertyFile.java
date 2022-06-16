package com.Framework.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile extends BaseTest {

	public static String Value(String key) throws IOException{
		FileInputStream fis=new FileInputStream(Config_properties);
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
	}

}
