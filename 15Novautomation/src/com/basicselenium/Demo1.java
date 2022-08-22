package com.basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	
	static void openbrowser(WebDriver driver) throws InterruptedException 
	{
		 Thread.sleep(3000);
		 driver.get("https://www.facebook.com");
		 String Url=driver.getCurrentUrl();
		 System.out.println("URL=" + Url);
		 String title=driver.getTitle();
		 Thread.sleep(5000);
		 System.out.println("Title=" + title);
		 driver.close();
		 
	}

}
