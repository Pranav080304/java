import java.util.*;

import java.lang.Math;


class Data
{
	int count=0,sum=0,num;
	
	
	void getdata(int a)
	{
		num=a; 
	}
	
	void check_count()
	{  
		int num_count=num;
		while(num_count!=0)
		{
			num_count=num_count/10;
			count++;
		}		
	}
	
	void armstrong_check()
	{
		int a,num1=num;
		for(int i=0;i<count;i++)
		{
			a=num1%10;
			a=(int)Math.pow(a,count);
			sum=sum+a;
			num1=num1/10;
		}
	}
	
	void display()
	{
		
		if(sum==num)
		{
				System.out.println("Given number is Armstrong number");
		}
		
		else
		{
			System.out.println("Given number not is Armstrong number");
		}
		
	}
}

class Armstrong_number
{
	public static void main(String ab[])
	{
		int num;
		System.out.println("Enter the number");
		Scanner z=new Scanner(System.in);
		num=z.nextInt();
		Data x=new Data();	
		x.getdata(num);
		x.check_count();
		x.armstrong_check();
		x.display();
	}
}