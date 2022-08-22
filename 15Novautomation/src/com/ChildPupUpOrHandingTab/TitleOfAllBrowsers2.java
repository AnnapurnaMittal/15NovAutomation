package com.ChildPupUpOrHandingTab;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TitleOfAllBrowsers2 {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("start of java code");
			WebDriver driver= new ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
			
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			driver.findElement(By.xpath("//a[text()='Courses']")).click();	
			Set<String> whs = driver.getWindowHandles();	 
			int size = whs.size();
			System.out.println("size =" + size);	
			 for(String address:whs)
			 {
				 WebDriver a = driver.switchTo().window(address);
				 System.out.println(a);
				String title = driver.getTitle();
				System.out.println("title =" +title);
			 }	
			 
			System.out.println("end of java code");
		}
	}


