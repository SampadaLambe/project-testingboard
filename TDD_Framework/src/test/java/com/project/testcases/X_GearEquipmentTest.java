package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.X_GearEquipment;

public class X_GearEquipmentTest {
	
	//selecting items under gear-> equipment
	X_GearEquipment eg;
	
	@BeforeMethod
	public void initialize()
	{
		eg=new X_GearEquipment();
		eg.setup();
	}
	
	@Test
	public void gearTest()
	{
		Assert.assertTrue(eg.gear());
	}
	
	@AfterMethod
	public void close()
	{
		eg.tearDown();
	}



}
