package com.fileUploadPOpUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPOPup 
{
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("start of java code");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			//-->open the browser in modified settings
			
			WebDriver driver= new ChromeDriver(options);	
			driver.get("https://www.india.com/news/india/");
			System.out.println("end of java code");
		}
	}

