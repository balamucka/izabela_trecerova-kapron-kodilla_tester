package com.kodilla.collections.interfaces.kodilla.bank;

import com.kodilla.collections.interfaces.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {


    @Test
    public void shouldAddSixElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(-700);
        cashMachine.add(500);
        cashMachine.add(400);
        cashMachine.add(-150);
        cashMachine.add(-300);

        int[] values = cashMachine.getValues();
        assertEquals(6, values.length);
        assertEquals(2500, values[0]);
        assertEquals(-700, values[1]);
        assertEquals(500, values[2]);
        assertEquals(400, values[3]);
        assertEquals(-150, values[4]);
        assertEquals(-300, values[5]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();

    }




    @Test
    public void shouldCalculatePaymentsAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2500);
        cashMachine.add(500);
        cashMachine.add(400);

        assertEquals(1133.333333333333,cashMachine.getAverageOfPayments(), 0.001);
    }

    @Test
    public void shouldCalculatePayoutsAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-150);
        cashMachine.add(-550);
        cashMachine.add(-3000);

        assertEquals(-1233.333333333333, cashMachine.getAverageOfPayouts(),0.001);
    }

}
