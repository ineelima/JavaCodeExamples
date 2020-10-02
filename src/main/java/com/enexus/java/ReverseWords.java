package com.enexus.java;

public class ReverseWords {
    public static void main(String[] args) {
        String str="My name is Neelima";
        String words[]=str.split("");
        String word="";
        for(int i=0;i<words.length;i++){

            System.out.println(words[i] +"");
        }
        System.out.println("");
        for(int i=words.length-1;i>=0;i--){
            word=word + words[i];
        }

        System.out.println(word + " ");
    }
}
