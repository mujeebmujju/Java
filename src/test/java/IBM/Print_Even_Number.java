package IBM;

import org.testng.annotations.Test;

public class Print_Even_Number 
{
	@Test
	public void test()
	{
		int count=0;  
		for(int i=1; count< 50; i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println(i);
			}
		}
	}
}
