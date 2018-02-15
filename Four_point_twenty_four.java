package Problem_Solving;

import java.util.Scanner;

public class Four_point_twenty_four {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String cityOne = input.next();
        String cityTwo = input.next();
        String cityThree = input.next();
        if (cityOne.charAt(0) < cityTwo.charAt(0) && cityOne.charAt(0) < cityThree.charAt(0)) {
            if (cityTwo.charAt(0) < cityThree.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + cityOne + " " + cityTwo + " " + cityThree);
            } else {
                System.out.println("The three cities in alphabetical order are " + cityOne + " " + cityThree + " " + cityTwo);
            }
        }
        if (cityTwo.charAt(0) < cityOne.charAt(0) && cityTwo.charAt(0) < cityThree.charAt(0)) {
            if (cityOne.charAt(0) < cityThree.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + cityTwo + " " + cityOne + " " + cityThree);
            } else {
                System.out.println("The three cities in alphabetical order are " + cityTwo + " " + cityThree + " " + cityOne);
            }
        }
        if (cityThree.charAt(0) < cityTwo.charAt(0) && cityThree.charAt(0) < cityOne.charAt(0)) {
            if (cityOne.charAt(0) < cityTwo.charAt(0)) {
                System.out.println("The three cities in alphabetical order are " + cityThree + " " + cityOne + " " + cityTwo);
            } else {
                System.out.println("The three cities in alphabetical order are " + cityThree + " " + cityTwo + " " + cityOne);
            }
        }
    }
}
