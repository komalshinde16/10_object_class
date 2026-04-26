package com.itshaala.OBJECT_CLASS;

public class Demo8 {

    public static void main(String[] args) {
        Demo8 demo8 = new Demo8();
        demo8 = null; // object unreferenced object
        System.gc();
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("finalize method called");
    }
}
