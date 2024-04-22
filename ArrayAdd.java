// addition of two array and save to 3rd array

import java.util.*;

class Data
{
	Scanner z=new Scanner(System.in);
   String Arr1[]=new String[10];
   String Arr2[]=new String[10];
   String Arr3[]=new String[20];

   Database x=new Database();
   void start()
   {
   	  x.getdata();
   	  x.add_array();
   	  x.display();
   }

   class Database
   {

   		void getdata()
   		{
	   		System.out.println("Enter Elements In Array 1");
	   		for(int i=0;i<10;i++)
	   		{
	   			Arr1[i]=z.nextLine();
	   			System.out.println("Element SAved Sucessfuly");
	   			if(i<9)
	   			{
	   				System.out.println("Enteer Next Element");
	   			}
	   		}

	   		System.out.println("Enter Element in 2nd Array");
	   		for(int i=0;i<10;i++)
	   		{
	   			Arr2[i]=z.nextLine();
	   			System.out.println("Element SAved Sucessfuly");
	   			if(i<9)
	   			{
	   				System.out.println("Enteer Next Element");
	   			}
	   		}
	   	}

	   	void add_array()
	   	{
	   		for(int i=0;i<10;i++)
	   		{
				Arr3[i]=Arr1[i]+Arr2[i];
	   		}
	   	}

	   	void display()
	   	{
	   		System.out.println("Array 3 ");
	   		for(int i=0;i<10;i++)
	   		{
	   			System.out.println(Arr3[i]);
	   		}
	   	}
   }
}


class ArrayAdd
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.start();
	}
}