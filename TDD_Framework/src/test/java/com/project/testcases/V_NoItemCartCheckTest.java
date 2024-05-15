package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.V_NoItemCartCheck;

public class V_NoItemCartCheckTest {
	
	V_NoItemCartCheck cc;
	
	// checking at the home page, pressing cart option must show no items in cart.
	@BeforeMethod
	public void initialize()
	{
		cc=new V_NoItemCartCheck();
		cc.setup();
	}
	
	@Test
	public void selectOtherTabs()
	{
		Assert.assertTrue(cc.cartCheck());
	}
	
	@AfterMethod
	public void close()
	{
		cc.tearDown();
	}


}
