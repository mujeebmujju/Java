package IBM;

import org.testng.annotations.Test;

public class Special_Charcter_Remain_Same_Print_Alphabet_In_Reverse 
{
	@Test
	public void test()
	{
		String s="&quot;This is m@y cou2ntr!y !&quot;;";
		String s1=s.replaceAll("[^a-zA-Z]","");
		int count = s1.length()-1;
		for(int i=0; i<s.length(); i++)
		{ 
			if(s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	
	}

}
