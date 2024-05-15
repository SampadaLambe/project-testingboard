package com.project.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.ProjectBase;

public class M_CartCheckout extends ProjectBase {
	
	L_SaleOption so;
	public boolean cartCheckout()
	{
		so=new L_SaleOption();
		so.sales();
		driver.findElement(By.xpath("//div[@class='header content']/div[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='minicart-content-wrapper']/div[2]/div[3]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("customer-email")).sendKeys(prop.getProperty("accountgmail"));
		
		driver.findElement(By.xpath("//form[@class='form form-shipping-address']/div/div[1]/div[1]/input")).sendKeys("Sampada");
		driver.findElement(By.xpath("//form[@class='form form-shipping-address']/div/div[2]/div/input")).sendKeys("Lambe");
		driver.findElement(By.xpath("//form[@class='form form-shipping-address']/div/div[3]/div/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//fieldset[@class='field street admin__control-fields required']/div/div[1]/div/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//form[@class='form form-shipping-address']/div/div[4]/div/input")).sendKeys("Pune");
		
		WebElement cname=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select country=new Select(cname);
		country.selectByVisibleText("India");
		
		WebElement state=driver.findElement(By.xpath("//select[@name='region_id']"));
		Select statename=new Select(state);
		statename.selectByVisibleText("Maharashtra");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(prop.getProperty("pin"));
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(prop.getProperty("contactno"));
		
		driver.findElement(By.xpath("//input[@name='ko_unique_3']")).click();
		driver.findElement(By.xpath("//form[@id='co-shipping-method-form']/div[3]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@title='Place Order']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1/span")).isDisplayed();	
	}
}
