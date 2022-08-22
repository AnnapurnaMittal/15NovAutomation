package com.ListSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextvalue 
{
	/*WAS to print no of element present and print the element which is having text as “facebook”*/
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Selenium%20eclipse/HtmlCode.html");
		List<WebElement> elements = driver.findElements(By.cssSelector("a[id='d1']"));
		System.out.println(elements.size());
		  List<WebElement> printFacebook = driver.findElements(By.xpath("//a[contains(text(),'FaceBook')]"));
		for(WebElement facebookPrint:printFacebook)
		{
			String name=facebookPrint.getText();
			System.out.println("name=" + name);
		}
		System.out.println("End of java code");
	}
}
