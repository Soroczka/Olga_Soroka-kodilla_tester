package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peugeot peugeot = (Peugeot) o;
        return actualSpeed == peugeot.actualSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSpeed);
    }
}
