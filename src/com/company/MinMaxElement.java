package com.company;

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args){
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of testcases: ");
        int t =sc.nextInt();
        while(t>0) {

            System.out.println("Enter size of array: ");
            n = sc.nextInt();
            int array[] = new int[n];


            System.out.println("Enter array elements: ");
            for (int count = 0; count < n; count++) {
                array[count] = sc.nextInt();
            }

            int max = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Maximum Element: "+max);

            int j;
            int min=array[0];
            for (j = 1; j < n; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
            System.out.println("Minimum Element: "+min);

            t--;
        }

    }

}
