package com.enexus.java;

import java.util.Scanner;

public class BinarySearchProg {
    public static void main(String[] args) {
//provides the sorted array
        int[] arr = {2, 5, 7, 12, 14, 16, 19,20,24,28};
        System.out.println("Enter the item to be searched");
        Scanner scan = new Scanner(System.in);
        int searchElement = scan.nextInt();
        int li=0;
        int hi=arr.length-1;
        int middle = (li + hi) / 2;
        while (li <= hi) {

                if (arr[middle] == searchElement) {
                    System.out.println("Item is at " + middle + "position");
                    break;
                }
                else if (arr[middle] < searchElement) {
                    li = middle + 1;
                }
                else {
                    hi = middle - 1;
                }
                middle = (li + hi) / 2;
            }

        }

    }





