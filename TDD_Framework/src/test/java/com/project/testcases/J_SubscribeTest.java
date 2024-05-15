package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.J_Subscribe;

public class J_SubscribeTest {
	
		J_Subscribe s;
		@BeforeMethod
		public void initialize()
		{
			s=new J_Subscribe();
			s.setup();	
		}

		// subscribing by giving user input details
		
		@Test
		public void subcribeTest() 
		{
			
			Assert.assertTrue(s.subscribe());
		}

		@AfterMethod
		public void close()
		{
			s.tearDown();
		}

}
