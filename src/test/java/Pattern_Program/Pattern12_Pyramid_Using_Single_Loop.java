package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern12_Pyramid_Using_Single_Loop 
{
	@Test
	public void test1()
	{
		int n=3;
		char ch='A';
		for(int i=1, j=1;i<=n;)
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
