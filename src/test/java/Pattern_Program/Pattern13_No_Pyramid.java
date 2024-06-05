 package Pattern_Program;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Pattern13_No_Pyramid 
{
	@Test
	public void pat10()
	{
		
		for(int i=1; i<=3; i++)
		{                                                 //1
			for(int j=1; j<=3-i; j++)                   //1 2 1
			{                                          //1 2 3 2 1
				System.out.print("  ");	
			}
		
		for(int j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		
		for(int j=i-1; j>=1; j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
	}

}                                   

								
                                 

