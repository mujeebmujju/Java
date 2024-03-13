package Number_Series_programs;

import org.testng.annotations.Test;

public class Special_No 
{
	@Test
	public void test()
	{
		int num=145, rem=0, sum=0, temp=num;
		while(num>0)
		{
			rem=num%10;
			int fact=1;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" it is a special no");
		}
		else
		{
			System.out.println(sum+" it is not a special no");
		}
	}
}
