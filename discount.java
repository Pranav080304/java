/* A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
   Ask user for quantity
   Suppose, one unit will cost 100.
   Judge and print total cost for user.
*/

import java.util.Scanner;

class discount
{

  public static void main(String ab[])
  {
    int a;
	double b;
	System.out.println("Enter the Quentity of purchesed");
	Scanner z=new Scanner (System.in);
	a=z.nextInt ();
	a=a*100;
	if (a>1000)
	{
		b=a* 0.1;
	  System.out.println("The total value of purches is "+(a-b));
	  
	}
    
    else
	{
	  System.out.println("the toal price of purched is "+a);
	}
  }


}