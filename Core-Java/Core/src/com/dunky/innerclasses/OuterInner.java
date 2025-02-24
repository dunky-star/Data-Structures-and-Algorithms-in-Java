package com.dunky.innerclasses;

public class OuterInner {
    // Static and non-static member variables
    private static final int x = 100;
    private final int y;

    OuterInner(int y){
        this.y = y;
    }

    private static void printOuter(){
        System.out.println("Outer static method");
    }

    private void print(){
        System.out.println("Outer non-static method");
        // Local inner class
        class LocalInner{
            void printLocal(){
                System.out.println("Local Inner class method");
            }
        }
        LocalInner local = new LocalInner();
        local.printLocal(); // Accessing printLocal() inside LocalInner class
    }

    private static class InnerStaticClass {
        private static void printInner(){
        System.out.println("Inner static method");
        }

        private void f1(){
            System.out.println("Inner non-static method");
        }
    }

    private class InnerNonStaticClass {

        private int y;
        InnerNonStaticClass(int y){
            this.y = y;
        }

        private void f2(){
            System.out.println("Value of X: " +OuterInner.x);
            System.out.println("Value of Y from inner non static class: " +OuterInner.this.y);
        }
    }

    public static void main(String[] args) {
        OuterInner.printOuter(); // Accessing outer static method
        OuterInner.InnerStaticClass.printInner(); // Accessing inner class static method
        // Accessing static inner class non-static method
        OuterInner.InnerStaticClass objInner = new OuterInner.InnerStaticClass();
        objInner.f1();

        // Accessing inner class non-static
        OuterInner outerObj = new OuterInner(10);
        OuterInner.InnerNonStaticClass innerNonStatic = outerObj.new InnerNonStaticClass(100);
        innerNonStatic.f2();
        // Invoking Local Inner class method
        outerObj.print();
    }
}
