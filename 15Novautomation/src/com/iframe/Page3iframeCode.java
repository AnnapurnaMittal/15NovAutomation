package com.iframe;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page3iframeCode 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws AWTException
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20eclipse/Page%203%20iframe.html");
		
	/*	//frame with index argument
		driver.findElement(By.id("t1")).sendKeys("Annapurna");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Mittal");   
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Annapurna");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("Mittal");  
		
		//frame with id of frame as argument
		driver.findElement(By.id("t1")).sendKeys("Annapurna");
		driver.switchTo().frame("f1");  //Here id of frame id needed
		driver.findElement(By.id("t2")).sendKeys("Mittal"); 
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("Annapurna");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("Mittal");  
		
		//frame with webElement define as argument
		driver.findElement(By.id("t1")).sendKeys("Annapurna");
		WebElement frame = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frame);  
		driver.findElement(By.id("t2")).sendKeys("Mittal"); */
		
		WebElement frame = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("Mittal");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("Annapurna");
		
		System.out.println("End of java code");
	}
}

