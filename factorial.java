// Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.Scanner;

class factorial
{

 public static void main(String ab[])
 {
   int a;
   int i;
   int c=0;
   System.out.println("Enter the number");
   Scanner z=new Scanner(System.in);
   a=z.nextInt();
   
   
   
   for (i=1;i<a;i++)
   {
      if(a%i==0)
	  {
	    System.out.println(i);
	  
	  }
	  	  
	 
	  
      
   }
 
 }

}