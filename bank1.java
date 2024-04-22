import java.util.*;

class Data
{

	Scanner z=new Scanner(System.in);
	Scanner zz=new Scanner(System.in);
	String data[][]=new String[10000][2];
	int balance[][]=new int[10000][2];
	TreeSet<Integer>ID=new TreeSet<Integer>();
	void getaccount()
	{	
		int a;
		for(int i=0;i<100;i++)
		{
			
			if(data[i][0]==null)
			{
				System.out.println("Enter your name");
				data[i][0]=zz.nextLine();
				System.out.println("Enter your address");
				data[i][1]=zz.nextLine();
				a=100+i;
				ID.add(a);
				System.out.println(" ");
				System.out.println("Your id - "+ a);
				System.out.println(" ");
				break;
			}
		}
	}

	void credit()
	{
		int a,b,c;
		System.out.println("Enter your id ");
		a=z.nextInt();

		if(ID.contains(a)==true)
		{
			c=a%10;	
			System.out.println("name - "+ data[c][0]);
			System.out.println(" ");
			System.out.println("Enter amount want to add");
			b=z.nextInt();
			balance[c][0] = balance[a][0]+b;
	        
	        System.out.println(" ");
			System.out.println("AVL balance - "+balance[c][0]);
			System.out.println(" ");
			System.out.println("Amount credited sucessfuly");
		}

		else 
		{
			System.out.println("Invalid ID");
		}
	}

	void debit()
	{
		int a,b,c;
		System.out.println("Enter your id ");
		a=z.nextInt();

		if(ID.contains(a)==true)
		{
			c=a%10;	
			System.out.println("name - "+ data[c][0]);
			System.out.println(" ");
			System.out.println("Enter amount want to debit");
			b=z.nextInt();
			
			if(balance[c][0]>b)
			{
				 balance[c][0]=balance[c][0]-b;	
				 System.out.println("Amount credited sucessfuly");
				 System.out.println(" ");
				 System.out.println("AVL balance - "+balance[c][0]);
				 System.out.println(" ");
			}
			else
			{
				System.out.println(" ");
				System.out.println(" Sorry ! Insuficent amount");
				System.out.println(" ");
			}
			

		}
		else 
		{
			System.out.println("Invalid ID");
		}

	}

	void check_balance()
	{	int a,c;
		System.out.println("Enter your id ");
		a=z.nextInt();
		
		if(ID.contains(a)==true)
		{	
			c=a%10;
			System.out.println(" ");
			System.out.println("name - "+ data[c][0]);
			System.out.println(" ");
			System.out.println("AVL balance - "+balance[c][0]);
			System.out.println(" ");
		}
		else 
		{
			System.out.println("Invalid ID");
		}
	}
}


class bank1
{
	public static void main(String ab[])
	{
		int ch;
		String ans="y";
		Data x=new Data();
		Scanner z=new Scanner(System.in);
		Scanner zz=new Scanner(System.in);
		System.out.println("Welcome");
		do
		{
			System.out.println("   Enter choice");
			System.out.println("1. Create Account");
			System.out.println("2. Check balance");
			System.out.println("3. Cradit Amount ");
			System.out.println("4. Debit Amount");
			ch=z.nextInt();

			switch(ch)
			{
				 case 1: x.getaccount();
				 		 break;

				 case 2: x.check_balance();
				 		 break;

				 case 3: x.credit();
				 		 break;

				 case 4: x.debit();
				 		 break;	

				 default: System.out.println("Invaild Input");		 	 		 		 
			}
			System.out.println("Do you Want To continue ? Y/N ");
			ans=zz.nextLine();
		}
		while(ans.equals("y")||ans.equals("Y"));
	}
}