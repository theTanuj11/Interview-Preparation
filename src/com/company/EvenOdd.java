package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*if (n % 2 == 0) {
            if (n >= 2 && n <= 5)
                System.out.println("Not Weird");
            else if (n >= 6 && n <= 20)
                System.out.println("Weird");
            else{
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }*/
        if ((n % 2 == 0) && (n >= 6 && n <= 20) || (n % 2 == 1))
            System.out.println("weird");
        else if((n % 2 == 0) && ((n >= 2 && n <= 5) || (n > 20))){
            System.out.println("not weird");
        }
    }
}
