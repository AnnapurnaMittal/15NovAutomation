package com.mock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MOcktest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of java code");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pearson" +  "\n");
		List<WebElement> ref = driver.findElements(By.xpath("//a"));
		System.out.println("Size=" + ref.size());
		
		for(WebElement print:ref)
		{
			//System.out.println(print.getAttribute("href"));
			System.out.println(print.getText());
		}
		System.out.println("End of java code");
	}
}

// "\n" = we can use it in place of KEYS.Enter.
