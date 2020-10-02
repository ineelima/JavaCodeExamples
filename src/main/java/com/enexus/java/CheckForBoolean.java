package com.enexus.java;

public class CheckForBoolean {

    //. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true *


        static  boolean atLeastTwo(boolean a, boolean b, boolean c) {
            if ((a && b) || (b && c) || (a && c)) {
                return true;
            }
            else{
                return false;
            }
        }

        public static void main(String[] args) {
            System.out.println(atLeastTwo(true,true,false));
        }
    }


