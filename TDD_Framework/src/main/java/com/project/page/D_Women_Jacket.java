package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.project.base.ProjectBase;

public class D_Women_Jacket extends ProjectBase {
	
	public boolean womenJacketSelection()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-4']/span[2]")).click();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
		act.scrollToElement(element).perform();
		
		driver.findElement(By.xpath("//img[@alt='Juno Jacket']")).click();
		driver.findElement(By.xpath("//div[@option-label='M']")).click();
		driver.findElement(By.xpath("//div[@option-label='Green']")).click();
		
		Actions act2=new Actions(driver);
		WebElement element2=driver.findElement(By.xpath("//input[@id='qty']"));
		act2.doubleClick(element2).perform();
		act2.keyDown(Keys.DELETE).keyUp(Keys.DELETE).sendKeys("2").perform();
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		
		return driver.findElement(By.xpath("//a[@class='action showcart']/span[2]")).isDisplayed();
		
	}

}
