package IBM;

import org.testng.annotations.Test;

public class Occurance_Of_Element_In_An_Array 
{
	@Test
	public void test()
	{
		int a[]= {2,4,6,2,8};
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>1)
			{
				System.out.println(a[i]+" repeating "+count+" times");
			}
		}

	}

}
