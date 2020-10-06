package com.mughees;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));

    }

    public static String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        List<Character> characters = new ArrayList<>(counts.keySet());
        characters.sort((a, b) -> counts.get(b) - counts.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c : characters) {
            int copies = counts.get(c);
            for (int i = 0; i < copies; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
