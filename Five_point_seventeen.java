package Problem_Solving;

import java.util.Scanner;

public class Five_point_seventeen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int rows = 0; rows <= numberOfLines; rows++) {

            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }

            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }

            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }

            System.out.println();

        }
    }
}
