package com.enexus.java;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n;
        int factorial=fact(5);
        System.out.println(factorial);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            n=n*fact(n-1);
        }
     return n;
    }
}
