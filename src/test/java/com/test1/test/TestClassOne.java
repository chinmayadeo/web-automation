package com.test1.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.test1.Regression.HomepageTest;

public class TestClassOne 
{
	WebDriver driver;
	
	
	@BeforeTest
	public void launchApplication()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	@Test()
	@Parameters({"username","password"})
	public void loginToApplication(String username,String password)
	{
		HomepageTest page= new HomepageTest(driver);
		page.loginToApplication(username, password);
		
		System.out.println("logged in to application");
		
	
		
		if(driver.getTitle().contains("Online Shopping India"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
