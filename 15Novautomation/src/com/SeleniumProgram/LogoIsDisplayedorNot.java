package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoIsDisplayedorNot 
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
		//boolean logoDisplayed=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		//System.out.println("logoDisplayed=" + logoDisplayed);
		
		WebElement logoDisplayed=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		//boolean display=logoDisplayed.isDisplayed();
		//System.out.println("display=" + display);
		
		/*if(display==true)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo not present");
		}
		*/
		
		if(logoDisplayed.isDisplayed())
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo not present");
		}
		
		System.out.println("End of java code");
	}
}


