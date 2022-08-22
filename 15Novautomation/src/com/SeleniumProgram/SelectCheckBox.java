package com.SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBox
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean selectedOrNot=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("selectedOrNot=" + selectedOrNot);
		
		if(selectedOrNot==true)
		{
			System.out.println("CheckBox is selected");
		}
		else
		{
			System.out.println("CheckBox is not selected");
		} 
		System.out.println("End of java code");
	}
}
