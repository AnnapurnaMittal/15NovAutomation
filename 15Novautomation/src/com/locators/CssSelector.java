package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("start of java code");

		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20eclipse/Locators.html");
	
		 //WebElement facebook = driver.findElement(By.cssSelector("a[id='d1']"));
		 //facebook .click();
		 //WebElement facebook = driver.findElement(By.cssSelector("a[name='n1']"));
		 //facebook .click();
		// WebElement facebook = driver.findElement(By.cssSelector("a[class='c1']"));
		// facebook .click();
		// WebElement facebook = driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']"));
		 //facebook .click();
		
		System.out.println("end of java code");
	}

}
