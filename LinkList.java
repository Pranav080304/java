import java.util.*;
class Data
{
	LinkedList<Integer> numbers = new LinkedList<Integer>();

	void getdata(int num)
	{
		int a;
		System.out.println("Insert the Data");
		Scanner z=new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			a=z.nextInt();
			numbers.add(a);
		}
	}

	void delete(int num)
	{
		numbers.remove(num);
	}
	void display()
	{
		System.out.println(numbers);
	}
}

class LinkList
{
	public static void main(String ab[])
	{
		Data x=new Data();
		int ch,num;
		String ans="Y";
		
		do 
		{

			System.out.println("Enter the choice");
			System.out.println("1. Insert data");
			System.out.println("2. display data");
			System.out.println("3. delete data");
			Scanner z=new Scanner(System.in);
			ch=z.nextInt();

			switch(ch)
			{
				case 1: System.out.println("no of Data Entres");
						num=z.nextInt();
						x.getdata(num);
						break;

				case 2: x.display();	
						break;

				case 3: System.out.println("Enter index position of deleting data")	;
						num=z.nextInt();
						x.delete(num);
						break;

				default: System.out.println("Invalid Input");								


			}
			System.out.println("do you want to continue");
			Scanner zx=new Scanner(System.in);
			ans=zx.nextLine();
		}
		while(ans.equals("Y")||ans.equals("y"));
	}
}