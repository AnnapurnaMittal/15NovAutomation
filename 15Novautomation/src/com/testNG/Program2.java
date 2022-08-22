package com.testNG;

import org.testng.annotations.Test;

public class Program2
{
	@Test()
	public void createContact()
	{
		System.out.println("created contacts");
		
	}
	
	@Test ()
	public void deleteContact()
	{
		System.out.println("delete contacts");
		
	}
	
	@Test (groups ="smokeTest")
	public void modifyContact()
	{
		System.out.println("modify contacts");
		
	}
}
