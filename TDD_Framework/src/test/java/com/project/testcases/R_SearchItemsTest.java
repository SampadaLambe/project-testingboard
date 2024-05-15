package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.R_SearchItems;

public class R_SearchItemsTest {
	R_SearchItems si;

	@BeforeMethod
	public void setup()
	{
		si=new R_SearchItems();
		si.setup();
	}
	
	//accessing the product item from the search items menu
	@Test
	public void searchItems()
	{
		Assert.assertTrue(si.search());
				
	}
	@AfterMethod
	public void close()
	{
		si.tearDown();
	}

}

	
	
