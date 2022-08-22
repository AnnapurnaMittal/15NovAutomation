package com.LogIn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Practice2
	{
		static
		{
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		 
		public static void main(String[] args) throws InterruptedException
		{
			System.out.println("start of java code");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/Godrej-Fully-Automatic-Loading-Washing-Machine/dp/B09JSBCPW1/ref=sr_1_1_sspa?hvadid=82326142518846&hvbmt=bb&hvdev=c&hvqmt=b&keywords=fully+automatic+washing+machine+top+loading+7kg&qid=1657124261&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExVUExSjdOOUpSMUtaJmVuY3J5cHRlZElkPUEwNjk5MDU4MjlaOTdIV1FUS1RUSCZlbmNyeXB0ZWRBZElkPUEwMjU1OTAyMVFQQzhKQVE2U05GMiZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
			WebElement javaprice=driver.findElement(By.xpath("//span[@id='productTitle']/../../../../div[11]/div[1]/div[1]/span/span/span[2]"));
		     String price=javaprice.getText();
			System.out.println("javaprice="+ price);
			System.out.println("End of java code");
		
		}
	}