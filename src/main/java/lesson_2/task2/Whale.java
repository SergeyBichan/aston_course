package lesson_2.task2;


import lesson_2.task2.impl.Water;
import lesson_2.task2.parts.Spine;

public class Whale extends Mammal implements Water {

    public Whale(Spine spine) {
        super(spine);
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe");
    }

}
