package string_program;

import org.testng.annotations.Test;

public class Print_Vowels_With_Duplicate 
{
	@Test
	public void VowelsDuplicate()
	{
		String st="india";
		char[] ch = st.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
			{
			
				
				System.out.println(ch[i]);
				
			}
		}
	}

}
