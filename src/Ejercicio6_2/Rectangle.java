package Ejercicio6_2;

public class Rectangle implements GeometricOject{
    private final double length;
    private final double width;
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public String toString(){
        return "Rectangle[width="+width+", length="+length+"]";
    }
}
