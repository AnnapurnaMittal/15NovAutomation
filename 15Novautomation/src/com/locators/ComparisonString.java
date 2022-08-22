package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparisonString 
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
			
			//String url1=driver.getCurrentUrl();
			//System.out.println("url=" +url1);
			
			String title=driver.getTitle();
			System.out.println("url=" +title);
			
			//boolean res = url1.contains("google.com");
			//System.out.println("res=" +res);
			
			if (title.contains("Gmail"))
			{
				System.out.println(" contains gmail.com");
			}
			else
			{
				System.out.println(" does not Contains gmail.com");
			} 
			
			System.out.println("end of java code");
		}}

