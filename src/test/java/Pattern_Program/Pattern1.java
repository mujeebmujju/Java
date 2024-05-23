package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern1 
{
	@Test
	public void Pat1()
	{
		for(int i=0; i<=5; i++)                   // *
		{                                        //  * *
			for(int j=0; j<=i; j++)             //   * * *
			{                                  //    * * * *
				System.out.print("* ");       //     * * * * *
			}                                //      * * * * * *
			System.out.println();
		}
	} 

   //approach 2
	@Test
	public void Right()
	{
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

