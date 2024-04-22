/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
   Ask user for their salary and year of service and print the net bonus amount.
*/

import java.util.Scanner;

class bonus
{
  public static void main(String ab[])
  {
    double salary;
	int year;
	
	System.out.println("Enter your salary & year of service");
	Scanner z=new Scanner (System.in);
	salary=z.nextDouble();
	year=z.nextInt();
	
	if (year >= 5)
	{
	 System.out.println("Your total salary is "+(salary+salary*0.5));
	
	}
    else
	{
	System.out.println("Your total salary is "+salary);
	}
  
  
  }

}