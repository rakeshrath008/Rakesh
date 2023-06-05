package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_CreateLeave_Delete;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_logoutPage;

public class TC_006_CreateLeave_Delete extends BASETEST
{
	@Test
    public void login() throws InterruptedException, IOException
    {
    	Actitime_Login_page login_page = new Actitime_Login_page(driver);
    	login_page.loginMethod();
    	login_page.titleValidate();
    }
	@Test(dependsOnMethods = "login")
	public void createLeave_delete() throws InterruptedException, IOException
	{
		Actitime_CreateLeave_Delete createLeave_Delete = new Actitime_CreateLeave_Delete(driver);
		createLeave_Delete.createLeave_Delete();
	}
    @Test(dependsOnMethods ="createLeave_delete")
    public void logout() throws InterruptedException
    {
    	Actitime_logoutPage logout_Page = new Actitime_logoutPage(driver);
    	logout_Page.logoutMethod();
    }
}
