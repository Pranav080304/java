class outer
{
   int x=30;
    void call()
	{
      inner x=new inner();	
	  x.display();
	}
	

    class inner
	{ 
	
	  void display()
	  {
	   System.out.println("Enner class " +x);
	  }
	}
}

class outerdemo
{
	public static void main(String ab[])
	{
		outer y=new outer();
		y.call();
		
	}
}