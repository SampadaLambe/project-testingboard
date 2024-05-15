package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class L_SaleOption extends ProjectBase {
	
	public boolean sales()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-8']")).click();// select sale option
		driver.findElement(By.xpath("//div[@class='categories-menu']/ul[2]/li[1]/a")).click();// select hoodies from men section
		driver.findElement(By.xpath("//ol[@class='products list items product-items']/li[2]/div/div/strong/a")).click();// select hoodie
		driver.findElement(By.xpath("//div[@class='swatch-attribute size']/div/div[3]")).click();// selecting size M
		driver.findElement(By.xpath("//div[@class='swatch-attribute color']/div/div[2]")).click();
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		return driver.findElement(By.xpath("//div[@class='page messages']/div[2]/div/div")).isDisplayed();
		
		
	}

}
