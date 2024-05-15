package com.project.page;

import org.openqa.selenium.By;

import com.project.base.ProjectBase;

public class A_SignInPage extends ProjectBase {
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	// entering all valid inputs
	public boolean createAccount()
	{
		driver.findElement(By.xpath("//a[@class='action skip contentarea']/following-sibling::ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("lastname")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("password_confirmation")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		return driver.findElement(By.xpath("//h1[@class='page-title']/span")).isDisplayed();
		
	}
	//entering only name and clicking on submit(incomplete information)
	public boolean inputCreateAccount()
	{
		driver.findElement(By.xpath("//a[@class='action skip contentarea']/following-sibling::ul/li[3]/a")).click();
		driver.findElement(By.id("firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		return driver.findElement(By.xpath("//div[@class='field field-name-lastname required']/div/div")).isDisplayed();
		
	}
	

}
