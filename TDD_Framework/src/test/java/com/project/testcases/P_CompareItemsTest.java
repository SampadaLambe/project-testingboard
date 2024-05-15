package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.P_CompareItems;

public class P_CompareItemsTest {
	
	P_CompareItems ci;

	// adding items to compare list and checking whether they are moved to the compare list 
	@BeforeMethod
	public void setup()
	{
		ci=new P_CompareItems();
		ci.setup();
	}
	
	@Test
	public void testHomePage()
	{
		Assert.assertTrue(ci.compareItems());
	}
	
	@AfterMethod
	public void close()
	{
		ci.tearDown();
	}


}
