package com.project.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.ProjectBase;

public class I_AddReview extends ProjectBase {
	
	public boolean addYourReview()
	{
		driver.findElement(By.xpath("//a[@title='Fusion Backpack']")).click();// clicking fusion bag
		driver.findElement(By.xpath("//a[text()='Add Your Review']")).click();// add review click
		Actions act=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//input[@id='nickname_field']"));
		act.scrollToElement(we).perform();
		
		we.sendKeys(prop.getProperty("firstname"));// writing nickname
		driver.findElement(By.id("summary_field")).sendKeys("The product is robust and good");//adding product review
		driver.findElement(By.id("review_field")).sendKeys("I have been using the product for 3 years. The bag quality is excellent");
		driver.findElement(By.xpath("//div[@class='primary actions-primary']/button")).click();//submit review
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement star=driver.findElement(By.xpath("//input[@id='Rating_3']"));//4 star rating
//		wait.until(ExpectedConditions.elementToBeClickable(star));
//		star.click();
		return driver.findElement(By.xpath("//div[text()='Please select one of each of the ratings above.']")).isDisplayed();
	}

}
