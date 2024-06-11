package IBM;

import org.testng.annotations.Test;

public class Print_Number_Which_Is_Divisible_5_From_1_To_100 
{
	@Test
	public void test()
	{
		for(int i=0; i<=100; i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
