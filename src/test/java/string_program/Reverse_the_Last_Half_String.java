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
		System.out.print(rev2+rev1);
	}

}
