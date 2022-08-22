package com.fileUploadPOpUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[]args) throws InterruptedException
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20eclipse/FileUpload.html");
		
		//File f=new File("./FileLoading/BBMKU __ Admit Card PHd.pdf");
		//String path = f.getAbsolutePath();
		//System.out.println(path);
		driver.findElement(By.xpath("//button[@id='lifecycle-nativebutton']")).sendKeys("D:\\Annapurna documents of exam\\Annapurna CV 2021 corporate job.pdf");
		System.out.println("end of java code");
		
	}
}
