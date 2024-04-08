package string_program;

import org.testng.annotations.Test;

public class Reverse_the_Last_Half_String 
{
	@Test
	public void test()
	{
		String s="mujeeb";
		String rev1="";
		String rev2="";
		for(int i=s.length()/2; i<s.length(); i++)
		{
			rev1=s.charAt(i)+rev1;
		}
		for(int i=0; i<s.length()/2; i++)
		{
			rev2=rev2+s.charAt(i);
		}
		System.out.println(rev2+rev1);
	}

	@Test
	public void test1()
	{
		String s="mujeeb";
		String rev1="";
		String rev2="";
		for(int i=0; i<s.length()/2; i++)
		{
			rev1=s.charAt(i)+rev1;
		}
		for(int i=s.length()/2; i<s.length(); i++)
		{
			rev2=rev2+s.charAt(i);
		}
		System.out.println(rev1+rev2); 
	}

	@Test
	public void test11()
	{
		String s="mujeeb";
		String rev1="";
		int k=s.length()-1;
		for (int i = 0; i < s.length(); i++)
		{
			if(i<s.length()/2) 
			{
				rev1=rev1+s.charAt(i);
			}
			else 
			{
				rev1=rev1+s.charAt(k--);
				
			}
		}
		System.out.println(rev1);
	}

}

