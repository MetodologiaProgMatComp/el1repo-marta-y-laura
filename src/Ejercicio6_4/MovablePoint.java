package Ejercicio6_4;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+x+","+y+") speed=("+xSpeed+","+ySpeed+")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp(){
        y-=ySpeed;
    }
    public void moveDown(){
        y+=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    protected int getySpeed() {
        return ySpeed;
    }

    public void setY(int y) {
        this.y=y;
    }

    protected int getxSpeed() {
        return xSpeed;
    }

    protected void setX(int x) {
        this.x=x;
    }
}