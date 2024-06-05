package Array_Practice_Program;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class Print_Unique_Number_From_Two_array 
{
	@Test
	public void test()
	{
		int[]a= {10,20,30,40,50,60};
		int[]a1= {20,25,30,40,50,65,70};
		int[]a2=new int[a.length+a1.length];
		int k=0;
		for(int i=0; i<a2.length; i++)
		{
			if(i<a.length)
			{
				a2[i]=a[i];
			}
			else
			{
				a2[i]=a1[k];
				k++;
			}
		}
		for(int i=0; i<a2.length; i++)
		{
			int count=0;
			for(int j=0; j<a2.length; j++)
			{
				if(a2[i]==a2[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.print(a2[i]+" ");
			}
		}
	}
}