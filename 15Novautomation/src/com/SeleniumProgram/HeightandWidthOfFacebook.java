package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidthOfFacebook 
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
			WebElement username=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']/.."));
			int userHeight=username.getSize().getHeight();
			int userwidth=username.getSize().getWidth();
			System.out.println("userHeight=" + userHeight);
			System.out.println("userwidth=" + userwidth);
			
			WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']/../.."));
			int passHeight=password.getSize().getHeight();
			int passWidth=password.getSize().getWidth();
			System.out.println("passHeight=" + passHeight);
			System.out.println("passWidth=" + passWidth);
			
			if(userHeight==passHeight)
			{
				System.out.println("Both height is same");
			}
			else
			{
				System.out.println("Not same");
			}
			if (userwidth==passWidth)
			{
				System.out.println("Both width is same");
			}
			else
			{
				System.out.println("Not same");
			}
			System.out.println("End of java code");
		}
	}






	
	
	
	