package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car{

    private int actualSpeed;

    public Peugeot(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public int getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed(int acceleration) {
        actualSpeed += acceleration;
    }

    @Override
    public void decreaseSpeed(int acceleration) {
        actualSpeed -= acceleration;
    }


}
