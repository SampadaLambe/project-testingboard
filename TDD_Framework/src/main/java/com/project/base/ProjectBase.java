package com.project.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectBase {
	public static WebDriver driver;
	public static String filepath;
	public static Properties prop;
	 
	public void setup()
	{
		driver=new ChromeDriver();
		propReader();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void propReader()
	{
		filepath="./src/main/java/com/project/base/inputConfig.properties";
		try {
			FileReader reader=new FileReader(filepath);
			prop=new Properties();
			prop.load(reader);	
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
