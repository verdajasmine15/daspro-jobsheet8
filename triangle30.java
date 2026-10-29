import java.util.Scanner;
public class triangle30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = mine.nextInt();
        int i = 0;

        while (i <= n) {
            //System.out.print(" "); 
            int j = 0;
        while (j < i) {
            System.out.print("*");
            
            j++;
        }
        System.out.println();
            i++;
        }
       

        // segitiga terbalik
        i = n;
         while (i >= 1) {
            //System.out.print(" "); 
            int j = 0;
        while (j < i) {
            System.out.print("*");
            
            j++;
        }
        System.out.println();
            i--;
             mine.close();
        }

    }
}
