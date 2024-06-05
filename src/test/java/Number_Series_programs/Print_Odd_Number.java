package Number_Series_programs;

import org.testng.annotations.Test;

public class Print_Odd_Number 
{
	@Test
	public void test()
	{
		int count=0;
		for(int i=0; count<100; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
		}
	}

}
