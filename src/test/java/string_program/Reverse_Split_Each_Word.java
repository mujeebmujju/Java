package string_program;

import org.testng.annotations.Test;

public class Reverse_Split_Each_Word 
{

	@Test
	public void test()
	{
		String s="i am from Bangalore";
		String []st=s.split(" ");
		for(int i=0; i<st.length; i++)
		{
			String temp=st[0];

			for(int j=1; j<st.length; j++)
			{
				st[j-1]=st[j];
				System.out.print(st[j]+" ");
			}
			st[st.length-1]=temp;
			System.out.println(temp+" ");
		}
	}
} 