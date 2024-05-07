package Array_Practice_Program;

import org.testng.annotations.Test;

public class Reverse_Number 
{
	@Test
	public void test()
	{
		int num=1234,rem=0, sum=0;
		while (num!=0) 
		{
			 rem = num%10;
			 sum=(sum*10)+rem;
			 num=num/10;
		}
		System.out.println(sum);
	
	}

}
