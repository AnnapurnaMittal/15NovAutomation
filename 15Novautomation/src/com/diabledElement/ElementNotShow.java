package com.diabledElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotShow 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='Annapurna'" );
		System.out.println("End of java code");
	}
}
