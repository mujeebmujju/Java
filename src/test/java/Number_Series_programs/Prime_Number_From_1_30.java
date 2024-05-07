package Number_Series_programs;

import org.testng.annotations.Test;

public class Prime_Number_From_1_30 
{
	@Test
	public void Prime()
	{
		
		for(int i=1; i<=30; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
	}

}
