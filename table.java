// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

import java.util.Scanner;

class table
{

 public static void main (String ab[])
 {
    int a;
	
   System.out.println("Enter the number");
   Scanner z=new Scanner(System.in);
   a=z.nextInt();
   
   int i=0;
   for (i=1;i<=10;i++)
   {
      System.out.println(a*i);
  
   }
   
 
 
 
 
 }



}