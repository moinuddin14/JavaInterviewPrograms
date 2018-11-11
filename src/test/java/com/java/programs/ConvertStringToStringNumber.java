package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class ConvertStringToStringNumber {

    public static void main(String[] args) {
        String str = "qqqweertyuiio";

        compress(str);
    }

    public static void compress(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
