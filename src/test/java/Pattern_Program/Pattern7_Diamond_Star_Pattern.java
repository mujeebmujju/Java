package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern7_Diamond_Star_Pattern 
{
	@Test
	public void Two_loop()
	{
		int n=4;
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{

				if(i+j>=n+1 && (j-i)<=n-1 && (i-j)<=n-1 && (i+j)<=3*n-1)
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
	
	
	@Test
	public void Single_Loop()
	{
		int n=4;
		   for(int i=1,j=1;i<=2*n-1;)
			{
				if(i+j>=n+1 && (j-i)<=n-1 && (i-j)<=n-1 && (i+j)<=3*n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				if(j==2*n)
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
}
	

