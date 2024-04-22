/* Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
   For example, if the input is 12345, the output should be 54321
*/

import java.util.Scanner;

class reverse
{

 public static void main(String ab[])
 {
   int num;
   int b=0;
   
   System.out.println("ENter the number");
   Scanner z=new Scanner(System.in);
   num=z.nextInt();
   
   int i=1;
   while(num!=0)
   {
   
     b=num%10;
	 num=num/10;
   
     System.out.print(b);
   
   }
   
 
 
 
 
 }

}   