import java.util.*;

class Soluntion {
    static void numberToWords(int num) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        System.out.print(num + ": ");

        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                System.out.print(romanNumerals[i]);
                num -= numbers[i];
            }
        }

        System.out.println();
    }

    public static void main(String args[])  {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num1 = sc.nextInt(); 
        numberToWords(num1);  
    }  
}