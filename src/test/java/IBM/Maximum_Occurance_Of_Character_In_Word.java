package IBM;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Maximum_Occurance_Of_Character_In_Word 
{
	@Test
	public void test()
	{
		String s="mujeeb";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+" repeating "+count+" times");
			}
		}
	}

}
