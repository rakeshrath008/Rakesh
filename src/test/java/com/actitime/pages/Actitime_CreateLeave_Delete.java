package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AUTOCONSTANT;
import com.actitime.generics.BASE_PAGE;
import com.actitime.generics.ExcelLibrary;

public class Actitime_CreateLeave_Delete extends BASE_PAGE implements AUTOCONSTANT
{
	WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingButton;
    
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetype;
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement createLeavetype;
	
	@FindBy(id =  "leaveTypeLightBox_nameField")
	private WebElement leavetypeName;
	
	@FindBy(xpath = "//span[@class='buttonTitle']")
	private WebElement createleavetypeButton;
	
	@FindBy(xpath = "//span[.='Rakesh']/../../../../../..//td[7]")
	private WebElement delete;
	
	public Actitime_CreateLeave_Delete(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createLeave_Delete() throws InterruptedException, IOException
	{
		highlightElement(driver, settingButton);
		visibilityofElement(driver, settingButton);
		javascriptClick(driver, settingButton);

		highlightElement(driver, leavetype);
		visibilityofElement(driver, leavetype);
		javascriptClick(driver, leavetype);

		highlightElement(driver, createLeavetype);
		visibilityofElement(driver, createLeavetype);
		javascriptClick(driver, createLeavetype);
		
		highlightElement(driver, leavetypeName);
		visibilityofElement(driver, leavetypeName);
		leavetypeName.sendKeys(ExcelLibrary.getcellvalue(Sheet_Name_Customers, 1, 0));

		highlightElement(driver, createleavetypeButton);
		visibilityofElement(driver, createleavetypeButton);
		javascriptClick(driver, createleavetypeButton);
		Thread.sleep(5000);
		
		highlightElement(driver, delete);
		visibilityofElement(driver, delete);
		javascriptClick(driver, delete);

		alertIsPresenet(driver);
		alertAccept(driver);
	}
}
