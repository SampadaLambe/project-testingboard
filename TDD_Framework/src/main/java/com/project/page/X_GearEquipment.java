package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;

import com.project.base.ProjectBase;

public class X_GearEquipment extends ProjectBase {
	
	public boolean gear()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-6']/span[2]")).click();
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div[1]/div[2]/dl/dd/ol/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[2]/div/div/strong/a")).click();
		Navigation nav=driver.navigate();
		nav.back();
		driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[1]/div/div/strong/a")).click();
		nav.back();
		return driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1/span")).isDisplayed();
	}

}
