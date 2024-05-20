package lesson_2.task2;


import lesson_2.task2.parts.Spine;
import lesson_2.task2.parts.Wool;

import java.util.Objects;

public class Bear extends Mammal{
    private Wool wool;

    public Bear(Spine spine) {
        super(spine);
    }

    public Bear(Spine spine, Wool wool) {
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
        Bear bear = (Bear) o;
        return Objects.equals(wool, bear.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool);
    }

    @Override
    public String toString() {
        return "Bear{" +
                "wool=" + wool +
                '}';
    }
}
