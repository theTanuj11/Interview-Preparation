package com.company;

public class PatternOfStrings {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("GEEKS");
        System.out.println(string);
        int index = string.length() - 1;
        while (index > 0) {
            System.out.println(string.deleteCharAt(index));

            index--;
        }
    }
}
