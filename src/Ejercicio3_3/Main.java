package Ejercicio3_3;

public class Main {
    public static void main(String[] args) {
        Point3D p3=new Point3D(2,1,3);
        System.out.println("Las coordenadas son: x= "+p3.getXYZ()[0]+" y="+ p3.getXYZ()[1]+" z="+ p3.getXYZ()[2]);
        p3.setXYZ(2,1,3);
        System.out.println("Mis coordenadas después del setter x son: "+p3.getX());
        System.out.println("Mis coordenadas después del setter y son: "+p3.getY());
        System.out.println("Mis coordenadas después del setter z son: "+p3.getZ());
        p3.setY(8);
        p3.setX(4);
        p3.setZ(6);
        System.out.println("Otras nuevas coordenadas después de los setters son: "+p3);
        System.out.println("Mis coordenadas XY son:"+"("+p3.getXY()[0]+","+p3.getXY()[1]+")");
        System.out.println("Mi coordenada Z es: "+p3.getXYZ()[2]);
    }
}
