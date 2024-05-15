package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.Q_AddingFilters;

public class Q_AddingFiltersTest {

	Q_AddingFilters af;

	//adding filter to watches with respect to gender and price
	@BeforeMethod
	public void setup()
	{
		af=new Q_AddingFilters();
		af.setup();
	}
	
	@Test
	public void addfilter()
	{
		Assert.assertTrue(af.addFilters());
	}
	
	@AfterMethod
	public void close()
	{
		af.tearDown();
	}

}
