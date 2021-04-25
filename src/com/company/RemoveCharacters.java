package com.company;

import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String originalString = sc.nextLine();
        String newString = "";
        for(int i=0; i<originalString.length();i++){
            if(originalString.charAt(i) >=48 && originalString.charAt(i) <= 57)
                newString+=originalString.charAt(i);
        }
        System.out.println(newString);
    }
}
