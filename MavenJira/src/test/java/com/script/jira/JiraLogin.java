package com.script.jira;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.genrics.jira.BaseTest;
import com.genrics.jira.ExcelUpload;
import com.page.jira.CreateIssue;
import com.page.jira.Taskbar;


public class JiraLogin extends BaseTest{
	
	@Test
	public void login() throws IOException, AWTException, InterruptedException
	{
		Taskbar tsk = new Taskbar(driver);
		
		tsk.createclick(driver);
		
		CreateIssue ci = new CreateIssue(driver);
		
		ExcelUpload eu = new ExcelUpload();
		
		List<String> incidentnumber = eu.getIncidentNumber();
		
		String flag = "x";
		for (int i = 1 ; i<=incidentnumber.size() ; i++ )
		{
			String INC = incidentnumber.get(i);
			if( i == incidentnumber.size())
			{
				flag = "y";
				
			}
			
			ci.createIssue(INC , flag);	
			Thread.sleep(3000);
		}
	}

}
