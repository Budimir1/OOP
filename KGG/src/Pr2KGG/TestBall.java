package Pr2KGG;
import java.util.Scanner;
import java.lang.*;

public class TestBall {
    public static void main(String[] args){
        System.out.print("Введите изначальное положение по х\n");
        Scanner x1= new Scanner(System.in);
        double x2=x1.nextDouble();
        System.out.print("Введите изначальное положение по y\n");
        Scanner y1= new Scanner(System.in);
        double y2=y1.nextDouble();
        Ball b=new Ball(x2,y2);
        System.out.print("Введите насколько изменилось положение по х\n");
        Scanner x3= new Scanner(System.in);
        double x4=x3.nextDouble();
        System.out.print("Введите насколько изменилось положение по y\n");
        Scanner y3= new Scanner(System.in);
        double y4=y3.nextDouble();
        b.move(x4,y4);
        System.out.print(b);
    }
}
