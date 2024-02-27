package Ejercicio4_2;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius = 1;
        this.color = "Black";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "[radius="+radius+", color="+color+"]";    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
