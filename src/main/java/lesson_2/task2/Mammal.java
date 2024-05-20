package lesson_2.task2;


import lesson_2.task2.parts.Spine;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private Spine spine;

    public Mammal(Spine spine) {
        this.spine = spine;
    }

    public Spine getSpine() {
        return spine;
    }

    public void setSpine(Spine spine) {
        this.spine = spine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(spine, mammal.spine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spine);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "spine=" + spine +
                '}';
    }
}
