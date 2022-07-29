package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrBranchTask {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		

		 System.setProperty
		("webdriver.chrome.driver","C:\\\\Users\\\\Mohammed Rafiullah\\\\eclipse-workspace\\\\Selenium Project\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement  Rafi = driver.findElement(By.id("pr_register"));
		
		Rafi.click();
		
	
		
		WebElement element = driver.findElement(By.className("modal-content"));
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		
	
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File("C:\\Users\\Mohammed Rafiullah\\eclipse-workspace\\Screenshot\\Screenshot\\omr.png");
		
		
		FileUtils.copyFile(file, dest);
		System.out.println("kansnns");
		System.out.println("kannana");
		System.out.println("kansnns");
		System.out.println("kansnns");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


