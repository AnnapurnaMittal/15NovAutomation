package com.HandlingMouseAction;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws AWTException
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement destination = driver.findElement(By.id("column-3"));
		
		Actions dragAndDrop=new Actions(driver);
		dragAndDrop.dragAndDrop(source,destination).perform();
		System.out.println("End of java code");
	}
}
