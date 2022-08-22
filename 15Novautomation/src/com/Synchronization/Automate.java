package com.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		int femaleAlin=driver.findElement(By.xpath("//label[text()='Female']/..")).getLocation().getY();
		System.out.println("femaleAlin Y=" + femaleAlin);
		
		int maleAlin=driver.findElement(By.xpath("//label[text()='Male']/..")).getLocation().getY();
		System.out.println("maleAlin Y=" + maleAlin);
		
		System.out.println(driver.getCurrentUrl());
		if (femaleAlin==maleAlin)
		{
			System.out.println("gender radio button are properly aligned");
		}
		else
		{
			System.out.println("gender radio button are not properly aligned");
		}
		System.out.println("End of java code");
	}

}
