package Array_Practice_Program;

public class Merge_Two_Arrays_Print_In_Single_Array 
{
	public static void main(String[] args) 
	{
		int[]a= {1,3,5,7};
		int[]a1= {2,4,6,8};
		int[]a2=new int[a.length+a1.length];
		int k=0;
		
		for(int i=0; i<a2.length; i++)
		{
			if(i<a.length)
			{
				a2[i]=a[i];
			}
			else
			{
				a2[i]=a1[k];
				k++;
			}
		}
		
		for(int i=0; i<a2.length; i++)
		{
			System.out.println(a2[i]);
		}
		
	}

}
