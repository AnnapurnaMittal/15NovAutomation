package com.LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{
	static
	{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("start of java code");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/tshirts/hrx-by-hrithik-roshan/hrx-by-hrithik-roshan-men-off-white-printed-t-shirt/1700946/buy");
		WebElement javaprice=driver.findElement(By.xpath("//h1[text()='HRX by Hrithik Roshan']/../p/span/strong"));
		String price=javaprice.getText();
		System.out.println("javaprice="+ price);
		System.out.println("End of java code");
	
	}
}
