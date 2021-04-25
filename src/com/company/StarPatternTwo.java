package com.company;

public class StarPatternTwo {
    public static void main(String[] args) {
        int num = 5;
        for(int row=1;row<=num;row++){
            for (int column = 1; column <= num; column++) {
                if(column<row) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
