package com.deg540.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzShould {

    @Test
    public void add_two_numbers() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int result = fizzBuzz.add(1, 2);

        Assert.assertThat(result, is(3));
    }

    @Test
    public void multiply_two_numbers() throws Exception {
        FizzBuzz calculator = new FizzBuzz();

        int result = calculator.multiply(1, 2);

        Assert.assertThat(result, is(2));
    }

}