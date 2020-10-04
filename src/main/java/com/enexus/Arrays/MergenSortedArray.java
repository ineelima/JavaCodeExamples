package com.enexus.Arrays;

import java.util.Arrays;

public class MergenSortedArray {
    public static void main(String[] args) {

        int[] a = {1, 11, 14, 20};
        int[] b = {2, 5, 7, 9};

        int[] c = new int[a.length + b.length];
//    for(int i=0;i<c.length/2;i++)
//        {
//            if(a[i]>b[i])
//            {
//                c[i*2]=b[i];
//                c[(2*i)+1]=a[i];
//            }
//            else{
//                c[i*2]=a[i];
//                c[(2*i)+1]=b[i];
//            }
//        }
//        System.out.println(Arrays.toString(c));
        int i = 0;
        int j = 0;
        for (int k = 0; k < c.length; k++) {
            if (j < b.length && i < a.length) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;

                } else {
                    c[k] = b[j];
                    j++;
                }
            }
            else if (i >= a.length) {
                c[k] = b[j];
                j++;
            }
            else if (j >= b.length) {
                c[k] = a[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}




