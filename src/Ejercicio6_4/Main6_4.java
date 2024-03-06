package Ejercicio6_4;

public class Main6_4 {
    public static void main(String[] args){
        Movable Mp= new MovablePoint(1,2,9,7);
        Mp.moveDown();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.moveUp();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.moveRight();
        System.out.println("Nuevas coordenadas"+ Mp.toString());
        Mp.moveLeft();
        System.out.println("Nuevas coordenadas"+ Mp.toString());

        System.out.println("Circulo");

        Movable c1= new MovableCircle(4,3,8,7,6);
        System.out.println(c1);
        c1.moveDown();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.moveUp();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.moveRight();
        System.out.println("Nuevas coordenadas"+ c1.toString());
        c1.moveLeft();
        System.out.println("Nuevas coordenadas"+ c1.toString());

    }
}
