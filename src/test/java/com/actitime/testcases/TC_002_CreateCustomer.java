package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_CreateCustomer;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_logoutPage;

public class TC_002_CreateCustomer extends BASETEST
{
   @Test
   public void createCustomer() throws InterruptedException, IOException
   {
	   Actitime_Login_page login_page = new Actitime_Login_page(driver);
	   login_page.loginMethod();
	   login_page.titleValidate();
   }
   @Test
   public void createCustomers() throws InterruptedException, IOException
   {
	   Actitime_CreateCustomer createCustomer = new Actitime_CreateCustomer(driver);
	   createCustomer.createCustomore();
   }
   @Test
   public void logout() throws InterruptedException
   {
	   Actitime_logoutPage logoutPage = new Actitime_logoutPage(driver);
	   logoutPage.logoutMethod();
   }
}
