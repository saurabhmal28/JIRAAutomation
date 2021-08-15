package com.genrics.jira;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.page.jira.LoginJira;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class BaseTest  implements AutoConstant {

	
public WebDriver driver ;
	
	
	
	@BeforeClass() 
	public void OpenBrowser() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(jira_link);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 ExcelUpload data = new ExcelUpload();
		 
		 List<String> idpass= data.excelUp();
		 String uname = idpass.get(0);
		 String pass = idpass.get(1);
		
		LoginJira log = new LoginJira(driver);
		log.Login(uname, pass, driver);
		
		
		
	}
	
	@AfterClass()
	public void closeBrowser()
	{
		
		/* driver.quit(); */
	}
	
}
