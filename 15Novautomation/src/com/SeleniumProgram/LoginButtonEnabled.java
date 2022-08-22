package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonEnabled 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean loginEnabled=driver.findElement(By.xpath("//div[text()='Login ']")).isEnabled();
		
		if(loginEnabled==true)
		{
			System.out.println("Login button is enabled");
		}
		else
		{
			System.out.println("Login button is not enabled");
		}
		System.out.println("end of java code");
	}
}
