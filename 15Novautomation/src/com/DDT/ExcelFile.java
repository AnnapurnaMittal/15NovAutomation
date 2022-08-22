package com.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("start of java code");
		FileInputStream fs= new FileInputStream("./data/ExcelSelenium.xlsx");
		XSSFWorkbook s=new XSSFWorkbook(fs);
		System.out.println(s.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		System.out.println(s.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue());
		System.out.println(s.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		System.out.println(s.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		System.out.println("End of java code");
	}
}
