 package string_program;

import org.testng.annotations.Test;

public class Longest_Substring_In_A_String_WithOut_Vowels
{
	@Test
	public void substringwithOutvowel()
	{
		String s ="mujeeb";
		String temp ="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length();j>=(i+1);j--)
			{
				String str = s.substring(i, j);
				if(!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u"))
				{
					if(temp.length()<str.length())
					{
						temp=str;
					}
				}
			}
		}
		System.out.println(temp);

	}
}
