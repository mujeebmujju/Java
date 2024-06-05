package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern4_Reverse_Left_Angle_Star_pattern 
{
	@Test
	public void Single_LooP()
	{
		int n=4;
		for(int i=1,j=1; i<=n;)                   
		{                                        
			if(i<=j)                                 // * * * * *
			{                              		    //    * * * * 
			  System.out.print("* ");     	       //	    * * *              
			}									   //         * *
			else                                   //           *
			{                                  
				System.out.print("  ");
			}
			if(j==n)
			{
				i++;
				j=1;
				System.out.println();
			}
			else
			{
				j++;
			}
		}
	}

   //approach 2
	@Test
	public void Two_LoopRight()
	{
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");  
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

