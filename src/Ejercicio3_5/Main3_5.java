package Ejercicio3_5;

public class Main3_5 {
    public static void main(String[] args) {
        Shape s = new Shape("red",true);
        Circle c = new Circle(3, "red", true);
        Rectangle r = new Rectangle(3,4,"green", false);
        System.out.println(s);
        s.setColor("blue"); // Test setters
        s.setFilled(false);
        c.setRadius(2);
        c.setFilled(false);
        c.setColor("red");
        r.setWidth(5);
        r.setLength(4);
        r.setColor("pink");
        r.setFilled(true);
        System.out.println("El color es: " + s.getColor());
        System.out.println("Esta terminado : " + s.isFilled());
        System.out.println("El radio del círculo es: " + c.getRadius());
        System.out.println("y del perímetro del círculo es: " + c.getPerimeter());
        System.out.println("El area del círculo es: " + c.getArea());
        System.out.println("El color del círculo es: " + c.getColor());
        System.out.println("Esta terminado el circulo: " + c.isFilled());
        System.out.println("El radio del círculo es: " + c.getRadius());
        System.out.println("El color del rectangulo es: " + r.getColor());
        System.out.println("Esta terminado el rectangulo : " + r.isFilled());
        System.out.println("y del primetro del rectángulo es: " + r.getPerimeter());
        System.out.println("El area del rectángulo es: " + r.getArea());
    }
}
