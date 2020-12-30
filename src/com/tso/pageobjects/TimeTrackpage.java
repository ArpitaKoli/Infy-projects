package com.tso.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackpage
{
	public WebDriver driver;
@FindBy(xpath="//div[.='TASKS']")
private WebElement task;

@FindBy(xpath="//div[.='TIME-TRACK']")
private WebElement timetrack;

@FindBy(xpath="//div[.='REPORTS']")
private WebElement reports;

@FindBy(xpath="//div[.='USERS'] ")
private WebElement users;

@FindBy (xpath="//span[.='New']")
private WebElement newbutton;

@FindBy (xpath="//a[contains(.,'Logout')]")
private WebElement logoutbtn;

@FindBy (xpath="//button[.='- Select Customer -']")
private WebElement selectcustomer;

@FindBy (xpath="//a[.='arpita']")
private WebElement customer;

@FindBy (xpath="//button[.='- Select Project -']")
private WebElement selectproject;

@FindBy (xpath="//a[contains(.,'xudocrmm')]")
private WebElement project;

@FindBy (xpath="(//input[@placeholder='Enter task name'])[1]")
private WebElement taskname;

@FindBy (xpath="//span[.='Create Tasks']")
private WebElement createtask;


public TimeTrackpage(WebDriver driver2)
{
	driver = driver2;
	PageFactory.initElements(driver, this);
}
public void logout()
{
	logoutbtn.click();
}
public boolean verifylogoutlink()
{
	return logoutbtn.isDisplayed();
}
public String gettitle()
{
	System.out.println(driver.getTitle());
	return driver.getTitle();
}
public Taskspage Tasks()
{
	task.click();
	return new Taskspage();
}

public void Timetrack()
{
	timetrack.click();
}

public void Users()
{
	users.click();
}

public void Reports()
{
	reports.click();
}
public void Newbutton()
{
	newbutton.click();
}
public void Selectcustomer()
{
	selectcustomer.click();
}
public void customer()
{
 customer.click();	
}

public void taskname()
{
	taskname.sendKeys("xyz");
}
public void Selectproject()
{
	selectproject.click();
}
public void project()
{
	project.click();
}
public void Createtask()
{
	createtask.click();
}
 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

