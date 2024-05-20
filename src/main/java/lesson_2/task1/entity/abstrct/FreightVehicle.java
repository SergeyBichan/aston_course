package lesson_2.task1.entity.abstrct;

import lesson_2.task1.impl.Action;

public abstract class FreightVehicle extends Vehicle implements Action {
    private int cargoCounter;

    public FreightVehicle() {
    }

    public FreightVehicle(int cargoCounter) {
        this.cargoCounter = cargoCounter;
    }

    public int getCargoCounter() {
        return cargoCounter;
    }

    public void setCargoCounter(int cargoCounter) {
        this.cargoCounter = cargoCounter;
    }

    @Override
    public void carryCargo() {
        this.cargoCounter++;
    }

    @Override
    public void removeCargo() {
        if (this.cargoCounter > 0){
            this.cargoCounter--;
        } else {
            System.out.println("Cargo is 0");
        }
    }

    @Override
    public String toString() {
        return "FreightVehicle{" +
                "cargoCounter=" + cargoCounter +
                '}';
    }
}
