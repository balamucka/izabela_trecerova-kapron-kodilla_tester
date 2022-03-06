package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Iza.94", "bedo2115", "muro_01", "lucky-007" })
    public void shouldReturnTrueForCorrectUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"iza.94@gmail.com", "Bedo-2115@onet.pl", "muro_01@outlook.com", "lucky007@wp.pl" })
    public void shouldReturnTrueForCorrectEmails(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
}
