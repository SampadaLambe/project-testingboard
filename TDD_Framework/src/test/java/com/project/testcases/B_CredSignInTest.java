package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.B_CredentialSignIn;

public class B_CredSignInTest {
	
	B_CredentialSignIn csi;
	
	@BeforeMethod
	public void initialize()
	{
	csi=new B_CredentialSignIn();
	csi.setup();
	}
	
	//Testing with positive credentials. 
	@Test(priority=1)
	public void testPositiveCred()
	{
		Assert.assertTrue(csi.positiveSignIn());
	}
	
	//Testing with negative credentials
	@Test(priority=2)
	public void testNegativeCred()
	{
		Assert.assertTrue(csi.NegativeSignIn());
	}
	
	@AfterMethod
	public void close()
	{
		csi.tearDown();
	}
	
}
