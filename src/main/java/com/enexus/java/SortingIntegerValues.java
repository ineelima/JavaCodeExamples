package com.enexus.java;
//bubble sort
public class SortingIntegerValues {
    public static void main(String[] args) {
        int[] arr1={81,32,56,74};
        sortArray(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static int[] sortArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

