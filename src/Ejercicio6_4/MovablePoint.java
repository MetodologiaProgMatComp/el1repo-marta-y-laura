package Ejercicio6_4;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;
    private int aux;

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
        return getySpeed();
    }

    public void setY(int aux) {
        this.aux=aux;
    }

    protected int getxSpeed() {
        return getxSpeed();
    }

    protected void setX(int aux) {
        this.aux=aux;
    }
}