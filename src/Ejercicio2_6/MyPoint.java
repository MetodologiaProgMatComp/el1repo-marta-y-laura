package Ejercicio2_6;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x2, int y2){
        x = x2;
        y = y2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] point = {x, y};
        return point;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
    public double distance(int x2, int y2){
        return Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
    }
    public double distance(MyPoint another){
        int x2 = another.getX();
        int y2 = another.getY();
        return Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
}
