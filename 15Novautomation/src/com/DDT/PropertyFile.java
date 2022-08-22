package com.DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("start of java code");
		FileInputStream fis = new FileInputStream("./data/PropertyFile1.property.txt");
		Properties p= new Properties();
		p.load(fis);
		String h = p.getProperty("url");
		System.out.println(h);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
		WebDriver driver =new ChromeDriver();
		driver.get(h);
		System.out.println("End of java code");
	}
}


