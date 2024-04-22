// Write a program to print the names of students by creating a Student class. If no name is passed while creating an object
// of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while 
// creating object of Student class.

import java.util.*;
class Student
{   String name;
	void Student()
	{
		name="unknown";
		System.out.println("Name of student - "+name);
	}
	void Student(String n)
	{
		name=n;
		System.out.println("Nmae of student - "+name);
	}
}

class Studentname
{
	public static void main(String ab[])
	{
		Scanner z= new Scanner(System.in);

		String n;
		System.out.println("Enter name of student");
		n=z.nextLine();
		Student x=new Student(n);
		Student y=new Student();



	}
}