package com.skillfactory;

import com.skillfactory.test.Boat;

public class Main {

    public static void main(String[] args) {
        Car sedan = new Sedan();

        sedan.notify();

        sedan.start();
        sedan.toString();
        System.out.println(sedan);
        System.gc();
//        rideRideable();
//        rideRideable(new Boat());
        Transport transport = new Transport();
    }

    public static void rideRideable(Rideable rideable) {
        rideable.ride();
    }
}
