package com.DDT;

import java.io.IOException;
import java.util.HashMap;

public class HashCode
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("start of java code");
		HashMap<String,String> hs= new HashMap<String,String>();
		hs.put("Name", "Annapurna Mittal");
		hs.put("Place", "Ranchi");
		System.out.println(hs.get("Name"));
		System.out.println(hs.get("Place"));
		System.out.println("End of java code");
	}
}
