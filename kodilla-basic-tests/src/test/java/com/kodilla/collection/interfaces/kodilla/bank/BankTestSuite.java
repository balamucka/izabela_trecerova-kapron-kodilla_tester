package com.kodilla.collection.interfaces.kodilla.bank;

import com.kodilla.collection.interfaces.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCalculateCorrectPaymentsAverages() {
        Bank bank = new Bank();
        bank.addPayment(2500);
        bank.addPayment(500);
        bank.addPayment(400);

        double paymentAverage = bank.getPaymentsAverage();

        assertEquals(1133.333333333333, paymentAverage, 0.001);
    }

    @Test
    public void shouldCalculateCorrectPayoutsAverages() {
        Bank bank = new Bank();
        bank.addPayout(150);
        bank.addPayout(550);
        bank.addPayout(3000);

        double payoutAverage = bank.getPayoutsAverage();

        assertEquals(1233.333333333333, payoutAverage, 0.001);
    }
}
