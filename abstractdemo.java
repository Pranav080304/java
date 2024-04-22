
abstract class Abc 
{
	abstract void data();

	void display()
	{
		System.out.println("Display fuction call");
	}
} 

class Bcd extends Abc
{
	void data()
	{
		System.out.println("Abstract data function call");
	}
}

class Cde extends Abc 
{
	void hello()
	{
		System.out.println("hello function call");
	}

	void data()
	{
		
	}
}
class abstractdemo
{
	public static void main(String ab[])
	{
		Bcd x=new Bcd();
		x.data();
		x.display();

		Cde y=new Cde();
		y.hello();
	}

}