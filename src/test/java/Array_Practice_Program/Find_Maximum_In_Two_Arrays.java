package Array_Practice_Program;

import org.testng.annotations.Test;

public class Find_Maximum_In_Two_Arrays 
{
	@Test
	public void test()
	{
		int[]a= {1,2,3,4,5,6};
		int[]b= {7,8,9,10};
		int[]c=new int[a.length+b.length];
		int k=0;
		for(int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[k];
				k++;
			}
		}
		int max=c[0];
		for(int i=0; i<c.length; i++)
		{
			if(max<c[i])
			{
				max=c[i];
			}
		}
		System.out.println(max);
		
	}
	

}
