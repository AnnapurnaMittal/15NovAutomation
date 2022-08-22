package com.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	static
	{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("start of java code");

		 //ChromeDriver driver=new ChromeDriver();
		 
		 //Demo1.openbrowser(new ChromeDriver());
		
		 Demo1.openbrowser(new ChromeDriver());
		 
		
	
		 //FirefoxDriver driver1=new FirefoxDriver();
		 
		 
		System.out.println("end of java code");
	}
}


/*
 ChromeDriver driver=new ChromeDriver();
//Demo1.openbrowser(driver);
Demo1.openbrowser(new ChromeDriver());
*/