package com.skillfactory;

public class Sedan extends Car {
    Sedan() {
        super();
    }

    @Override
    void start() {
        System.out.println("Starting sedan");
    }
}
