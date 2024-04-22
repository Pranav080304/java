class Mythread extends Thread
{
	Mythread(String s)
	{
		this.setName(s);
		start();
	}
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println("Thread Name = "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);	
			}
			catch (Exception x)
			{

			}
					
		}
	}
}


class multithreaddemo
{
	public static void main(String ab[])
	{	Mythread m[];
		m = new Mythread[500];
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<500;i++){
			m[i]=new Mythread("Thread "+i);
		}
		Mythread m1=new Mythread("Abc");
		Mythread m2=new Mythread("bcd");
		System.out.println("3rd Thread");
		
	}
}