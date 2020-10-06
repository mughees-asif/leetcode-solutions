package com.mughees;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        frequencySort("tree");
        frequencySort("cccaaa");
        frequencySort("Aabb");

    }

    public static void frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        map.forEach((K, V) -> System.out.print(K + " " + V + " "));
    }
}
