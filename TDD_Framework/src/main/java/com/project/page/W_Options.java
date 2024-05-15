package com.project.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;

import com.project.base.ProjectBase;

public class W_Options extends ProjectBase {
	
	public boolean optionsCheck()
	{
		driver.findElement(By.xpath("//a[text()='Privacy and Cookie Policy']")).click();
		Navigation nav= driver.navigate();
		nav.back();
		driver.findElement(By.xpath("//main[@id='maincontent']/following-sibling::footer/div/div/div/ul/li[1]/a")).click();
		Set<String> allhandles = driver.getWindowHandles();
		Iterator<String> it = allhandles.iterator();
		it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//a[text()='PRACTICE API TESTING USING MAGENTO 2']")).click();
		return driver.findElement(By.xpath("//h1[text()='Practice API Testing using Magento 2']")).isDisplayed();
}
}
