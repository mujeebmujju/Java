package IBM;

import org.testng.annotations.Test;

public class Space_In_String 
{
	@Test
	public void test()
	{
		String s="sum";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				System.out.print(s.substring(i, j) +" ");
			}
		}
	}

}
