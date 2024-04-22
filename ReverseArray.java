
// Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
	import java.util.*;

	class Data
	{
		Scanner z=new Scanner(System.in);
		int n;
		void Data01(int num)
		{
			n=num;
		}

		int Arr[]=new int[5];
		int Arr2[]=new int[n];
		System.out.println(Arr.length);
		void getdata()
		{
			System.out.println("Enter The Number");
			for(int i=0;i<n;i++)
			{
				Arr[i]=z.nextInt();
				System.out.println("Input Saved");

				if(i<n-1)
				{
					System.out.println("Enter The Next Element");
				}
			}
		}

		void reverce()
		{
			for(int i=Arr.length;i>=0;i--)
			{	int j=0;
				Arr[i]=Arr2[j];
				j++;
			}
		}

		void display()
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(Arr[i]);
				System.out.println(Arr2[i]);
			}
		}
	}

	class ReverseArray
	{
		public static void main(String ab[])
		{
			Scanner z=new Scanner(System.in);
			int num;
			System.out.println("Enter The Array Size");
			num=z.nextInt();

			Data x=new Data();
			x.Data01(num);
			x.getdata();
			x.reverce();
			x.display();
		}
	}







