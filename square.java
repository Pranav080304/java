
//Take values of length and breadth of a rectangle from user and check if it is square or not.


import java.util.Scanner;

class square
{
  public static void main(String ab[])
  {
      int a,b;
	  
	  System.out.println("Enter the length & breath ");
      Scanner z=new Scanner (System.in);
      a=z.nextInt();
      b=z.nextInt();
	  
     
      if (a==b)
	  {
	    System.out.println(" is SQUARE");
		
	  }
	  
	  else
	  {
	   System.out.println(" Is Recangle");
	  }
  }


}