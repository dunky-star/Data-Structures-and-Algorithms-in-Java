package com.dunky.objectclassmethods;

public class MainTest {
    public static void main(String[] args) {

        ElectricityBill[] electricBills = {new ElectricityBill(101, "Geoffrey", "Sunrise, FL"),
                new ElectricityBill(201, "Army", "TX, Maine drive"),
                new ElectricityBill(301, "Sheen", "Iowa, Highway 7")};
        for(int i = 0; i < electricBills.length; i++){
            System.out.println("Customer " + (i + 1) + " Electricity Bill " +electricBills[i]);
            System.out.println("Customer " + (i + 1) + " hashCode " +electricBills[i].hashCode());
        }


        ElectricityBill electricBill1 = new ElectricityBill(104, "Geoffrey", "Sunrise, FL");
        ElectricityBill electricBill2 = new ElectricityBill(104, "Geoffrey", "Sunrise, FL");
        System.out.println("Is Bill1 equals Bill2? " +electricBill1.equals(electricBill2));
    }
}
