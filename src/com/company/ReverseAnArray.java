package com.company;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter testcases: ");
        int testCases = sc.nextInt();
        int sizeOfArray;


        while(testCases>0){
            System.out.println("Enter size of array: ");
            sizeOfArray = sc.nextInt();
            int[] array = new int[sizeOfArray];
            System.out.println("Enter elements of array: ");
            for(int index = 0; index < sizeOfArray; index++){
                array[index] = sc.nextInt();
            }
            int mid = (sizeOfArray/2)-1;
            int temp;
            for(int count=0;count<=mid;count++){
                temp=array[count];
                array[count]=array[sizeOfArray-1-count];
                array[sizeOfArray-1-count]=temp;
            }
            for(int i=0;i<sizeOfArray;i++)
                System.out.println("reversed array: "+array[i]);
            testCases--;    
        }

    }
}
