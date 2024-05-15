package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.C_SearchOptions;

public class C_SearchOptionsTest {
	C_SearchOptions so;
	
	@BeforeMethod
	public void setup()
	{
		so=new C_SearchOptions();
		so.setup();
	}
	//Testing search bar with option available
	@Test
	public void testSearchBar()
	{
		Assert.assertTrue(so.searchBar());
	}
	
	@AfterMethod
	public void close()
	{
		so.tearDown();
	}

}
