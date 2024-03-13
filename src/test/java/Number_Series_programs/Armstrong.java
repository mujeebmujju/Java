package Number_Series_programs;

import org.testng.annotations.Test;

public class Armstrong 
{
	@Test
	public void test()
	{
		int num=153, rem=0, sum=0, temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" it is a armstrong");
		}
		else
		{
			System.out.println(sum+" it is not a armstrong");
		}
	}
}
