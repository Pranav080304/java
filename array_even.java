import java.util.*;

class Data
{
	Scanner z=new Scanner(System.in);
	int arr1[]=new int[10];
	int arr2[]=new int[10];
	int even[]=new int[5];
	int odd[]=new int[5];
	
	void getdata()
	{
		
		System.out.println("Enter 20 numbers");
		for(int i=0;i<10;i++)
		{
			arr1[i]=z.nextInt();
			arr2[i]=z.nextInt();
		}
	}
	
	void sort()
	{   int j=0,k=0;
	
		for (int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				even[j]=arr1[i]+arr2[i];
				j++;
			}
			
			else
			{
				odd[k]=arr1[i]+arr2[i];
				k++;
			}
		}
	}
	
	void display()
	{
		System.out.println("Even set");
		for(int i=0;i<5;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("odd set");
		for(int i=0;i<5;i++)
		{
			System.out.println(odd[i]);
		}
	}
}

class array_even
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.getdata();
		x.sort();
		x.display();
	}
}