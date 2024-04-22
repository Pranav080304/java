import java.util.*;

class Data
{
	void check_fraction(int num)
	{
		for (int i=2;i<num;i++)
		{
				if(num%i==0)
				{
					System.out.println(i +" is fraction of number " + num);
				}
		}
	}
}

class fraction
{
	public static void main(String ab[])
	{
		Scanner z=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=z.nextInt();
		
		Data x=new Data();
		x.check_fraction(num);
	}
}