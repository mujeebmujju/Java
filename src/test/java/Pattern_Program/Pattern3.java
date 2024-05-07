package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern3
{
	@Test
	public void pat3()
	{
	
	for(int i=1; i<=5; i++)  
	{                                              // *
		for(int j=i; j<=5; j++)                   // * *
		{                                        // * * *
			System.out.print(" ");              // * * * *
		}                                      // * * * * *
		for(int j=1; j<=i; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
                         