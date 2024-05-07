package string_program;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Enter_common_length 
{
		@Test
		public void test()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the length");
			int n=sc.nextInt();
			char c='a';
			int r=new Random().nextInt(25);
			String s=r+"";
			for(int i=0; ; i++)
			{
				if(s.length()==n)
				{
					break;
				}
				else
				{
					s=s+c;
				}
			}
			System.out.println(s);
			
			
		}
	}
			
