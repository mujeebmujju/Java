package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern2_Reverse_Right_Angle_Triangle
{
	@Test
	public void Single_Loop()
	{
		int n=4;
		for(int i=1,j=1; i<=n;)
		{	
			if(i+j<=n+1)
			{
				System.out.print("* ");       // * * * * *
				j++;                          // * * * * 
			}                                 // * * *
			else                              // * *
			{                                 // *
				i++;
				j=1;
				System.out.println();
			}
			                                  
			             
		}
	}

	//Approach 2
	@Test
	public void Two_Loop()
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)                   
			{   
				if(i+j<=n+1)
				{							       // * * * * *
					System.out.print("* ");        // * * * *
				}								   // * * *
				                                   // * *									   
			}                                      // *
			System.out.println();
		}
	}
}


