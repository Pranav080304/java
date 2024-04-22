/* Two numbers are entered through the keyboard. Write a program to find the value of one 
   number raised to the power of another. (Do not use Java built-in method)
*/  

import java.util.Scanner;

class power
{

public static void main(String ab[])
{

int a,b;
System.out.println("ener the two numbers");

Scanner z=new Scanner(System.in);
a=z.nextInt();
b=z.nextInt();

int i=1;
int result=1;
while (i<=b)
{

  result=result*a;

i++;
}

System.out.println(result);

}


}