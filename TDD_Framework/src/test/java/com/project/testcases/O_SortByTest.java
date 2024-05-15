package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.O_SortBy;

public class O_SortByTest {
	O_SortBy sb;
	
	// sorting the product items by Price
	@BeforeMethod
	public void initialize()
	{
		sb=new O_SortBy();
		sb.setup();
		
	}
	@Test
	public void sorting()
	{
		Assert.assertTrue(sb.sortBy());
	}

	@AfterMethod
	public void close()
	{
		sb.tearDown();
	}

}
