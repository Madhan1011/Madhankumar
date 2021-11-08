package com.selenium_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	String CurrentUrl1=driver.getCurrentUrl();
	System.out.println(CurrentUrl1);
	String title1=driver.getTitle();
	System.out.println(title1);
	driver.get("https://www.amazon.com/");
	String CurrentUrl2=driver.getCurrentUrl();
	System.out.println(CurrentUrl2);
	String title2=driver.getTitle();
	System.out.println(title2);
	driver.navigate().to("https://www.zomato.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.get("https://www.instagram.com/");
	String CurrentUrl3=driver.getCurrentUrl();
	System.out.println(CurrentUrl3);
	String title3=driver.getTitle();
	System.out.println(title3);
	driver.navigate().refresh();
	driver.close();
	System.out.println("browserclosed");
	
	
	
	
	
	
	
	
	
	
}




















}




