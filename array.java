// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

class array
{
   public static void main(String ab[])
   {
     int a[];
 	 a = new int[10];
	 
	 
	 System.out.println("Enter the 10 numbers");
	 Scanner z=new Scanner(System.in);
	 
	 int i=0;
	 int sum=0;
	 int sum1=0;
	 while(i<10)
	 {
	 
	  a[i]=z.nextInt();
	  
	  i++;
	 }
   
   for (i=0;i<10;i++)
   {
      if(a[i]%2==0)
	  {
         sum=sum+a[i];	  
	  
	  }
	  
      else
	  { 
	     sum1=sum1+a[i]; 
	  }
   }
   
   
     System.out.println("Sum of even integers = " +sum);
	 System.out.println("Sum of odd intrgers = " +sum1);
   
   
   }





}