package string_program;

import org.testng.annotations.Test;

public class Print_First_Character_Into_UpperCase 
{
	@Test
	public void test()
	{
		String s="My Name Is Mujeeb";
		String s1[]=s.split(" ");
		for(int i=0; i<s1.length; i++)
		{
			String str=s1[i];
			String text = str.charAt(0)+"";
			System.out.print(text.toLowerCase()+str.substring(1)+" ");
		}
	}
	
	//approach 2
	@Test
	public void Test()
	{
		String s="my name is mujeeb";
		String []s1=s.split(" ");
		for(int i=0; i<s1.length; i++)
		{
			String str=s1[i];
			char ch[]=str.toCharArray();
			for(int j=0; j<str.length(); j++)
			{
				if(j==0)
				{
					System.out.print((char)(str.charAt(j)-32)+"");
				}
				else
				{
					System.out.print((char)(str.charAt(j)));
				}
			}
			System.out.print(" ");
		}
	}

}
