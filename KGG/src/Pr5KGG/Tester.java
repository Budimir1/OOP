package Pr5KGG;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    static String name = "name";
    static int age = 0;
    public static ArrayList<String> DogHouse = new ArrayList<String>();
    public static void main(String[] args){
        Dog dog= new Dog(name,age);
        DogHouse.add(Dog.name + Dog.AGE);
        System.out.println(dog);
    }
}
