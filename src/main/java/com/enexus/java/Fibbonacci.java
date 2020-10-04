package com.enexus.java;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    //public static int fibonacci(int n){
//        int k=0;
//        int j=1;
//        if(n<2){
//            return n;
//        }
//        int sum=k+j;
//        for(int i=2;i<=n;i++){
//            sum=fibonacci(n-1)+fibonacci(n-2);       }
//        return sum;
//    }

    public static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);

    }
}
