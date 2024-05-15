package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.H_HomePageLinks;

public class H_HomePageLinksTest {
	
	H_HomePageLinks hp;

	@BeforeMethod
	public void setup()
	{
		hp=new H_HomePageLinks();
		hp.setup();
	}
	
	// checks the product item links on the home page are working or not
	@Test
	public void testHomePage()
	{
		Assert.assertTrue(hp.homePageLinks());
	}
	@AfterMethod
	public void close()
	{
		hp.tearDown();
	}

}
