package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));

    }

    public static String frequencySort(String s) {
        if (s == null || s.isEmpty()) return s;
        // count occurrences
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // build up sorted frequency list
        List<Character> characters = new ArrayList<>(counts.keySet());
        characters.sort((a, b) -> counts.get(b) - counts.get(a));

        // append char to  result string
        StringBuilder result = new StringBuilder();
        for(char c : characters) {
            int copies = counts.get(c);
            for (int i = 0; i < copies; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
}