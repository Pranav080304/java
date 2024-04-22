import java.util.*;

class Array01
{
	ArrayList<String> names = new ArrayList<String>();

	void getdata(int num)
	{
		System.out.println("Enter  names");
		Scanner z=new Scanner(System.in);
		String a;
		for(int i=0;i<num;i++)
		{
			a=z.nextLine();
			names.add(a);
		}
	}

	void display()
	{
		
			System.out.println(names);
		
	}
}

class Arraylist001
{
	public static void main(String ab[])
	{
		int ch,num;
		String name;
		String ans="y";
		Scanner z=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter choice");
			System.out.println("1. Enetr element");
			System.out.println("2. Display element");
			ch=z.nextInt();
			Array01 x=new Array01();
			switch(ch)
			{
				case 1: System.out.println("how much entry you want");
						num=z.nextInt();
						x.getdata(num);
						break;

				case 2: x.display();
						break;

				default: System.out.println("invalid input");							

			}
			System.out.println("do you want to contioue y/n");
			Scanner zz=new Scanner(System.in);
			ans=zz.nextLine();
		}
		while(ans.equals("y") ||ans.equals("Y"));
	}
}