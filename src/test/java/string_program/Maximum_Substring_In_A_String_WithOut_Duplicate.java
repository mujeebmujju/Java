package string_program;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Maximum_Substring_In_A_String_WithOut_Duplicate 
{
	@Test
	public void maxSubString()
	{
		String s="geeksforgeek";
		String out="";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=s.length(); j>=i+1; j--)
			{
				String str=s.substring(i,j);
				HashSet set=new HashSet();
				for(int k=0; k<str.length(); k++)
				{
					set.add(str.charAt(k));
				}
				if(str.length()==set.size())
				{
					if(str.length()>out.length())
					{
						out=str;
					}

				}
			}
		}
		System.out.println(out);
	}

}
