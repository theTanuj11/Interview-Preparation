package com.company;

public class JavaUtils {
    public static boolean isEqualThree(int a,int b,int c) {
        if((a==b) && (b==c)) {
            return true;
        }
        return false;
    }
    public static boolean isEqualTwo(int a,int b, int c){
        if((a==b) || (b==c) || (a==c)) {
            return true;
        }
        return false;
    }
}
