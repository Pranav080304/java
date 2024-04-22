import java.util.*;

class Data
{		
		Scanner z=new Scanner(System.in);
		
		
		int arr[]=new int[10];
				
		void getdata()
		{
			System.out.println("Enter numbers");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=z.nextInt();
			}
		}
		
		void check_invort()
		{
			int counter=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr[(arr.length-1)-i])
				{
					System.out.println("array is not invert");
					counter++;
					break;
				}					
			}
			if(counter==0)
			{
				System.out.println("Gien Array is invort array");
			}
		}
}

class array_invort
{
	public static void main(String ab[])
	{
		
		Data x=new Data();
		x.getdata();
		x.check_invort();
		
	}
}