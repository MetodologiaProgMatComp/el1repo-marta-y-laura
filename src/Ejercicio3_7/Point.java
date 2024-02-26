package Ejercicio3_7;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public methods
    public String toString() {
        return "Point: ("+x+","+y+")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }
    public double distance(Point another){
        int x2 = another.getX();
        int y2 = another.getY();
        return Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
    }
}
