package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project.base.ProjectBase;

public class K_OrderDetails extends ProjectBase {
	
	public boolean orderDetails()
	{
		driver.findElement(By.xpath("//a[text()='Orders and Returns']")).click();
		driver.findElement(By.id("oar-order-id")).sendKeys(prop.getProperty("orderid"));
		driver.findElement(By.id("oar-billing-lastname")).sendKeys(prop.getProperty("lastname"));
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='quick-search-type-id']"));
		Select option=new Select(dropdown);
		option.selectByVisibleText("Email");
		
		driver.findElement(By.id("oar_email")).sendKeys(prop.getProperty("accountgmail"));
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		
		return driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1")).isDisplayed();
	}

}
