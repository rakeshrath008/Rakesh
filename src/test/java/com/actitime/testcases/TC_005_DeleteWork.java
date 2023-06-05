package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_deleteWork;
import com.actitime.pages.Actitime_logoutPage;

public class TC_005_DeleteWork extends BASETEST
{
	@Test
    public void login() throws InterruptedException, IOException
    {
    	Actitime_Login_page login_page = new Actitime_Login_page(driver);
    	login_page.loginMethod();
    	login_page.titleValidate();
    }
	@Test(dependsOnMethods = "login")
	public void deleteWork() throws InterruptedException, IOException
	{
		Actitime_deleteWork deleteWork = new Actitime_deleteWork(driver);
		deleteWork.deleteWork();
	}
    @Test(dependsOnMethods ="deleteWork")
    public void logout() throws InterruptedException
    {
    	Actitime_logoutPage logout_Page = new Actitime_logoutPage(driver);
    	logout_Page.logoutMethod();
    }
}
