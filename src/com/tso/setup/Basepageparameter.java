package com.tso.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basepageparameter 
{
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser", "URL"})
	public void open(String browser,String URL) throws Exception
	{
		initialize(browser,URL);
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	public void initialize(String browser,String URL) throws Exception
	{
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get(URL);
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get(URL);
	}
		
	}
}

/* Parameter passing launch specified particular browser

<suite name="Suite" parallel="tests">
  <test name="Test_firefox">
  <parameter name="browser" value="Firefox"></parameter>
  <parameter name="URL" value="http://localhost/login.do"></parameter>
<classes>
 <class name="com.tso.setup.Basepageparameter"></class>
</classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/

/* Launch multiple browser to run same script in all browsers
 <suite name="Suite" parallel="tests" thread-count="2">
<test name="Test_chrome">
  <parameter name="browser" value="Chrome"></parameter>
  <parameter name="URL" value="http://localhost/login.do"></parameter>
  <classes>
  <class name="com.tso.setup.Basepageparameter"></class>
  </classes>
  </test> <!-- Test -->

 <test name="Test_firefox">
  <parameter name="browser" value="Firefox"></parameter>
  <parameter name="URL" value="http://localhost/login.do"></parameter>
  <classes>
  <class name="com.tso.setup.Basepageparameter"></class>
  </classes>
  </test> <!-- Test -->
  </suite> <!-- Suite -->
 */
