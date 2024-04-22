// check given lengths of triangle are of right angle triangle or not.

import java.util.*;

class Data
{
	int a,b,c;

	void getdata(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
	}

	void check()
	{
		if(a*a+b*b==c*c)
		{
			System.out.println("Given Sides are of right angle triangle");
		}

		else if(b*b+c*c==a*a)
		{
			System.out.println("Given Sides are of right angle triangle");
		}

		else if(a*a+c*c==b*b)
		{
			System.out.println("Given Sides are of right angle triangle");
		}
		else 
		{
			System.out.println("Given Sides are not of right angle triangle");
		}
	}
}

class RightAngleTriangle
{
	public static void main(String ab[])
	{
		Scanner z=new Scanner(System.in);
		int num1,num2,num3;

		System.out.println("Enter Sides of triangles");
		num1=z.nextInt();
		num2=z.nextInt();
		num3=z.nextInt();

		Data x=new Data();
		x.getdata(num1,num2,num3);
		x.check();

	}
}