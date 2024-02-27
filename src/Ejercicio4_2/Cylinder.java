package Ejercicio4_2;

public class Cylinder {
    private final double height;
    private final Circle base;
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return base.getRadius()*base.getRadius()*Math.PI * height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of circle, height=" + height;
    }
}
