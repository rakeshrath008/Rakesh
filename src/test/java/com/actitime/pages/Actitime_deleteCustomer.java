package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AUTOCONSTANT;
import com.actitime.generics.BASE_PAGE;
import com.actitime.generics.ExcelLibrary;

public class Actitime_deleteCustomer extends BASE_PAGE implements AUTOCONSTANT
{
     public WebDriver driver;
     
    @FindBy(xpath = "//div[@id='container_tasks']")
 	private WebElement taskButton;

 	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
 	private WebElement searchBar;

 	@FindBy(xpath = "(//span[.='Rakesh'])[1]")
 	private WebElement Rakeshpage;
 	
 	@FindBy(xpath = "//span[.='Rakesh']")
 	private WebElement rakeshElement;
 	
 	@FindBy(xpath = "(//span[.='Rakesh']/../../..//div)[6]")
 	private WebElement settingsLink;
 	
 	@FindBy(xpath = "(//div[.='ACTIONS'])[1]")
 	private WebElement actionsButton;

 	@FindBy(xpath = "(//div[.='Delete'])[2]")
 	private WebElement deleteButton;

 	@FindBy(xpath = "//span[.='Delete permanently']")
 	private WebElement deletePermanentlyButton;
 	
 	public Actitime_deleteCustomer(WebDriver driver)
 	{
 		this.driver=driver;
 		PageFactory.initElements(driver, this);
 	}
 	public void deleteCustomer() throws InterruptedException, IOException
 	{
 		highlightElement(driver, taskButton);
 		visibilityofElement(driver, taskButton);
 		javascriptClick(driver, taskButton);
 		
 		highlightElement(driver, searchBar);
 		visibilityofElement(driver, searchBar);
 		searchBar.sendKeys(ExcelLibrary.getcellvalue(Sheet_Name_Customers, 1, 0));
        Thread.sleep(3000);
        
 		highlightElement(driver, Rakeshpage);
 		visibilityofElement(driver, Rakeshpage);
 		javascriptClick(driver, Rakeshpage);
 		Thread.sleep(3000);

 		highlightElement(driver, rakeshElement);
 		visibilityofElement(driver, rakeshElement);
 		moveToElement(driver, rakeshElement);
 		Thread.sleep(3000);

 		highlightElement(driver, settingsLink);
 		visibilityofElement(driver, settingsLink);
 		javascriptClick(driver, settingsLink);
 		Thread.sleep(3000);

 		highlightElement(driver, actionsButton);
 		visibilityofElement(driver, actionsButton);
 		javascriptClick(driver, actionsButton);
 		Thread.sleep(3000);

 		highlightElement(driver, deleteButton);
 		visibilityofElement(driver, deleteButton);
 		javascriptClick(driver, deleteButton);
 		Thread.sleep(3000);

 		highlightElement(driver, deletePermanentlyButton);
 		visibilityofElement(driver, deletePermanentlyButton);
 		javascriptClick(driver, deletePermanentlyButton);
 		Thread.sleep(2000);
 	}
}
