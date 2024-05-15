package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class T_SelectingOtherTabs extends ProjectBase{

	public boolean selectTabs()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-4']/span[2]")).click();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		driver.findElement(By.xpath("//img[@alt='Juno Jacket']")).click();
		driver.findElement(By.xpath("//div[@class='product data items']/div[3]/a")).click();
		driver.findElement(By.xpath("//div[@class='product data items']/div[5]/a")).click();
		return driver.findElement(By.xpath("//div[@id='product-review-container']/div/div[1]")).isDisplayed();
	}
}
