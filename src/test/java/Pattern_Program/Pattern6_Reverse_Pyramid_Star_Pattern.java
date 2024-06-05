package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern6_Reverse_Pyramid_Star_Pattern
{
	@Test
	public void pat4()
	{
		 int n=4;
		   for(int i=1,j=1;i<=n;)
			{
				if(j>=i && i+j<=2*n)
				{
					System.out.print("* ");           // * * * * *
				}                                    //   * * * *
				else								 //    * * *
				{									 //     * *
					System.out.print("  ");			 //      *
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
			if(j>=i && i+j<=2*n)
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

		
                         