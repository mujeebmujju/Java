package IBM;

import org.testng.annotations.Test;

public class Count_Uppercase_LowerCase 
{
	@Test
	public void test()
	{
		String s="I am a traVeLLer";
		int ucount=0;
		int lcount=0;
		int count=0;
		int tcount=0;
		
		for(int i=0; i<s.length(); i++)
		{
			 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				ucount++;
			}
			 else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lcount++;
			}
		}
		
		System.out.println("upper case "+ucount);
		System.out.println("lower case "+lcount);
		System.out.println("ower case "+tcount);

	}

}
