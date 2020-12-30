package com.tso.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage 
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;

	@FindBy(xpath="//div[.='TIME-TRACK']")
	private WebElement timetrack;

	@FindBy(xpath="//div[.='REPORTS']")
	private WebElement reports;

	@FindBy(xpath="//div[.='USERS'] ")
	private WebElement users;
}
