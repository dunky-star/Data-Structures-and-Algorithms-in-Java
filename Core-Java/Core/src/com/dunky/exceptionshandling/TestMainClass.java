package com.dunky.exceptionshandling;

public class TestMainClass{
    public static void main(String[] args) throws CheckedCustomExceptions {
        //throw new UncheckedCustomExceptions("Business runtime error occurred");
        throw new CheckedCustomExceptions("Business Exception occurred");
    }
}
