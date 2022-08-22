package com.iframe;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameCode
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws AWTException
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame(0); //first frame
		driver.findElement(By.tagName("input")).sendKeys("Annapurna");
		driver.switchTo().frame(0); // first frame inside the first frame so this time index is as 0 ,if another frame remains inside first frame only then that time index would be 1. 
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		System.out.println("Topic="+ driver.findElement(By.xpath(" //span[text()='Not a Friendly Topic']")).getText());
		//driver.switchTo().defaultContent();  it will move to parent web-page directly
		driver.switchTo().frame(1);
		WebElement dropDowm = driver.findElement(By.id("animals"));
		
		Select element=new Select(dropDowm);
		List<WebElement> all = element.getOptions();
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
		
		int size = all.size();
		System.out.println("size=" + size);
		
		element.selectByValue("avatar");
		
		System.out.println("End of java code");
	}
}

