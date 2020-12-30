package com.tso.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tso.config.propertyfile;

public class Basepageprop 
{
	public static WebDriver driver;
	@BeforeMethod
	public void open() throws Exception
	{
		propertyfile file=new propertyfile();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url=file.fetch("url");
		driver.get(url);
	}
}
