package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("Madhankumar");
		
		WebElement surname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg ')])[1]"));
		surname.sendKeys("sekar");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@name='lastname'])"));
		lastname.sendKeys("kumar");
	    
		WebElement number = driver.findElement(By.xpath("(//input[contains(@name,'reg_email__')])[1]"));	
		number.sendKeys("98765435");
	    
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("tegrnrnfg");
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'share')]"));
		String text2 = text.getText();
		System.out.println(text2);
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(drop);
		s.selectByValue("20");
		WebElement month = driver.findElement(By.xpath("(//select[@id='month'])"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1993");
		WebElement gender = driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[2]"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
	}


}
