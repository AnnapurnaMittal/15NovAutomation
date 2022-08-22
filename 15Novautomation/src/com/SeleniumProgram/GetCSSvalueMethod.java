package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalueMethod 
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
		WebElement font=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String colourOfLink=font.getCssValue("color");
		System.out.println("colourOfLink=" + colourOfLink);
		
		String fontfamily=font.getCssValue("font-family");
		System.out.println("fontfamily=" + fontfamily);
		
		String fontSize=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		System.out.println("fontSize=" + fontSize);
		
		System.out.println("End of java code");
		
	}
}
