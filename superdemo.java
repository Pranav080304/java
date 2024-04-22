import java.util.Scanner;

class A
{
	int a,b;
	void display()
	{
	System.out.println("Supper b" +b);
	}
	
}

class b extends A
{
	void getdata(int a,int b)
	{
		super.a=a;
		super.b=b;
	}
	
	void display()
	{
		super.display();
		System.out.println("a = " +a);
	}
}

class superdemo
{
   public static void main(String ab[])
   {
	   int a,b;
	   System.out.println("Enter two numbers");
	   Scanner z= new Scanner(System.in);
	   a=z.nextInt();
	   b=z.nextInt();
	   
	   b x=new b();
	   x.getdata(a,b);
	   x.display();
   }
}

