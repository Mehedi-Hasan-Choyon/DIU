
package test;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();
    int third = input.nextInt();
    int fourth = input.nextInt();
    double resultOne = sum((double)third, (double)fourth);
    int resultTwo = sum(first, second);
    int resultThird = sum(first, second, third);
        System.out.println(resultOne + resultTwo + resultThird);

    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
}