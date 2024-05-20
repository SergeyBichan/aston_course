package lesson_2.task2;


import lesson_2.task2.impl.Water;

public class Fish extends Animal implements Water {


    @Override
    public void swim() {
        System.out.println("Swimming!");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

    @Override
    public String toString() {
        return "Fish{} :)";
    }
}
