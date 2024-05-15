package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.project.base.ProjectBase;

public class E_WhatsNew extends ProjectBase {

	public boolean whatsNewOption()
	{
		driver.findElement(By.xpath("//a[@id='ui-id-3']/span")).click();// click whats new
		WebElement we1=driver.findElement(By.xpath("//div[@class='blocks-promo']/a/span/span[2]"));//shop new yoga button click
		we1.click();
		WebElement we=driver.findElement(By.xpath("//div[@data-product-id='1997']/following-sibling::div/div[1]/div[1]/div[1]"));
		// selecting 28 size
		Actions act=new Actions(driver);
		act.doubleClick().perform();
		Actions act2 = act.doubleClick(we).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
		act2.perform();
		act2.doubleClick().perform();// selecting black color
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//form[@data-product-sku='WSH07']/button")).click(); //adding to cart
		driver.findElement(By.xpath("//form[@data-product-sku='WSH07']/div[1]/div/div/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//form[@data-product-sku='WSH07']/div[1]/div/div/div[2]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//form[@data-product-sku='WSH07']/div[2]/div/div/div[2]/button")).click();
		return driver.findElement(By.xpath("//a[@class='action showcart']/span[2]")).isDisplayed();
	}
}
