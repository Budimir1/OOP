package KVBO0821_Baybakov;

import java.util.Scanner;

public class Pr_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 2; System.out.print("Input a number: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println(i*2);
        }
        else {
            System.out.println("Not a whole number");
        }

    }
}
