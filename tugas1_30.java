import java.util.Scanner;
public class tugas1_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = mine.nextInt();

        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(j + " ");
                total++;
                j++;
            }

            System.out.println();
            i++;
        }

        System.out.println("Total angka tercetak: " + total);

        mine.close();
    }
}
