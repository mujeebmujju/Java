package IBM;

public class This_Keyword 
{
	int a=10;
	public void m1()
	{
		int a=50;
		System.out.println("the value of local variable is "+a);
		System.out.println("the value of non static variable is "+this.a);
	}
	public static void main(String[] args) 
	{
		This_Keyword a1 = new This_Keyword(); 
		a1.m1();
	} 
}
