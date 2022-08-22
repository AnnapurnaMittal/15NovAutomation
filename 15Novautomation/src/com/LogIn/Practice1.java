package com.LogIn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Practice1
	{
		static
		{
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		 
		public static void main(String[] args) throws InterruptedException
		{
			System.out.println("start of java code");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/search?q=APPLE+iPhone+12+Mini+%28Black%2C+64+GB%29&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
			WebElement javaprice=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
			String price=javaprice.getText();
			System.out.println("javaprice="+ price);
			System.out.println("End of java code");
		
		}
	}
