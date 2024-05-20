package lesson_2.task1;

import lesson_2.task1.entity.Plane;
import lesson_2.task1.entity.parts.Propeller;
import lesson_2.task1.entity.parts.Wheel;
import lesson_2.task1.entity.parts.Wing;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(new Wheel(), new Wing(), new Propeller());
        plane.carryCargo();

        System.out.println(plane);

        plane.removeCargo();

        System.out.println(plane);
    }
}
