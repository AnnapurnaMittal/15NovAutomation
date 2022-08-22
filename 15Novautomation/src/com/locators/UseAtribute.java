package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseAtribute
{
			static
			{
				System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
			}
			
			public static void main(String[] args) throws InterruptedException
			{
				System.out.println("start of java code");

				ChromeDriver driver=new ChromeDriver();
				
				driver.get("file:///D:/Selenium%20eclipse/HtmlCode.html");
				
				//driver.findElement(By.tagName("a")).click();
				
				//driver.findElement(By.id("d1")).click();
				
				//driver.findElement(By.name("n1")).click();
				
				//driver.findElement(By.className("c3")).click();
				
				//driver.findElement(By.linkText("Instagram")).click();
				
				//driver.findElement(By.partialLinkText("FaceBook")).click();
				
				//driver.findElement(By.xpath("./html/body/a")).click();
				//driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
				//driver.findElement(By.xpath("./html/body/a[1]")).click();
				//driver.findElement(By.xpath("./html/body/a[2]")).click();
				
				//driver.findElement(By.xpath("//a[@href='https://www.instagram.com/']")).click();
				driver.findElement(By.xpath("//a[text()='Actitime']")).click();
				System.out.println("end of java code");
			}
		}





/*
//WebElement facebook=driver.findElement(By.tagName("a"));
// facebook.click();
// WebElement id = driver.findElement(By.id("d1"));
//driver.findElement(By.name("n1")).click();
//name.click();
//WebElement classname = driver.findElement(By.className("c1"));
//classname.click();
//driver.findElement(By.linkText("Instagram")).click();//or
// driver.findElement(By.partialLinkText("Instagram")).click();
//driver.findElement(By.xpath("./html/body/a")).click();
//driver.findElement(By.xpath("./html/body/a[1]")).click();
driver.findElement(By.xpath("./html/body/a[2]")).click();
*/