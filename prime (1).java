/*  Write a program that prompts the user to input a positive integer.
    It should then output a message indicating whether the number is a prime number.
*/

	
	import java.util.Scanner;
	
	class prime
	{
	    public static void main(String ab[])
		{
		 
		  int a;
		  int i;
		  int c=0;
		  System.out.println("Enter the number");
		  Scanner z=new Scanner(System.in);
		  a=z.nextInt();
		  
		  if (a==0)
		  {
		    System.out.println("Sorry Given number is zero(0)");
		  }
		  else if(a==1)
		  {
		    System.out.println("Sorry given number is one (1)");
		  }
		   else
		   {
		   
		     for(i=2;i<a;i++)
			 {
			    if(a%i==0)
				{
				c=c+1;
				}
			 
			 
			 }
		   
		   
		   }
		 
		
		if(c>0)
		{
		 System.out.println("Number is not prime");
		}
         
        else
         {
           System.out.println("Number is prime");
          }		 
		}
	
	
	
	}