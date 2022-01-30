package com.kodilla.collections.interfaces.kodilla.bank.homework;

public class Bank {

    private CashMachine accountBalance;
    private CashMachine numberOfPayouts;
    private CashMachine numberOfPayments;
    private CashMachine payouts;
    private CashMachine payments;

    public Bank () {
        this.accountBalance = new CashMachine();
        this.numberOfPayouts = new CashMachine();
        this.numberOfPayments = new CashMachine();
        this.payouts = new CashMachine();
        this.payments = new CashMachine();
    }

    public void addPayment(int payment) {
        if(payment > 0 ) {
            this.payments.add(payment);
        }
    }
    public void addPayout(int payout) {
        if (payout > 0 &&  payout < 15000) {
            this.payouts.add(payout);
        }
    }

    public double getPaymentsAverage() {
        return this.payments.getAverageOfPayments();
    }

    public double getPayoutsAverage() {
        return this.payouts.getAverageOfPayouts();
    }

}
