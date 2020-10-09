package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();

        // count occurrences
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // check
        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            int freq_1 = map.get(o1);
            int freq_2 = map.get(o2);
            if(freq_1 < freq_2) return o2.compareTo(o1);
            return freq_1 - freq_2;
        });

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k)   pq.poll();
        }

        Collections.reverse(result);
        while(!pq.isEmpty())    result.add(pq.poll());
        return result;
    }
}
