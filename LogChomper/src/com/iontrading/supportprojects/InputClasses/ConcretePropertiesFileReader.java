package com.iontrading.supportprojects.InputClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConcretePropertiesFileReader implements AbstractPropertiesFileReader {

	private Properties properties = null;
	private InputStream input = null;
	
	/**
	 * Loads the logchomper.properties file for LogChomper process. 
	 * 
	 * @param propertiesFile This is the properties file we will load. It is hard coded
	 * to logchomper.properties which we expect to find in the working directory of the
	 * jar file.
	 * 
	 * @throws IOException
	 * 
	 * This will be thrown in an event that the file is not in the correct 
	 */
	public void consumePropertiesFile(String propertiesFile) {
		
	// We set our member variables to null each time we call this function
	// to ensure they're not containing previous data. 
		
	properties=null;
	input = null;
	
		try {
			
			input = new FileInputStream(propertiesFile);
			properties = new Properties();
			properties.load(input);
			
			
		} catch (IOException io) {  
			io.printStackTrace();
		} finally {
			if (null != input ) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}
	}
	
	public Properties getProperties () { 
		if (null == properties) 
			consumePropertiesFile("logchomper.properties");
			return properties;
		}

	@Override
	public String getProperties(String key) {
		if (null == properties) 
			consumePropertiesFile("logchomper.properties");
			 return properties.getProperty(key);

	}

}
