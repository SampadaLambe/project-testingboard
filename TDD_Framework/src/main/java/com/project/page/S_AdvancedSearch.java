package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class S_AdvancedSearch extends ProjectBase {
	
	public boolean advancedSearch()
	{
		driver.findElement(By.xpath("//a[text()='Advanced Search']")).click();
		driver.findElement(By.xpath("//input[@title='Product Name']")).sendKeys("Juliana Short-Sleeve Tee");
		driver.findElement(By.xpath("//input[@title='SKU']")).sendKeys("WS07");
		driver.findElement(By.xpath("//input[@name='price[from]']")).sendKeys("42");
		driver.findElement(By.xpath("//input[@name='price[to]']")).sendKeys("42");
		driver.findElement(By.xpath("//form[@class='form search advanced']/div/div/button")).click();
		return driver.findElement(By.xpath("//main[@id='maincontent']/div[1]/h1/span")).isDisplayed();
	}
}

