import java.util.*;
class WordPrice   
{  
static void numberToWords(char num[])  
{  
	int len = num.length;  
	if (len == 0)   
	{  
	System.out.println("The string is empty.");  
	return;  
	}  
	if (len > 6)   
	{  
	System.out.println("\n The given number has more than 6 digits.");  
	return;  
	}  
String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
String[] poweroftens = new String[] {"Hundred", "Thousand", "Lakh", "Crore"};  
System.out.print(String.valueOf(num) + ": ");  
	if (len == 1)   
	{  
	System.out.println(onedigit[num[0]-'0']);  
	return;  
	}  
int x = 0;  
	while (x < num.length)   
	{  
		if (len >= 3)   
		{  
			if (num[x] - '0' != 0)   
			{  
			System.out.print(onedigit[num[x] - '0'] + " ");  
			System.out.print(poweroftens[len - 3]+ " ");  
			}  
		--len;  
		} else{  
				if (num[x] - '0' == 1)   
				{  
					// System.out.println("Abc"+num[x] - '0');
				int sum = num[x] - '0' + num[x + 1] - '0';  
				System.out.println(twodigits[sum]);  
				return;  
				} else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
					{  
					System.out.println("Twenty");  
					return;  
					} else {  
							int i = (num[x] - '0');  
								if (i > 0)  
									System.out.print(multipleoftens[i]+ " ");  
								else  
									System.out.print("");  
							++x;  
							if (num[x] - '0' != 0)  
							System.out.println(onedigit[num[x] - '0']);  
							}  
		}  
	++x;  
	}  
}  

public static void main(String args[])  {  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number having max 6 digits : ");
	String num1 = sc.nextLine(); 
	numberToWords(num1.toCharArray());  
	}  
}  