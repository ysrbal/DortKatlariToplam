import java.util.Scanner;

public class DortKatlari {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner inp = new Scanner(System.in);


        do {
            System.out.print("Lutfen Bir Sayi Giriniz : ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;

            }

        } while (n %2 == 0);

        System.out.println("Total :" + total);
    }
}
