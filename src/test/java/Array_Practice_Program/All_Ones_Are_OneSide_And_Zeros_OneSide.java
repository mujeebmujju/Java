package Array_Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class All_Ones_Are_OneSide_And_Zeros_OneSide 
{
	@Test
	public void test()
	{
		int []a= {1,0,1,0,0,1,1,0};
		ArrayList<Integer> a1= new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();

		for(int value:a)
		{
			if(value!=0)
			{
				a1.add(value);
			}
			else
			{
				a2.add(value);
			}
		}
		a1.addAll(a2);
		System.out.println(a1);
	}

	//approach2
	@Test
	public void test1()
	{
		int []a= {1,0,1,0,0,1,1,0};
		Arrays.sort(a);
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		for(int i=a.length-1; i>=0; i--)
		{
			a1.add(a[i]);
		}
		System.out.print(a1);

	}
}