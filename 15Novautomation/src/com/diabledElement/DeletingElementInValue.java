package com.diabledElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingElementInValue
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20eclipse/DisableElement.html");
		driver.findElement(By.id("d1")).sendKeys("Annapurna");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('d2').value='Mittal'");
		Thread.sleep(4000);
		jse.executeScript("document.getElementById('d2').value=''");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		jse.executeScript("document.getElementById('d3').click()");
		System.out.println("End of java code");
	}
}
