package com.ChildPupUpOrHandingTab;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CloseTabWithoutQuit 
	{
		
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("start of java code");
			WebDriver driver= new ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://skpatro.github.io/demo/");	
			
			driver.findElement(By.xpath("//a[@href = 'links']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();	
			
			Set<String> whs = driver.getWindowHandles();	 
			int size = whs.size();
			System.out.println("size =" + size);	
			
			 for(String wh:whs)
			 {
				driver.switchTo().window(wh);
				driver.close();
			 }	
			 
			System.out.println("end of java code");
		}
	}

