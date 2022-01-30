package com.kodilla.collections.interfaces.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;
    private int accountBalance;


    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
        this.accountBalance = 15000;

    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public double getAverageOfPayments() {

        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum / this.values.length;
    }

    public double getAverageOfPayouts() {

        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum / this.values.length;
    }

    public int getAccountBalance() {
        return this.accountBalance;
    }

}


