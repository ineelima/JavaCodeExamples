package com.enexus.java;


public class DifferentWaysToCreateString {
    public static void main(String[] args) {
    //Q7. What are different ways to create String Object? *
        //1
        String str = "abc";
        //2
        String strObj = new String("NEELIMA");
        //3
        char[] chArray = {'A', 'R', 'Y', 'A'};
        String str1 = new String(chArray);
        System.out.println(str1);

        // How can we make String upper case to lower case? *
        String newStr = new String("ENEXUS GLOBAL");
        System.out.println(newStr.toLowerCase());

        String toUpper=new String("enexusglobal");
        System.out.println(toUpper.toUpperCase());
    }
}

