package com.dunky.enums;

// Use Case: Encouraging end-users to use CREDIT card.
// Charge it at $0

public enum PaymentType {
    DEBIT(5.0), CREDIT(0.0), CASH(10.0);

    private final double fee;

    PaymentType(double fee) {
        this.fee = fee;
    }

    public double getFee(){
        return this.fee;
    }
}
