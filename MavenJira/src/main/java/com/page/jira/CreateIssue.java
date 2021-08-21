package com.page.jira;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genrics.jira.AutoConstant;
import com.genrics.jira.BasePage;
import com.genrics.jira.DateTime;

public class CreateIssue implements AutoConstant{
	

	public CreateIssue(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(id = "summary")
	WebElement summary;
	
	@FindBy (id = "customfield_10148")
	
	WebElement incidenttype ;
	
	@FindBy (id = "customfield_10145")
	
	WebElement Remedyno ;
	
	@FindBy(id = "description")
	
	WebElement descrip;
	
	@FindBy(id = "reporter-field")
	WebElement reporter;
	
	@FindBy(id = "assign-to-me-trigger")
	WebElement assigntome;
	
	@FindBy(xpath = "//a[@id = 'customfield_10155-trigger']")
	WebElement startdate;
	
	@FindBy(xpath = "//input[@id = 'customfield_10156']")
	WebElement duedate;
	
	String description  = Jira_Descriptions;
	
	@FindBy(xpath = "//input[@id = 'qf-create-another']")
	WebElement createAnother;
	
	@FindBy(id = "create-issue-submit")
	WebElement create;
	
	@FindBy(xpath = "//input[@id = 'issuetype-field']")
	WebElement issuetype;
	
	@FindBy(id = "customfield_10149")
	WebElement requesttype;
	
	int executionumber_inc = 0;
	int executionumber_wo = 0;
	
	public void createIssue(String sum, String flag) throws AWTException, InterruptedException
	{
		
		if (executionumber_inc == 0)
		{	issuetype.click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL );
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_CONTROL );
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			issuetype.sendKeys("Incident-P4");
			Thread.sleep(1000);
			issuetype.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		
		summary.sendKeys(sum);
		
		
		
		
		BasePage bp = new BasePage();
		
		bp.selectByVisibleText(incidenttype, "03 Data Correction");
		if (executionumber_inc == 0)
		{
		Remedyno.sendKeys(sum);
		}
		else if (executionumber_inc > 0 )
		{
			Remedyno.click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL );
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_CONTROL );
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			Remedyno.sendKeys(sum);
			
		}
		descrip.sendKeys(description);		
		
		Robot r = new Robot();
		reporter.click();
		r.keyPress(KeyEvent.VK_CONTROL );
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_CONTROL );
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		reporter.sendKeys("Shwetang");
		Thread.sleep(1000);
		reporter.sendKeys(Keys.ENTER);
		
		if(executionumber_inc == 0)
		{
		assigntome.click();
		}
		
		startdate.click();
		startdate.sendKeys(Keys.ENTER);
		
		DateTime date = new DateTime();
		String formatdate= date.getLocalDate();
		
		
		if(executionumber_inc == 0)
		{
			duedate.sendKeys(formatdate);
		}
		
		if(executionumber_inc == 0)
		{
			createAnother.click();
		}
		
		
		
		if (flag.equalsIgnoreCase("x"))
		{
		 
			createAnother.click();
			
		}
		
		 create.click();
		 executionumber_inc ++ ;
		
		
		
		
		
	}
	
	public void createWorkorder(String sum, String flag) throws AWTException, InterruptedException
	{
		
     
      
		BasePage bp = new BasePage();
		if (executionumber_wo == 0)
		{	issuetype.click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL );
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_CONTROL );
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			issuetype.sendKeys("Work");
			Thread.sleep(1000);
			issuetype.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		
		 summary.sendKeys(sum);
		
		bp.selectByVisibleText(requesttype, "06 Data Extraction");
		if (executionumber_wo == 0)
		{
		Remedyno.sendKeys(sum);
		}
		else if (executionumber_wo > 0 )
		{
			Remedyno.click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL );
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_CONTROL );
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			Remedyno.sendKeys(sum);
			
		}
		descrip.sendKeys(description);		
		
		Robot r = new Robot();
		reporter.click();
		r.keyPress(KeyEvent.VK_CONTROL );
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_CONTROL );
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		reporter.sendKeys("Shwetang");
		Thread.sleep(1000);
		reporter.sendKeys(Keys.ENTER);
		
		if(executionumber_wo == 0)
		{
		assigntome.click();
		}
		
		startdate.click();
		startdate.sendKeys(Keys.ENTER);
		
		DateTime date = new DateTime();
		String formatdate= date.getLocalDate();
		
		
		if(executionumber_wo == 0)
		{
			duedate.sendKeys(formatdate);
		}
		
		if(executionumber_wo == 0)
		{
			createAnother.click();
		}
		
		
		
		if (flag.equalsIgnoreCase("a"))
		{
		 
			createAnother.click();
			System.out.println(flag);
			
		}
		
		 create.click();
		 executionumber_wo ++ ;
		
		
		
	}
	
	
	

}
