package mycaptain;

import java.util.Scanner;

public class Employee {
	String name1,name2,name3;
	String address1,address2,address3;
	int yoj1,yoj2,yoj3;
	Scanner sc=new Scanner(System.in);
	public void getname()
	{
		System.out.println("Enter Employee Name");
		name1=sc.next();
		System.out.println("Enter Employee Name");
		name2=sc.next();
		System.out.println("Enter Employee Name");
		name3=sc.next();
		
	}
	public void getYearOfJoining()
	{
		System.out.println("Enter Year of Joining.");
		yoj1=sc.nextInt();
		System.out.println("Enter Year of Joining.");
		yoj2=sc.nextInt();
		System.out.println("Enter Year of Joining.");
		yoj3=sc.nextInt();
		
		
	}
	public void getAddress()
	{
		System.out.println("Enter Address");
		address1=sc.next();
		System.out.println("Enter Address");
		address2=sc.next();
		System.out.println("Enter Address");
		address3=sc.next();
		
	}
	public void Print1()
	{
		System.out.println("Name is:"+name1);
		System.out.println("Year Of Joining is:"+yoj1);
		System.out.println("Address is:"+address1);
	}
	public void Print2()
	{
		System.out.println("Name is:"+name2);
		System.out.println("Year Of Joining is:"+yoj2);
		System.out.println("Address is:"+address2);
	}
	public void Print3()
	{
		System.out.println("Name is:"+name3);
		System.out.println("Year Of Joining is:"+yoj3);
		System.out.println("Address is:"+address3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.getname();
		e.getYearOfJoining();
		e.getAddress();
		e.Print1();
		e.Print2();
		e.Print3();

	}

}
