package string_program;

import org.testng.annotations.Test;

public class Remove_Integer_And_Print_Character
{
	@Test
	public void test1()
	{
		String s="mu12jee3b";
		String[] s1 = s.split("[a-z A-Z]");
		for(int i=0; i<s1.length; i++)
		{
				System.out.print(s1[i]);
		}

		}

	
	@Test
	public void test2()
	{
		String s="mu12jee3b";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.print(s.charAt(i));
			}

		}
	}

}
