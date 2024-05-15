package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class G_ShopTees extends ProjectBase {
	
	public boolean shopTees()
	
	{ 
		driver.findElement(By.xpath("//strong[text()='Take it from Erin']/following-sibling::span[2]")).click();
		driver.findElement(By.xpath("//div[@data-role='collapsible'][1]/div[1]")).click();// style
		driver.findElement(By.xpath("//div[@data-role='content']/ol[1]/li[5]/a")).click();// leggings
		driver.findElement(By.xpath("//ol[@class='products list items product-items']/li[1]/div/div/strong/a")).click();//select leggings item
		driver.findElement(By.xpath("//div[@class='product-addto-links']/a[1]")).click();//adding to wishlist
		return driver.findElement(By.xpath("//h1[@class='page-title']")).isDisplayed();
		
	}

}
