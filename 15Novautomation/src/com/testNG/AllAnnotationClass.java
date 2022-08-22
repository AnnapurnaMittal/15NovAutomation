package com.testNG;

import java.util.Scanner;

import org.testng.annotations.Test;

public class AllAnnotationClass extends BaseClass
{
	@Test(groups ="smokeTest")
	public void createContact()
	{
		System.out.println("Contect created");
	}
	@Test (groups = {"smokeTest", "RegressionTest"})
	public void deleteContact()
	{
		System.out.println("Contact Deleted");
	}
	@Test (groups ="smokeTest")
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
}
