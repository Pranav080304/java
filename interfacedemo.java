
interface Abc
{ 
	void data();
}

class Bcd implements Abc 
{
   public void data()
   {
   	System.out.println("data fuction call");
   }
}


class interfacedemo
{
	public static void main(String ab[])
	{
		Bcd x=new Bcd() ;
		x.data();
	}
}