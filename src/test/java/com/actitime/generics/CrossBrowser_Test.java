package com.actitime.generics;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowser_Test
{
	public WebDriver driver;
	
    @Parameters("browser")
    @BeforeClass
    public void setup(String browser)
    {
    	if(browser.equalsIgnoreCase("chrome"))
    	{
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    		driver.get("https://demo.actitime.com");
    	}
    	else if (browser.equalsIgnoreCase("edge")) 
    	{
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    		driver.get("https://demo.actitime.com");
		}
    	else if (browser.equalsIgnoreCase("firefox")) 
    	{
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    		driver.get("https://demo.actitime.com");
		}
    }
}
