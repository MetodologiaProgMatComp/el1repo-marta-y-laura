package Ejercicio6_1;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double r) { // 2nd constructor
        radius = r;
    }
    public Circle(double r, String color, boolean filled){
        super(color, filled);
        this.radius=r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle["+super.toString()+", radius="+radius+"]";
    }

}
