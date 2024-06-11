package IBM;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Student_Driver 
{
	@Test
	public void setStudentDetails()
	{
		Student driver=new Student("mujeeb",10);
		System.out.println("old name :"+ driver.getName());
		System.out.println(driver.getid());
		
		//Now i am going to set Name but id remains same
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the new name");
		String name=sc.next(); 
		driver.setName(name);
		System.out.println("New Name :"+ driver.getName());
	}

}
