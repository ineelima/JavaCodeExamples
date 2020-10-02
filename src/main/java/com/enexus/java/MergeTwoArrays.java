package com.enexus.java;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 2};
        int[] arr2 = {3, 4, 5};



        int [] arr3=(mergeArray(arr1, arr2));
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
        sortArray(arr3);
        displayArray(arr3);
    }

    public static int[] sortArray(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        return arr;
    }
        public static int[] mergeArray(int[] arr1,int[] arr2)
        {
            int[] arr3=new int[arr1.length+ arr2.length];

            for(int i=0; i<arr1.length; i++){
                arr3[i] = arr1[i];
            }

            for(int i=0; i<arr2.length; i++){
                arr3[i+arr1.length] = arr2[i];
            }
    return arr3;
        }
   }

