package com.LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin
{
	static
	{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("start of java code");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("annapurnamittal5@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Anna@1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@tabindex='0']")).click();
		System.out.println("End of java code");
	}
}
