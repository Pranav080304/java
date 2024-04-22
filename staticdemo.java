import java.util.Scanner;
class astatic
{
  static int a;
  static int b;
  static int c=0;
  static int g;
  
  
  static void function(int d,int e)
  { a=d;
    b=e;
    System.out.println("satatic a=" +a);
	System.out.println("staatic b=" +b);
    System.out.println("static g=" +g);
	c++;
  }
  static
  {
	  g=a*b;
  }
}

class staticdemo
{
	public  void main(String ab[])
	{   int d,e;
		Scanner z= new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		d=z.nextInt();
		e=z.nextInt();
		
		astatic.function(d,e);
		System.out.println(astatic.c);
	}
}