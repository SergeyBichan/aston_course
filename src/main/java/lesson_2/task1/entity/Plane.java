package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.FreightVehicle;
import lesson_2.task1.entity.parts.Propeller;
import lesson_2.task1.entity.parts.Wheel;
import lesson_2.task1.entity.parts.Wing;

import java.util.Objects;

public class Plane extends FreightVehicle {

    private Wheel wheel;
    private Wing wing;
    private Propeller propeller;

    public Plane(Wheel wheel, Wing wing, Propeller propeller) {
        this.wheel = wheel;
        this.wing = wing;
        this.propeller = propeller;
    }

    public Plane(int cargoCounter, Wheel wheel, Wing wing, Propeller propeller) {
        super(cargoCounter);
        this.wheel = wheel;
        this.wing = wing;
        this.propeller = propeller;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "wheel=" + wheel +
                ", wing=" + wing +
                ", propeller=" + propeller +
                ", name='" + this.getClass().getName() + '\'' +
                ", cargo='" + this.getCargoCounter() +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(wheel, plane.wheel) && Objects.equals(wing, plane.wing) && Objects.equals(propeller, plane.propeller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, wing, propeller);
    }


}
