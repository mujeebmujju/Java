package string_program;

import org.testng.annotations.Test;

public class Count_Of_Character
{
	@Test
	public void test()
	{
		String s="my name is mujeeb";
		String[] s1 = s.split(" ");
		int count=0;
		for(int i=0; i<s1.length; i++)
		{
			count++;
		}
		System.out.println(count);
	}
}



