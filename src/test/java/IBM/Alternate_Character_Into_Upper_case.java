package IBM;

import org.testng.annotations.Test;

public class Alternate_Character_Into_Upper_case 
{
	@Test
	public void test()
	{
		String s="damler";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i%2==0)
			{
				int x=(char)ch-32;
				System.out.print((char)x);
			}
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