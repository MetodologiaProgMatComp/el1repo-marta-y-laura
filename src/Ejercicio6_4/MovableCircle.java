package Ejercicio6_4;


public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius=radius;
        this.center=new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + ") speed=(" + center.getxSpeed() + "," + center.getySpeed()+ ") radius=(" + radius + ")";
    }

    public int getX() {
        return  center.getX();
    }

    public int getY() {
        return center.getY();
    }

    public void moveUp() {
        int y = getY();
        int ySpeed = center.getySpeed();
        center.setY(y-ySpeed);
    }

    public void moveDown() {
        int y = getY();
        int ySpeed= center.getySpeed();
        center.setY(y+ySpeed);
    }

    public void moveLeft() {
        int x = getX();
        int xSpeed = center.getxSpeed();
        int aux = x - xSpeed;
        center.setX(aux);
    }

    public void moveRight() {
        int x = getX();
        int xSpeed = center.getxSpeed();
        int aux = x + xSpeed;
        center.setX(aux);
    }
}
