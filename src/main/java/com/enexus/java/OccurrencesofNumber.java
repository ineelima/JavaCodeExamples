package com.enexus.java;

import java.util.HashSet;

//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. *
public class OccurrencesofNumber {
    public static void main(String[] args) {

        int[] arr={12,43,21,21,};
        occurancesOfNumber( arr);
        printUnique(arr);
        printUniqueUsingArray(arr);
        //printArray(arr);
    }
    public static int occurancesOfNumber(int[] arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count>=2)
                System.out.println("The number " + arr[i] + "occurs " + count + "times");
        }
    return count;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] printUnique(int[] arr1){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
            hs.add(arr1[i]);
        System.out.println("The unique elements are"+hs);
        return arr1;
    }
    public static int[] printUniqueUsingArray(int[] arr1){
        int temp=0;
        for(int i=0;i<arr1.length-1;i++){
            if(temp!=arr1[i]){
                System.out.println(arr1[i]);
            }
        }

       // System.out.println("The unique elements are"+hs);
        return arr1;
    }
}
