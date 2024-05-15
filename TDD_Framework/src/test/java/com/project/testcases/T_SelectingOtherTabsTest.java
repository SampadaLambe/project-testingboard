package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.T_SelectingOtherTabs;

public class T_SelectingOtherTabsTest {
	
	T_SelectingOtherTabs sot;
	
	@BeforeMethod
	public void initialize()
	{
		sot=new T_SelectingOtherTabs();
		sot.setup();
	}
	// selecting more information and review tab under the product item displayed
	@Test
	public void selectOtherTabs()
	{
		Assert.assertTrue(sot.selectTabs());
	}
	
	@AfterMethod
	public void close()
	{
		sot.tearDown();
	}


}
