package Ejercicio3_7;

public class Main3_7 {
    public static void main(String[] args) {
        Point p= new Point(3,4);
        Point s= new Point(1,1);

        Line li = new Line(3,4,1,6);
        Line li2 = new Line(p,s);

        LineSub r = new LineSub(3,4,7,8);
        LineSub r2 = new LineSub(s,p);

        System.out.println(p);
        System.out.println(s);

        System.out.println(li);
        System.out.println(li2);

        System.out.println(r);
        System.out.println(r2);
        p.setX(5);
        p.setY(8);
        p.setXY(2,3);

        li.setBegin(s);
        li.setEnd(p);
        li.setBeginX(2);
        li.setBeginY(5);
        li.setEndX(2);
        li.setEndY(5);
        li.setBeginXY(4, 6);
        li.setEndXY(9,7);

        r.setBegin(p);
        r.setEnd(s);
        r.setBeginX(2);
        r.setBeginY(5);
        r.setEndX(2);
        r.setEndY(5);
        r.setBeginXY(4, 6);
        r.setEndXY(9,7);

        System.out.println("La coordenada x es: " + p.getX());
        System.out.println("La coordenada y es: " + p.getY());
        System.out.println(p.getXY()[0]);
        System.out.println(p.getXY()[1]);
        System.out.println("La distancia de un punto p a otro s es:" + p.distance(s));

        System.out.println("El punto inicial es: " + li.getBegin());
        System.out.println("El punto final es: " + li.getEnd());
        System.out.println("La coordenada x del punto inicial es: " + li.getBeginX());
        System.out.println("La coordenada y del punto inicial es: " + li.getBeginY());
        System.out.println(li.getBeginXY()[0]);
        System.out.println(li.getBeginXY()[1]);
        System.out.println("La coordenada x del punto final es: " + li.getEndX());
        System.out.println("La coordenada y del punto final es: " + li.getEndY());
        System.out.println(li.getEndXY()[0]);
        System.out.println(li.getEndXY()[1]);
        System.out.println("La longitud de la recta es: " + li.getLength());
        System.out.println("El grado de la recta es: " + li.getGradient());

        System.out.println("El punto inicial es: " +r.getBegin());
        System.out.println("El punto final es: " + r.getEnd());
        System.out.println("La coordenada x del punto inicial es: " + r.getBeginX());
        System.out.println("La coordenada y del punto inicial es: " + r.getBeginY());
        System.out.println("La coordenada x del punto final es: " + r.getEndX());
        System.out.println("La coordenada y del punto final es: " + r.getEndY());
        System.out.println("La longitud de la recta es: " + r.getLength());
        System.out.println("El grado de la recta es: " + r.getGradient());
    }
}