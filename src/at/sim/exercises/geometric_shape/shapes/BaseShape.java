package at.sim.exercises.geometric_shape.shapes;

public class BaseShape {

    private String name;
    private double height;
    private double length;
    private double width;
    private double radius;


    public BaseShape(String name, double length, double width, double height, double radius) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    public double getArea() {
        if (name == "Rectangle") {
            return getRectangleArea();
        } else if (name == "Triangle") {
            return getTriangleArea();
        } else if (name == "Circle") {
            return getCircleArea();
        } else if (name == "Cube") {
            return getCubeVolumn();
        } else {
            return 0;
        }
    }


    private double getRectangleArea() {
        return length * width;
    }

    private double getTriangleArea() {
        return length * width / 2;
    }

    private double getCircleArea() {
        return 2 * radius * Math.PI;
    }

    private double getCubeVolumn() {
        return width * length * height;
    }


}