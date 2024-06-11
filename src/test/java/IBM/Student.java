package IBM;

import java.util.Scanner;

public class Student 
{
	private String name;
	private int id;

	public Student(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public int getid()
	{
		return id;	
	}
	public String getName()
	{
		return name;

	}

	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id1=sc.nextInt();

		if(id==getid())
		{
			if(name.length()>0 && name.length()<16)
			{
				System.out.println("the id is matched and new name is as below");
				this.name=name;
			}
			else
			{
				System.out.println("name is not match");
			}
		}
		else
		{
			System.out.println("id is not match");
		}
	}
}

