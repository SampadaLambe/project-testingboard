package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.U_ImageCheck;

public class U_ImageCheckTest {
	
	U_ImageCheck ic;
	
	// checking all the views of the images(back, front , side)
	@BeforeMethod
	public void initialize()
	{
		ic=new U_ImageCheck();
		ic.setup();
	}
	
	@Test
	public void selectOtherTabs()
	{
		Assert.assertTrue(ic.imageCheck());
	}
	
	@AfterMethod
	public void close()
	{
		ic.tearDown();
	}


}
