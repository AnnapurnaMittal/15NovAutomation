package com.interviewPurposeQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[]args)
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20eclipse/MultiDropDownCarHTMLCodeLink.html");
		 WebElement carDropDown = driver.findElement(By.id("multiselect1"));
		
		 Select multiDrop=new Select(carDropDown);
		 
		 for(int i=0;i<9;i++)
		 {
			 multiDrop.selectByIndex(i);
		 }
		 
		 List<WebElement> ref = multiDrop.getOptions();
		 
		 for(WebElement print:ref)
		 {
		 System.out.println(print.getText());
		 }
		 System.out.println("End of java code");	
	}
}
