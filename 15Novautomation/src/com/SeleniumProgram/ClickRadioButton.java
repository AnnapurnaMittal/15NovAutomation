package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRadioButton
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		int femaleAlin=driver.findElement(By.xpath("//label[text()='Female']/..")).getLocation().getY();
		System.out.println("femaleAlin Y=" + femaleAlin);
		
		int maleAlin=driver.findElement(By.xpath("//label[text()='Male']/..")).getLocation().getY();
		System.out.println("maleAlin Y=" + maleAlin);
		
		if (femaleAlin==maleAlin)
		{
			System.out.println("gender radio button are properly aligned");
		}
		else
		{
			System.out.println("gender radio button are not properly aligned");
		}
		System.out.println("End of java code");
	}
}
