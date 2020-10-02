package com.enexus.java;

public class PalindromeProgram {

    public static void main(String[] args) {
        System.out.println(palindromeProgram("MalayalaM"));
        System.out.println(palindromeNumber(121));
    }

    public static boolean palindromeProgram(String str) {

        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean palindromeNumber(int num) {
        int remainder, reversedInteger = 0;
        int originalNumber=num;
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num = num / 10;
        }
        if(originalNumber==reversedInteger){
//            System.out.println("Both are palindrome");
            return true;
        }
        return false;
    }
}

