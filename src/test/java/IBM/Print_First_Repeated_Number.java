package IBM;

import org.testng.annotations.Test;

public class Print_First_Repeated_Number 
{
	@Test
	public void test()
	{
		int[]a= {8,1,4,8,6,9,6,2};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
			break;
		}
	}

}
