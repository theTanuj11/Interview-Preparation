package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int len = str.length();
        String rev = "";
        for( int i = len-1 ; i >=0 ;i--)
            rev = rev+str.charAt(i);
        System.out.println("Reversed String is : "+rev);
        System.out.println("Reversed String is : "+revStr(str));
    }
    public static String revStr(String s) {
    int len= s.length();
    String rev = "";
    for( int i = len-1 ; i>=0 ; i--)
        rev = rev + s.charAt(i);
    return rev;
    }


}
