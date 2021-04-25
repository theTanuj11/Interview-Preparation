package com.company;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args){
        System.out.println("TYPE - 1");
        char ch1 = 'a';
        char ch2 = 'b';

        int asciiValuech1= ch1;
        int asciiValuech2= ch2;

        System.out.println(asciiValuech1);
        System.out.println(asciiValuech2);

        System.out.println("TYPE- 2");
        Scanner input = new Scanner(System.in);
        char ch=input.next().charAt(0);
        int asciiValue=ch;
        System.out.println(asciiValue);

    }
}
