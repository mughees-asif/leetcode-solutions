package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<String> fizzBuzz(int n) {
        n = Integer.parseInt(String.valueOf(n));
        List<Integer> list = new ArrayList<>(n);
        for(int i = 0; i <= n; i++) {
            if(n % 15 == 0) {
                System.out.println("FizzBuzz");
                list.add(n);
            } else if(n % 3 == 0) {
                System.out.println("Fizz");
                list.add(n);
            } else if(n % 5 == 0) {
                System.out.println("Buzz");
                list.add(n);
            }
        }
        return list;
    }
}
