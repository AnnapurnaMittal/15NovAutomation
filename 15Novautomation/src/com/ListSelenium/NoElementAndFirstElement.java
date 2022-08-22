package com.ListSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoElementAndFirstElement
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
		List<WebElement> allElement = driver.findElements(By.xpath("//a[@id='d1']"));
		System.out.println(allElement.size());
		
		System.out.println(allElement.get(0).getText());
		
		System.out.println("End of java code");
	}
}


/*
If used for loop for executing only one element
then it will print all
FaceBook 24
FaceBook 24
FaceBook 24
FaceBook 24
FaceBook 24
so used only this
System.out.println(allElement.get(0).getText());
*/