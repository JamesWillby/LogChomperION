package com.iontrading.supportprojects.InputClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class ConcreteFileReader implements AbstractConfigFileReader{

	private BufferedReader configFile = null;
	private List<String> linesInTheFile = null;
	
	
	public void consumeConfigFile (File configurationFile){
		
	configFile = null;
	linesInTheFile = null;
	
	try (BufferedReader configFile = new BufferedReader(new FileReader(configurationFile))) {
		
		linesInTheFile = new LinkedList<String>();
		String line;
		
		while (null != (line = configFile.readLine())) {
			linesInTheFile.add(line);
		}
		
	} catch (IOException io){
			
	} finally {
		
		}
	}
		
		
	public LinkedList<String> getComponentConfig () {
		return null;
	}
	public String getSingleComponentSetting (String key){
		return key;
		
	}

}