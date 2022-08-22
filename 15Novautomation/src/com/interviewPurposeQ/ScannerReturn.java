package com.interviewPurposeQ;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScannerReturn 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	 
	public static void main(String[]args)
	{
		System.out.println("Start of java code");
		
	     Scanner sc= new Scanner(System.in);
	   	 System.out.println("enter your car name");
		 String browser = sc.nextLine();
		
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  driver.get("file:///D:/Selenium%20eclipse/MultiDropDownCarHTMLCodeLink.html");
		   WebElement carDropDown = driver.findElement(By.id("multiselect1"));
		
		   Select multiDrop=new Select(carDropDown);
		 
	     	 List<WebElement> ref = multiDrop.getOptions();
	     	 
		    for(WebElement print:ref)
	     	 {
			 String car = print.getText();
			 if (browser.equals(car)==true)
			 {
			    System.out.println(car);
			    System.out.println("Present in multi-list");
			 }
		     }
		    
		 System.out.println("End of java code");
	}
}
