package com.company;

import java.sql.SQLOutput;

public class AgeConverter {
    private static int convertAgeToDays(int ageInYears) throws Exception{
        if(ageInYears <0){
            throw new Exception("Age received : "+ageInYears+". Age Cannot be negative");
        }
        return ageInYears*365;
    }   

    public static void main(String[] args)  throws Exception{
       int days = convertAgeToDays(78);
        System.out.println("days : "+days);

    }


}
