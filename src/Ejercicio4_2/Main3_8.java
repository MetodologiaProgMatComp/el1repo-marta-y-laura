package Ejercicio4_2;

public class Main3_8 {
    public static void main(String[] arg){
        Circle c = new Circle(3, "red");
        Cylinder cy = new Cylinder();
        System.out.println(cy);
        System.out.println(c);
        c.setRadius(5);
        c.setColor("blue");
        System.out.println("El color del círculo es: "+ c.getColor());
        System.out.println("El radio del círculo es: "+ c.getRadius());
        System.out.println("El area del círculo es: "+ c.getArea());
        System.out.println("La altura del cilindro es: "+ cy.getHeight());
        System.out.println("El volumen del cilindro es: "+ cy.getVolume());
    }
}
