package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.project.base.ProjectBase;

public class C_SearchOptions extends ProjectBase {

	public boolean searchBar()
	{
		WebElement target=driver.findElement(By.id("search"));
		target.sendKeys(prop.getProperty("searchtopic"));
		Actions act=new Actions(driver);
		act.click(target).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		return driver.findElement(By.xpath("//div[@class='page-title-wrapper']/h1/span")).isDisplayed();
	}
}
