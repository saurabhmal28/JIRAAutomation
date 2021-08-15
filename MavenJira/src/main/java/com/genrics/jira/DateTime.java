package com.genrics.jira;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	
	public static String  getLocalDate() {
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd/MMM/yy h:mm a");
		 
		//Zoned datetime instance
	ZonedDateTime zdt = ZonedDateTime.now().plusDays(3);
		 
		//Get formatted String
		String zdtString = FOMATTER.format(zdt);
		return zdtString;
		
	}
}
