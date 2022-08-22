package com.fileUploadPOpUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobortPOPup
{
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException 
		{
			System.out.println("start of java code");
				
			Runtime.getRuntime().exec("notepad");
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_U);
			
			System.out.println("end of java code");
		}
	}

