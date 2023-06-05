package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_Creatework;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_logoutPage;

public class TC_004_CreateTypeofWork extends BASETEST
{
	@Test
    public void login() throws InterruptedException, IOException
    {
    	Actitime_Login_page login_page = new Actitime_Login_page(driver);
    	login_page.loginMethod();
    	login_page.titleValidate();
    }
	@Test(dependsOnMethods = "login")
	public void createWork() throws InterruptedException, IOException
	{
		Actitime_Creatework creatework = new Actitime_Creatework(driver);
		creatework.createtypesofWork();
	}
    @Test(dependsOnMethods ="createWork")
    public void logout() throws InterruptedException
    {
    	Actitime_logoutPage logout_Page = new Actitime_logoutPage(driver);
    	logout_Page.logoutMethod();
    }
}
