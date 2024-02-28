package Ejercicio2_7;
import Ejercicio2_6.*;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        int x1 = getBeginX();
        int x2 = getEndX();
        int y1 = getBeginY();
        int y2 = getEndY();
        double x = Math.sqrt((x2-x1)*(x2-x1)); //para eliminar el signo de la resta.
        double y = Math.sqrt((y2-y1)*(y2-y1));
        return Math.atan2(y,x);
    }
    public String toString(){
        int x1 = getBeginX();
        int x2 = getEndX();
        int y1 = getBeginY();
        int y2 = getEndY();
        return "MyLine[begin = ("+x1+","+y1+"), end = ("+x2+","+y2+")]";
    }
}
