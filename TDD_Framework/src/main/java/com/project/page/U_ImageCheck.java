package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class U_ImageCheck extends ProjectBase {
	int finalcount=0;
	boolean result; 

	public boolean imageCheck() {
		
		driver.findElement(By.xpath("//strong[text()='Take it from Erin']/following-sibling::span[2]")).click();
		driver.findElement(By.xpath("//div[@data-role='collapsible'][1]/div[1]")).click();// style
		driver.findElement(By.xpath("//div[@data-role='content']/ol[1]/li[5]/a")).click();// leggings
		driver.findElement(By.xpath("//ol[@class='products list items product-items']/li[1]/div/div/strong/a")).click();
		driver.findElement(By.xpath("//div[@class='fotorama__stage']/div[3]/div[1]/img")).click();
		for(int i=0;i<Integer.parseInt(prop.getProperty("count"));i++)
		{
		driver.findElement(By.xpath("//div[@class='fotorama__stage']/div[4]/div")).click();
		finalcount++;
		}
		if(finalcount==Integer.parseInt(prop.getProperty("count")))
		{
		result=true;
		}
		return result;
		
	}
}
