package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TriangleShrinkingDownwards {
    public static void main(String[] args) {
        String string = "GEEKS";
        String newString = string;
        int index=0;
        while(index<string.length()-1){
            string = string.replace(String.valueOf(string.charAt(index)), ".");
            newString = newString.concat(string);
            index++;
        }
        System.out.println(newString);
    }
}
