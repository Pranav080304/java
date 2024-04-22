import java.util.*;

class data
{
	HashSet<String>Pranav_Set=new HashSet<String>();
	HashSet<String>Pranav_Set01=new HashSet<String>();
	Scanner z= new Scanner(System.in);

	void getdata(int num)
	{
		String a;
		System.out.println("Enter the name");
		for (int i=0;i<num;i++)
		{
			a=z.nextLine();
			Pranav_Set.add(a);
		}
	}

	void getdata01(int num)
	{
		String a;
		System.out.println("Enter the name");
		for (int i=0;i<num;i++)
		{
			a=z.nextLine();
			Pranav_Set01.add(a);
		}
	}


	void delete(int num)
	{
		String a;
		System.out.println("Enter element");
		
		for(int i=0;i<num;i++)
		{
			a=z.nextLine();
			Pranav_Set.remove(a);
		}
	}


	void delete01(int num)
	{
		String a;
		System.out.println("Enter element");
		
		for(int i=0;i<num;i++)
		{
			a=z.nextLine();
			Pranav_Set01.remove(a);
		}
	}



	void checkElement()
	{
		String a;
		System.out.println("Enter element");
		a=z.nextLine();
		System.out.println(Pranav_Set01.contains(a));
	}

	void checkElement01()
	{
		String a;
		System.out.println("Enter element");
		a=z.nextLine();
		System.out.println(Pranav_Set01.contains(a));
	}

	void checkSize()
	{
		System.out.println(Pranav_Set.size());
	}

	void checkSize01()
	{
		System.out.println(Pranav_Set01.size());
	}
	void display()
	{
		System.out.println("Set 01"+Pranav_Set);
		System.out.println("Set 02"+Pranav_Set01);
	}
	void uninon()
	{
		
	}

}

class Assignmentno2
{
	public static void main(String ab[])
	{
		int ch,num,a;
		String ans="y";
		data x=new data();
		Scanner z=new Scanner(System.in);
		Scanner zz=new Scanner(System.in);

		do
		{
			System.out.println("Enter a choice");
			System.out.println("1. add element");
			System.out.println("2. remove element");
			System.out.println("3. check element");
			System.out.println("4. check size");
			System.out.println("5. display set");
			ch=z.nextInt();

			switch(ch)
			{
				 case 1: System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 a=z.nextInt();

					 		 switch(a)
					 		 {
					 		 	 case 1: System.out.println("Enter how much element want to add");
					 		 			 num=z.nextInt();
					 		 	 		 x.getdata(num);
					 		 	 		 break;

					 		 	 case 2: System.out.println("Enter how much element want to add");
					 		 			 num=z.nextInt();
					 		 	 		 x.getdata01(num);
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;
					 	 
				case 2:  System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 a=z.nextInt();

					 		 switch(a)
					 		 {
					 		 	 case 1: System.out.println("Enter how much element want to remove");
					 		 			 num=z.nextInt();
					 		 	 		 x.delete(num);
					 		 	 		 break;

					 		 	 case 2: System.out.println("Enter how much element want to remove");
					 		 			 num=z.nextInt();
					 		 	 		 x.delete01(num);
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;	

				case 3:  System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 a=z.nextInt();

					 		 switch(a)
					 		 {
					 		 	 case 1: x.checkElement();
					 		 	 		 break;

					 		 	 case 2: x.checkElement01();
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;


				case 4:  System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 a=z.nextInt();

					 		 switch(a)
					 		 {
					 		 	 case 1: x.checkSize();
					 		 	 		 break;

					 		 	 case 2: x.checkSize01();
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;
	 	 		
				case 5: x.display();
						break;

	 	 		default: System.out.println("Wrong input");
			}
				System.out.println("Do you Want to continue y/n");
				ans=zz.nextLine();
		}
		while(ans.equals("y")||ans.equals("Y"));
	}
}