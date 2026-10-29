import java.util.Scanner;
public class tugas2_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = mine.nextInt();

        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;

            while (j <= n) {
                int hasil = i * j;

                System.out.printf("%4d", hasil);
                total += hasil;

                j++;
            }

            System.out.println();
            i++;
        }

        System.out.println("Jumlah seluruh angka: " + total);

        mine.close();
    }
}
