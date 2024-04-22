
import java.util.Scanner;

class prime
{
	
	  
public static void main (String a[])
{
   int b;
   int i=2;
   int c=0;
   
   System.out.println("Enter the number");
   Scanner z=new Scanner (System.in);
   b=z.nextInt();
   
if(b==0)
{ System.out.println("The given number is 0");
}

else
{
	
	if (b==1)
	{
		System.out.println("the Given number is 1");
	}
	
	else
	{
   for (i=2;i<b;i++)
   {
	 	   
     if (b%i==0)
	 {
	   c=c+1;
	 }
	 
   
   }
     
	 if(c>0)
	 {
	 System.out.println("the given number is not prime"); 
	 }
	 else{
	 System.out.println("the given number is prime");
	 }
	}
}


}
  
}