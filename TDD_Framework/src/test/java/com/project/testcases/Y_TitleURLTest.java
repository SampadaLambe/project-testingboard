package com.project.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.base.ProjectBase;
import com.project.page.Y_TitleURL;

public class Y_TitleURLTest extends ProjectBase {
	
	Y_TitleURL tu;
	
	//Testing the URL and title (way 2) of Home page
	
	@BeforeMethod
	public void initialize()
	{
		tu=new Y_TitleURL();
		tu.setup();
	}
	@Test(priority=1)
	public void URLTest()
	{
		if(tu.URLCheck().equals(prop.getProperty("URL")))
		{
			System.out.println("URL check: Test case passed");
		}
	}
	@Test(priority=2)
	public void titleTest()
	{
		if(tu.titleCheck().equals(prop.getProperty("ExpTitle")))
		{
			System.out.println("Title check: Test case passed");
		}
	}
	@AfterMethod
	public void close()
	{
		tu.tearDown();
	}
}
