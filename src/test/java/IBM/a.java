package IBM;

class a
{
	int a1=10;
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1();
	}
}
class B extends a
{
	int a1=10;
	public void m1()
	{
		int a1=50;
		System.out.println(a1);
		System.out.println("the variable in parent class is "+super.a1);
	}
}

 