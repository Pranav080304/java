class Abc
{
	int a=50;

	void cal()
	{
		int i;
		int d;

		for(i=-10;i<=10;i++)
		{   

			if(i!=0)
				{
					d=a/i;
					System.out.println(" num divide by "+i);
					System.out.println(d);
		 		}
			
		 	else 
		 	{
				try
				{
					d=a/0;
				}
				catch(ArithmeticException e)
				{
					System.out.println("divide by zero");
				}
			}	
				
		}	
		
	}
}

class divide
{
	public static void main(String ab[])
	{
		Abc x=new Abc();
		x.cal();
	}
}