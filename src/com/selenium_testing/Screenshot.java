package com.selenium_testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");

	driver.get("https://wwww.facebook.com/login/");
	driver.manage().window().maximize();

	//findElement....>find the element..>WebElemnt
	//findElements....>find the Elements..>list <WebElemnt>

	WebElement input1 = driver.findElement(By.name("email"));
	input1.sendKeys("Madhankumar");
	WebElement input2 = driver.findElement(By.name("pass"));
	input2.sendKeys("2012345567");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
    Thread.sleep(3000);
	TakesScreenshot shot=(TakesScreenshot) driver;
	File source=shot.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
	FileUtils.copyFile(source, des);
}
	
	
	
	
}
