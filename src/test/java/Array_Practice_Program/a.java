package Array_Practice_Program;

import org.testng.annotations.Test;

public class a 
{
	@Test
	public void test()
	{
		String s = "i am from testi bangalore yantra";
		String[] s1 = s.split(" ");
		String maxLength=s1[0];
		for(int i=0; i<s1.length; i++)

		{
			if(maxLength.length()<s1[i].length()) 
			{
				maxLength=s1[i];
			}
		}

		for(int i=0; i<s1.length; i++)
		{
			if(maxLength.length()==s1[i].length()) 
			{
				System.out.println(s1[i]+" ");

			}
		} 
	}
}