package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private boolean isStamped;

    public Stamp(String name, double height, double width, boolean isStamped) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.isStamped = isStamped;
    }

    @Override
    public String toString() {
        return "Stamp {" +
                "Name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", is stamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 && Double.compare(stamp.width, width) == 0 && isStamped == stamp.isStamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, isStamped);
    }
}
