package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AUTOCONSTANT;
import com.actitime.generics.BASE_PAGE;
import com.actitime.generics.ExcelLibrary;

public class Actitime_Creatework extends BASE_PAGE implements AUTOCONSTANT
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingButoon;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typesOfWork;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createTypesofwork;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public Actitime_Creatework(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    public void createtypesofWork() throws InterruptedException, IOException
    {
    	 highlightElement(driver, settingButoon);
    	 visibilityofElement(driver, settingButoon);
    	 javascriptClick(driver, settingButoon);
    	 
    	 highlightElement(driver, typesOfWork);
    	 visibilityofElement(driver, typesOfWork);
    	 javascriptClick(driver, typesOfWork);
    	 
    	 highlightElement(driver, createTypesofwork);
    	 visibilityofElement(driver, createTypesofwork);
    	 javascriptClick(driver, createTypesofwork);
    	 
    	 highlightElement(driver, name);
    	 visibilityofElement(driver, name);
    	 name.sendKeys(ExcelLibrary.getcellvalue(Sheet_Name_Customers, 1, 0));
    	 
    	 highlightElement(driver, submit);
    	 visibilityofElement(driver, submit);
    	 javascriptClick(driver, submit);
    	 Thread.sleep(3000);
    }
}
