package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern9_Right_Angle_with_Position 
{
	@Test
	public void pat6()
	{

		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)                   // 1
				{                                     // 1 2
					System.out.print(j+" ");          // 1 2 3
	                                                  // 1 2 3 4
				}                                     // 1 2 3 4 5

			System.out.println();
		}
}
}