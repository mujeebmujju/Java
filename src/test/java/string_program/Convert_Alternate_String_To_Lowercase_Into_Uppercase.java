package string_program;

import org.testng.annotations.Test;

public class Convert_Alternate_String_To_Lowercase_Into_Uppercase 
{
	@Test
	public void test()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i%2==0)
			{
				int x = (char)ch-32;
				System.out.print((char)x);
			}											//MuJeEb
			else
			{
				System.out.print(ch);
			}
		}

	}
	@Test
	public void test1()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i%2==1)
			{
				int x = (char)ch-32;
				System.out.print((char)x);
			}
			else
			{
				System.out.print(ch);				//mUjEeB
			}
		}

	}
	
	@Test
	public void test2()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i>=s.length()/2)
			{
				int x = (char)ch-32;
				System.out.print((char)x);
			}
			else
			{
				System.out.print(ch);				//mujEEB
			}
		}

	}
	
	@Test
	public void test3()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i<=s.length()/2-1)
			{
				int x = (char)ch-32;
				System.out.print((char)x);
			}
			else
			{
				System.out.print(ch);				//MUJeeb
			}
		}

	}
	
	
	//Approach 2
	@Test
	public void test4()
	{
		String s="mujeeb";
		for(int i=0; i<s.length(); i++)	
		{
			if(i%2==0)
			{
				char ch = Character.toUpperCase(s.charAt(i));
				System.out.print(ch);

			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
			
 	
}
