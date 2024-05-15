package string_program;

import org.testng.annotations.Test;

public class Sum_Of_Digits_In_String 
{
	//approach1
	@Test
	public void SumOfDigitsInString()
	{
		String s="a2b24c6";
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' &&  s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48; //Asci value of 2 is 50...
				
				sum=sum+n;
			}
		}

		System.out.println(sum);
	}


	//approach 2
	@Test
	public void SumOfDigitsInString1()
	{
		String s="a2$7%65b4c6";  
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' &&  s.charAt(i)<='9')
			{
				String st=""+s.charAt(i);
				int digit = Integer.parseInt(st);  
				sum=sum+digit;
			}
		}

		System.out.println(sum);
	}
}