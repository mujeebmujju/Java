package string_program;

import org.testng.annotations.Test;

public class Print_Consonant 
{

	@Test
	public void Consonant()
	{
		String st="india";
		char[] ch = st.toCharArray();	
		for(int i=0; i<ch.length; i++)
		{
			if(!(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'))
			{	
				System.out.print(ch[i] );	
			}
		}
	}

	
	@Test
	public void test()
	{
		char ch='z';
		if(ch>='a' && ch<='z')
			System.out.println(ch +" is a character");
		{
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				System.out.println(ch+" is a vowel");
			}
			else
			{
				System.out.println(ch+" is not a vowel");
			}
		}
	}
}

