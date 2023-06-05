package com.actitime.generics;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BASETEST implements AUTOCONSTANT
{
	public static WebDriver driver;
	
     @BeforeSuite
     public void executionStart()
     {
    	 Reporter.log("Execution started",true);
     }
     
     @BeforeClass
     public void setup()
     {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    	 driver.get(url);
     }
     @AfterClass
     public void teardown()
     {
    	 driver.quit();
     }
     @AfterSuite
     public void executioncomplete()
     {
    	 Reporter.log("Execution complete",true);
     }
}
