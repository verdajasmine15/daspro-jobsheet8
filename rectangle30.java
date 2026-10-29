import java.util.Scanner;
public class rectangle30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = mine.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = mine.nextInt();

        for (int i = 1; i <= baris; i++) {
        for (int j = 1; j <= kolom; j++) {
        System.out.print("*");
        }
        System.out.println(); 
    }

    }
}
