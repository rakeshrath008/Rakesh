package com.actitime.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BASE_PAGE extends Utility
{
    //WebDriver Interface
    public void validTitle(WebDriver driver ,String ExpectedTitle)
    {
    	String actualTitle = driver.getTitle();
    	Assert.assertEquals(actualTitle,ExpectedTitle,"Both title are not matched");
    	Reporter.log("Both title are matched",true);
    }
    public void currentUrl(WebDriver driver)
    {
    	String currenturl = driver.getCurrentUrl();
    	Reporter.log(currenturl,true);
    }
    
    //Actions Class
    public void moveToElement(WebDriver driver,WebElement element)
    {
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
    }
    
    //Robot Class
    public void robotEnter() throws AWTException, InterruptedException
    {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
    	Thread.sleep(1000);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    //Select Class
    public void selectedByText(WebElement element,String text)
    {
    	Select select = new Select(element);
    	select.selectByVisibleText(text);
    }
    public void selectedByIndex(WebElement element,int index)
    {
    	Select select = new Select(element);
    	select.selectByIndex(index);
    }
    public void selectedByValue(WebElement element,String value)
    {
    	Select select = new Select(element);
    	select.selectByValue(value);
    }
    
    //Alert Interface
    public void alertAccept(WebDriver driver)
    {
        driver.switchTo().alert().accept();
    }
    
    //JavascriptExecutor Interface
    public void javascriptClick(WebDriver driver,WebElement element)
    {
    	JavascriptExecutor jsExecutor =(JavascriptExecutor)driver;
    	jsExecutor.executeScript("arguments[0].click()",element);
    }
    public void javascriptEnter(WebDriver driver,String value,WebElement element)
    {
    	JavascriptExecutor jsExecutor =(JavascriptExecutor)driver;
    	jsExecutor.executeScript(value,element);
    }
    
    //WebdriverWait Class
    public void visibilityofElement(WebDriver driver,WebElement element) 
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void visibilityofElementLocator(WebDriver driver,By locator) 
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void alertIsPresenet(WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.alertIsPresent());
    }
    public void titleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
}
