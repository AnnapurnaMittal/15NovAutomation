package com.Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait
{

		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException 
		{
			System.out.println("start of java code");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
			Thread.sleep(2000);
			List<WebElement> allElements = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
			System.out.println(allElements.size());
			
			for(int i=0;i<allElements.size();i++)
			{
				System.out.println(allElements.get(i).getText());
			}
			allElements.get(0).click();
			System.out.println("End of java code");
		}
}
	

/*
 * explicitly wait 
 * 
 * WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
*/
 

