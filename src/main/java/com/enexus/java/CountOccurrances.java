package com.enexus.java;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrances {
    public static void main(String[] args) {
        String str="abbbccdddaa";
        countOccurranceOfCharacters(str);
        countOccurranceOfWordsUsingHashMap( "My My name  name is is Neelima");
        countCharactersInHashMap("My  name  name is is Neelima");
    }


    public static int countOccurranceOfCharacters(String str){
       int i,j,counter = 0;
       char[] ch=str.toCharArray();
        for(i=0;i<ch.length-1;i++ ){
            counter=0;
            for(j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    counter++;
                    if(j<i && ch[i]==ch[j])
                        break;
                }
                if(j==ch.length-1){
                    System.out.println("the character at string " + ch[i] +" occurs"+ counter +" times");
                }
            }

        }
        return counter;
    }
    public static void countOccurranceOfWordsUsingHashMap(String str){
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            if(hmap.containsKey(words[i]))
                hmap.put(words[i],(hmap.get(words[i])+1));
            else
                hmap.put(words[i],1);
        }
        for(Map.Entry<String,Integer> m:hmap.entrySet()){
            System.out.println(m.getKey() +" " + m.getValue());
        }
    }

    public static void countCharactersInHashMap(String str){
        HashMap<Character,Integer> hmap=new HashMap<Character, Integer>();
        char ch;
        int count;
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            if (hmap.containsKey(ch)) {
                count = hmap.get(ch);
                count++;
                hmap.put(ch,count);
            }
            else{
                hmap.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> m:hmap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

