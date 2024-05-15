package com.project.page;

import org.openqa.selenium.By;
import com.project.base.ProjectBase;
import com.project.page.R_SearchItems;

public class R_SearchItems extends ProjectBase {
	
	public boolean search()
	{
		driver.findElement(By.xpath("//a[text()='Search Terms']")).click();//clicking on search items 
		driver.findElement(By.xpath("//main[@id='maincontent']/div[3]/div/ul/li[3]/a")).click();// click on 3rd option- Aero tees
		driver.findElement(By.xpath("//main[@id='maincontent']/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/div/strong/a")).click();// selecting the specific tshirt
		return driver.findElement(By.xpath("//main[@id='maincontent']/div[2]/div/div[1]/div[1]/h1/span")).isDisplayed();
	}
}
	