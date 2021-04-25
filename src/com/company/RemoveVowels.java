package com.company;

import static com.company.ReverseVowels.isVowel;

public class RemoveVowels {
    public static void main(String[] args) {
        String string = "Hello Everyone";
        int index = 0;
        int end = string.length() - 1;
        String withoutVowel = "";
        while (index < end) {
            if (!isVowel(string.charAt(index))){
                withoutVowel = withoutVowel.concat(String.valueOf(string.charAt(index)));
            }
            index++;
        }
        System.out.println(withoutVowel);
    }

    static boolean isVowel(char c) {
        return ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U'));

    }

}
