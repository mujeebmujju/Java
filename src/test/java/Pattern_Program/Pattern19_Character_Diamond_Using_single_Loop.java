package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern19_Character_Diamond_Using_single_Loop 
{
	@Test
	public void test()
	{
		int n=4;char ch='A';
		for(int i=1,j=1;i<=2*n-1;)
		{

			if(i+j>=n+1 && (j-i)<=n-1 && (i-j)<=n-1 && (i+j)<=3*n-1)
			{
				if(j<n)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(ch--+" ");
				}
			}
			else
			{
				System.out.print("  ");
			}
			if(j==2*n)
			{
				
				i++;
				j=1;
				ch='A';
				System.out.println();
			}
			else
			{
				j++;
			}
			
		}
	}
}


