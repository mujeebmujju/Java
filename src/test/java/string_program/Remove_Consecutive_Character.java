package string_program;

import org.testng.annotations.Test;

public class Remove_Consecutive_Character 
{
	@Test
	public void removeCon()
	{
		String s="abccba";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{

			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count==1)
				{
					System.out.print(s.charAt(i));
				}
				count=1; 
			}
		}
		if(count==1)
			System.out.print(s.charAt(s.length()-1));

	}
	
	@Test
	public void test()
	{
		String s="abccba";
		String s1="";
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i+1)-s.charAt(i)==1)
			{
				if(s1.length()==0)
				{
					s1=s1+s.charAt(i)+s.charAt(i+1);
				}
				else
				{
					s1=s1+s.charAt(i+1);
				}
			}
				else
				{
					System.out.println(s1);
					s1="";
				}
			}
		System.out.println(s1);
		}

}
