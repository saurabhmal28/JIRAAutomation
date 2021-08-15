package com.page.jira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginJira {
	
	public LoginJira(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	WebElement username;
	
	
	@FindBy(id = "password")
	
	WebElement password;
	
	@FindBy(xpath = "(//span[.='Log in'])[2]")
	WebElement login;
	
	@FindBy(xpath = "(//span[. = 'Continue'])[2]")
    WebElement cont;	
	
	
	public void Login(String uname , String pass, WebDriver driver)
	{
		  WebDriverWait wait = new WebDriverWait(driver, 20);
	   username.sendKeys(uname);
	   wait.until(ExpectedConditions.visibilityOf(cont));
	   cont.click();
	   password.sendKeys(pass);
	   
	 
	   wait.until(ExpectedConditions.visibilityOf(login));
	   
	   login.click();
	}
}
