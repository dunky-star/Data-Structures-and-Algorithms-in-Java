package com.dunky.objectclassmethods;

import java.util.Objects;

public class ElectricityBill {
    private int meterNo;
    private String customerName;
    private String address;

    public ElectricityBill(int meterNo, String customerName, String address) {
        this.meterNo = meterNo;
        this.customerName = customerName;
        this.address = address;
    }

    public int getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(int meterNo) {
        this.meterNo = meterNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " {" +
                "Meter No=" + meterNo +
                ", Customer name='" + customerName + '\'' +
                ", Address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricityBill that = (ElectricityBill) o;
        return meterNo == that.meterNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(meterNo);
    }
}
