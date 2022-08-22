package com.testNG;

import org.testng.annotations.Test;

public class Program3
{
	@Test
	public void createContact2()
	{
		System.out.println("created contacts 2");
		
	}
	
	@Test (groups ="smokeTest")
	public void deleteContact2()
	{
		System.out.println("delete contacts 2 ");
		
	}
	
	@Test
	public void modifyContact2()
	{
		System.out.println("modify contacts 2");
		
	}
}
