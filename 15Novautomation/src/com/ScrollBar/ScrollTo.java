package com.ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
		JavascriptExecutor r=(JavascriptExecutor)driver;
		r.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("End of java code");
	}
}
