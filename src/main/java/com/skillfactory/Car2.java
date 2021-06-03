package com.skillfactory;

public class Car2 {
    String brand; // Марка
    int horsePower; // мощность
    boolean isAwd; // привод
    float acceleration;

    Car2() {
        this("Mazda", 199, true, 10);

    }

    Car2(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    void start() {
        System.out.println(brand + " Engine started!");
    }

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    float countSpeed(float time) {
        return (100 / acceleration) * time; // иетод считает ускорение за ед. времени
    }


}
