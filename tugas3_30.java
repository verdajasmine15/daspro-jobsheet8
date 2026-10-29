import java.util.Scanner;
public class tugas3_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

         System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = mine.nextInt();

        int totalBarangSemuaToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;

        int toko = 1;

        while (toko <= jumlahToko) {
            System.out.print("Masukkan jumlah pelanggan toko "
                    + toko + ": ");
            int jumlahPelanggan = mine.nextInt();

            int totalBarangToko = 0;
            int pelanggan = 1;

            while (pelanggan <= jumlahPelanggan) {
                System.out.print("Jumlah barang pelanggan "
                        + pelanggan + " di toko "
                        + toko + ": ");

                int jumlahBarang = mine.nextInt();

                totalBarangToko += jumlahBarang;
                pelanggan++;
            }

            System.out.println("Toko " + toko
                    + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalBarangSemuaToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }

            toko++;
        }

        System.out.println("Total barang seluruh toko: "
                + totalBarangSemuaToko);

        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        mine.close();
    }
}
