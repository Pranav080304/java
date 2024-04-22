import java.util.*;

class Data
{
	double num;
	void calculate()
	{
		num=12.056;
		System.out.println(num%1);
	}
}

class double_parts
{
	public static void main(String ab[])
	{
		Data x=new Data();
		x.calculate();
	}
}