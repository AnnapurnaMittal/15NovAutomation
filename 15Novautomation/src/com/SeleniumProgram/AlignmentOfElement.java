package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentOfElement
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com/");
	    int userAlin=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']/..")).getLocation().getX();
		System.out.println("userAlin X=" + userAlin);
		
		int passAlin=driver.findElement(By.xpath("//input[@placeholder='Password']/../..")).getLocation().getX();
		System.out.println("passAlin X=" + passAlin);
		
		if (userAlin==passAlin)
		{
           System.out.println("email and password are properly aligned ");
		}
		else
		{
			System.out.println("email and password are not properly aligned");
		}
		System.out.println("end of java code");
	
	}
}

