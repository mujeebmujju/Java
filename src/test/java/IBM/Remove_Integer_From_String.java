package IBM;

import org.testng.annotations.Test;

public class Remove_Integer_From_String 
{
	@Test
	public void test()
	{
		String s="Ab2hishek12";
		String[] s1 = s.split("[0-9]");
		for(int i=0;i<s1.length; i++)
		{
			System.out.print(s1[i]);
		}
	}

}
