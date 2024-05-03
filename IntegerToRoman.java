import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Heads = scanner.nextInt();
        int Legs = scanner.nextInt();
        scanner.close();

        int cows = 0;
        while (cows <= Legs / 2) {
            int chickens = (Legs - 2 * cows) / 2;
            if (Heads == chickens + cows) {
                System.out.println(chickens + " " + cows);
                return;
            }
            cows++;
        }

        System.out.println(-1);
    }
}