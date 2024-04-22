
// Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.


import java.util.*;

class Data
{
	ArrayList<Integer>Numbers=new ArrayList<Integer>();
	Scanner z=new Scanner(System.in);
	
	void getdata(int num)
	{
		int a;
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		{
			a=z.nextInt();
			Numbers.add(a);
			System.out.println("Number Sucessfuly Saved");

			if(i<num-1)
			{
				System.out.println("Enter next number");
			}
		}
	}

	void display()
	{
		System.out.println("Array - "+ Numbers);
	}

	void check()
	{
		int num;
		System.out.println("Enter number to check it is present in array or not");
		num=z.nextInt();
		if(Numbers.contains(num)==true)
		{
			System.out.println(num +" Is Present in Array");
		}
		else
		{
			System.out.println(num +" Is Not Present In Array");
		}
	}
}

class ArrayCheck
{
	public static void main(String ab[])
	{
		int ch,num;
		String ans="y";
		Scanner z=new Scanner(System.in);
		Scanner zz=new Scanner(System.in);
		Data x=new Data();

		do
		{
			System.out.println("Enter the choice");
			System.out.println("1. Add Numbers In Array");
			System.out.println("2. Display Numbers In Array");
			System.out.println("3. Check number In Array");
			ch=z.nextInt();

			switch(ch)
			{
				 case 1: System.out.println("how Mutch Numbers do You Want To Add");
				 		 num=z.nextInt();
				 		 x.getdata(num);
				 		 break;

				 case 2: x.display();
				 		 break;

				 case 3: x.check();
				 		 break;

				 default : System.out.println("Wrong Input");		 		 		 
			}
			System.out.println("Do You Want To Continue Y/N");
			ans=zz.nextLine();
		}
		while(ans.equals("y")|| ans.equals("Y"));
	}
}