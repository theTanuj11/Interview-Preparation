package com.company;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first nunmber : ");
        int num1 = num.nextInt();
        System.out.println("Enetr second number : ");
        int num2 = num.nextInt();
        int product = num1*num2;
        System.out.println("Product of two numbers :"+product);
    }
}
