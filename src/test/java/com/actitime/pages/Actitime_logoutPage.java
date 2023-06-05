package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BASE_PAGE;

public class Actitime_logoutPage extends BASE_PAGE
{
	public WebDriver driver;
	
	@FindBy(id = "logoutLink")
	private WebElement  logoutLink;
	
	public Actitime_logoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoutMethod() throws InterruptedException
	{
		highlightElement(driver, logoutLink);
		visibilityofElement(driver, logoutLink);
		javascriptClick(driver, logoutLink);
	}
}
