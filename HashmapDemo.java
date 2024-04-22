import java.util.*;

class data
{
 HashMap<Integer,String> pranav=new HashMap<Integer,String>();
 Scanner z= new Scanner(System.in);
 Scanner zz=new Scanner(System.in);

	 void getdata()
	 {
		int a,num;
		String b;
		System.out.println("hoe mutch Entres you want to add");
		num=z.nextInt();
		System.out.println("Enter number And data ");

		for(int i=0;i<num;i++)
		{
			a=z.nextInt();
			b=zz.nextLine();
			pranav.put(a,b);
			System.out.println("suceed");
		}	 	

	 }

	 void display()
	 {
	 	System.out.println(pranav);
	 }
	 void delete()
	 {
	 	int a,ch;
	 	String b,c;
	 	System.out.println("Enter choice");
	 	System.out.println("1. For Key");
	 	System.out.println("2. for replace");
	 	ch=z.nextInt();
	 	
	 	switch(ch)
	 	{
	 		case 1: System.out.println("Enter the key");
	 				a=z.nextInt();
	 				pranav.remove(a);
	 				break;

			case 2: System.out.println("Enter key & value");
					a=z.nextInt();
					b=zz.nextLine();
					c=zz.nextLine();
					pranav.replace(a,b,c);
					break;

			default: System.out.println("Wrong input");										 					
	 	}
	 }
	 void traverse()
	 {
	 	for(Map.Entry<Integer, String> entry : pranav.entrySet()) 
	 	{
 			System.out.println(entry.getKey()+" : "+entry.getValue());
 		}
	 }
}

class HashmapDemo
{
	public static void main(String ab[])
	{
		Scanner z=new Scanner (System.in);
		int ch;
		String ans="y";
		data x=new data();
		do
		{
			System.out.println("Enter the choice");
			System.out.println("1. add element");
			System.out.println("2. Display element");
			System.out.println("3. delete element");
			System.out.println("4. traverse element");
			ch=z.nextInt();

			switch(ch)
			{
				case 1: x.getdata();
						break;

				case 2: x.display();
						break;	

				case 3: x.delete();
						break;

				case 4: x.traverse();
						break;

				default: System.out.println("Wrong Input");							
			}
			System.out.println("Do you want to continue  y/n");
			Scanner zz=new Scanner (System.in);
			ans=zz.nextLine();
		}
		while(ans.equals("y")||ans.equals("Y"));
	}
}