class Abc
{
   final int a=10;
}

class bcd extends Abc
{
  void display()
  {
	System.out.println(a);
  }
}

class finaldemo
{
  public static void main(String ab[])
  {
	bcd x=new bcd();
	x.display();
  }
}