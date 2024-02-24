package Ejercicio2_8;
import Ejercicio2_6.*;

public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    public String toString(){
        int x = getCenterX();
        int y = getCenterY();
        int r = getRadius();
        return "MyCircle[radius = "+r+", center = ("+x+","+y+")]";
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
    public double distance(MyCircle another){
        center = getCenter();
        MyPoint center2 = another.getCenter();
        return center.distance(center2);
    }
}
