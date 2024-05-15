package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.I_AddReview;

public class I_AddReviewTest {
	
	I_AddReview ar;
	
	@BeforeMethod
	public void initialize()
	{
		ar=new I_AddReview();
		ar.setup();	
	}
	// submitting incomplete review must give the indication to fill required fields.
	@Test
	public void addReviewTest()
	{
		Assert.assertTrue(ar.addYourReview());
	}
	
	@AfterMethod
	public void close()
	{
		ar.tearDown();
	}


}
