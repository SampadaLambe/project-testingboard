package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.M_CartCheckout;

public class M_CartCheckoutTest {
	M_CartCheckout cc;
	
	@BeforeMethod
	public void initialize()
	{
		cc=new M_CartCheckout();
		cc.setup();	
	}
	
	// placing oder for the product items in the cart.
	@Test
	public void cartItems()
	{
		Assert.assertTrue(cc.cartCheckout());
	}
	
	@AfterMethod
	public void close()
	{
		cc.tearDown();
	}


}
