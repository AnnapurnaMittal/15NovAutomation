package com.Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown 
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
		driver.get("https://omayo.blogspot.com/");
		WebElement option = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		Select ref=new Select(option);
		ref.selectByIndex(0);
		 Thread.sleep(1000);
		//ref.selectByIndex(1);
		// Thread.sleep(1000);
		ref.selectByIndex(2);
		 Thread.sleep(1000);
		ref.selectByIndex(3);
		//ref.deselectByValue("volvox");
		// Thread.sleep(1000);
		//ref.deselectByValue("swiftx");
		// Thread.sleep(1000);
		//ref.deselectByValue("Hyundaix");
		// Thread.sleep(1000);
		//ref.deselectByValue("audix"); 
		
		List<WebElement> all = ref.getAllSelectedOptions();
		for(WebElement out:all)
		{
			System.out.println(out.getText());
		}
		
		
		/*
		List<WebElement> all = ref.getOptions();
		for(WebElement out:all)
		{
			System.out.println(out.getText());
		}
		

		System.out.println(ref.getFirstSelectedOption().getText());
		
		
	   ref.selectByValue("volvox");
	    Thread.sleep(1000);
		ref.selectByValue("swiftx");
		 Thread.sleep(1000);
	    ref.selectByValue("Hyundaix");
	    Thread.sleep(1000);
	    ref.selectByValue("audix");
	    Thread.sleep(1000);
	    ref.deselectByIndex(2);
	    Thread.sleep(1000);
	    ref.deselectByIndex(3);
	    Thread.sleep(1000);
	    ref.deselectByIndex(1);
	    Thread.sleep(1000);
	    ref.deselectByIndex(0); 
	
		ref.selectByVisibleText("Volvo ");
		ref.selectByVisibleText("Swift ");
		ref.selectByVisibleText("Hyundai ");
		ref.selectByVisibleText("Audi ");
		ref.deselectAll();*/
		 
		System.out.println("End of java code");
	}
}
