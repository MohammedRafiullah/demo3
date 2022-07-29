package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     public class ScreenShotTask {
	public static void main(String[] args) throws IOException {
		
		

		 System.setProperty
		("webdriver.chrome.driver","C:\\\\Users\\\\Mohammed Rafiullah\\\\eclipse-workspace\\\\Selenium Project\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement element = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
	
		
		
		
		// Type Casting
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		
		// Location
		
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		
		// Destination file
		
		
		File dest = new File("C:\\Users\\Mohammed Rafiullah\\eclipse-workspace\\Screenshot\\Screenshot\\fb.png");
		
		
		// Copy File
		
		
		FileUtils.copyFile(file, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
