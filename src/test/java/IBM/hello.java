package IBM;

import org.testng.annotations.Test;

public class hello 
{
	@Test
	public void test()
	{
		String s="hello";
		int count=1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count==0)
				{
					System.out.print(s.charAt(i));
				}
				count=1;
			}
		}
		if(count==1)
		{
			System.out.print(s.charAt(s.length()-1));
		}
	}

}
