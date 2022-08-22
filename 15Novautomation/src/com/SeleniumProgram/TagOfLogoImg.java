package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagOfLogoImg 
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
		String tagName=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getTagName();
		System.out.println("tagName=" + tagName);
		
		if(tagName.contains("img"))
		{
			System.out.println("Tag of logo is image of facebook");
		}
		else
		{
			System.out.println("Tag of logo is not image of facebook");
		}
		System.out.println("end of java code");
	}

}
