import java.util.Scanner;

class array
{
    void data()
	{ 
	  Scanner z= new Scanner (System.in);
	  int b;
	  int temp;
	  int i=0;
	  System.out.println("Enter array length");
	  b=z.nextInt();
	  int a[]=new int[b];
	  System.out.println("Enter  numbers");
	
	
	  for(i=0;i<a.length;i++)
		{
         a[i]=z.nextInt();	  
		}
		
		if(a.length==1)
		{
			System.out.println("min value "+a[0]);
		}
	    else
		{
			if(a[0]>a[1])
				{
				temp=a[1];
				}		  
			else
				{
				temp=a[0];
				}	   
			for(i=2;i<a.length;i++)
				{
					if(temp>a[i])
					{
					temp=a[i];
					}
				}	

			System.out.println("min value "+temp);	  
		}
	}


    public static void main(String ab[])
	{ 
	  array x=new array();
	  x.data();
	
	}
}