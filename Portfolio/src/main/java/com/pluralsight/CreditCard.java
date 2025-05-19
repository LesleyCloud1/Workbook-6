package com.pluralsight;

public class CreditCard implements Valuable {
    private double balance;

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance; // It's debt
    }
}
