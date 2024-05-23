package string_program;

import org.testng.annotations.Test;

public class Print_Repeated_Character_Position 
{
	@Test
	public void test()
	{
		String s="i am samuel";
		int pos=0;
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
				pos=i+1;
				System.out.print(pos+" ");
			}
		}
		System.out.println();
		System.out.print(count);
	}
}


