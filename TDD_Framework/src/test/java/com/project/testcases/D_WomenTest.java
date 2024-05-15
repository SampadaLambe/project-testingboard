package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.D_Women_Jacket;

public class D_WomenTest {
	D_Women_Jacket wj;
	
	@BeforeMethod
	public void initialize()
	{
		wj=new D_Women_Jacket();
		wj.setup();		
	}
	
	//adding women-> jacket-> selecting size, color and quantity ->adding to cart
	@Test
	public void womenJacketSelect()
	{
		Assert.assertTrue(wj.womenJacketSelection());
	}
	
	@AfterMethod
	public void close()
	{
		wj.tearDown();
	}
}
