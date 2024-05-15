package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;

import com.project.base.ProjectBase;

public class H_HomePageLinks extends ProjectBase {
	
	public boolean homePageLinks()
	{
		driver.findElement(By.xpath("//a[@class='block-promo home-pants']/span/span[2]")).click();// click on pants
		Navigation nav=driver.navigate();
		nav.back();// back to home screen
		
		driver.findElement(By.xpath("//a[@class='block-promo home-performance']/span/span[2]")).click();// click on performance
		nav.back();// back to home screen
		
		driver.findElement(By.xpath("//a[@class='block-promo home-eco']/span/span[2]")).click();// click on eco friendly
		nav.back();// back to home screen
		
		driver.findElement(By.xpath("//a[@title='Radiant Tee']")).click();//radiant tees click
		nav.back();// back to home screen
		
		driver.findElement(By.xpath("//a[@title='Breathe-Easy Tank']")).click();// click on breathe easy tank
		nav.back();
		
		driver.findElement(By.xpath("//a[@title='Argus All-Weather Tank']")).click();// click on Argus All-Weather Tank
		nav.back();
		
		driver.findElement(By.xpath("//a[@title='Hero Hoodie']")).click();
		nav.back();
		
		driver.findElement(By.xpath("//a[@title='Fusion Backpack']")).click();
		nav.back();
		
		driver.findElement(By.xpath("//a[@title='Push It Messenger Bag']")).click();
		nav.back();
		return driver.findElement(By.xpath("//a[text()='Subscribe']")).isDisplayed();
	}
	

}
