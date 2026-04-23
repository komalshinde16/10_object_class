package com.itshaala.OBJECT_CLASS;

public class DEMO1 {
    public static void main(String[] args) {
        class A {}

        class B extends A {}

        A a = new A();
        a.hashCode();

        B b = new B();
        b.hashCode();
    }
}
