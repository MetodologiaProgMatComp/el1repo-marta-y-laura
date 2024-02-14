package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Circle miObjeto= new Circle();
        System.out.println(miObjeto);
        Circle miObjeto1= new Circle(4.5);
        System.out.println(miObjeto1);
        Circle miObjeto2= new Circle(3.2,"red");
        System.out.println(miObjeto2);

        System.out.println(miObjeto2.getRadius());
        System.out.println(miObjeto2.getColor());
        miObjeto2.setRadius(4.3);
        System.out.println("Ahora el radio del Objeto 2 es;" +miObjeto2);
        miObjeto1.setColor("pink");
        System.out.println("Ahora el color de Objeto 1 es:"+ miObjeto1);
        System.out.println(miObjeto1.toString());
    }
}
