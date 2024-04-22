// Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.

import java.util.*;
class Data
{
	ArrayList<Integer>contener= new ArrayList<Integer>();
	Scanner z=new Scanner(System.in);
	int positive_count=0,negetive_count=0,zero_count=0;
	void getdata(int num)
	{
		int element;
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		{
			element=z.nextInt();
			contener.add(element);

			System.out.println("Element Saved Sucessfuly");
			if(i<num-1)
			{
				System.out.println("Enter Next Element");
			}
		}
	}

	void display()
	{
		System.out.println(contener);
	}

	void check_element()
	{ 
		object Arr[]=contener.toArray();
		
		for(int i=0;i<contener.size();i++)
		{
			if(Arr[i]<0)
			{
				negetive_count++;
			}

			else if(Arr[i]==0)
			{
				zero_count++;
			}
			else if(Arr[i]>0)
			{
				positive_count++;
			}
		}
	}

	void display_count()
	{
		System.out.println("positive_count - "+positive_count);
		System.out.println("zero_count - "+zero_count);
		System.out.println("negetive_count - "+negetive_count);
	}
}

class Arraynumcount
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.getdata(5);
		x.display();
		x.check_element();
		x.display_count();
	}
}  