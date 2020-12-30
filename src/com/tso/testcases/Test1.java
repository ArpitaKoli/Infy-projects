package com.tso.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tso.setup.Basepage;

public class Test1 extends Basepage
{
@DataProvider
public Object[][] getTestdata() throws Exception
{
	Object dat[][] =com.tso.testdata.Testdata.getdata();
	return dat;
}

@Test(dataProvider="getTestdata")
public void Testlogin(String Username,String password) throws Exception
{
	com.tso.pageobjects.Loginpage l=new com.tso.pageobjects.Loginpage(driver);
	l.username(Username);
	l.password(password);
	l.loginbutton();
}

}
