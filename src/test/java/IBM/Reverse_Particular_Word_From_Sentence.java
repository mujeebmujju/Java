package IBM;

import org.testng.annotations.Test;

public class Reverse_Particular_Word_From_Sentence 
{
	@Test
	public void test()
	{
		String s="i am from bangalore";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i].equals("am"))
			{
				for(int j=s1[i].length()-1; j>=0; j--)
				{
					System.out.print(s1[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{   
				System.out.print(s1[i]+" ");
			}
		}
	}
}
