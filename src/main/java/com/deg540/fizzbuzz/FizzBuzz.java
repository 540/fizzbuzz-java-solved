package com.deg540.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.deg540.fizzbuzz.Predicate.*;

class FizzBuzz {

    private Rule[] rules;

    public FizzBuzz(Rule... rules) {
        this.rules = rules;
    }

    public List<String> calculate() {
        return IntStream.rangeClosed(1, 100)
                .mapToObj(this::calculate)
                .collect(Collectors.toList());
    }

    private String calculate(int number) {
        return Arrays.stream(rules)
                .filter(rule -> rule.isSatisfiedBy(number))
                .findFirst()
                .map(satisfiedRule -> satisfiedRule.replacement())
                .orElse(String.valueOf(number));
    }

    public static FizzBuzz build() {
        return new FizzBuzz(
                new Rule(and(isDivisibleBy(3), isDivisibleBy(5)), "FizzBuzz"),
                new Rule(or(numberContains(3), isDivisibleBy(3)), "Fizz"),
                new Rule(or(numberContains(5), isDivisibleBy(5)), "Buzz")
        );
    }
}
