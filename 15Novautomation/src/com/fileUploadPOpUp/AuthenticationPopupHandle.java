package com.fileUploadPOpUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupHandle 
		{
			static
			{
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
			public static void main(String[] args) throws InterruptedException 
			{
				System.out.println("start of java code");
				WebDriver driver= new ChromeDriver();
				//driver.get("https://the-internet.herokuapp.com/basic_auth");
			    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				System.out.println("end of java code");
			}
	}


