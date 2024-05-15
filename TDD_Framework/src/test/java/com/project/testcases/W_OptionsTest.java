package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.W_Options;

public class W_OptionsTest {
	
	W_Options op;
	
	//checking privacy policy option and API testing option
	@BeforeMethod
	public void initialize()
	{
		op=new W_Options();
		op.setup();
	}
	
	@Test
	public void selectOtherTabs()
	{
		Assert.assertTrue(op.optionsCheck());
	}
	@AfterMethod
	public void close()
	{
		op.tearDown();
	}



}
