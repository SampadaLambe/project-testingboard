package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.F_CartCheckout;

public class F_CartCheckoutTest {
	
	//adding items to the cart and observing whether the item is added to the cart
	
	F_CartCheckout cc;
	@BeforeMethod
	public void initialize()
	{
		cc=new F_CartCheckout();
		cc.setup();
	}
	
	@Test
	public void addItemsTest()
	{
		Assert.assertTrue(cc.addItems());
	}
	
	@AfterMethod
	public void close()
	{
		cc.tearDown();
	}

	
	

}
