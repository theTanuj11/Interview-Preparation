package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultipleOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 =sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int subtract = num1-num2;
        int product = num1*num2;
        int divide = num1/num2;
        int mod =num1%num2;
        System.out.println(num1 + "+" +num2 + ":" +sum);
        System.out.println(num1 + "-" +num2 + ":" +subtract);
        System.out.println(num1 + "x" +num2 + ":" +product);
        System.out.println(num1 + "/" +num2 + ":" +divide);
        System.out.println(num1 + "mod" +num2 + ":" +mod);

    }
}
