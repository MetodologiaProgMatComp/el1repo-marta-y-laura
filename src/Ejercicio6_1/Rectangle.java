package Ejercicio6_1;

public class Rectangle extends Shape{
    protected double length;
    protected double width;
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public Rectangle(double l, double w, String color, boolean filled){
        super(color, filled);
        this.length = l;
        this.width = w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public String toString(){
        return "Rectangle[Shape[color="+getColor()+", width="+width+", length="+length+"]";
    }

}
