import java.util.*;

class Data
{
	int num1,num2;
	void swap(int a ,int b)
	{
		num1=a;
		num2=b;
	}
	
	void calculation()
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("num 1 = " + num1 + " num 2 = "+ num2);
	}
}

class swap
{
	public static void main(String ab[])
	{
		int a,b;
		Data x=new Data();
		Scanner z=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=z.nextInt();
		b=z.nextInt();
		
		x.swap(a,b);
		x.calculation();
		
	}
}