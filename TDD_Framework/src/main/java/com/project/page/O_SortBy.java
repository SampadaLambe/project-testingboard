package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.project.base.ProjectBase;

public class O_SortBy extends ProjectBase{
	
	public boolean sortBy()
	{
		driver.findElement(By.xpath("//div[@id='store.menu']/nav/ul/li[3]/a/span[2]")).click();
		WebElement we1=driver.findElement(By.xpath("//main[@id='maincontent']/div[4]/div[2]/div[2]/div/ul[1]/li[3]/a"));
		we1.click();
		
		//sort by price
		WebElement we=driver.findElement(By.xpath("//main[@id='maincontent']/div[3]/div[1]/div[2]/div[3]/select"));
		Select options=new Select(we);
		options.selectByValue("price");
				
		Actions act=new Actions(driver);
		WebElement we2=driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[6]/div/div/strong/a"));
		act.scrollToElement(we2).perform();
		return driver.findElement(By.xpath("//main[@id='maincontent']/div[3]/div[1]/div[2]/div[3]/select/option[3]")).isDisplayed();
		}

}
