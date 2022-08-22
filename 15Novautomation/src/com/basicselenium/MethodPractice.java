package com.basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodPractice
{
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) throws InterruptedException 
		{
			System.out.println("start of java code");
			WebDriver driver = new ChromeDriver();
			driver.get("https://gmail.com");
	
			//driver.navigate().to("https://www.facebook.com");
			
			//driver.navigate().back();
			// Thread.sleep(4000);
			//driver.navigate().forward();
			// Thread.sleep(4000);
			//driver.navigate().refresh();
			
			String htmlCode = driver.getPageSource();
			
			System.out.println("htmlCode=" +htmlCode);
		}
	}




