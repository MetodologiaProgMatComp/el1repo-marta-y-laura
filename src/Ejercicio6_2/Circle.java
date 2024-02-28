package Ejercicio6_2;

public class Circle implements GeometricOject {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return "[radius="+radius+"]";}

    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
