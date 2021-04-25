package com.company;

public class Equality {
    public static int equal(int a ,int b, int c){
        int count = 1;
        if( a==b || b==c || a==c)   {
            if((a==b) && (b==c) || (a==b && a==c) || (b==c) && (a==c) ){
                return count+=2;
            }
            return count+=1;
        }
        else
            return count-=1;
    }
    public static void main(String[] args){
        int valueCount = equal(3,1,1);
        System.out.println(valueCount);
    }
}
