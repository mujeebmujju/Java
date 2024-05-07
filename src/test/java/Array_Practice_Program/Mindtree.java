package Array_Practice_Program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;

//Program to Print index of numbers which sum equals to target.

public class Mindtree 
{
	@Test
	public void test()
	{
		int[]a= {1,2,3,4,5,6};
		int target=6;
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			System.out.print(i+" ");
			if(sum==target)
			{
				break;
			}
		}
	}

	//Sum Of Infinite Array

	@Test
	public void test2()
	{
		int[]a= {1,2,3,4,5};
		int m=10;
		int n=a.length;
		int sum=0;

		for(int i=0; i<m; i++)
		{
			sum=sum+a[i%n];
		}
		System.out.println(sum);
	}
	
	//approach 2
	@Test
	public void test22()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		System.out.println("Enter an array");
		int sum=0;
		int []a=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

	//Fibonacci series

	@Test
	public void test3()
	{

		int n1=0, n2=1, sum=0;
		System.out.println("the fibonacci series are");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<=10; i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}

	}

	//Integer palindrome

	@Test
	public  void Palindrome() 
	{
		int num=121,sum=0,rem=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" it is a palindrome");
		}
		else
		{
			System.out.println(sum+" it is not a palindrome");
		}
	}

	// String palindrome

	public void palindrome()
	{
		String s="dad";
		String s1="";

		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s))  
		{
			System.out.println("String is palindrome");
		}

		else
		{
			System.out.println("String is not a Palindrome");
		}

	}


	//Program to Find all the non-repeating elements or numbers in an array.
	@Test
	public void RemoveDuplicatesORUNIQUE() 
	{

		int a[]= {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer> ();

		for (int i = 0; i < a.length; i++)
		{
			if(map.containsKey(a[i])) 
			{
				map.put(a[i],map.get(a[i])+1);   

			}
			else
			{
				map.put(a[i],1);
			}

		}

		System.out.println("revome duplicates Number");

		for(Entry<Integer, Integer>m:map.entrySet()) 

			if(m.getValue()==1) 
			{
				System.out.println(m.getKey()+"="+m.getValue());
			}
	}
	
	//Reverse an array till particular position
	
	@Test
	public void test11()
	{
		int a[]= {10,20,30,40,50,60,70};
		int position=5;
		int k=position;
		
		for(int i=0; i<a.length; i++)
		{
			if(i+1<=k)
			{
				System.out.print(a[--position]+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}




