package com.ListSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestion
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allElements = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(allElements.size());
		
		for(int i=0;i<allElements.size();i++)
		{
			System.out.println(allElements.get(i).getText());
		}
		allElements.get(0).click();
		System.out.println("End of java code");
		
	}

}


/*
To find this Xpath 
	List<WebElement> allElements= driver.findElements(By.xpath("//span[contains(text(),'java')]"));

we have to click inspect of java auto suggestion

if we use for loop then as index start from 0 so last index will be less then 8 otherwise it will show 
indexOutOfBoundException

for(WebElement name:allElements)
		{
			System.out.println(name.getText());
		}
		As par my knowledge as per now for each loop do not have index so i can't able to click first 
		java suggestion so for each loop not used in this case 

*/