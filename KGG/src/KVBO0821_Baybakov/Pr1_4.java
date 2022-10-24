package KVBO0821_Baybakov;

import java.util.Scanner;

public class Pr1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Введите 10 целочисленных элементов массива: ");
        int sum = 0;
        int min = 100000000;
        int max = 0;
        int i = 0;
        while (i != 10){
            int n = sc.nextInt();
            a[i] = n;
            sum += a[i];
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
            i += 1;
        }
        System.out.print("Сумма чисел в массиве: ");
        System.out.println(sum);
        System.out.print("Минимальный элемент массива: ");
        System.out.println(min);
        System.out.print("Максимальный элемент массива: ");
        System.out.println(max);
    }
}
