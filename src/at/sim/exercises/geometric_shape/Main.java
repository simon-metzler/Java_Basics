package at.sim.exercises.geometric_shape;

import at.sim.exercises.geometric_shape.shapes.Circle;
import at.sim.exercises.geometric_shape.shapes.Cube;
import at.sim.exercises.geometric_shape.shapes.Rectangle;
import at.sim.exercises.geometric_shape.shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube(10, 10, 10);
        System.out.println(cube.getArea());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(30, 30);
        System.out.println(triangle.getArea());

        Circle circle = new Circle(3);
        System.out.println(circle.getArea());




    }
}
