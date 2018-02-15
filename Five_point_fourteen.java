package Problem_Solving;

import java.util.Scanner;

public class Five_point_fourteen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int j = 2;
        int gcd = 1;
        while (j <= firstNum && j <= secondNum) {
            if (firstNum % j == 0 && secondNum % j == 0) {
                gcd = j;
            }
            j++;
        }
        System.out.println("The greatest common divisor for" + firstNum + "and" + secondNum + "is" + gcd);
    }
}
