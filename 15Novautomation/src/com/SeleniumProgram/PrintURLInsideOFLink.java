package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURLInsideOFLink
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String printInsideURL=driver.findElement(By.xpath("//a[@target='_blank']")).getAttribute("href");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println("printInsideURL=" + printInsideURL);
		System.out.println("End of java code");
	}
}
