package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.FreightVehicle;
import lesson_2.task1.entity.parts.Propeller;

import java.util.Objects;

public class Boat extends FreightVehicle {

    private Propeller propeller;

    public Boat(Propeller propeller) {
        this.propeller = propeller;
    }

    public Boat(int cargoCounter, Propeller propeller) {
        super(cargoCounter);
        this.propeller = propeller;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
    }


    @Override
    public String toString() {
        return "Boat{" +
                "propeller=" + propeller +
                ", name='" + this.getClass().getName() + '\'' +
                ", cargo='" + this.getCargoCounter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return Objects.equals(propeller, boat.propeller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propeller);
    }


}
