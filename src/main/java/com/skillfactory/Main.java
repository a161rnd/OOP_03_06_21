package com.skillfactory;

import com.skillfactory.test.Boat;

public class Main {

    public static void main(String[] args) {

        Car2 mazda = new Car2();

        Car2 lada = new Car2("Lada", 124, false, 20);

        float mazdaSpeed = mazda.countSpeed(5);

        System.out.println(mazda.brand + " " + mazdaSpeed);
        System.out.println(lada.brand + " " + lada.countSpeed(5));



    }
}
