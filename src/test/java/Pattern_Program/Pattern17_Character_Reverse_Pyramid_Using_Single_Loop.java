package Pattern_Program;
import org.testng.annotations.Test;

public class Pattern17_Character_Reverse_Pyramid_Using_Single_Loop 
{
	@Test
	public void test()
	{
		int n=4;char ch='A';
		for(int i=1,j=1;i<=n;)
		{
			if(j>=i && i+j<=2*n)
			{
				if(j<n)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(ch--+" ");
				}
			}
			else
			{
				System.out.print("  ");
			}
			if(j==2*n)
			{
				i++;
				j=1;
				ch='A';
				System.out.println();
			}
			else
			{
				j++;
			}
		}
	}
}

