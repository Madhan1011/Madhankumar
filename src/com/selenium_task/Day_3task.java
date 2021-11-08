package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_3task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement text1 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
text1.click();
	
	
	
	
	
	
	
	
	
	}
}