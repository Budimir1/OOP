package Pr3KGG;
import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Double r;
        Point p = new Point(3.1, 4.1);
        Circle c=new Circle(p,5.1);
        System.out.println("Длина окружности = " + c.getPerimetr() + "см");
        Scanner r1 =new Scanner(System.in);
        System.out.println("Введите радиус\n");
        r=r1.nextDouble();
        c.setR(r);
        System.out.println("Длина окружности = " + c.getPerimetr() + "cm");
    }
    private Circle[] arr;
    private int dim;
    private int a;
    public Tester(int a){
        this.a=a;
        dim=Math.abs(a);
        arr= new Circle[dim];
    }
    public int getA(){return a;}

    public void setA(int a) {
        this.a = a;
    }

    public Circle[] getArr() {
        return arr;
    }

    public void setArr(Circle[] arr) {
        this.arr = arr;
    }
}
