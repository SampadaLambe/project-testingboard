package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.G_ShopTees;

// adding leggings to wishlist without customer login
// as per the feature , only after sign in , the product item can be added in the wishlist.
//here , it shows the error message to sign in first

public class G_ShopTeesTest {
	G_ShopTees st;

	
	@BeforeMethod
	public void initialize()
	{
		st=new G_ShopTees();
		st.setup();
	}
	
	@Test
	public void ShopTTest()
	{
		Assert.assertTrue(st.shopTees());
	}
	@AfterMethod
	public void close()
	{
		st.tearDown();
	}


}
