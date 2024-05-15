package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class B_CredentialSignIn extends ProjectBase {
	
	//positive credentials
	public boolean positiveSignIn()
	{
		driver.findElement(By.xpath("//div[@class='panel header']/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		return driver.findElement(By.xpath("//div[@class='panel header']/ul//li/span[starts-with(text(),'Welcome')]")).isDisplayed();
	}
	
	//negative credentials
	
	public boolean NegativeSignIn()
	{
		driver.findElement(By.xpath("//div[@class='panel header']/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("NegCred"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("Negpass"));
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		return driver.findElement(By.xpath("//div[@role='alert']/div/div[contains(text(),'incorrect')]")).isDisplayed();
	}
}
