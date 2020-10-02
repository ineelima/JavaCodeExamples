package com.enexus.java;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsInString {
    public static void main(String[] args) {

        String strLine="My name is Neelima and my sister's name is Hema";
        UniqueWords(strLine);
    }

    public static void UniqueWords(String str){
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        String[] words=str.split(" ");
            for(int i=0;i<words.length;i++){
                if(hmap.containsKey(words[i]))
                    hmap.put(words[i],(hmap.get(words[i])+1));
                else
                    hmap.put(words[i],1);
            }
            System.out.println("unique words are ");
             System.out.println("-------------------------");
            for(Map.Entry<String,Integer> m:hmap.entrySet()){
                if(m.getValue()==1){
                    System.out.println( m.getKey()+"");
                }
                //System.out.println(m.getKey() +" " + m.getValue());
            }

    }
}
