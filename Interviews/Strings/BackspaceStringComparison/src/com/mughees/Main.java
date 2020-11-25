package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    
    }

    public boolean backspaceCompare(String S, String T) {
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
                first.remove(i -1);
            }
        }

        return true;
    }

}
