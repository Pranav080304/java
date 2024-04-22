import java.util.*;

import java.lang.Math;


class Data
{
	int count=0,sum=0,num;
	
	
	void armstrong_check()
	{
		for(int j=0;j<100000000;j++)
			{ 	
				num=j;
				int a,num1=num;
				int num_count=num;
				
				while(num_count!=0)
				{
					num_count=num_count/10;
					count++;
				}	
				
				for(int i=0;i<count;i++)
				{
					a=num1%10;
					a=(int)Math.pow(a,count);
					sum=sum+a;
					num1=num1/10;
				}
				
				if(sum==num)
				{
						System.out.println(num +" is Armstrong number");
				}
				sum=0;
				count=0;
			}	
	}
	
}

class Armstrong_number1
{
	public static void main(String ab[])
	{
		System.out.println("Enter the number");
		Data x=new Data();	
		x.armstrong_check();
	}
}