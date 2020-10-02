package com.enexus.java;

public class ReverseAString {
    public static void main(String[] args) {
    String str="edocavaJ";
    char[] ch=str.toCharArray();
    for(int i=ch.length-1;i>=0;i--) {
        System.out.println (ch[i]);
    }
    }
}
