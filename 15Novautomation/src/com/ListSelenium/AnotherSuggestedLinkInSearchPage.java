package com.ListSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherSuggestedLinkInSearchPage
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation testing jobs" + Keys.ENTER);
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
	      int size=allLink.size();
	      System.err.println("size="+ size);
	      
	      for(int i=0;i<size;i++)
	      {
	    	  String print=allLink.get(i).getText();
	    	  System.out.println(print);
	    	  String allLinkInSearchPage = allLink.get(i).getAttribute("href");
	    	  System.out.println(allLinkInSearchPage);
	    	 
	      }
	      System.out.println("End of java code");	
	}
}
