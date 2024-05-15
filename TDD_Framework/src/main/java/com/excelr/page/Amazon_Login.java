package com.excelr.page;

import org.openqa.selenium.By;

import com.excelr.base.Amazon_Base;

public class Amazon_Login extends Amazon_Base{
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean loginStep()
	{
		driver.findElement(By.id("ap_email")).sendKeys("9769961079");
		driver.findElement(By.id("continue")).click();
		return driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).isDisplayed();
	}

}
