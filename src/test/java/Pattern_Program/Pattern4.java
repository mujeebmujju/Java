package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern4
{
	@Test
	public void pat4()
	{
	
	for(int i=1; i<=5; i++)  
	{                                             
		for(int j=1; j<=i; j++)                   
		{                                        
			System.out.print(" ");              
		}                                      // * * * * *
		for(int j=i; j<=5; j++)               //   * * * *
		{                                     //    * * *
			System.out.print("* ");           //     * *
		}                                     //      *
		System.out.println();
	}
	}
}
                         