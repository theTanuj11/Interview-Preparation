package com.company;

public class StarPatternThree {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        int row = 1;
        while (row <= num) {
            while (i < num) {
                for (int column = 1; column <= num - i; column++) {
                    System.out.print("* ");
                }
                row++;
                i++;
                System.out.print("\n");
            }

        }
    }
}
