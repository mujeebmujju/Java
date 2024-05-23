package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern11_Pyramid_Using_2Loop 
{
	@Test
	public void test()
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=2*n-1;j++)
			{

				if(i+j>=n+1 && (j-i)<=n-1)
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


			}
			System.out.println();
		}
	}
}