package Problem_Solving;

import java.util.Scanner;

public class Three_point_fifteen {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int comNumber = (int) (Math.random() * 100);
        int guess = input.nextInt();
        int guessNumOne = guess / 10;
        int guessNumTwo = guess % 10;
        int lotteryOne = comNumber / 10;
        int lotteryTwo = comNumber % 10;
        if (comNumber == guess) {
            System.out.println("Exact match: you win $10,000");
        } else if (lotteryOne == guessNumTwo && lotteryTwo == guessNumOne) {
            System.out.println("Match all digits: you win $3,000");
        } else if (lotteryOne == guessNumTwo
                || lotteryOne == guessNumOne
                || lotteryTwo == guessNumTwo
                || lotteryTwo == guessNumOne) {
            System.out.println("Match one digit: you win $1,000");
        }
    }
}
