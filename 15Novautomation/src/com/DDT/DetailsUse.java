package com.DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DetailsUse 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("start of java code");
		FileInputStream s= new FileInputStream("./data/Details.property.txt");
		Properties fi=new Properties();
		fi.load(s);
		System.out.println(fi.getProperty("Name"));
		System.out.println(fi.getProperty("Place"));
		System.out.println("End of java code");
	}
}
