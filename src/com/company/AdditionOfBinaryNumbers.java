package com.company;

import java.util.Scanner;

public class AdditionOfBinaryNumbers {
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println(" Enter first binary number :");
        int num1 = num.nextInt();
        System.out.println(" Enter second binary number :");
        int num2 = num.nextInt();
        int add = num1 + num2;
        System.out.println("Addtion of two numbers : "+add);

    }
}
