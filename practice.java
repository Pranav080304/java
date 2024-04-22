import java.util.Scanner;

class data
{ 

	void circlearea(double r)
	{
	  System.out.println("Rea of circle is "+3.14*r*r);
	}

	void rectarea(double l, double b)
	{
		System.out.println("Area of rectangle is "+l*b);
	}


}

class practice
{
	public static void main(String ab[])
	{
		Scanner z=new Scanner(System.in);
		
		int ch;
		double len,bre,ra;
		System.out.println("Enter the choice");
		System.out.println("1. Area of circle");
		System.out.println("2. Area of rectangle");
        ch=z.nextInt();
		switch(ch)
		{
			case 1 : System.out.println("Enter the radius of circle");
					  ra=z.nextDouble();
					 data x=new data();
					 x.circlearea(ra);
					 break;

			case 2 : System.out.println("Enter the length and breath of rectangle");
					 len=z.nextDouble();
					 bre=z.nextDouble();
					data y=new data();
					y.rectarea(len,bre);
					break;

			default: System.out.println("Wrong choice");
		}                                                
	} 
}