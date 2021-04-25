package com.company;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter testcases count: ");
        int testCases =sc.nextInt();
        while(testCases>0){

            System.out.println("Enter size of array : ");
            int sizeOfArray = sc.nextInt();

            System.out.println("Enter number of elements to be rotated: ");
            int rotationCount = sc.nextInt();

            int[] array = new int[sizeOfArray];
            System.out.println("Enter elements of array: ");
            for(int index = 0; index < sizeOfArray; index++ ) {
                array[index] = sc.nextInt();
            }

            while(rotationCount>0) {

                int i;
                int temp = array[0];
                for( i = 1; i<sizeOfArray; i++) {
                    array[i - 1] = array[i];

                }
                array[sizeOfArray-1]=temp;
                rotationCount--;
            }
            for(int j=0;j<sizeOfArray;j++)
                System.out.println( array[j]);
            testCases--;
        }

    }
}
