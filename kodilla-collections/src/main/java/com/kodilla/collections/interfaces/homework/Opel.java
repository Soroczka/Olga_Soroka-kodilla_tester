package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int actualSpeed;

    public Opel(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    @Override
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
