package com.mughees;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        stringCompression(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        stringCompression(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});
        stringCompression(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'});
        stringCompression(new char[]{'a'});
    }

    static void stringCompression(char[] input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        map.forEach((key, value) ->
                System.out.print(key + "" + value));
        System.out.println();
    }
}
