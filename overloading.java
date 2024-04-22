class Abc
{

	void area (double a)
	{
		System.out.println("area of circle "+(3.14*a*a));
	}

	void area (int a, int b)
	{
		System.out.println("area of rectangle "+(b*a));
	}

	void area (double a,int b)
	{
		System.out.println("area of square "+(b*a));
	}
}

class overloading
{
	public static void main(String ab[])
	{
		Abc x=new Abc();
		x.area(3.2);
		x.area(3,2);
		x.area(3.2,5);
	}
}