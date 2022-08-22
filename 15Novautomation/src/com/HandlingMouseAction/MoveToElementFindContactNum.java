package com.HandlingMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementFindContactNum
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of java code");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement recourses = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(recourses).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		
		WebElement banguloreNum = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]"));
		System.out.println("contact number of bangulore=" + banguloreNum.getText());
		
		WebElement UnitedKingdomNum=driver.findElement(By.xpath("//p[contains(text(),'United Kingdom, London')]/../p[2]"));
		System.out.println("Contact number of UK=" + UnitedKingdomNum.getText());
		
		WebElement ChristchurchNum=driver.findElement(By.xpath("//p[contains(text(),'Christchurch, New Zealand')]/../p[2]"));
		System.out.println("Contact number of Christchurch =" + ChristchurchNum.getText());
		
		WebElement MelbourneNum=driver.findElement(By.xpath("//p[contains(text(),'Melbourne, Australia')]/../p[2]"));
		System.out.println("Contact number of MelbourneNum =" + MelbourneNum.getText());
		
		WebElement Num=driver.findElement(By.xpath("//p[contains(text(),'U.S. & Global')]/../p[2]"));
		System.out.println("Contact number of U.S. & Global =" + Num.getText());
		
		WebElement GeneralEmail=driver.findElement(By.xpath("//p[contains(text(),'General')]/../p[2]"));
		System.out.println("Email Id of General=" + GeneralEmail.getText());
		
		WebElement HumanResourcesEmail=driver.findElement(By.xpath("//p[contains(text(),'Human Resources')]/../p[2]"));
		System.out.println("Email Id of Human Resources=" + HumanResourcesEmail.getText());
		
		System.out.println("End of java code");
	}
}
