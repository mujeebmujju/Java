package Array_Practice_Program;

import org.testng.annotations.Test;

public class Print_Last_Repeated_No_With_position
{
    @Test
    public void test()
    {
		int[]a= {4,6,7,8,10,8};
		int pos=0;
		int value=0;
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				pos=i+1;
				value=a[i];
			}
		}
		System.out.print(value+" present at "+pos);
		
	}

}
