package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.FreightVehicle;
import lesson_2.task1.entity.parts.Propeller;
import lesson_2.task1.entity.parts.Wheel;

import java.util.Objects;

public class Helicopter extends FreightVehicle {

    private Propeller propeller;
    private Wheel wheel;


    public Helicopter(Propeller propeller, Wheel wheel) {
        this.propeller = propeller;
        this.wheel = wheel;
    }

    public Helicopter(int cargoCounter, Propeller propeller, Wheel wheel) {
        super(cargoCounter);
        this.propeller = propeller;
        this.wheel = wheel;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "propeller=" + propeller +
                ", wheel=" + wheel +
                ", name='" + this.getClass().getName() + '\'' +
                ", cargo='" + this.getCargoCounter() +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return Objects.equals(propeller, that.propeller) && Objects.equals(wheel, that.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propeller, wheel);
    }

    @Override
    public void carryCargo() {
        System.out.println("Do something!");
    }
}
