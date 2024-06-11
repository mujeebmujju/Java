package IBM;

import org.testng.annotations.Test;

public class Reverse_String
{
	@Test
	public void test()
	{
		String s="I AM IN BANGALORE";
		String[] st = s.split(" ");
		for(int i=0; i<st.length; i++)
		{
			String str = st[i];
			for(int j=str.length()-1; j>=0; j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	

}
