import java.util.*;

class roman {
    static void numberToWords(char num[]) {
        if (num.length > 4) {
            System.out.println("\n The given number has more than 4 digits. Only numbers with 4 or fewer digits are supported.");
            return;
        }
        String[] onedigit = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] twodigits = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] multipleoftens = new String[] {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        System.out.print(String.valueOf(num) + ": ");
        if (num.length == 1) {
            System.out.println(onedigit[num[0] - '0']);
            return;
        }
        if (num.length == 2) {
            if (num[0] - '0' == 1) {
                int sum = num[0] - '0' + num[1] - '0';
                System.out.println(twodigits[sum]);
                return;
            }
            System.out.print(twodigits[num[0] - '0'] + " ");
            System.out.println(onedigit[num[1] - '0']);
            return;
        }
        if (num.length == 3) {
            if (num[0] - '0' == 1) {
                int sum = num[0] - '0' + num[1] - '0';
                System.out.println(multipleoftens[sum] + " ");
                System.out.println(onedigit[num[2] - '0']);
                return;
            }
            System.out.print(multipleoftens[num[0] - '0'] + " ");
            System.out.print(twodigits[num[1] - '0'] + " ");
            System.out.println(onedigit[num[2] - '0']);
            return;
        }
        if (num.length == 4) {
            if (num[0] - '0' == 1) {
                int sum = num[0] - '0' + num[1] - '0';
                System.out.println(multipleoftens[sum] + " ");
                System.out.print(multipleoftens[num[2] - '0'] + " ");
                System.out.println(onedigit[num[3] - '0']);
                return;
            }
            System.out.print(multipleoftens[num[0] - '0'] + " ");
            System.out.print(multipleoftens[num[1] - '0'] + " ");
            System.out.print(twodigits[num[2] - '0'] + " ");
            System.out.println(onedigit[num[3] - '0']);
            return;
        }
    }

    public static void main(String args[])  {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number having max 4 digits : ");
        String num1 = sc.nextLine(); 
        numberToWords(num1.toCharArray());  
    }  
}