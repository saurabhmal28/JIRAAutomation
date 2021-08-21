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
		
		
		CreateIssue ci = new CreateIssue(driver);
		
		ExcelUpload eu = new ExcelUpload();
		
		List<String> incidentnumber = eu.getIncidentNumber();
		List<String> Workordernumber = eu.getWorkOrderNumber();
		System.out.println(Workordernumber);
		System.out.println(incidentnumber);
		String flag_inc = "y";
		
		String flag_wo = "b";
		
		
		if (incidentnumber.size() > 1)
			
		{
			Taskbar tsk = new Taskbar(driver);
			
			tsk.createclick(driver);
			
			for (int i = 1 ; i<incidentnumber.size() ; i++ )
			{
				String INC = incidentnumber.get(i);
				if( i == incidentnumber.size()-1)
				{
					flag_inc = "x";
				}
				
				ci.createIssue(INC , flag_inc);	
				Thread.sleep(6000);
			}
			
		}
		
		
		if (Workordernumber.size() > 1)
		{
			Taskbar tsk = new Taskbar(driver);
			
			tsk.createclick(driver);
			for (int i = 1 ; i< Workordernumber.size() ; i++ )
			{
				String WO = Workordernumber.get(i);
				System.out.println(Workordernumber.size());
				if( i == Workordernumber.size()-1)
				{
					flag_wo = "a";
					System.out.println(i);
					System.out.println(Workordernumber.size()-1);
				}
				
				 ci.createWorkorder(WO , flag_wo); 	
				Thread.sleep(6000);
			}
			
		}
		
		
		
	}

}
