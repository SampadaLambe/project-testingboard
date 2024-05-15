package com.project.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.project.page.N_WishList;

public class N_WisListTest {
	N_WishList wl;
	
	// signing in and adding a product item to wishlist	
	@BeforeMethod
	public void initialize()
	{
		wl=new N_WishList();
		wl.setup();	
	}
	@Test
	public void cartItems()
	{
		Assert.assertTrue(wl.wishList());
	}

	@AfterMethod
	public void close()
	{
		wl.tearDown();
	}

}
