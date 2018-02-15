package test;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAHBUB
 */
public class ChapterThreeProblemNine {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String input = sc.next();
        int d1 = input.charAt(0) - 48;
        int d2 = input.charAt(1) - 48;
        int d3 = input.charAt(2) - 48;
        int d4 = input.charAt(3) - 48;
        int d5 = input.charAt(4) - 48;
        int d6 = input.charAt(5) - 48;
        int d7 = input.charAt(6) - 48;
        int d8 = input.charAt(7) - 48;
        int d9 = input.charAt(8) - 48;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        String output;
        if (d10 == 10) {
            output = input + "X";
        } else {
            output = input + d10;
        }
        
        System.out.println("The ISBN-10 number is " + output);
    }
}
