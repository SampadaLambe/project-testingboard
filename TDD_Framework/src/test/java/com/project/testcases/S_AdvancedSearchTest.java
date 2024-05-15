package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.S_AdvancedSearch;

public class S_AdvancedSearchTest {
	
	S_AdvancedSearch s;
	
	@BeforeMethod
	public void initialize()
	{
		s=new S_AdvancedSearch();
		s.setup();
	}
	
	//adding the details of the product and getting the required product item through advanced search
	@Test
	public void advancedSearchTest()
	{
		Assert.assertTrue(s.advancedSearch());
	}
	
	@AfterMethod
	public void close()
	{
		s.tearDown();
	}


}
