package IBM;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Longest_String 
{
	@Test
	public void test()
	{
		String s="how are you";
		String[] s1 = s.split(" ");
		int max=s1[0].length();
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i].length()>max)
			{
				max=s1[i].length();
			}
		}
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i].length()==max)
			{
				a.add(s1[i]);
			}

		}
		System.out.println(a);

	}

}
