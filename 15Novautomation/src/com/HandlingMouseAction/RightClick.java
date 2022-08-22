package com.HandlingMouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick
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
		driver.get("https://demo.actitime.com/login.do");
		WebElement rightClick = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		Actions a=new Actions(driver);
		a.contextClick(rightClick).perform();
		
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_W);
		//b.keyPress(KeyEvent.VK_T);
		System.out.println("End of java code");
	}
}
