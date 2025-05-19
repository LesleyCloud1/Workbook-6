package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        FixedAsset house = new FixedAsset("House", 300000);
        FixedAsset ring = new FixedAsset("Ring", 5000);

        BankAccount bank = new BankAccount();
        bank.deposit(20000);

        CreditCard card = new CreditCard();
        card.charge(1000);

        portfolio.addValuable(house);
        portfolio.addValuable(ring);
        portfolio.addValuable(bank);
        portfolio.addValuable(card);

        System.out.println("Net Worth: $" + portfolio.getTotalValue());
    }
}
