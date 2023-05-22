package com.freecodecamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class FibonacciTest {

    private Fibonacci fibonacci;
    
    @BeforeEach
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @RepeatedTest(30)
    public void validateAlgorithmsParity(RepetitionInfo repetition) {
        Assertions.assertEquals(fibonacci.recursiveWithMemoization(repetition.getCurrentRepetition()), fibonacci.recursiveNoMemoization(repetition.getCurrentRepetition()));
    }

    @Test
    public void testRecursiveNoMemoizationSequenceVality() {
        //Assertions.assertEquals(fibonacci.recursiveNoMemoization(1), 1);
        //Assertions.assertEquals(fibonacci.recursiveNoMemoization(2), 1);
        Assertions.assertEquals(fibonacci.recursiveNoMemoization(7), 13);
    }

    @Test
    public void testRecursiveWithMemoizationSequenceVality() {
        //Assertions.assertEquals(fibonacci.recursiveWithMemoization(1), 1);
        //Assertions.assertEquals(fibonacci.recursiveWithMemoization(2), 1);
        Assertions.assertEquals(fibonacci.recursiveWithMemoization(50), 13);
    }
}
