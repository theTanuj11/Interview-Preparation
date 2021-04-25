package com.company;


import java.util.Scanner;

public class CheckBinary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isBinary(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isBinary(String str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==0 || str.charAt(i)==1){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
