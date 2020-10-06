package com.mughees;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        frequencySort("tree");
        frequencySort("cccaaa");
        frequencySort("Aabb");

    }

    public static void frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int freqeuncy = 0;
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
                freqeuncy++;
            }
        }
        System.out.println(freqeuncy);

    }
}
