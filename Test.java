/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 *
 * @author MAHBUB
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner sc=new Scanner(System.in);
        int numberOne=sc.nextInt();
        int numberTwo=sc.nextInt();
        int numberThree=sc.nextInt();
        int numberFour=sc.nextInt();
        int R1 = sum(numberOne, numberTwo);
        int R2 = sum(numberOne, numberTwo, numberThree, numberFour);
        System.out.println(R1);
        System.out.println(R2);
    }
    
    public static int sum(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static int sum(int numOne,int numTwo,int numThree,int numFour){
    return numOne + numTwo + numThree + numFour; 
    }

 
}
