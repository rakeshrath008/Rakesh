package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{
   public void onTestFailure(ITestResult result)
   {
	   TakesScreenshot tS = (TakesScreenshot)BASETEST.driver;
	   File srcFile = tS.getScreenshotAs(OutputType.FILE);
	   
	   String methodName = result.getName();
	   Date date = Calendar.getInstance().getTime();
	   String today = date.toString().replaceAll(":","_");
	   
	   File destFile = new File("./FailedScreenshot/"+methodName+today+".png");
	   try {
		      FileHandler.copy(srcFile, destFile);
	       }
	   catch (IOException e) 
	   {
		   e.printStackTrace();
	   }
    }
}
