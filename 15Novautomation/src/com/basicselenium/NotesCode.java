package com.basicselenium;

	import java.util.Scanner;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class NotesCode
	{
		static
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		 static WebDriver driver;

		public static void main(String[] args) 
		{
			System.out.println("start of java code");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter your browser name");
			String browser = sc.nextLine();
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver= new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			
			driver.get("https://www.facebook.com/");
			String title = driver.getTitle();
			System.out.println("title=" + title);
			
			System.out.println("end of java code");
		}
	}
//static WebDriver driver=new ChromeDriver(); this static WebDriver driver is as global variables

