package Problem_Solving;

import java.util.Scanner;

public class Three_point_Twenty_Seven {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double pointOne = input.nextDouble();
        double pointTwo = input.nextDouble();
        if (pointOne >= 0 && pointOne <= 200) {
            if (pointTwo >= 0 && pointTwo <= 100) {
                System.out.println("The point is in the triangle");
            }
        } else {
            System.out.println("The point isn't in the triangle");
        }
    }
}
