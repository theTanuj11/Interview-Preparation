package com.company;

import java.util.Scanner;

public class HelpingChef {
    public static String chef(int input) {
        if (input < 10) {
              return "Thanks for helping Chef!";
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter testcases :");
        int testCaseCount = sc.nextInt();
        System.out.println("Enter integer :");
        while (testCaseCount > 0) {
            int number = sc.nextInt();
             System.out.println(chef(number));
            testCaseCount--;
        }
    }

}
