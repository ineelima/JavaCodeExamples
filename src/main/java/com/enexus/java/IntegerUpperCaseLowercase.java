package com.enexus.java;

import java.util.Scanner;

public class IntegerUpperCaseLowercase {
    //WJP to find total number of integers, uppercase and lowercase character in the give string
    public static void main(String[] args) {
        upperlowerInteger();
    }
public static void upperlowerInteger(){
        System.out.println("Enter the string you want to enter");
        Scanner scan=new Scanner(System.in);
         String str=scan.next();
        int uppercase=0;
        int lowercase=0;
        int digit=0;

        for(int i=0;i< str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                lowercase++;
            }else {
                if (Character.isUpperCase(str.charAt(i))) {
                    uppercase++;
                } else {
                    if (Character.isDigit(str.charAt(i))) {
                        digit++;
                    }
                }
            }
        }
        System.out.println("LowerCase"+ lowercase);
        System.out.println("Uppercase letters "+ uppercase);
        System.out.println("digits are "+ digit);
}
}
