
package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement ok = driver.findElement(By.xpath("//button[@id='alertButton']"));
		ok.click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		WebElement timer = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timer.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("Success");
		alert.accept();
		WebElement text = driver.findElement(By.xpath("//span[contains(text(),'On button click, prompt box will appear')]"));
		System.out.println(text.getText());






	}
}
