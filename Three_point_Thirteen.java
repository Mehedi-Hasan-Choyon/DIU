package Problem_Solving;

import java.util.Scanner;

public class Three_point_Thirteen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double first_Edge = input.nextDouble();
        double second_Edge = input.nextDouble();
        double third_Edge = input.nextDouble();
        if (first_Edge + second_Edge == third_Edge
                || second_Edge + third_Edge == first_Edge
                || third_Edge + first_Edge == second_Edge) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
