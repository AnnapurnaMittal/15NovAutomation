package com.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 
{
   @Test
   public void test()
   {
	   //System.out.println("Hello world");   no need to use use below line
	   Reporter.log("Log in successfull",true );
   }
   @Test
   public void work()
   {
	   Reporter.log("I am working", true);
   }
   @Test
   public void park()
   {
	   Reporter.log("Park name is Amozone", true);
   }
   @Test(groups = {"smokeTest", "RegressionTest"})
   public void tool()
   {
	   Reporter.log("Tool is hard to work", true);
   }
   @Test
   public void demo()
   {
	   Reporter.log("Demo is going on", true);
   }
   @Test
   public void King()
   {
	   Reporter.log("Knowledge is king", true);
   }
   @Test
   public void shop()
   {
	   Reporter.log("I want to go for shoping", true);
   }
   @Test
   public void age()
   {
	   Reporter.log("Age is not reason", true);
   }
   @Test
   public void house()
   {
	   Reporter.log("House is big", true);
   }
   @Test
   public void music()
   {
	   Reporter.log("music is good", true);
   }
   @Test
   public void talk()
   {
	   Reporter.log("People do not speak", true);
   }
   @Test
   public void speed()
   {
	   Reporter.log("need to match speed", true);
   }
   @Test
   public void food()
   {
	   Reporter.log("I am foodie", true);
   }
   @Test
   public void tour()
   {
	   Reporter.log("My dream is to go in long tour", true);
   }
   @Test
   public void study()
   {
	   Reporter.log("Study makes me good", true);
   }
   @Test
   public void cool()
   {
	   Reporter.log("No rain no cool", true);
   }
   @Test
   public void warm()
   {
	   Reporter.log("No rain too warm", true);
   }
   @Test
   public void hill()
   {
	   Reporter.log("Hill is top", true);
   }
   @Test
   public void gone()
   {
	   Reporter.log("Going to market", true);
   }
   @Test
   public void well()
   {
	   Reporter.log("Well to do good", true);
   }
}


