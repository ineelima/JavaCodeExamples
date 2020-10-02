package com.enexus.java;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args){
        System.out.println(removeCharacter("Neelima",'N'));
    }
    public static String  removeCharacter(String str,char chToRemove){
        System.out.println("Enter the string you want ot enter");
        Scanner scan=new Scanner(System.in);
         str=scan.next();
        if(str==""){
            return "";
        }
        StringBuilder strBuild=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==chToRemove){
                continue;
            }
            strBuild= strBuild.append(ch);
        }
    return strBuild.toString();

    }
}
