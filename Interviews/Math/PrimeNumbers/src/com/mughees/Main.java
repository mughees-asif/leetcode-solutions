package com.mughees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(2));
        System.out.println(countPrimes(3));
    }

    // using the Sieve of Eratosthenes
    public static int countPrimes(int n) {
        if(n == 2) return 0;
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.size();
    }
}
