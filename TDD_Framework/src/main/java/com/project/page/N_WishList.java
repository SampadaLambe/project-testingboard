package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class N_WishList extends ProjectBase{
	B_CredentialSignIn credential;
	
	public boolean wishList()
	{
		credential=new B_CredentialSignIn();// sign in
		credential.positiveSignIn();
		driver.findElement(By.xpath("//a[@id='ui-id-3']/span")).click();// select whats new
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div/div/ul[2]/li[2]/a")).click();// select jacket option under Men section
		driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[3]/div/div/strong/a")).click();// select the third jacket
		driver.findElement(By.xpath("//div[@class='product-info-main']/div[5]/div/a[1]")).click();//click on add to wishlist
		return driver.findElement(By.xpath("//main[@id='maincontent']/div[1]/div[2]/div/div/div")).isDisplayed();
		
		
	}

}
