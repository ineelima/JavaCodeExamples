package com.enexus.java;

import java.util.Scanner;

public class FactorialInReverseWay {
        public static void main(String args[]){
            System.out.println("Enter the number ");
            Scanner scan=new Scanner(System.in);
            int num=scan.nextInt();

            int fact=0;
            int quo=0;
            int m=num;
            for(int i=2;m!=i;i++)
            {
                quo = num /i;
                i++;
            }
            System.out.println(quo);
        }

    }
