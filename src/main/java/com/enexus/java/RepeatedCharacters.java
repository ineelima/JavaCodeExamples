package com.enexus.java;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        repeatedCharcters("NNEEELIMA");
    }

    public static void repeatedCharcters(String str) {

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        char ch;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (hmap.containsKey(ch)) {
                count = hmap.get(ch);
                count++;
                hmap.put(ch, count);
            } else {
                hmap.put(ch, 1);
            }
        }
        //Duplicate Words
        System.out.println("Duplicate characters");
        for (Map.Entry<Character, Integer> m : hmap.entrySet()) {
            if(m.getValue()>1) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
        System.out.println("---------------------------------------------");

        //Unique Words
        System.out.println("unique Characters");
        for (Map.Entry<Character, Integer> m : hmap.entrySet()) {
            if(m.getValue()==1)  {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}
