package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	Actions act=new Actions(driver);
	act.click(click).build().perform();
	WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	act.contextClick(rightclick).build().perform();
	WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	act.doubleClick(doubleclick).build().perform();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	WebElement move = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none fluid-image-container'])[11]"));
	act.moveToElement(move).build().perform();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
	act.dragAndDrop(from, to).build().perform();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
