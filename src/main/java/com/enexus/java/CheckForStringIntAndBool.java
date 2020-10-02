package com.enexus.java;

public class CheckForStringIntAndBool {

        public static void main(String[]s){

            show(5);
            show("hello");
            show(true);
        }
        public static void show(Object obj){
            if(obj instanceof Integer){
                System.out.println((Integer)obj);
            }else if(obj instanceof String){
                System.out.println((String)obj);
            }
            else if(obj instanceof Boolean){
                System.out.println((Boolean)obj);
            }
        }
    }


