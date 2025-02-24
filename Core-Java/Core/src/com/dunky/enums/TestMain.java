package com.dunky.enums;

public class TestMain {
    public static void main(String[] args) {
        PaymentType pt = PaymentType.DEBIT;
        //System.out.println("\nPayment Type: " +pt);

        PaymentType[] paymentTypes = PaymentType.values();
        System.out.println();
        for(PaymentType paymentType : paymentTypes){
            System.out.println("PaymentType: " +paymentType+ " , Fee levied: $" +paymentType.getFee());
        }
    }
}
