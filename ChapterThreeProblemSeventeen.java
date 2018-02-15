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
public class ChapterThreeProblemSeventeen {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int random;
        int value = (int) (Math.random() * 100);
        
        if (value < 33) {
            random = 0;
        } else if (value < 66) {
            random = 1;
        } else {
            random = 2 ;
        }
        
        System.out.println("Random no is " + random);
        
        
    }
}
