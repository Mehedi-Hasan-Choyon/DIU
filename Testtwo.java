/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclass;

import java.util.Scanner;
public class Testtwo extends Testone{
    public static void main(String[] args) {
        int one, two, three, four, sumoftwo, sumofthree, sumoffour;
        Scanner input = new Scanner(System.in);
        one = input.nextInt();
        two = input.nextInt();
        three = input.nextInt();
        four = input.nextInt();
        sumoftwo= sum(one, two);
        sumofthree= sum(sumoftwo, three);
        sumoffour= sum(sumofthree, four);
        printf("The sum of two digit is " +sumoftwo );
        System.out.println("The sum of three digit is " +sumofthree );
        System.out.println("The sum of four digit is " +sumoffour );
        
    }
    
    @Override
    public void display(){
        System.out.println("This is from Test two");
    }
    
    public static void printf(Object object){
        System.out.println(object);
    }
    
    public static int sum(int a, int b){
        return a + b;
    }
     public static int sum(int a, int b, int c){
        return a + b + c;
    }
      public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    
}
