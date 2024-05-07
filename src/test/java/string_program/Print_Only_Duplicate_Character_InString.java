package string_program;

import org.testng.annotations.Test;

public class Print_Only_Duplicate_Character_InString
{
	@Test
	public void Duplicate()
	{
		String s1="aaabbbcc";
		String s = s1.toLowerCase();

		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i>j)
					{
						break;
					}

					else
					{
						count++;
					}
				}
			}

			if(count>1)
			{
				System.out.println(s.charAt(i)+"="+count);

			}

		}
	}



	@Test
	public void test()
	{
		String s1="Tekion is Tekion very eco very friendly ";
		String[] s = s1.split(" ");

		for(int i=0; i<s.length; i++)
		{
			int count=0;
			for(int j=0; j<s.length; j++)
			{
				if(s[i].equals(s[j]))
				{
					if(i>j)
					{
						break;
					}

					else
					{
						count++;
					}
				}
			}

			if(count>1)
			{
				System.out.println(s[i]+"="+count);

			}

		}
	}

}

