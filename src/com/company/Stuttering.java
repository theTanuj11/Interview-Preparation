package com.company;

public class Stuttering {
    public static String stutter(String inputString) throws Exception {
        if (inputString.length() > 2 && isLowerCase(inputString)) {
            return inputString.substring(0, 2);
        } else {
            throw new Exception("Input String should be atleast two character long and all characters must be lower case");
        }
    }

    private static boolean isLowerCase(String originalString) {
        String lowerCaseString = originalString.toLowerCase();
        return lowerCaseString.equals(originalString);
    }

    public static void main(String[] args) throws Exception {
        String inputString = "hellooooo";
        String s = stutter(inputString);
        System.out.println("Stuttered String : " + s + "... " + s + "... " + inputString + "?");
    }
}
