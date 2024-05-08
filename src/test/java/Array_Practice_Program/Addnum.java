package Array_Practice_Program;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Addnum 
{
	@Test
	public void test()
	{
		int[]a= {1,3,4,5,6,8,2,9,7,6,5,3,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]+a[j]==10)
				{

					if(i>j)
					{
						break;
					}
					else
					{
						System.out.println(a[i]+","+a[j]);
					}
				}
			}
		}
	}

	@Test
	public void test1()
	{

		int[]a= {2,4,5,6,3,9,7,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}

	@Test  
	public void test3()
	{
		int[]a= {1,3,4,5,6,8,2,9,7,6,5,3,1};
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==10)
				{
					map.put(a[i], a[j]);
				}
			}
		}
		for(Entry<Integer, Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
	}

}





