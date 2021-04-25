package com.company;

import java.util.Scanner;

public class ReverseVowels {
    static boolean isVowel(char c) {
        return ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in lower characters: ");
        String string = sc.nextLine();
        int start = 0;
        int end = string.length() - 1;
        char[] stringArray = string.toCharArray();
        while (start < end) {
            if (!isVowel(stringArray[start])) {
                start++;
            } else {
                if (!isVowel(stringArray[end])) {
                    end--;
                } else {
                    swap(stringArray, start, end);
                    start++;
                    end--;
                }
            }
        }
        System.out.println(stringArray);
    }

    /**
     *to swap a character array
     * @param stringArray - character array where swapping needs to be done
     * @param first - first index
     * @param second - second index
     */
    private static void swap(char[] stringArray, int first, int second) {
        char temp = stringArray[first];
        stringArray[first] = stringArray[second];
        stringArray[second] = temp;

    }
}
