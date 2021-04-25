package com.company;

public class StarPatternFive {
    public static void main(String[] args){
        int num=5;
        int counter=1;
        for( int row=1;row<=num;row++){
            for (int column=1;column<=row;column++){
                System.out.print(counter+++" ");
            }
            System.out.print("\n");
        }
    }
}
