package string_program;

import org.testng.annotations.Test;

public class Print_Length_Of_Each_Words 
{
	@Test
	public void test()
	{
		String s="my name is mujeeb";
		String s1[]=s.split(" ");
		String temp="";
		for(int i=0; i<s1.length; i++)
		{
			temp=s1[i];
			System.out.println(temp+" length is "+temp.length());
		}
	}

}
