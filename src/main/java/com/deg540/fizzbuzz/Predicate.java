package com.deg540.fizzbuzz;

import java.util.Arrays;

interface Predicate {

    boolean apply(int number);

    static Predicate isDivisibleBy(int divisor) {
        return number -> number % divisor == 0;
    }

    static Predicate numberContains(int value) {
        return n -> String.valueOf(n).contains(String.valueOf(value));
    }

    static Predicate or(Predicate... predicates) {
        return n -> Arrays.stream(predicates).anyMatch(predicate -> predicate.apply(n));
    }

    static Predicate and(Predicate... predicates) {
        return n -> Arrays.stream(predicates).allMatch(predicate -> predicate.apply(n));
    }
}
