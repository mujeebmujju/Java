 package Recursion;

import org.testng.annotations.Test;

public class Print_1_To_10_WithOut_using_For_Loop 
{
	public static void main(String[] args) 
	{
		printnumbers(1, 10);
	}
	public static void printnumbers(int n, int end) 
	{
		if(n<=end)
		{
			System.out.println(n+" ");
			printnumbers(n+1, end);
		}
	}
	

}
