package com.selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		driver.manage().window().maximize();
		
	    WebElement multi = driver.findElement(By.xpath("//select[@name='coffee2']"));
	    Select s =new Select(multi);
	    boolean multiple = s.isMultiple();
	    System.out.println(multiple);
	     s.selectByValue("sugar");
	     s.selectByValue("danish");
	     List<WebElement> ss = s.getAllSelectedOptions();
	     
	     
	      for (WebElement webElement : ss) {
			System.out.println(webElement.getText());
		}
	
	
	
	}
	
	
	
	
}
