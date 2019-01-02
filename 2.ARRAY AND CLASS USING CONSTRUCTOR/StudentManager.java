import java.util.Scanner;

/*Program to enter information of a student using class Student and display the information */ 
//	by Aniruddha
class Student
{
	String Name,Dept;
	int roll;
	
	Student(String n,int r,String d)
	{
		Name=n;
		roll=r;
		Dept=d;
	}
	
	void display()
	{
		System.out.println("Name: "+Name+"\nRoll:  "+roll+"\nDept:  "+Dept);
	}
}	
class StudentManager
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input name: ");
		String n = in.nextLine();
		System.out.println("Input roll: ");
		int r = in.nextInt();
		System.out.println("Input dept: ");
		String d = in.next();
		
		Student ob = new Student(n,r,d);
		ob.display();
		
	}
	
}	
	
/*
Input name: 
Aniruddha
Input roll: 
4
Input dept: 
cse
Name: Aniruddha
Roll:  4
Dept:  cse

*/	
