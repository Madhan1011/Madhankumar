package com.selenium_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );

WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();


}
	
	
}
