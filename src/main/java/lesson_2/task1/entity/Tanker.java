package lesson_2.task1.entity;


import lesson_2.task1.entity.abstrct.FreightVehicle;
import lesson_2.task1.entity.parts.Propeller;

import java.util.Objects;

public class Tanker extends FreightVehicle {

    private Propeller propeller;

    public Tanker(Propeller propeller) {
        this.propeller = propeller;
    }

    public Tanker(int cargoCounter, Propeller propeller) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tanker tanker = (Tanker) o;
        return Objects.equals(propeller, tanker.propeller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propeller);
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "propeller=" + propeller +
                ", name='" + this.getClass().getName() + '\'' +
                ", cargo='" + this.getCargoCounter() +
                '}';
    }
}
