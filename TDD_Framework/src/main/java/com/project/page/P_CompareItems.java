package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;

import com.project.base.ProjectBase;

public class P_CompareItems extends ProjectBase {
	
	
	public boolean compareItems()
	{
		
	driver.findElement(By.xpath("//a[@id='ui-id-6']/span[2]")).click();//gear click
	driver.findElement(By.xpath("//a[@class='block-promo gear-category-bags']/span/span[2]")).click();//bag click
	
	driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[2]/div/div/strong/a")).click();// specific bag click
	driver.findElement(By.xpath("//div[@class='product-info-main']/div[5]/div/a[2]")).click();// add to compare
	Navigation nav= driver.navigate();
	nav.back();
	nav.back();
	driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[1]/div/div/strong/a")).click();//second bag selection;
	driver.findElement(By.xpath("//div[@class='product-info-main']/div[5]/div/a[2]")).click();// add to compare
	
	driver.findElement(By.xpath("//a[text()='comparison list']")).click();// viewing the comparison list
	Actions act=new Actions(driver);
	act.scrollToElement(driver.findElement(By.xpath("//table[@id='product-comparison']/tbody[2]/tr[1]/th"))).perform();
	return driver.findElement(By.xpath("//table[@id='product-comparison']/tbody[2]/tr[1]/th")).isDisplayed();
}
}
