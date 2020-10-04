package com.enexus.Arrays;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5, 6, 7, 8, 9, 10};
        //int[] arr={};
        //reverseEvenAndodd( arr);
        int[] newEvenArray = evenElements(arr);

        int[] newOddArray = oddElements(arr);
        sortArray(newEvenArray);
        sortArray(newOddArray);
        mergeArray(newEvenArray,newOddArray);
    }

    public static int[] reverseEvenAndodd(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            System.out.println(arr[i]);
        }
        return arr;
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
        System.out.println("SortedArray" + Arrays.toString(arr));
        return arr;
    }

    public static int[] evenElements(int[] arr) {
        int b[] = new int[arr.length / 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i * 2];
        }
        System.out.println("Even Elements" + Arrays.toString(b));
        return b;
    }

    public static int[] oddElements(int[] arr) {
        int b[] = new int[arr.length / 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[(i * 2) + 1];
        }
        System.out.println("Odd Elements" + Arrays.toString(b));
        return b;
    }

    public static int[] mergeArray(int[] arr,int[] arr1) {
        int c[] = new int[arr.length + arr1.length];
        for (int i = 0; i <c.length/2; i++) {
            c[i*2] = arr[i];
            c[(2*i)+1]=arr1[i];
        }
        System.out.println("Merged Elements" + Arrays.toString(c));
        return c;
    }
}
