package com.enexus.java;

import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String[] args) {

        int add, subtract, multiply, first, second;
        float divide;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        first =scan.nextInt();
        second=scan.nextInt();

        add=first+second;
        subtract=first-second;
        multiply=first*second;
        divide=(float)first/second;

        System.out.println("sum -> "+ add);
        System.out.println("subtract-> " + subtract);
        System.out.println("multiply-> " + multiply);
        System.out.println("divide-> " + divide);

    }

}
