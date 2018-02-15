
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        int i, j, k;
        System.out.print("Enter The Row Numbers:  ");
        Scanner myScanner = new Scanner(System.in);
        int row = myScanner.nextInt();

        for (i = 1; i < (row * 2) - 1; i++) {
            System.out.print("*");
        }

        for (j = row; j >= 1; j--) {

            for (k = row - 1; k >= j; k--) {

                System.out.print(" ");
            }
            System.out.print("*");

            for (k = 1; k < (j - 1) * 2; k++) {
                System.out.print(" ");
            }
            if (j < row & j > 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}