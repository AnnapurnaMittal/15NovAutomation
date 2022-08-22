package com.up;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class MockQuestion
{
	public static void main(String[]args)
	{
		System.out.println("start of java code");
		 ArrayList ref= new ArrayList();
		 HashSet hs = new HashSet();
		 hs.add("Annapurna");
		 hs.add(10);
		 hs.add(58.25);
		 hs.add("pradeep");
		 hs.add(true);
		 hs.add(false);
		 hs.add("raj");
		 hs.add("pradeep");
		 hs.add(10);
		     
		for(Object ob:hs)
		{
			System.out.println(ob);
			ref.add(ob);
		}		
		
		System.out.println("Java is hard");
		
		 ListIterator re = ref.listIterator();
		 while(re.hasNext())
		 {
			 System.out.println(re.next());
		 }
		 
		 System.out.println("But Java is hard ..............");
		 
		while(re.hasPrevious())
		{
			System.out.println(re.previous());
		}
		
		    System.out.println("End of java code");
	}
}

/*
 *     for(int i=7;i>=0;i--)
		    {
		    	for(Object name:hs)
		    	{
		    	System.out.println(name);
		    	}
		    }
		    =============
		    	
		for(Object name:ref)
		{
			System.out.println(name);
		}
		
*/
