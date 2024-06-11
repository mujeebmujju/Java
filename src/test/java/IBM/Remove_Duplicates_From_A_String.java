package IBM;

import org.testng.annotations.Test;

public class Remove_Duplicates_From_A_String 
{
	@Test
	public void test()
	{
		String s="My name is Khan";
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			if(s.charAt(i)==' ')
			{
				System.out.print(' ');
			}
			for(int j=0; j<s.length(); j++)
			{
				char ch=Character.toLowerCase(s.charAt(i));
				char ch1=Character.toLowerCase(s.charAt(i));
				
				if(ch==ch1 && s.charAt(i)!=' ')
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	//Approach
	@Test
	public void test1()
	{
		String s="My naMe is Khan";
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			Character ch=s.charAt(i);
			if((s1.indexOf(ch.toUpperCase(ch))==-1 && s1.indexOf(ch.toLowerCase(ch))==-1)|| s.charAt(i)==' ' )
			{
				s1=s1+s.charAt(i);			
			}
		}
		System.out.println(s1);
	}
}