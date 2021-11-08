package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		WebElement pass = driver.findElement(By.xpath("//input[@type='text']"));
		pass.sendKeys("Tester");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		System.out.println(iframe.getText());
		int size1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size1);
		driver.switchTo().frame(1);
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		Thread.sleep(3000);
		WebElement pass1 = driver.findElement(By.xpath("//input[@type='text']"));
		pass1.sendKeys("Selenium");
		System.out.println(pass1.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
