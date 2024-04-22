import java.util.*;

class Arraylist1 
{
	public static void main(String ab[])
	{
		int ch,num;
		String ans="Y";
		String a="abc";
		Scanner z=new Scanner(System.in);
		ArrayList <String> numbers=new ArrayList <String>();
		do
			{
				System.out.println("Enter the choice");
				System.out.println("1. Add Element");
				System.out.println("2. Remove Element");
				System.out.println("3. Display ArrayList");
				ch=z.nextInt();

				switch(ch)
				{
					case 1: System.out.println("how much numbers want to add");
							num=z.nextInt();
							//x.add(num);
							System.out.println("Enter the numbers");
							
							for(int i=0; i<num;i++)
							{
								a=z.nextLine();
								numbers.add(a);	
							}
							break;


					case 2: System.out.println("which index position you want to remove");
							num=z.nextInt();
							//x.delete(num);
							numbers.remove(num);
							break;

					case 3: 
							System.out.println(numbers);
							break;
					//x.display();
					
					default : System.out.println("Wrong choice");

				}
				System.out.println("Do you want to continue");
				Scanner zz=new Scanner(System.in);
				ans=zz.nextLine();
				System.out.println("Choice = "+ ans);
		    }
		    while (ans.equals("y") || ans.equals("Y"));
	}
}