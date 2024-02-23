package Ejercicio1_9;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x1, float y1, int r, float xD, float yD){
        x = x1;
        y = y1;
        radius = r;
        xDelta = xD;
        yDelta = yD;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
        setX(x);
        setY(y);
    }
    public void reflectHorizontal(){setXDelta(-xDelta);}
    public void reflectVertical(){setYDelta(-yDelta);     }

    public String toString(){
        return "Ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }
}