package com.project.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.ProjectBase;

public class F_CartCheckout extends ProjectBase {
	
	public boolean addItems()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-6']/span[2]")).click();//gear click
		driver.findElement(By.xpath("//a[@class='block-promo gear-category-bags']/span/span[2]")).click();//bag click
		
		driver.findElement(By.xpath("//div[@class='products wrapper grid products-grid']/ol/li[2]/div/div/strong/a")).click();// specific bag click
		driver.findElement(By.xpath("//form[@data-product-sku='24-WB07']/div/div/div[2]/button")).click();// add to cart click
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 200).perform();
		
		driver.findElement(By.xpath("//a[text()='shopping cart']")).click();// clicking my shopping cart
		driver.findElement(By.xpath("//div[@id='cart-totals']/following-sibling::ul/li[1]/button")).click();// proceeding to checkout
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));// does not work hence added thread.sleep()
//		wait.until(ExpectedConditions.elementToBeClickable(we)).click();
		//driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();// click proceed to 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.findElement(By.id("customer-email")).isDisplayed();
	}

}
