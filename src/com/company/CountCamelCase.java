package com.company;

import java.util.Scanner;

public class CountCamelCase {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int counter = 0;
        for(int i=1; i<str.length();i++){
            if(str.charAt(i) >= 65 && str.charAt(i)<=90)
                counter++;
        }
        System.out.println(counter);

    }

}

