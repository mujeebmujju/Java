package Pattern_Program;

public class Pattern20_Star_Pattern_With_Space 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n; i++)
		{
			int num=n+1;
			for(int j=1; j<=2*n-1; j++)
			{
				if(i+j>=n+1 && j-i<=n-1 && i+j==num)
				{
					System.out.print("* ");
					num=num+2;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


