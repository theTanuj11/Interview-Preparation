package com.company;

public class StarPatternOne {
    public static void main(String[]args){
        int num=5;
        for(int rows =1 ;rows<=num;rows++){
            for(int column =1;column<=rows;column++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
