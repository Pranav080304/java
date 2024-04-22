class area
{  double length,breath,result;

     area(double length,double breath)
	 {
		 result=0.5*length*breath;	 
	 }
	
     void display()
	 {
		 System.out.println("Area of trisngle is "+result);	 
	 }
	
}

class contructor1
{
	public static main(String ab[])
	{
		area x=new area(10,20);
		x.display();
		
		
		
	}
	
	
	
	
	
}