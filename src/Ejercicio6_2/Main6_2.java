package Ejercicio6_2;

public class Main6_2 {
    public static void main(String[] args) {
        GeometricOject c = (GeometricOject) new Circle(4);
        System.out.println(c);
        System.out.println("El area del círculo es: " + c.getArea());
        System.out.println("El perímetro del círculo es: " + c.getPerimeter());
        GeometricOject r = (GeometricOject) new Rectangle();
        GeometricOject r2 = (GeometricOject) new Rectangle(4, 4.5);
        System.out.println(r);
        System.out.println(r2);
        System.out.println("El area del rectángulo es: " + r2.getArea());
        System.out.println("El perímetro del rectángulo es: " + r2.getPerimeter());

    }
}
