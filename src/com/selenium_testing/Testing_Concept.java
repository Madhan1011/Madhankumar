package com.selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		//navigate
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
	}
	
	
	
}
