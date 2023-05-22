package com.freecodecamp;

import java.util.HashMap;
import java.util.Map;

/**
 * Cover course chapters/sections:
 * 
 * 1. introduction
 * 2. fib memoization
 */
public class Fibonacci {
    private Map<Integer, Long> memory;

    public Fibonacci() {
        this.memory = new HashMap<>();
    }

    /** <p>Naive recursive calculation with no optimizations.</p>
     * 
     * f(n) = f(n - 1) + f(n - 2)
     * 
     * example: 1, 1, 2, 3, 5, 8, 13 , ...
     * 
     * @param number n-th fib sequence number
     * @return the n-th fib number
     */
    public long recursiveNoMemoization(int number) {
        if (1 == number || 2 == number) {
            return 1;
        }
        return recursiveNoMemoization(number - 1) + recursiveNoMemoization(number - 2);
    }

    /** <p>Recursive calculation with memoization optimization.</p>
     * 
     * f(n) = f(n - 1) + f(n - 2)
     * 
     * example: 1, 1, 2, 3, 5, 8, 13 , ...
     * 
     * @param number n-th fib sequence number
     * @return the n-th fib number
     */
    public long recursiveWithMemoization(int number) {
        if (number <= 2) {
            return 1;
        }
        if (memory.containsKey(number)) {
            return memory.get(number);
        }
        memory.put(number,  recursiveWithMemoization(number - 1) + recursiveWithMemoization(number - 2));
        return memory.get(number);
    }
}
