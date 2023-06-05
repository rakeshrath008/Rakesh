package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AUTOCONSTANT;
import com.actitime.generics.BASE_PAGE;
import com.actitime.generics.ExcelLibrary;

public class Actitime_Login_page extends BASE_PAGE implements AUTOCONSTANT
{
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public Actitime_Login_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws InterruptedException, IOException
	{
		highlightElement(driver, usernameTextfield);
		visibilityofElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login,1,0));

		highlightElement(driver, passwordTextfield);
		visibilityofElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 1));

		visibilityofElement(driver, keepLoggedInCheckBox);
		javascriptClick(driver, keepLoggedInCheckBox);

		visibilityofElement(driver, loginButton);
		javascriptClick(driver, loginButton);
	}
	public void titleValidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validTitle(driver, "actiTIME - Enter Time-Track");
	}
}