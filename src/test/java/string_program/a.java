package string_program;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class a 
{
	@Test
	public void test()
	{
		int num=121, rem=0, sum=0, temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" it is a palindome");
		}
		else
		{
			System.out.println(sum+" it is not a palindrome");
		}
	}
}
