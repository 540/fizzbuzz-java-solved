package com.deg540.fizzbuzz;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = FizzBuzz.build();
    }

    @Test
    public void return_same_number_when_normal_number_inserted() throws Exception {
        assertThat(fizBuzzCalculate(1), is("1"));
        assertThat(fizBuzzCalculate(2), is("2"));
    }

    @Test
    public void return_fizz_when_number_divisible_by_3_inserted() throws Exception {
        assertThat(fizBuzzCalculate(3), is("Fizz"));
        assertThat(fizBuzzCalculate(6), is("Fizz"));
    }

    @Test
    public void return_buzz_when_number_divisible_by_5_inserted() throws Exception {
        assertThat(fizBuzzCalculate(5), is("Buzz"));
        assertThat(fizBuzzCalculate(10), is("Buzz"));
    }

    @Test
    public void return_fizzbuzz_when_number_divisible_by_3_and_5_inserted() throws Exception {
        assertThat(fizBuzzCalculate(15), is("FizzBuzz"));
    }

    @Test
    public void return_fizz_when_number_containing_3_inserted() throws Exception {
        assertThat(fizBuzzCalculate(13), is("Fizz"));
    }

    @Test
    public void return_buzz_when_number_containing_5_inserted() throws Exception {
        assertThat(fizBuzzCalculate(52), is("Buzz"));
    }

    @Test
    public void return_100_number_calculation() throws Exception {
        assertThat(fizzBuzz.calculate().size(), CoreMatchers.is(100));
    }

    private String fizBuzzCalculate(int number) {
        return fizzBuzz.calculate().get(number - 1);
    }

}