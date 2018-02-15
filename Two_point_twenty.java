package Problem_Solving;

import java.util.Scanner;

public class Two_point_twenty {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int balance = input.nextInt();
        double rate = input.nextDouble();
        double interest = balance * (rate / 1200);
        System.out.println("The interest is " + interest);
    }
}
