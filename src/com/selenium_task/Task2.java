package com.selenium_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT"
				+ "\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
sign.click();
WebElement input1 = driver.findElement(By.name("email"));
input1.sendKeys("Madhan");
WebElement click1 = driver.findElement(By.id("continue"));
click1.click();

Thread.sleep(3000);
TakesScreenshot shot=(TakesScreenshot) driver;
File source=shot.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
FileUtils.copyFile(source, des);



}
}