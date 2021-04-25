package com.company;

public class StarPatternFour {
    public static void main(String[] args) {
        int num = 8;
        for (int row=0;row<=num;row++){
            for(int column =1;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.print("\n");
        }
    }
}
