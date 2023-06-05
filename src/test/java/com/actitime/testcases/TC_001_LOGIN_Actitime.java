package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BASETEST;
import com.actitime.pages.Actitime_Login_page;
import com.actitime.pages.Actitime_logoutPage;

@Listeners(com.actitime.generics.Screenshot.class)
public class TC_001_LOGIN_Actitime extends BASETEST
{
    @Test
    public void login() throws InterruptedException, IOException
    {
    	Actitime_Login_page login_page = new Actitime_Login_page(driver);
    	login_page.loginMethod();
    	login_page.titleValidate();
    }
    
    @Test(dependsOnMethods = "login")
    public void logout() throws InterruptedException
    {
    	Actitime_logoutPage logout_Page = new Actitime_logoutPage(driver);
    	logout_Page.logoutMethod();
    }
}