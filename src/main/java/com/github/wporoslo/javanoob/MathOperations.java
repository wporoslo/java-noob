package com.github.wporoslo.javanoob;

/**
 * Created by Wojciech on 28.10.2016.
 */
public class MathOperations {
    public int sum(int termOne, int termTwo) {
        return termOne + termTwo;
    }

    public int difference(int termOne, int termTwo) {
        return termOne - termTwo;
    }

    public int product(int termOne, int termTwo) {
        return termOne * termTwo;
    }

    public int quotient(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return power(base, exponent - 1) * base;
    }

}
