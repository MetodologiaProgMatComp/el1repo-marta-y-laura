package Ejercicio6_5;

public class Main6_5 {
    public static void main(String[] args) {
        //De Circle
        GeometricObject miObjeto1= new Circle(3);
        System.out.println(miObjeto1);
        System.out.println("El perimetro del circulo es: "+ miObjeto1.getPerimeter());
        System.out.println("El Area del circulo es: "+ miObjeto1.getArea());
        System.out.println(" ");
        //Reizable Circle

        Resizable miObjeto2= new ResizableCircle(5);
        miObjeto2.resize(56);
        System.out.println(miObjeto2);

        ResizableCircle miObjeto3=new ResizableCircle(4);
        System.out.println(miObjeto3);
        System.out.println("El área de mi objeto es "+miObjeto3.getArea());
        miObjeto3.resize(23);
        System.out.println("El área después del resize es: "+miObjeto3.getArea());
        System.out.println("El perímetro después del resize es: "+miObjeto3.getPerimeter());
        System.out.println(miObjeto3);

    }
}
