
import java.util.Scanner;

class area
{
  double radius,result,length,breath;
  //area(){};
  area(double r)
  {
   result=3.14*radius*radius;
  }
  
   area(double l,double b)
 {
   result=length*breath;
 }
   void display()
  {
    System.out.println("area is "+result);
  }

}





class main
{
 public static void main(String ab[])
 {
   
   double l,b,r;
   int ch;
    String a=null, N=null,Y=null;
   
   System.out.println("Enter the choice");
   System.out.println("1. area of circle");
   System.out.println("2. area of rectangle");
   Scanner z=new Scanner(System.in);
   ch=z.nextInt();
   
 do{
 
  switch(ch)
  {
  
  case 1 : System.out.println("Enter the radius of circle");
           r=z.nextDouble();
           area x=new area(r);
           x.display();
		   break;

  case 2 : System.out.println("Enter the length and breath of rectangle");
           l=z.nextDouble();
		   b=z.nextDouble();
		   area y=new area(l,b);
		   y.display();
		   break;
		   
  default: System.out.println("Wrong input");			   
  
 
  System.out.println("Do you want ot continue Yes/No");
  Scanner p= new Scanner(System.in);
  a=p.nextLine();
 }
 }
 while(a==Y);	
 
 
 
 }
}