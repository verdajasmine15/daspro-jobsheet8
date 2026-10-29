import java.util.Scanner;
public class star30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

    System.out.print("Masukkan nilai n = ");
    int n = mine.nextInt();

    for (int i = 1; i <= n; i++) {
    System.out.print("*");
}
    System.out.println();
    mine.close();
    }
    
}
