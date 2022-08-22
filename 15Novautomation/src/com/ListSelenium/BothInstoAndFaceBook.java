package com.ListSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BothInstoAndFaceBook
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		driver.get("file:///D:/Selenium%20eclipse/HtmlCode.html");
		List<WebElement> allElements = driver.findElements(By.xpath("//a[@id='d1']"));
		int size =allElements.size();
		System.out.println("size=" + size);
		
		for(WebElement name :allElements)
		{
			String print=name.getText();
			System.out.println(print);
		}
		
		System.out.println("end of java code");
	}

}
