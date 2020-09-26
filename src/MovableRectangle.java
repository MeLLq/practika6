import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Scanner;
interface Movable{
    public void move();
}
public class MovableRectangle {
    private int x1;
    private int y1;
    private int x2;
    private  int y2;

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY1() {
        return y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getX1() {
        return x1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getX2() {
        return x2;
    }
    MovableRectangle(int x1, int y1,int x2,int y2){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }


    public static void main(String[] args) {
        int x1,y1,x2,y2,movecounter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первую вершину прямоугольника: ");
        x1= sc.nextInt();
        y1= sc.nextInt();
        System.out.println("Введите вторую вершину прямоугольника: ");
        x2= sc.nextInt();
        y2=sc.nextInt();
        System.out.println("Введите счетчик движения: ");
        movecounter=sc.nextInt();
        MovableRectangle move=new MovableRectangle(x1,y1,x2,y2);
        for(int i=0;i<=5;i++) {
            x1 += movecounter;
            x2 += movecounter;
            System.out.println("Перемещение вершин: ");
            System.out.print(x1 + " ");
            System.out.println(y1);
            System.out.print(x2 + " ");
            System.out.println(y2);
        }
}
}



