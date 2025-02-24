package com.dunky.garbagecollection;

public class GCExample {
    private final int objId;
    GCExample(int objId){
        this.objId = objId;
        System.out.println(this.getClass().getName() + " Created..." + this.objId);
    }
    public static void main(String[] args) {
        new GCExample(1);
        new GCExample(2);
        for( int i = 1; i <= 10; i++) {
            System.gc(); // Requesting system to perform garbage collection.
        }
    }

    @Override
    protected void finalize(){  // Garbage collector only works when we are running out of resources.
        System.out.println(this.getClass().getName() + " Finalized... "  +this.objId);
    }
}
