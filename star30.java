import java.util.Scanner;
public class star30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

    System.out.print("Masukkan nilai n = ");
    int n = mine.nextInt();

    for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
    System.out.println();
    mine.close();
    }
    
}
