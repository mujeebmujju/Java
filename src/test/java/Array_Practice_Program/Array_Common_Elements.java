package Array_Practice_Program;



public class Array_Common_Elements 
{
	public static void main(String[]args)
	{
	    int[] a= {1,3,5,8};
		int[] a1={3,5,1,8};
		boolean b = main(a,a1);
		if(b==true)
		{
		    System.out.println("Common elements");
		}
	}
	public static boolean main(int [] a, int [] a1)
	{
	    boolean flag = false;
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a1.length; j++)
			{
				if(a[i]==a1[j])
				{
					flag = true;
				}
				else {
					flag = false;
				}
			}
		}
		return flag;
	}
}
