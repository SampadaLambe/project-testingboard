package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class V_NoItemCartCheck extends ProjectBase {
	
	
	public boolean cartCheck()
	{
	driver.findElement(By.xpath("//div[@class='header content']/div/a")).click();
	return driver.findElement(By.xpath("//strong[text()='You have no items in your shopping cart.']")).isDisplayed();
	}
	
}
