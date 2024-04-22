import java.util.Scanner;

class number
{
	 
	 int ch,num ;
	 int counter=0;
	 Scanner z=new Scanner(System.in);
	 void getdata()
	 {
	 	
	 	System.out.println("Enetr the number");
	 	num=z.nextInt();
	 }

	 void calculation()
	 {  int a;
	 	a=num;
	 	do 
	 	{
	 		a=a/10;
	 		counter++;
	 	}
	 	while (a!=0);
	 	System.out.println("Value of counter = "+counter);
	 }


	 
		 void world()
		 { 
		 // 	if (num<=2)
			// { 
			 	
			 	switch(num)
			 	{
			 		case 0: System.out.println("zero");
                            break;

			 		case 1: System.out.print("one");
			 				break;

			 		case 2: System.out.print("two");
			 				break;

			 		case 3: System.out.print("three");
							break;	 		

			 		case 4: System.out.print("four");
			 				break;

			 		case 5: System.out.print("five");
			 				break;

			 		case 6: System.out.print("six");
			 				break;

			 		case 7: System.out.print("seven");
			 				break;

			 		case 8: System.out.print("eight");
			 				break;

			 		case 9: System.out.print("nine");
			 				break;	

			 		case 10: System.out.println("ten");
                            break;

			 		case 11: System.out.print("eleven");
			 				break;

			 		case 12: System.out.print("twele");
			 				break;

			 		case 13: System.out.print("threeteen");
							break;	 		

			 		case 14: System.out.print("fourteen");
			 				break;

			 		case 15: System.out.print("fifteen");
			 				break;

			 		case 16: System.out.print("sixteen");
			 				break;

			 		case 17: System.out.print("seventeen");
			 				break;

			 		case 18: System.out.print("eighteen");
			 				break;

			 		case 19: System.out.print("nineteen");
			 				break;			
		 	    }
	       // }
        }


	public static void main(String ab[])
		{
			number x=new number();
			x.getdata();
			x.calculation();
			x.world();
		}
}