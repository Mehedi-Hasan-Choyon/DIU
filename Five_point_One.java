package Problem_Solving;

import java.util.Scanner;

public class Five_point_One {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int Num = input.nextInt();
        int i = 0, positive = 0, negative = 0, count = 0;
        double total = 0, average = 0;
        if (Num == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }
        while (Num != 0) {
            total = total + Num;
            if (Num > 0) {
                positive ++;
            } else {
                negative ++;
            }
            count ++;
            Num = input.nextInt();
        }
        average = total / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average " + average);
    }
}
