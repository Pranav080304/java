
import java.util.*;

class Data
{
	int ans=0,a=0,b=1;	
	void calculation()
	{
		while(ans<=999999999)
			{
				ans=a+b;
				System.out.println(b + "+" + a + "=" + ans);
				a=b;
				b=ans;	
			}
	}
}


class Series
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.calculation();
	}
}