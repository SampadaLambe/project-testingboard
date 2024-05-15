package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.L_SaleOption;

public class L_SaleOptionTest {
	L_SaleOption so;
	@BeforeMethod
	public void initialize()
	{
		so=new L_SaleOption ();
		so.setup();	
	}

	// selecting product item under the sale option and adding to cart
	
	@Test
	public void orderDetailsTest() 
	{
		
		Assert.assertTrue(so.sales());
	}
	
	@AfterMethod
	public void close()
	{
		so.tearDown();
	}


}
