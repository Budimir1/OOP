package Pr4KGG;
import javax.naming.Name;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private static ArrayList<Computer> list;

    public static void Add(Computer name){
        list.add(name);
    }
    public static void Delete(){
        String name = new String();
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        for (int i = 0; i < list.size(); i++){
            if (Objects.equals(list.get(i), name)){
                list.remove(name);
            }
        }
    }
    public static int Search(){
        String name = new String();
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == name) {
               index=i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Add();
        Delete();
        Search();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
