package com.project.page;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class J_Subscribe extends ProjectBase{
	
	public boolean subscribe() 
	{
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("Parent window handle "+parentWindowHandle);
		
		String parentWindowTitle=driver.getTitle();
		System.out.println("Parent window title "+parentWindowTitle);
		
		driver.findElement(By.xpath("//a[text()='Subscribe']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		it.next();
		String childWindowhandle = it.next();
		System.out.println("Child window handle "+childWindowhandle);
		driver.switchTo().window(childWindowhandle);
		String ChildWindowTitle = driver.getTitle();
		System.out.println("Child Window title "+ChildWindowTitle);
		driver.findElement(By.xpath("//input[@id='mce-EMAIL']")).sendKeys(prop.getProperty("gmail"));
		driver.findElement(By.xpath("//input[@id='mce-FNAME']")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath("//input[@id='mce-LNAME']")).sendKeys(prop.getProperty("surname"));
		driver.findElement(By.xpath("//input[@id='mce-COMPANY']")).sendKeys(prop.getProperty("company"));
		driver.findElement(By.xpath("//input[@id='mce-POSITION']")).sendKeys(prop.getProperty("position"));
		driver.findElement(By.xpath("//input[@id='mc-embedded-subscribe']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.findElement(By.xpath("//div[@id='mce-success-response']")).isDisplayed();
	}

}
