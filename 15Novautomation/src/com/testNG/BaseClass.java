package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.GenericsLibraries.FileUtility;

public class BaseClass 
{
	public WebDriver driver;
	 FileUtility futil=new FileUtility();
	 
	 @BeforeClass
	 public void launchbrowser(String browserName)
	 {
		 if (browserName.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else if (browserName.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	 
	 @AfterClass  
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
	 @BeforeMethod
	 public void login()
	 {
		System.out.println("Login ");
	 }
	 
   @AfterMethod
   public void logout()
   {
	   System.out.println("LOgout sucessfully");
   }
}
