package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.FreightVehicle;
import lesson_2.task1.entity.parts.Wheel;

import java.util.Objects;

public class Truck extends FreightVehicle {

    private Wheel wheel;

    public Truck(Wheel wheel) {
        this.wheel = wheel;
    }

    public Truck(int cargoCounter, Wheel wheel) {
        super(cargoCounter);
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
        Truck truck = (Truck) o;
        return Objects.equals(wheel, truck.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheel=" + wheel +
                ", name='" + this.getClass().getName() + '\'' +
                ", cargo='" + this.getCargoCounter() +
                '}';
    }
}
