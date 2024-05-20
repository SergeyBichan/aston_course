package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.Vehicle;
import lesson_2.task1.entity.parts.Wheel;

import java.util.Objects;

public class Taxi extends Vehicle {

    private Wheel wheel;

    public Taxi() {
    }

    public Taxi(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return Objects.equals(wheel, taxi.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "wheel=" + wheel +
                ", name='" + this.getClass().getName() + '\'' +
                '}';
    }
}
