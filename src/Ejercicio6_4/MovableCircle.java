package Ejercicio6_4;


public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
        this.center=new MovablePoint(x, y, xSpeed, ySpeed);

    }
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + ") speed=(" + super.getxSpeed() + "," + super.getySpeed()+ ") radius=(" + radius + ")";
    }

    public int getX() {
        return super.getX();
    }

    public int getY() {
        return super.getY();
    }

    public void moveUp() {
        int y = super.getY();
        int ySpeed = super.getySpeed();
        int aux = y -= ySpeed;
        super.setY(aux);
    }

    public void moveDown() {
        int y = super.getY();
        int ySpeed= super.getySpeed();
        int aux= y+= ySpeed;
        super.setY(aux);
    }

    public void moveLeft() {
        int x = super.getX();
        int xSpeed = super.getxSpeed();
        int aux = x -= xSpeed;
        super.setX(aux);
    }

    public void moveRight() {
        int x = super.getX();
        int xSpeed = super.getxSpeed();
        int aux = x += xSpeed;
        super.setX(aux);
    }
}
