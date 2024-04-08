package Array_Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class Array_Minimum_Using_2Integer_Array 
{
	@Test
	public void test()
	{
		int[]a= {1,2,3,4,5};
		int[]a1= {6,7,8,9};
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
		int min=a2[0];  
		for(int i=0; i<a2.length; i++)
		{
			if(min>a2[i])
			{
				min=a2[i];
			}
		}
	System.out.println(min);
	}
}