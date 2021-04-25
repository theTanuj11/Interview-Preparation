package com.company;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon : ");
        double s = sc.nextDouble();
        System.out.println("Area of hexagon : "+(6 * s*s)/(4*Math.tan(Math.PI/6)));
    }
}
