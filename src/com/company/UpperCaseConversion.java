package com.company;

import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        String string = "hello my name is khan !";
        String[] array = string.split(" ");
        for (int index = 0; index < array.length; index++) {
//            System.out.println("Before : "+array[index]);
            char oldChar = array[index].charAt(0);
            char mewChar = Character.toUpperCase(oldChar);
            array[index] = array[index].replace(oldChar,mewChar);
//            System.out.println("After : "+array[index]);
        }
        String capitalize = String.join(" " +
                "",array);
        System.out.println(capitalize);
    }
}
