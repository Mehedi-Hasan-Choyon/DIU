package Problem_Solving;


import java.util.Scanner;
public class ThreePN {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String numbers = input.next();
        int d1 = numbers.charAt(0) - 48;
        int d2 = numbers.charAt(1) - 48;
        int d3 = numbers.charAt(2) - 48;
        int d4 = numbers.charAt(3) - 48;
        int d5 = numbers.charAt(4) - 48;
        int d6 = numbers.charAt(5) - 48;
        int d7 = numbers.charAt(6) - 48;
        int d8 = numbers.charAt(7) - 48;
        int d9 = numbers.charAt(8) - 48;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
             if( d10 == 10){
                 System.out.println("The ISBN-10 number is "+numbers+"X");
             }
             else{
                  System.out.println("The ISBN-10 number is "+numbers+d10);
             }
    }
    
}
