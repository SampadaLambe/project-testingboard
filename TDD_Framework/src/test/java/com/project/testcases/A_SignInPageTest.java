package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.base.ProjectBase;
import com.project.page.A_SignInPage;

public class A_SignInPageTest extends ProjectBase {
	
	A_SignInPage sip;
	@BeforeMethod
	public void initialization()
	{
		sip=new A_SignInPage();
		sip.setup();
	}
	
	//Testing page title text
	@Test(priority=1)
	public void testPageTitle()
	{
		String expTitle=prop.getProperty("ExpTitle");
		String actualTitle=sip.getPageTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}
	
	//Testing account creation for first time users
	@Test(priority=2)
	public void testCreateAccount()
	{
		Assert.assertTrue(sip.createAccount());
	}
	
	//mandatory input field data is not entered.
	@Test(priority=3)
	public void testInputCreateAccount()
	{
		Assert.assertTrue(sip.inputCreateAccount());
		
	}
	
	@AfterMethod
	public void close()
	{
		sip.tearDown();
	}
}
