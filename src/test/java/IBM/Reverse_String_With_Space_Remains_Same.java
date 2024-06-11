package IBM;

import org.testng.annotations.Test;
public class Reverse_String_With_Space_Remains_Same 
{
	@Test
	public void test()
	{
		String s="i am string";
		String s1=s.replaceAll(" ","");
		int count=s1.length()-1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
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
