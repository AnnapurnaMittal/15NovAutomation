package com.interviewPurposeQ;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicate
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
		 HashSet hs=new HashSet();
		 
		 List<WebElement> ref = multiDrop.getOptions();
		 
		 for(WebElement unique:ref)
		 {
			 hs.add(unique.getText());
		 }
		 
		 for(Object print:hs)
		 {
			 System.out.println(print);
		 }
		 
		 
		/* for(WebElement unique:ref)
		 {
			 String duplicate=unique.getText();
			 if(hs.add(duplicate)==true)
			 {
				 System.out.println(duplicate);
			 }
		 } */
		 
		 System.out.println("End of java code");	
	}
}
