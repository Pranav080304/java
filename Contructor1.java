import java.util.Scanner;


class area
{  double height,breath,result,radius,result1;

     area(double height,double breath)
	 {
		 result=0.5*height*breath;	 
	 }
	 area(double radius)
	 {
		 result1=3.14*radius*radius;	 
	 }
	
     void display1()
	 {
		 System.out.println("Area of trisngle is "+result);	 
	 }
	 void display2()
	 {
		 System.out.println("Area of circle is "+result1);
	 }
	
}

class  Contructor1
{
	public static void main(String ab[])
	{   
	
		
	    double h,b,r;
		int ch;
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1. Area of circle");
		System.out.println("2. Area of triangle");
		
		ch=z.nextInt();
		
		switch(ch)
		{
			
			case 1 : System.out.println("Enter the radius of circle");
			         r=z.nextDouble();
					 area x=new area(r);
				     x.display2();
					 break;
			
			
			case 2 : System.out.println("Enter the height & breath");
			         h=z.nextDouble();
					 b=z.nextDouble();
					 area y=new area(h,b);
					 y.display1();
					 break;
					 
            default: System.out.println("Wrong input");				 
		}
	
		
		
	}
	
	
	
}