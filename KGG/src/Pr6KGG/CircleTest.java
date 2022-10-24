package Pr6KGG;
import java.lang.*;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        double r;
        Circle2 c = new Circle2();
        Scanner r1 =new Scanner(System.in);
        r=r1.nextDouble();
        c.setR(r);
        System.out.println(c);
    }
}
