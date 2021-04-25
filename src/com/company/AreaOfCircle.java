package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle : "+ Math.PI*radius*radius);
        System.out.println("Perimeter of Circle : "+ 2*Math.PI*radius);

    }
}
