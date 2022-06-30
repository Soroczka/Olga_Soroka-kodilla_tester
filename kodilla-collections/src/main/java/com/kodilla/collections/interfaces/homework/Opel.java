package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return actualSpeed == opel.actualSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSpeed);
    }
}
