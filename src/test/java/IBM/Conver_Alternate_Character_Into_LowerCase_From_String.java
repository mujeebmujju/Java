package IBM;

import org.testng.annotations.Test;

public class Conver_Alternate_Character_Into_LowerCase_From_String 
{
	@Test
	public void test()
	{
		String s="I am from Qspider";
		s=s.toLowerCase();
		String []s1=s.split(" ");
		for(int i=0; i<s1.length; i++)
		{
			String st = s1[i];
			
			for(int j=0; j<st.length(); j++)
			{
				if(j%2==0 && i!=0)
				{
					char ch = Character.toUpperCase(st.charAt(j));
					System.out.print(ch);
				}
				else
				{
					System.out.print(st.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}
}
