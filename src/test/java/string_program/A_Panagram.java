package string_program;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;
public class A_Panagram 
{
	@Test
	public void test()
	{
		String str=" The Quick Brown fox Jumps Over THe Lazy Dog";
		str=str.replaceAll(" ", "").toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<='z';ch++) 
		{
			if(!str.contains(String.valueOf(ch))) 
			{
				flag=false;
				break;
			}
		}
		if(flag==true) 
		{
			System.out.println("the given string is pangram");
		}
		else 
		{
			System.out.println(" The given string is not pangram");
		}
	}
	
	//approach 2
	@Test
	public void test11()
	{

		String s=" The Quick Brown fox Jumps Over THe Lazy Dog";
	    s = s.replaceAll(" ", "").toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
			
		} 
		if(set.size()==26)
		{
			System.out.println("it is pangram");
		}
		else
		{
			System.out.println("it is not a pangram");
		}
	}
	

}
