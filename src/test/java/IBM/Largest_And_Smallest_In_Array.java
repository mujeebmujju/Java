package IBM;

import org.testng.annotations.Test;

public class Largest_And_Smallest_In_Array 
{
	@Test
	public void test()
	{
		int a[]= {1,2,3,4,5};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("maximum number is "+max);
		System.out.println("minimum number is "+min);
	}

}
