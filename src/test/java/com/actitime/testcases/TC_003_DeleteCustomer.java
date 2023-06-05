package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_deleteCustomer;
import com.actitime.pages.Actitime_logoutPage;

public class TC_003_DeleteCustomer extends BASETEST
{
	@Test
    public void login() throws InterruptedException, IOException
    {
    	Actitime_Login_page login_page = new Actitime_Login_page(driver);
    	login_page.loginMethod();
    	login_page.titleValidate();
    }
	@Test(dependsOnMethods = "login")
	public void deleteCustomer() throws InterruptedException, IOException
	{
		Actitime_deleteCustomer deleteCustomer = new Actitime_deleteCustomer(driver);
		deleteCustomer.deleteCustomer();
	}
    @Test(dependsOnMethods = "deleteCustomer")
    public void logout() throws InterruptedException
    {
    	Actitime_logoutPage logout_Page = new Actitime_logoutPage(driver);
    	logout_Page.logoutMethod();
    }
}
