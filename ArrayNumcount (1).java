import java.util.*;

class Data {
    ArrayList<Integer> contener = new ArrayList<Integer>();

    void getdata(int num) {
        int z;
        Scanner zScanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {
            z = zScanner.nextInt();
            contener.add(z);

            System.out.println("Element Saved Sucessfuly");
            if (i < num - 1) {
                System.out.println("Enter Next Element");
            }
        }
    }

    void check_element() {
        int count = 0;
        for (int i = 0; i < contener.size(); i++) {
            if (contener.get(i) < 0) {
                count++;
            } else if (contener.get(i) > 0) {
                count++;
            }
            if (contener.get(i) == 0) {
                count++;
            }
        }
        System.out.println("positive_count - " + (count - contener.size() / 2));
        System.out.println("zero_count - " + (contener.size() / 2 - contener.stream().filter(n -> n < 0).count()));
        System.out.println("negetive_count - " + contener.stream().filter(n -> n < 0).count());
    }
}

class Arraynumcount {
    public static void main(String ab[]) {
        Data x = new Data();
        x.getdata(5);
        x.check_element();
    }
}