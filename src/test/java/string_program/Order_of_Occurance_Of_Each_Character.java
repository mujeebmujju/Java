package string_program;

import org.testng.annotations.Test;

public class Order_of_Occurance_Of_Each_Character 
{ 

	@Test
	public void Unique()
	{
		String s1="I am from india";
		String s = s1.toLowerCase();

		for(int i=0; i<s.length(); i++ )
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

			if(s.charAt(i)=='i')
			{
				System.out.print(s.charAt(i)+"="+count+" "+"");
				break;
			} 


		}
	}    

}

