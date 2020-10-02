package com.enexus.java;
//How to Split String in java?
public class StringSplit {
    public static void main(String[] args) {
        String str="Neelima-Adhya-Arya";
        String[] parts=str.split("-");
        for(int i=0;i<str.length();i++){
            System.out.println(parts[i]);
        }

    }
}
