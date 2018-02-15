package Problem_Solving;

import java.util.Scanner;

public class Five_point_fifteen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name = input.nextLine();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
