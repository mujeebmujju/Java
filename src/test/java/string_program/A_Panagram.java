package string_program;

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

}
