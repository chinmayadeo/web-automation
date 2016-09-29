package com.test1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageTest 
{
	WebDriver driver;
	
	public LoginpageTest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Log In")
	WebElement logInLink;
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement enterEmailorPhoneNo;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv']")
	WebElement enterPassword;
	
	@FindBy(xpath="html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement clickLogin;
	
	//click on login link on homepage
	public void clickLinkText()
	{
		logInLink.click();
	}
	
	//get User name(Email/phoneNo)
	public void getUsername(String username)
	{
		enterEmailorPhoneNo.sendKeys(username);
	}
	//get password
	public void getPassword(String password)
	{
		enterPassword.sendKeys(password);
	}
	
	//click to login app
	public void loginToApp()
	{
		clickLogin.click();
	}

}
