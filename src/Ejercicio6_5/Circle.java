package Ejercicio6_5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double r) {
        this.radius = r;

    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
