package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern5 
{
	@Test
	public void pat5()
	{
		
		for(int i=1; i<=5; i++)                      // 1
		{                                            // 2 2
			for(int j=1; j<=i; j++)                  // 3 3 3
			{                                        // 4 4 4 4
				System.out.print(i+" ");             // 5 5 5 5 5
			}
			System.out.println();
		}
	}

}
