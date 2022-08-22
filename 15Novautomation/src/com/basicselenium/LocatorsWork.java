package com.basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsWork 
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
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
			System.out.println("end of java code");
		}
	}

