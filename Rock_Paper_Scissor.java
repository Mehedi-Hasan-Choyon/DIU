package Thirdclass;

import java.util.Scanner;

public class Rock_Paper_Scissor {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Scissor(0), Rock(1), Paper(2). Guess One of them...");
        int guessNum = input.nextInt();
        int comNum = (int) (Math.random() * 10);
        int answer = getNumber(comNum);
        decision(answer, guessNum);
    }

    public static int getNumber(int comNum) {
        if (comNum > 0 && comNum < 3) {
            return 0;
        }
        if (comNum >= 3 && comNum < 6) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void decision(int answer, int guess) {
        if (answer == 0 && guess == 1) {
            System.out.println("Com is Scissor.You are Rock. You Won");
        } else if (answer == 1 && guess == 0) {
            System.out.println("Com is Rock.You are Scissor. You lose");
        } else if (answer == 0 && guess == 0) {
            System.out.println("Com is Scissor.You are Scissor too.Draw");
        } else if (answer == 1 && guess == 2) {
            System.out.println("Com is Rock.You are Paper. You Won");
        } else if (answer == 2 && guess == 1) {
            System.out.println("Com is Paper.You are Rock. You lose");
        } else if (answer == 1 && guess == 1) {
            System.out.println("Com is Rock.You are Rock too. Draw");
        } else if (answer == 2 && guess == 0) {
            System.out.println("Com is Paper.You are Scissor. You Won");
        } else if (answer == 0 && guess == 2) {
            System.out.println("Com is Scissor.You are Paper. You lose");
        } else if (answer == 2 && guess == 2) {
            System.out.println("Com is Paper.You are Paper too. Draw");
        } else {
            System.out.println("Wrong Input");
        }
    }
}
