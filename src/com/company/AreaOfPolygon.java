package com.company;

import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon :");
        int s = sc.nextInt();
        System.out.println("Input the length of one of the sides : ");
        double n = sc.nextDouble();
        System.out.println("Area of polygon : " +area(s,n));
    }
    public static double area(int s, double n) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
