package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys("madhankumar");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("96746738738");
WebElement button = driver.findElement(By.xpath("//div[contains(@class,'qF0y9')][3]"));
button.click();




}
}
