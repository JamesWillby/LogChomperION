package com.iontrading.supportprojects.ManagerClasses;

import java.io.*;
import java.util.*;

public interface AbstractChildManager {
	
	public AbstractLogChomper spawnNewLogChomperProcess (String processName, 
									String logName, List<String> functionList  );
	
	public LinkedList<AbstractLogChomper> generateLogChomperProcesses (File configurationFile);
	

}
