package com.skillfactory;

import com.skillfactory.test.Boat;

public class Main {
    public static void main(String[] args) {
        rideRideable(new Car());
//        rideRideable(new Boat());
        Transport transport = new Transport();
    }
    public static void rideRideable(Rideable rideable){
        rideable.ride();
    }
}
