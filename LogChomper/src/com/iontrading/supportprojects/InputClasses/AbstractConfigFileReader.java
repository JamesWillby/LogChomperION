package com.iontrading.supportprojects.InputClasses;

import java.io.File;
import java.util.LinkedList;

public interface AbstractConfigFileReader {
	
	public void consumeConfigFile (File configurationFile);
	public LinkedList<String> getComponentConfig ();
	public String getSingleComponentSetting (String key);


}
