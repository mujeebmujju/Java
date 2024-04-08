package string_program;

import org.testng.annotations.Test;

public class a1b2c1 
{
	@Test
	public void test()
	{
		String s="a2b2c2";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				int num = Character.getNumericValue(s.charAt(i+1));

				for(int j=0; j<num; j++)
				{
					System.out.print(s.charAt(i));
				}
			}
		}

	}

	//approach 2

	@Test
	public static void test1() 
	{
		String s = "a2b2c2";
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
			{
				int num = 0;
				char ch = s.charAt(i+1);


				if (ch >= '0' && ch <= '9') 
				{
					num = ch-'0';

					for (int j = 0; j < num; j++) 
					{
						System.out.print(s.charAt(i));
					}
				}
			}
		}
	}
}




