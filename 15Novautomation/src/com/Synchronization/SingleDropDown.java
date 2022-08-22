package com.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement option = driver.findElement(By.id("dropdown-class-example"));
		
		Select ref=new Select(option);
		//ref.selectByIndex(0);
		//ref.selectByIndex(1);
		ref.selectByIndex(2);
		ref.selectByIndex(3);
		
	//  ref.selectByValue("option1");
	//	ref.selectByValue("option2");
	//  ref.selectByValue("option3");
	
		//ref.selectByVisibleText("Option2");
		//ref.selectByVisibleText("Option3");
		//ref.selectByVisibleText("Option1");
		
		System.out.println(ref.getFirstSelectedOption().getText());
		System.out.println(ref.getOptions().get(3));
		System.out.println("End of java code");
	}
}

/*
	    ref.deselectByIndex(3);
		ref.deselectByIndex(2);
		ref.deselectByIndex(1);
		
		
Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
	at org.openqa.selenium.support.ui.Select.deselectByIndex(Select.java:248)
	at com.Synchronization.SingleDropDown.main(SingleDropDown.java:34)
	
	//ref.selectByIndex(0);
	 Zero index is not working , may be because select is as top.
	 
	 output of (ref.getOptions().get(3)); and all index it show same,
	 i.e
	 [[[[ChromeDriver: chrome on WINDOWS (d4e4ab0dfdda801a52db0c1385c1bd61)] -> id: dropdown-class-example]] -> tag name: option]


ref.getFirstSelectedOption().getText()); is giving last showing option which present in dropdown

*/
