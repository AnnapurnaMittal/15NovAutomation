package com.Top;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeWork 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.xpath("//span[@id='loginspan']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("annapurnamittal5@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Annapurna@1995");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@title='Add Contact']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Annapurna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mittal");
		WebElement ref = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions a=new Actions(driver);
		a.moveToElement(ref).perform();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		System.out.println("End of java code");
	}
}
