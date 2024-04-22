import java.util.Scanner;
class Abc
{
  int a,b;
}

class Ab extends Abc
{   int c;
	int sum;
	void getdata(int d, int f)
	{
		a=d;
		c=f;
	    sum=a+b+c;
	}
	void display()
	{
		System.out.println("class Ab"+sum);
	}
}
class Pqr extends Abc
{   
    
	void getdata(int e)
	{
		b=e;
	}
	void display()
	{
		System.out.println("class Pqr =" +(b));
	}
}
class Xyz
{
	public static void main(String ab[])
	{   int y,zy,yz;
	    Scanner z=new Scanner(System.in);
		System.out.println("Enter a three number");
		y=z.nextInt();
		zy=z.nextInt();
		yz=z.nextInt();
		Pqr x=new Pqr();
		Ab pp=new Ab();
		pp.getdata(zy,yz);
		x.getdata(y);
		x.display();
		pp.display();
	}
}