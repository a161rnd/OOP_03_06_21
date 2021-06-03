package com.skillfactory;

public class Transport {
    String type = "None";

    public int publicVal = 0;
    protected int protectedVal = 0;
    int defVal = 0;
    private int privateVal = 0;

    public void someMethod() {
        publicVal = 10;
        protectedVal = 20;
        publicVal = 20;
        defVal = 3;
    }
}
