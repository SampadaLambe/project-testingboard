package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class Q_AddingFilters extends ProjectBase {
	
	public boolean addFilters()
	{
		driver.findElement(By.xpath("//div[@class='section-items nav-sections-items']/div[2]/nav/ul/li[4]/a/span[2]")).click();// gear click
		driver.findElement(By.xpath("//main[@id='maincontent']/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[3]/a")).click();//watches
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div/div[2]/div/div[3]/div[1]")).click();//gender click
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div/div[2]/div/div[3]/div[2]/ol/li[2]/a")).click();// women click
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div/div[2]/div[3]/div[5]/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='sidebar sidebar-main']/div/div[2]/div[3]/div[5]/div[2]/ol/li[2]/a")).click();
		return driver.findElement(By.xpath("//div[@class='block-content filter-content']/div/strong")).isDisplayed();
	}
}
