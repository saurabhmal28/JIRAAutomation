package com.page.jira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Taskbar {

	public Taskbar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//button[ @id = 'createGlobalItem']")
	WebElement create ;
	
	public void createclick(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(create));
		create.click();		
	}
}
