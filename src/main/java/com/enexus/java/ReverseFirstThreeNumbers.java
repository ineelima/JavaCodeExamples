package com.enexus.java;

import java.util.Scanner;

//write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers,
// the number will be based on var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4
public class ReverseFirstThreeNumbers {
    public static void main(String[] args) {
        int[] arr={3,2,4,7,0,3,1,4,8,1};
        reversedArray(arr);
        System.out.println("the original array is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
            public static int[] reversedArray(int[] originalArray){
            System.out.println("how many pairs of numbers you want to reverse");
            Scanner scan = new Scanner(System.in);
            int k = scan.nextInt();
            for (int i = 0; i < originalArray.length / k; i = +k) {
                reverse(i, k, originalArray);
            }
            return originalArray;
        }
    public static int[] reverse(int left,int right,int[] arr){
        while(left>right)
        {
            int temp=0;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
     return arr;
    }
}
