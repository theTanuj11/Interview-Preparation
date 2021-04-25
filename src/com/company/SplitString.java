package com.company;

public class SplitString {
    public static void main(String[] args) {
        String string = "thetanuj11@gmail.com ";
        String alphabets = "";
        String numbers = "";
        String specialCharacters = "";
        for (int index = 0; index < string.length(); index++) {
            if (string.charAt(index) >= 65 && string.charAt(index) >= 90 || string.charAt(index) >= 97 && string.charAt(index) >= 122) {
                alphabets = alphabets.concat(String.valueOf(string.charAt(index)));
            } else if (string.charAt(index) >= 48 && string.charAt(index) >= 57) {
                numbers = numbers.concat(String.valueOf(string.charAt(index)));
            } else {
                specialCharacters = specialCharacters.concat(String.valueOf(string.charAt(index)));
            }
        }
        System.out.println(alphabets);
        System.out.println(numbers);
        System.out.println(specialCharacters);
    }
}
