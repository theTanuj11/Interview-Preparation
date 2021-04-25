package com.company;


import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a ;
            for(int count = 0; count<n; count++) {

                sum += Math.pow(2, count) * b;
                System.out.print(sum + " ");
            }

        }

    }
}






