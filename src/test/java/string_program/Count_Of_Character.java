package string_program;

import org.testng.annotations.Test;

public class Count_Of_Character
{
	@Test
	public void test()
	{
		String s="mujeeb";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			count++;
		}
		System.out.println(count);
	}
}



