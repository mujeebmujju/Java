package IBM;

import java.util.Arrays;

import org.testng.annotations.Test;

public class nTh_Largest 
{
	@Test
	public void test()
	{
		int a[]= {1,2,3,4,5};
		Arrays.sort(a);
		int largest=a.length;
		int n=2;
		System.out.println(a[largest-n]);
	}

}
