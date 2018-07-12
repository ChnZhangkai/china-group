package com.china.group.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggers {
	
	private static final Logger logger = LoggerFactory.getLogger(Loggers.class);
	
	public static void info(String paramString){
		
		logger.info(paramString);
		
	}
	
}
