package lesson_2.task2;


import lesson_2.task2.parts.Spine;
import lesson_2.task2.parts.Wool;

import java.util.Objects;

public class Cat extends Mammal{
    private Wool wool;

    public Cat(Spine spine, Wool wool) {
        super(spine);
        this.wool = wool;
    }

    public Wool getWool() {
        return wool;
    }

    public void setWool(Wool wool) {
        this.wool = wool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(wool, cat.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "wool=" + wool +
                '}';
    }
}
