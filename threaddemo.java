 class threaddemo extends Thread
 {
 	threaddemo(String a)
 	{
 		System.out.println("thread is running");
 		System.out.println(a);
 	}
 
 	public static void main(String ab[])
 	{
 		threaddemo n1= new threaddemo("thread run");
 		
 	}
 }