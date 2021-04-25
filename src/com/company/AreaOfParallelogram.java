package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) throws Exception {


        Scanner b = new Scanner(System.in);
        int breadth = b.nextInt();
        Scanner h = new Scanner(System.in);
        int height = h.nextInt();
        if (breadth <= 0 || height <= 0) {
            throw new Exception("Breadth and Height must be positive");
        }
        int area = breadth * height;

            System.out.println("Area of paralellogram :" + area);
        }
    }

