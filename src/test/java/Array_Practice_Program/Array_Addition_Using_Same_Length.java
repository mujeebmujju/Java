package Array_Practice_Program;

public class Array_Addition_Using_Same_Length 
{
	public static void main(String[] args) 
	{
		int[]a= {2,4,6,8};
		int[]a1={1,3,5,7};
		
		if(a.length==a1.length)
		{
			int[]a2=new int[a.length]; 
			for(int i=0; i<a2.length; i++)
			{
				a2[i]=a[i]+a1[i];
				System.out.println(a2[i]+" ");
			}
		}
		
	}
}
