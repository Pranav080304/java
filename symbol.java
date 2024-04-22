class symbol
{
	void print()
	{   
	    int i=1,j=1,l=0;
        
        for(j=1;j<=3;j++)
        {         
         for(l=3;l>j;l--)
         	{
         	System.out.print(" ");
         	}

	    for(i=1;i<=j;i++)
		    {
        	System.out.print("*");
      		}
      	for(i=1;i<j;i++)
		    {
        	System.out.print("*");
      		}

      	System.out.println();
      	}

      	for(j=1;j<=3;j++)
      	{

      	for(i=0;i<j;i++)
      	    {
      	    System.out.print(" ");	
      	    }	
      	for(i=2;i>=j;i--)
      	    {
      	    System.out.print("*");	
      	    }    
      	for(i=2;i>j;i--)
		    {
        	System.out.print("*");
      		}    

        System.out.println();

      	}	
	}

 public static void main(String ab[])
 
   	{

     symbol x=new symbol();
     x.print();
 	}

}