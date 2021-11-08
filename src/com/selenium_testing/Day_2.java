package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT"
				+ "\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

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



	}






}
