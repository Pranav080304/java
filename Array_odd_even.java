//  Arrat odd Even Sorting


import java.util.*;
class Data
{
	Scanner z=new Scanner(System.in);
	int Arr1[]=new int[10];
	int even[]=new int[10];
	int odd[]=new int[10];

	void getdata()
	{
		System.out.println("Enter 10 Elements in Array 1");

		for(int i=0;i<10;i++)
		{
			Arr1[i]=z.nextInt();
			if(i<9)
			{
				System.out.println("Enter Next Element");
			}
		}		
	}

	void odd_even()
	{
		for(int i=0;i<10;i++)
		{
			if(Arr1[i]%2==0)
			{
				even[i]=Arr1[i];
			}
			else 
			{
				odd[i]=Arr1[i];
			}
		}
	}

	void display()
	{
		System.out.println("Even Array");
		for(int i=0;i<10;i++)
		{
			if(even[i]!=0)
			{
				System.out.println(even[i]);
			}
		}
		System.out.println("Odd Array");
		for(int i=0;i<10;i++)
		{
			if(odd[i]!=0)
			{
				System.out.println(odd[i]);
			}
		}
	}
}

class Array_odd_even
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.getdata();
		x.odd_even();
		x.display();
	}
}