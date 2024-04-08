package string_program;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Longest_SubString_In_A_String 
{
	@Test
	public void norepeate()
	{
		String s="mujeeb";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length();j>=(i+1);j--)
			{
				String str = s.substring(i, j);
				HashSet set = new HashSet<>();
				for(int k=0;k<str.length();k++)
				{
					set.add(str.charAt(k));
				}
				if(str.length()==set.size())
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
