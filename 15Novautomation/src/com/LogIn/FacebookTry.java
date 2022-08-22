package com.LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTry
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
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("pari26asianu@gmail.con");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		System.out.println("End of java code");
	}
			

}
