package string_program;

import org.testng.annotations.Test;

public class Print_From_2nd_Alternate_Character 
{
	@Test
	public void test()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)
		{
			if(i%2==1)
			{
				System.out.print(s.charAt(i)+" ");
			}

		}

	}

	//approach
	@Test
	public void test1()
	{
		String s="mujeeb";
		for(int i=1; i<s.length(); i=i+2)
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}
