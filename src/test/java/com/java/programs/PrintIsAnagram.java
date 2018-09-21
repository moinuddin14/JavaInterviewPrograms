package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class PrintIsAnagram {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "lloeh";

        isAnagram(s1, s2);
    }

    public static void isAnagram(String str1, String str2) {
        Map<Character, Integer> map1 = stringToMap(str1);
        Map<Character, Integer> map2 = stringToMap(str2);

        if(map1.equals(map2)) {
            System.out.println("Given strings are anagrams!");
        }
        else {
            System.out.println("Given strings are not anagrams!");
        }
    }

    public static Map<Character, Integer> stringToMap(String string) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] ch = string.toCharArray();

        for(Character c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }

        return map;
    }
}
