package Ejercicio1;

public class Circle {
    private double radius;
    private String color;
    public Circle (){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    public Circle (double r, String color){
        radius = r;
        color = "red";

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
        return "es.uah.matcomp.md.el1.Circle[radius=" + radius + " color=" + color + "]";    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}

