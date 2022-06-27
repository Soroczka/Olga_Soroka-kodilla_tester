package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private int actualSpeed;

    public Ford(int actualSpeed) {
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
