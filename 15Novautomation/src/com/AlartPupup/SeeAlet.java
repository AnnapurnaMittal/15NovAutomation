package com.AlartPupup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeeAlet
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[]args) throws InterruptedException
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
	    driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	
		WebElement a = driver.findElement(By.id("timerAlertButton"));
		Thread.sleep(6000);
		a.click();
		driver.switchTo().alert().sendKeys("Annapurna");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("End of java code");
	}
}
