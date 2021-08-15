package com.genrics.jira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;
	

	public void selectByVisibleText( WebElement element, String selectedText)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(selectedText);
		
	}
	public void selectByString( WebElement element, String selectedText)
	{
		Select sel = new Select(element);
		sel.selectByValue(selectedText);
		
	}
	
	public void moveToElement(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target);
		
	}
	public void alertaccept()
	{
		driver.switchTo().alert().accept();
	}
	public void alertdismiss()
	{
		driver.switchTo().alert().dismiss();
	}

}
