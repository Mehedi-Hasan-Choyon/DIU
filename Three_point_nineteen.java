package Problem_Solving;

import java.util.Scanner;

class Three_point_nineteen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int firstEdge = input.nextInt();
        int secondEdge = input.nextInt();
        int thirdEdge = input.nextInt();
        if (firstEdge + secondEdge > thirdEdge
                || secondEdge + thirdEdge > firstEdge
                || thirdEdge + firstEdge > secondEdge) {
            int perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.print("valid !!");
            System.out.println("Perimter is: " + perimeter);
        }
    }
}
