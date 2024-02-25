package Ejercicio2_9;
import Ejercicio2_6.*;

public class MyTriangle {
    private final MyPoint v1;
    private final MyPoint v2;
    private final MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public String toString(){
        int x1 = v1.getX();
        int y1 = v2.getY();
        int x2 = v2.getX();
        int y2 = v2.getY();
        int x3 = v3.getX();
        int y3 = v3.getY();
        return "MyTriangle[v1=("+x1+","+y1+"), v2=("+x2+","+y2+"), v3=("+x3+","+y3+")]";
    }
    public double getPerimeter(){
        double d1= v1.distance(v2);
        double d2= v1.distance(v3);
        double d3= v2.distance(v3);
        return d1+d2+d3;
    }
    public String getType(){
        double d1= v1.distance(v2);
        double d2= v1.distance(v3);
        double d3= v2.distance(v3);
        if (d1==d2 || d1==d3 || d2==d3 ) {
            if (d1==d2 && d1==d3)return "Equilateral";
            else return "Isosceles";
        }else return "Scalene";
    }
}
