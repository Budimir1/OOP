package Pr5KGG;
import java.util.Scanner;

public class Dog {
    public static int AGE;
    public static String name;

    Dog(String name, Integer age) {
        this.name = name;
        this.AGE = age;
    }
    public String getName(){return name;}
    public Integer getAGE(){return AGE;}
    public void setName(String name){this.name=name;}
    public void setAGE(Integer AGE){this.AGE=AGE;}
    public void NameAge(){
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        sc = new Scanner(System.in);
        int age= sc.nextInt();
        AGE=age;
        this.name=name;
    }
    public int HumanAge(){
        return AGE*=7;
    }
    public String toString(){
        return "Name = " + name + ", \ndog age = " + AGE/7 + ",\n dog age in human" + AGE;
    }
}
