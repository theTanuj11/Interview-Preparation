package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B ;
    static int H ;
    static boolean flag = false;
    static{

        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B<= 0 || H <= 0) {
            try {
                throw new Exception("Breadth and Hheight must be positive");
            } catch (Exception e) {
                System.out.println("java.lang.Exception: "+e.getMessage());

            }
        }else {
            flag = true;
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

