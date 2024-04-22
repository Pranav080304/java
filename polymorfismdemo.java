
class polygon
{
	void area()
	{
		System.out.println("polygone class");
	}
}

class circle extends polygon
{
	void area()
	{
		System.out.println("circle area");
	}
}

class square extends polygon
{
	void area()
	{
		System.out.println("Square area");
	}
}

class polymorfismdemo
{
	public static void main(String ab[])
	{
		polygon x=new polygon();
		x.area();

		circle y=new circle();
		y.area();

		square z=new square();
		z.area();
	}
}