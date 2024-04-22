class Abc
{
	int a=0;
	int b=30;
	int c;
    int d[] = {5};


	void display()
	{
		try
		{
			c=b/a;
			System.out.println("exception deny");
			
			
		}

		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException occure");
		}

		try
		{
			d[31]=45;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}

class exception
{
	public static void main(String ab[])
	{
		Abc x=new Abc();
		x.display();
	}
}