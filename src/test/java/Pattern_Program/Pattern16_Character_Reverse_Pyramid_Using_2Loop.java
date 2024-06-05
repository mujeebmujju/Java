package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern16_Character_Reverse_Pyramid_Using_2Loop 
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

				if(j>=i && i+j<=2*n)
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


