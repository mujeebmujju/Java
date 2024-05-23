package Array_Practice_Program;

import java.util.ArrayList;

public class Print_Even_Number_Store_In_Another_Array 
{
	public static void main(String[] args) 
	{
		int []a= {1993,1887,168,199,20222};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2==0)
			{
				list.add(a[i]);
			}
		}
		int size=list.size();
		int[]a1=new int[size];
		for(int i=0; i<a1.length; i++)
		{
			a1[i]=list.get(i);
			System.out.println(a1[i]);
		}
		
		
		
	}

}
