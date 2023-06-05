package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AUTOCONSTANT;
import com.actitime.generics.BASE_PAGE;
import com.actitime.generics.ExcelLibrary;

public class Actitime_CreateCustomer extends BASE_PAGE implements AUTOCONSTANT
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
    private WebElement taskButton;
    
    @FindBy(xpath = "//div[.='Add New']")
    private WebElement addNewButton;
    
    @FindBy(xpath = "//div[@class='item createNewCustomer']")
    private WebElement newCustomoreButton;
    
    @FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
    private WebElement Entername;
    
    @FindBy(xpath = "//div[.='Create Customer']")
    private WebElement submit;
    
    public Actitime_CreateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    public void createCustomore() throws InterruptedException, IOException
    {
    	highlightElement(driver, taskButton);
    	visibilityofElement(driver, taskButton);
    	javascriptClick(driver, taskButton);
    	
    	highlightElement(driver, addNewButton);
    	visibilityofElement(driver, addNewButton);
    	javascriptClick(driver, addNewButton);
    	
    	highlightElement(driver, newCustomoreButton);
    	visibilityofElement(driver, newCustomoreButton);
    	javascriptClick(driver, newCustomoreButton);
    	Thread.sleep(5000);
    	
    	highlightElement(driver, Entername);
    	visibilityofElement(driver, Entername);
    	Entername.sendKeys(ExcelLibrary.getcellvalue(Sheet_Name_Customers,1,0));
    	Thread.sleep(3000);
    	
    	highlightElement(driver, submit);
    	visibilityofElement(driver, submit);
    	javascriptClick(driver, submit);
    }
}
