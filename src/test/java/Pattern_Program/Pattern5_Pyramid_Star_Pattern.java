package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern5_Pyramid_Star_Pattern
{
	@Test
	public void Single_loop()
	{
		 int n=4;
		   for(int i=1,j=1;i<=n;)
			{
				if(i+j>=n+1 && (j-i)<=n-1)					// *
				{										   // * *
					System.out.print("* ");               // * * *
				}									   	 // * * * *
				else									// * * * * *
				{
					System.out.print("  ");
				}
				
				if(j==2*n-1)
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
	
	@Test
	public void Two_Loop()
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
			if(i+j>=n+1 && (j-i)<=n-1)
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
		                        