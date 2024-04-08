package Array_Practice_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Second_MaximumNoArray_WithoutusingBubblesort 
{
		@Test
		public void Maximum()
		{
			int[]a= {2,5,6,8,9,10,1};   
			int max=a[0];
			int secondmax=a[0] ;
			
			for(int i=0; i<a.length;i++)

			{
				if(max<a[i]) 
				{
					secondmax=max;
					max=a[i];
				}
				else if(a[i]!=max && a[i]>max)
				{
					secondmax=a[i];
				}
			}
		
			System.out.println(secondmax);   
		} 
 @Test
 public void test()
 {
	 int[]a= {40,20,10,30};
	 for(int i=0; i<a.length; i++)
	 {
	     int count=1;
		 for(int j=0; j<a.length; j++)
		 {
			 if(a[i]>a[j])
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 System.out.println(a[i]);
		 }
	 }
 
}
 
 
 @Test
 public void test2()
 {
	 int[]a= {-4,-4,-4,-1};
	 int temp=a[0];
	 String position ="";
	 for(int i=0; i<a.length; i++)
	 {
	     int count=1;
		 for(int j=0; j<a.length; j++)
		 {
			 if(a[i]<a[j])
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			temp= a[i];
			position=position+" is repaeting at "+i;
		
		 }
		 
	 }
	 System.out.println(temp+ position);
}
}


