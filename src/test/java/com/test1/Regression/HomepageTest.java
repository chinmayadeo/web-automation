package com.test1.Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test1.pages.LoginpageTest;

public class HomepageTest 
{
	WebDriver driver;
	
	public HomepageTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String username,String password)
	{
		//creating object to loginpage
		LoginpageTest page=new LoginpageTest(driver);
		
		page.clickLinkText();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		page.getUsername(username);
		page.getPassword(password);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		page.loginToApp();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
