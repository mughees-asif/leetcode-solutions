package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "a#c#"));
    }

    public static boolean backspaceCompare(String S, String T) {
        List<Character> first = new ArrayList<>();
        for(char c : S.toCharArray()) {
            first.add(c);
        }

        List<Character> second = new ArrayList<>();
        for(char c : T.toCharArray()) {
            second.add(c);
        }

        for (int i = 0; i < first.size(); i++) {
            if(first.get(i) == '#') {
                first.remove(i);
                first.remove(i -1);
            }
        }

        for (int i = 0; i < second.size(); i++) {
            if (second.get(i) == '#') {
                second.remove(i);
                second.remove(i - 1);
            }
        }

        System.out.println(first);
        System.out.println(second);

        return first.equals(second);
    }
}
