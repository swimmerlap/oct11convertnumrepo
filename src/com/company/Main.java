package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number in inches: ");
        int numInInches = keyboard.nextInt();

	System.out.printf("%.2f", convertToCm(numInInches));




    }


    public static double convertToCm (int numInInches){
        double cm = numInInches * 2.54;
        return cm;

    }
}
