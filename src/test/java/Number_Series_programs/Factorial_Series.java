package Number_Series_programs;

import org.testng.annotations.Test;

public class Factorial_Series 
{
	@Test

	public void Factorial() 
	{
		int num=5, fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

 
	//approach 2
	@Test
	public void test()
	{
		int i=1, fact=1;
		while(i<=5)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);


	}
}



