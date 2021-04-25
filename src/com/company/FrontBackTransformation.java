package com.company;

public class FrontBackTransformation {
    public static void main(String[] args) {
        String string = "Hello";
        String newString = "";
        for (int index = 0; index < string.length(); index++) {
            char oldChar = string.charAt(index);
            int asciiValue = oldChar;

            if (asciiValue >= 65 && asciiValue <= 90) {
                int newAsciiValue = 65 + (90 - asciiValue);
                char newChar = (char) newAsciiValue;
                newString += String.valueOf(newChar);

            }
            if(asciiValue >= 97 && asciiValue <= 122){
                int newAsciiValue2 = 97 + (122 - asciiValue);
                char newChar2 = (char) newAsciiValue2;
                newString += String.valueOf(newChar2);
            }
        }
        System.out.println(newString);
    }
}
