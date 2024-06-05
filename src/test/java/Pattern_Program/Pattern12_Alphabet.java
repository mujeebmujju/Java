package Pattern_Program;

import org.testng.annotations.Test;

public class Pattern12_Alphabet 
{
	@Test
	public void pat9()
	{
		                                                   //A
		char ch='A';                                       //B C
		for(int i=1; i<=5; i++)                            //D E F
		{                                                  //G H I J
			for(int j=1; j<=i; j++)                        //K L M N O
			{
				System.out.print(ch+++" ");
			}
			System.out.println();   
		}
	}
}

