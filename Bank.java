import java.util.*;

class Data
{

	Scanner z=new Scanner(System.in);
	Scanner zz=new Scanner(System.in);
	String data[][]=new String[10000][2];
	int balance[][]=new int[10000][2];
	int id[]=new int[10000];
	void getaccount()
	{
		for(int i=0;i<100;i++)
		{
			if(id[i]==0)
			{
				System.out.println("Enter your name");
				data[i][0]=zz.nextLine();
				System.out.println("Enter your address");
				data[i][1]=zz.nextLine();
				id[i]=i+1;
				System.out.println(" ");
				System.out.println("Your id - "+ id[i]);
				System.out.println(" ");
				break;
			}
		}
	}

	void credit()
	{
		int a,b;
		System.out.println("Enter your id ");
		a=z.nextInt();
		a=a-1;
		if(data[a][0].equals(""))
		{
			System.out.println("name - "+ data[a][0]);
			System.out.println(" ");
			System.out.println("Enter amount want to add");
			b=z.nextInt();
			balance[a][0] = balance[a][0]+b;
	        
	        System.out.println(" ");
			System.out.println("AVL balance - "+balance[a][0]);
			System.out.println(" ");
		}

	}

	void debit()
	{
		int a,b;
		System.out.println("Enter your id ");
		a=z.nextInt();
		a=a-1;
		System.out.println("name - "+ data[a][0]);
		System.out.println(" ");
		System.out.println("Enter amount want to debit");
		b=z.nextInt();
		
		if(balance[a][0]>b)
		{
			 balance[a][0]=balance[a][0]-b;	
		}
		else
		{
			System.out.println(" ");
			System.out.println(" Sorry ! Insuficent amount");
			System.out.println(" ");
		}
		

		System.out.println(" ");
		System.out.println("AVL balance - "+balance[a][0]);
		System.out.println(" ");

	}

	void check_balance()
	{	int a;
		System.out.println("Enter your id ");
		a=z.nextInt();
		a=a-1;
		System.out.println(" ");
		System.out.println("name - "+ data[a][0]);
		System.out.println(" ");
		System.out.println("AVL balance - "+balance[a][0]);
		System.out.println(" ");
	}
}


class Bank
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
			}
			System.out.println("Do you Want To continue ? Y/N ");
			ans=zz.nextLine();
		}
		while(ans.equals("y")||ans.equals("Y"));
	}
}