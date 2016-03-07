package com.iontrading.supportprojects.InputClasses;

import java.io.File;
import java.util.Properties;

public interface AbstractPropertiesFileReader {

	public void consumePropertiesFile (String propertiesFile);
	public Properties getProperties ();
	public String getProperties (String key);
	
}
