package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.BASE_PAGE;

public class Actitime_deleteWork extends BASE_PAGE
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingButoon;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typesOfWork;
	
	@FindBy(xpath = "//input[@value='Show Types of Work']")
	private WebElement showtypesofWork;
	
	@FindBy(xpath = "//a[.='Rakesh']/../..//td[7]//a")
	private WebElement delete;
	
	public Actitime_deleteWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public void deleteWork() throws InterruptedException
	    {
		 highlightElement(driver, settingButoon);
    	 visibilityofElement(driver, settingButoon);
    	 javascriptClick(driver, settingButoon);
    	 
    	 highlightElement(driver, typesOfWork);
    	 visibilityofElement(driver, typesOfWork);
    	 javascriptClick(driver, typesOfWork);
    	 
    	 highlightElement(driver, showtypesofWork);
    	 visibilityofElement(driver, showtypesofWork);
    	 javascriptClick(driver, showtypesofWork);
    	 
    	 highlightElement(driver, delete);
    	 visibilityofElement(driver, delete);
    	 javascriptClick(driver, delete);
    	 
    	 alertIsPresenet(driver);
    	 alertAccept(driver);
	    }
}
