package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine machine = new GamblingMachine();
    @ParameterizedTest
    @CsvFileSource(resources = "/UserNumbers")
    public void ShouldCalculateUserNumbers(String userNumbers) throws InvalidNumbersException {
        String[] numbers = userNumbers.split(",");
        Set<Integer> numbers1 = new HashSet<>();
        for (String s : numbers) {
            int number = Integer.parseInt(s);
            numbers1.add(number);
        }
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers1));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validSetOfNumbers.csv")
    public void shouldReturnTrueWhenTheNumberOfDigitsHitIsGreaterThenZero(String numbers)
            throws InvalidNumbersException {

        String[] stringNumbers = numbers.split(" ");

        Set<Integer> numbers1 = new HashSet<>();

        for (String value : stringNumbers) {
            numbers1.add(Integer.valueOf(value));
        }
        int howManyWins = GamblingMachine.howManyWins(numbers1);
        System.out.println(howManyWins);
        assertTrue(howManyWins > 0);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/invalidSetOfNumbers.csv")
    public void shouldThrowExceptionWhenSetOfNumbersIsLessThanSix(String strings) {

        String[] numbers = strings.split(" ");

        Set<Integer> userNumbers = new HashSet<>();

        for (String number : numbers) {
            userNumbers.add(Integer.parseInt(number));
            assertThrows(InvalidNumbersException.class, () -> GamblingMachine.howManyWins(userNumbers));
        }
    }
}