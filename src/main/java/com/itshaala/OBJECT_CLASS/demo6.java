package com.itshaala.OBJECT_CLASS;

import lombok.*;

public class demo6 {
    public static void main(String[] args) {
        System.out.println(10 == 20);//false
        System.out.println(10 == 10);//true

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        @ToString
        class Product {
            private int id;
            private String name;
            private double price;
        }
        Product product1 = new Product(1, "Speaker", 40000);
        Product product2 = new Product(1, "Speaker", 40000);
        System.out.println(product1 == product2);//false
        System.out.println(product1.equals(product2));//false
        System.out.println(product1.equals(product1));//true
        System.out.println(product1.equals(null));//false
    }
}
