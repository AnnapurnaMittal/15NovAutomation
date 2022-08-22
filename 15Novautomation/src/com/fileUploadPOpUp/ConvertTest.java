package com.fileUploadPOpUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertTest
{
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException, AWTException, IOException
		{
			System.out.println("start of java code");
			WebDriver driver= new ChromeDriver();	
			driver.get("https://pdf.online/pdf-to-word-converter");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement up = driver.findElement(By.xpath("//button[@class='chakra-button css-2oeqt2']"));
			up.click();
			
			File f=new File("./FileLoading/Annapurna CV 2021 corporate job.pdf");
			String path = f.getAbsolutePath();
			up.sendKeys(path); 
		
			
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_U); 
			
			System.out.println("File upload sucessfully");
			System.out.println("End of java code");
		}
	}

