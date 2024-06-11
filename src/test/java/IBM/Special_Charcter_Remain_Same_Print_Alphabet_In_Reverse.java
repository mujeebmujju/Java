package IBM;

import org.testng.annotations.Test;

public class Special_Charcter_Remain_Same_Print_Alphabet_In_Reverse 
{
	@Test
	public void test()
	{
		String s="m@y countr!y !&quot";
		String s1=s.replaceAll("[^a-z]","");
		int count = s1.length()-1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println(" ");
	}

}
