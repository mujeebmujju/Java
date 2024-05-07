
package string_program;

import org.testng.annotations.Test;

public class Count_Of_UpperCase_LowerCase_Total  
{
	@Test
	public void test()
	{
		String s="JaNuArY";
		int ucount=0;
		int lcount=0;
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
			}
		}
		for(int i=0; i<s.length(); i++)
		{
			 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				ucount++;
			}
			else
			{
				lcount++;
			}
			
		}
		System.out.println("upper case "+ucount);
		System.out.println("lower case "+lcount);
		System.out.println("Total case "+count);

	
		
	}

}



