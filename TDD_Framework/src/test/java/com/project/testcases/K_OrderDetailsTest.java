package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.K_OrderDetails;

public class K_OrderDetailsTest {
	
	K_OrderDetails od;
	@BeforeMethod
	public void initialize()
	{
		od=new K_OrderDetails();
		od.setup();	
	}

	// checking order details by giving the oder id, last name and email as input.
	
	@Test
	public void orderDetailsTest() 
	{
		
		Assert.assertTrue(od.orderDetails());
	}
	
	@AfterMethod
	public void close()
	{
		od.tearDown();
	}


}
