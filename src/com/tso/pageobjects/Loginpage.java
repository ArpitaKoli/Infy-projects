package com.tso.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage 
{
	private WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	@FindBy(xpath="(//div[contains(.,'Login')])[3]")
	private WebElement loginbtn;
	
	public Loginpage(WebDriver driver2)
	{
		driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public TimeTrackpage login(String UN,String pwd)
	{
		username.sendKeys(UN);
		password.sendKeys(pwd);
		loginbtn.click();
		return new TimeTrackpage(driver);
	}	
}


