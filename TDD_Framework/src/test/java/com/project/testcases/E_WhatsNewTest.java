package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.page.E_WhatsNew;

public class E_WhatsNewTest {

	E_WhatsNew wn;
	
	@BeforeMethod
	public void initialize()
	{
		wn=new E_WhatsNew();
		wn.setup();		
	}
	
	//testing what's new section
	@Test
	public void whatsNewSelect()
	{
		Assert.assertTrue(wn.whatsNewOption());
	}

	@AfterMethod
	public void close()
	{
		wn.tearDown();
	}

}
